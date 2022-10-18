package typings.wdioTypes.buildOptionsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /**
    * Host of your WebDriver server.
    *
    * @default 'localhost'
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * Your cloud service access key or secret key (only works for
    * [Sauce Labs](https://saucelabs.com), [Browserstack](https://www.browserstack.com),
    * [TestingBot](https://testingbot.com), [CrossBrowserTesting](https://crossbrowsertesting.com)
    * or [LambdaTest](https://www.lambdatest.com) accounts). If set, WebdriverIO will
    * automatically set connection options for you. If you don't use a cloud provider this
    * can be used to authenticate any other WebDriver backend.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Path to WebDriver endpoint or grid server.
    *
    * @default '/'
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Port your WebDriver server is on.
    *
    * @default 4444
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Protocol to use when communicating with the Selenium standalone server (or driver).
    *
    * @default 'http'
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * Query paramaters that are propagated to the driver server.
    */
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Your cloud service username (only works for [Sauce Labs](https://saucelabs.com),
    * [Browserstack](https://www.browserstack.com), [TestingBot](https://testingbot.com),
    * [CrossBrowserTesting](https://crossbrowsertesting.com) or
    * [LambdaTest](https://www.lambdatest.com) accounts). If set, WebdriverIO will
    * automatically set connection options for you. If you don't use a cloud provider this
    * can be used to authenticate any other WebDriver backend.
    */
  var user: js.UndefOr[String] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
