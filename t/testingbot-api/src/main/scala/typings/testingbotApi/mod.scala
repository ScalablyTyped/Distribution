package typings.testingbotApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("testingbot-api", JSImport.Namespace)
  @js.native
  class ^ () extends TestingBot {
    def this(options: TestingBotOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingbotApi.testingbotApiStrings.webdriver
    - typings.testingbotApi.testingbotApiStrings.rc
  */
  trait BrowserType extends StObject
  object BrowserType {
    
    @scala.inline
    def rc: typings.testingbotApi.testingbotApiStrings.rc = "rc".asInstanceOf[typings.testingbotApi.testingbotApiStrings.rc]
    
    @scala.inline
    def webdriver: typings.testingbotApi.testingbotApiStrings.webdriver = "webdriver".asInstanceOf[typings.testingbotApi.testingbotApiStrings.webdriver]
  }
  
  @js.native
  trait TestData extends StObject {
    
    var build: js.UndefOr[String] = js.native
    
    var groups: js.UndefOr[String] = js.native
    
    var `test[extra]`: js.UndefOr[String] = js.native
    
    var `test[name]`: js.UndefOr[String] = js.native
    
    var `test[status_message]`: js.UndefOr[String] = js.native
    
    var `test[success]`: js.UndefOr[TestSuccess] = js.native
  }
  object TestData {
    
    @scala.inline
    def apply(): TestData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestData]
    }
    
    @scala.inline
    implicit class TestDataMutableBuilder[Self <: TestData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      @scala.inline
      def setGroups(value: String): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def `setTest[extra]`(value: String): Self = StObject.set(x, "test[extra]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTest[extra]Undefined`: Self = StObject.set(x, "test[extra]", js.undefined)
      
      @scala.inline
      def `setTest[name]`(value: String): Self = StObject.set(x, "test[name]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTest[name]Undefined`: Self = StObject.set(x, "test[name]", js.undefined)
      
      @scala.inline
      def `setTest[status_message]`(value: String): Self = StObject.set(x, "test[status_message]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTest[status_message]Undefined`: Self = StObject.set(x, "test[status_message]", js.undefined)
      
      @scala.inline
      def `setTest[success]`(value: TestSuccess): Self = StObject.set(x, "test[success]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTest[success]Undefined`: Self = StObject.set(x, "test[success]", js.undefined)
    }
  }
  
  @js.native
  trait TestLabData extends StObject {
    
    var `test[cron]`: js.UndefOr[String] = js.native
    
    var `test[enabled]`: js.UndefOr[Boolean] = js.native
    
    var `test[name]`: js.UndefOr[String] = js.native
    
    var `test[url]`: js.UndefOr[String] = js.native
  }
  object TestLabData {
    
    @scala.inline
    def apply(): TestLabData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestLabData]
    }
    
    @scala.inline
    implicit class TestLabDataMutableBuilder[Self <: TestLabData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setTest[cron]`(value: String): Self = StObject.set(x, "test[cron]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTest[cron]Undefined`: Self = StObject.set(x, "test[cron]", js.undefined)
      
      @scala.inline
      def `setTest[enabled]`(value: Boolean): Self = StObject.set(x, "test[enabled]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTest[enabled]Undefined`: Self = StObject.set(x, "test[enabled]", js.undefined)
      
      @scala.inline
      def `setTest[name]`(value: String): Self = StObject.set(x, "test[name]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTest[name]Undefined`: Self = StObject.set(x, "test[name]", js.undefined)
      
      @scala.inline
      def `setTest[url]`(value: String): Self = StObject.set(x, "test[url]", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTest[url]Undefined`: Self = StObject.set(x, "test[url]", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingbotApi.testingbotApiBooleans.`true`
    - typings.testingbotApi.testingbotApiBooleans.`false`
    - typings.testingbotApi.testingbotApiNumbers.`0`
    - typings.testingbotApi.testingbotApiNumbers.`1`
  */
  trait TestSuccess extends StObject
  object TestSuccess {
    
    @scala.inline
    def `0`: typings.testingbotApi.testingbotApiNumbers.`0` = 0.asInstanceOf[typings.testingbotApi.testingbotApiNumbers.`0`]
    
    @scala.inline
    def `1`: typings.testingbotApi.testingbotApiNumbers.`1` = 1.asInstanceOf[typings.testingbotApi.testingbotApiNumbers.`1`]
    
    @scala.inline
    def `false`: typings.testingbotApi.testingbotApiBooleans.`false` = false.asInstanceOf[typings.testingbotApi.testingbotApiBooleans.`false`]
    
    @scala.inline
    def `true`: typings.testingbotApi.testingbotApiBooleans.`true` = true.asInstanceOf[typings.testingbotApi.testingbotApiBooleans.`true`]
  }
  
  @js.native
  trait TestingBot extends StObject {
    
    def deleteLabTest(testID: String): Unit = js.native
    def deleteLabTest(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    
    def deleteTest(testID: String): Unit = js.native
    def deleteTest(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    
    def getBrowsers(): Unit = js.native
    def getBrowsers(callback: js.UndefOr[scala.Nothing], `type`: BrowserType): Unit = js.native
    def getBrowsers(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    def getBrowsers(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], `type`: BrowserType): Unit = js.native
    
    def getLabTestDetails(testID: String): Unit = js.native
    def getLabTestDetails(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    
    def getLabTests(): Unit = js.native
    def getLabTests(callback: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], limit: Double): Unit = js.native
    def getLabTests(callback: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
    def getLabTests(callback: js.UndefOr[scala.Nothing], offset: Double, limit: Double): Unit = js.native
    def getLabTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    def getLabTests(
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _],
      offset: js.UndefOr[scala.Nothing],
      limit: Double
    ): Unit = js.native
    def getLabTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], offset: Double): Unit = js.native
    def getLabTests(
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _],
      offset: Double,
      limit: Double
    ): Unit = js.native
    
    def getTestDetails(testID: String): Unit = js.native
    def getTestDetails(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    
    def getTests(): Unit = js.native
    def getTests(callback: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], limit: Double): Unit = js.native
    def getTests(callback: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
    def getTests(callback: js.UndefOr[scala.Nothing], offset: Double, limit: Double): Unit = js.native
    def getTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    def getTests(
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _],
      offset: js.UndefOr[scala.Nothing],
      limit: Double
    ): Unit = js.native
    def getTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], offset: Double): Unit = js.native
    def getTests(
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _],
      offset: Double,
      limit: Double
    ): Unit = js.native
    
    def getTunnel(): Unit = js.native
    def getTunnel(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    
    def getUserInfo(): Unit = js.native
    def getUserInfo(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
    
    def updateLabTest(data: TestLabData, testID: String): Unit = js.native
    def updateLabTest(
      data: TestLabData,
      testID: String,
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]
    ): Unit = js.native
    
    def updateTest(data: TestData, testID: String): Unit = js.native
    def updateTest(
      data: TestData,
      testID: String,
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]
    ): Unit = js.native
    
    def updateUserInfo(data: UserInfo): Unit = js.native
    def updateUserInfo(data: UserInfo, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  }
  
  @js.native
  trait TestingBotOptions extends StObject {
    
    var api_key: js.UndefOr[String] = js.native
    
    var api_secret: js.UndefOr[String] = js.native
  }
  object TestingBotOptions {
    
    @scala.inline
    def apply(): TestingBotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestingBotOptions]
    }
    
    @scala.inline
    implicit class TestingBotOptionsMutableBuilder[Self <: TestingBotOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
      
      @scala.inline
      def setApi_secret(value: String): Self = StObject.set(x, "api_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_secretUndefined: Self = StObject.set(x, "api_secret", js.undefined)
    }
  }
  
  @js.native
  trait UserInfo extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var first_name: js.UndefOr[String] = js.native
    
    var last_name: js.UndefOr[String] = js.native
  }
  object UserInfo {
    
    @scala.inline
    def apply(): UserInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      @scala.inline
      def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    }
  }
}
