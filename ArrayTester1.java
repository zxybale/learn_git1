import java.lang.reflect.Array;

public class ArrayTester1 {
    public static void main(String[] args) throws  Exception{
        Class classType = Class.forName(args[0]);

        //创建一个长度为10的字符串数组
        Object array = Array.newInstance(classType, 10 );
        //把索引位置为5的元素的值设为"hello"
        Array.set(array, 5, "hello");
        //读取索引位置为5的元素的值
        String s = (String)Array.get(array, 5);
        System.out.println(s);
    }
}
