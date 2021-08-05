package typings.testingbotApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("testingbot-api", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with TestingBot {
    def this(options: TestingBotOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingbotApi.testingbotApiStrings.webdriver
    - typings.testingbotApi.testingbotApiStrings.rc
  */
  trait BrowserType extends StObject
  object BrowserType {
    
    inline def rc: typings.testingbotApi.testingbotApiStrings.rc = "rc".asInstanceOf[typings.testingbotApi.testingbotApiStrings.rc]
    
    inline def webdriver: typings.testingbotApi.testingbotApiStrings.webdriver = "webdriver".asInstanceOf[typings.testingbotApi.testingbotApiStrings.webdriver]
  }
  
  trait TestData extends StObject {
    
    var build: js.UndefOr[String] = js.undefined
    
    var groups: js.UndefOr[String] = js.undefined
    
    var `test[extra]`: js.UndefOr[String] = js.undefined
    
    var `test[name]`: js.UndefOr[String] = js.undefined
    
    var `test[status_message]`: js.UndefOr[String] = js.undefined
    
    var `test[success]`: js.UndefOr[TestSuccess] = js.undefined
  }
  object TestData {
    
    inline def apply(): TestData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestData]
    }
    
    extension [Self <: TestData](x: Self) {
      
      inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      inline def setGroups(value: String): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def `setTest[extra]`(value: String): Self = StObject.set(x, "test[extra]", value.asInstanceOf[js.Any])
      
      inline def `setTest[extra]Undefined`: Self = StObject.set(x, "test[extra]", js.undefined)
      
      inline def `setTest[name]`(value: String): Self = StObject.set(x, "test[name]", value.asInstanceOf[js.Any])
      
      inline def `setTest[name]Undefined`: Self = StObject.set(x, "test[name]", js.undefined)
      
      inline def `setTest[status_message]`(value: String): Self = StObject.set(x, "test[status_message]", value.asInstanceOf[js.Any])
      
      inline def `setTest[status_message]Undefined`: Self = StObject.set(x, "test[status_message]", js.undefined)
      
      inline def `setTest[success]`(value: TestSuccess): Self = StObject.set(x, "test[success]", value.asInstanceOf[js.Any])
      
      inline def `setTest[success]Undefined`: Self = StObject.set(x, "test[success]", js.undefined)
    }
  }
  
  trait TestLabData extends StObject {
    
    var `test[cron]`: js.UndefOr[String] = js.undefined
    
    var `test[enabled]`: js.UndefOr[Boolean] = js.undefined
    
    var `test[name]`: js.UndefOr[String] = js.undefined
    
    var `test[url]`: js.UndefOr[String] = js.undefined
  }
  object TestLabData {
    
    inline def apply(): TestLabData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestLabData]
    }
    
    extension [Self <: TestLabData](x: Self) {
      
      inline def `setTest[cron]`(value: String): Self = StObject.set(x, "test[cron]", value.asInstanceOf[js.Any])
      
      inline def `setTest[cron]Undefined`: Self = StObject.set(x, "test[cron]", js.undefined)
      
      inline def `setTest[enabled]`(value: Boolean): Self = StObject.set(x, "test[enabled]", value.asInstanceOf[js.Any])
      
      inline def `setTest[enabled]Undefined`: Self = StObject.set(x, "test[enabled]", js.undefined)
      
      inline def `setTest[name]`(value: String): Self = StObject.set(x, "test[name]", value.asInstanceOf[js.Any])
      
      inline def `setTest[name]Undefined`: Self = StObject.set(x, "test[name]", js.undefined)
      
      inline def `setTest[url]`(value: String): Self = StObject.set(x, "test[url]", value.asInstanceOf[js.Any])
      
      inline def `setTest[url]Undefined`: Self = StObject.set(x, "test[url]", js.undefined)
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
    
    inline def `0`: typings.testingbotApi.testingbotApiNumbers.`0` = 0.asInstanceOf[typings.testingbotApi.testingbotApiNumbers.`0`]
    
    inline def `1`: typings.testingbotApi.testingbotApiNumbers.`1` = 1.asInstanceOf[typings.testingbotApi.testingbotApiNumbers.`1`]
    
    inline def `false`: typings.testingbotApi.testingbotApiBooleans.`false` = false.asInstanceOf[typings.testingbotApi.testingbotApiBooleans.`false`]
    
    inline def `true`: typings.testingbotApi.testingbotApiBooleans.`true` = true.asInstanceOf[typings.testingbotApi.testingbotApiBooleans.`true`]
  }
  
  @js.native
  trait TestingBot extends StObject {
    
    def deleteLabTest(testID: String): Unit = js.native
    def deleteLabTest(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    
    def deleteTest(testID: String): Unit = js.native
    def deleteTest(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    
    def getBrowsers(): Unit = js.native
    def getBrowsers(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    def getBrowsers(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any], `type`: BrowserType): Unit = js.native
    def getBrowsers(callback: Unit, `type`: BrowserType): Unit = js.native
    
    def getLabTestDetails(testID: String): Unit = js.native
    def getLabTestDetails(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    
    def getLabTests(): Unit = js.native
    def getLabTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    def getLabTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any], offset: Double): Unit = js.native
    def getLabTests(
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any],
      offset: Double,
      limit: Double
    ): Unit = js.native
    def getLabTests(
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any],
      offset: Unit,
      limit: Double
    ): Unit = js.native
    def getLabTests(callback: Unit, offset: Double): Unit = js.native
    def getLabTests(callback: Unit, offset: Double, limit: Double): Unit = js.native
    def getLabTests(callback: Unit, offset: Unit, limit: Double): Unit = js.native
    
    def getTestDetails(testID: String): Unit = js.native
    def getTestDetails(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    
    def getTests(): Unit = js.native
    def getTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    def getTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any], offset: Double): Unit = js.native
    def getTests(
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any],
      offset: Double,
      limit: Double
    ): Unit = js.native
    def getTests(
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any],
      offset: Unit,
      limit: Double
    ): Unit = js.native
    def getTests(callback: Unit, offset: Double): Unit = js.native
    def getTests(callback: Unit, offset: Double, limit: Double): Unit = js.native
    def getTests(callback: Unit, offset: Unit, limit: Double): Unit = js.native
    
    def getTunnel(): Unit = js.native
    def getTunnel(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    
    def getUserInfo(): Unit = js.native
    def getUserInfo(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
    
    def updateLabTest(data: TestLabData, testID: String): Unit = js.native
    def updateLabTest(
      data: TestLabData,
      testID: String,
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]
    ): Unit = js.native
    
    def updateTest(data: TestData, testID: String): Unit = js.native
    def updateTest(
      data: TestData,
      testID: String,
      callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]
    ): Unit = js.native
    
    def updateUserInfo(data: UserInfo): Unit = js.native
    def updateUserInfo(data: UserInfo, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, js.Any]): Unit = js.native
  }
  
  trait TestingBotOptions extends StObject {
    
    var api_key: js.UndefOr[String] = js.undefined
    
    var api_secret: js.UndefOr[String] = js.undefined
  }
  object TestingBotOptions {
    
    inline def apply(): TestingBotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestingBotOptions]
    }
    
    extension [Self <: TestingBotOptions](x: Self) {
      
      inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      inline def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
      
      inline def setApi_secret(value: String): Self = StObject.set(x, "api_secret", value.asInstanceOf[js.Any])
      
      inline def setApi_secretUndefined: Self = StObject.set(x, "api_secret", js.undefined)
    }
  }
  
  trait UserInfo extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var first_name: js.UndefOr[String] = js.undefined
    
    var last_name: js.UndefOr[String] = js.undefined
  }
  object UserInfo {
    
    inline def apply(): UserInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserInfo]
    }
    
    extension [Self <: UserInfo](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    }
  }
}
