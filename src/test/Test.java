package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.UserInfo;

public class Test {

	public static void main(String[] args) {
		BeanFactory bf = new  ClassPathXmlApplicationContext("beans.xml");
		UserInfo user = (UserInfo)bf.getBean("userInfo");
		System.out.println(user);
	}

}
