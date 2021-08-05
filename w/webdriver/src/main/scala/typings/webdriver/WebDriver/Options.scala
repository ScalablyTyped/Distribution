package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.webdriver.HTTPRequestOptions
import typings.webdriver.HTTPResponse
import typings.webdriver.anon.Https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Allows you to use a customhttp/https/http2 [agent](https://www.npmjs.com/package/got#agent) to make requests.
    */
  var agent: js.UndefOr[Https] = js.undefined
  
  /**
    * Defines the [capabilities](https://w3c.github.io/webdriver/webdriver-spec.html#capabilities) you want to run in your Selenium session.
    */
  var capabilities: js.UndefOr[DesiredCapabilities | W3CCapabilities] = js.undefined
  
  /**
    * Timeout for any request to the Selenium server
    */
  var connectionPollInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Count of request retries to the Selenium server.
    */
  var connectionRetryCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Timeout for any WebDriver request to a driver or grid.
    */
  var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
  
  var directConnectHost: js.UndefOr[String] = js.undefined
  
  var directConnectPath: js.UndefOr[String] = js.undefined
  
  var directConnectPort: js.UndefOr[Double] = js.undefined
  
  /**
    * Appium direct connect options (see: https://appiumpro.com/editions/86-connecting-directly-to-appium-hosts-in-distributed-environments)
    */
  var directConnectProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * Specify custom headers to pass into every request.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Host of your WebDriver server.
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * Your cloud service access key or secret key (only works for Sauce Labs, Browserstack,
    * TestingBot, CrossBrowserTesting or LambdaTest accounts). If set, WebdriverIO will
    * automatically set connection options for you.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Level of logging verbosity.
    */
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
  
  /**
    * Set specific log levels per logger
    * use 'silent' level to disable logger
    */
  var logLevels: js.UndefOr[Record[String, js.UndefOr[WebDriverLogTypes]]] = js.undefined
  
  /**
    * Path to WebDriver endpoint or grid server.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Port your WebDriver server is on.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Protocol to use when communicating with the Selenium standalone server (or driver).
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * Query paramaters that are propagated to the driver server.
    */
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var requestedCapabilities: js.UndefOr[DesiredCapabilities | W3CCapabilities] = js.undefined
  
  /**
    * Function intercepting [HTTP request options](https://github.com/sindresorhus/got#options) before a WebDriver request is made.
    */
  var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ HTTPRequestOptions, HTTPRequestOptions]] = js.undefined
  
  /**
    * Function intercepting HTTP response objects after a WebDriver response has arrived.
    */
  var transformResponse: js.UndefOr[
    js.Function2[/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions, HTTPResponse]
  ] = js.undefined
  
  /**
    * Your cloud service username (only works for Sauce Labs, Browserstack, TestingBot,
    * CrossBrowserTesting or LambdaTest accounts). If set, WebdriverIO will automatically
    * set connection options for you.
    */
  var user: js.UndefOr[String] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAgent(value: Https): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setConnectionPollInterval(value: Double): Self = StObject.set(x, "connectionPollInterval", value.asInstanceOf[js.Any])
    
    inline def setConnectionPollIntervalUndefined: Self = StObject.set(x, "connectionPollInterval", js.undefined)
    
    inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
    
    inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
    
    inline def setDirectConnectHost(value: String): Self = StObject.set(x, "directConnectHost", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectHostUndefined: Self = StObject.set(x, "directConnectHost", js.undefined)
    
    inline def setDirectConnectPath(value: String): Self = StObject.set(x, "directConnectPath", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectPathUndefined: Self = StObject.set(x, "directConnectPath", js.undefined)
    
    inline def setDirectConnectPort(value: Double): Self = StObject.set(x, "directConnectPort", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectPortUndefined: Self = StObject.set(x, "directConnectPort", js.undefined)
    
    inline def setDirectConnectProtocol(value: String): Self = StObject.set(x, "directConnectProtocol", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectProtocolUndefined: Self = StObject.set(x, "directConnectProtocol", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogLevels(value: Record[String, js.UndefOr[WebDriverLogTypes]]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
    
    inline def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setRequestedCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "requestedCapabilities", value.asInstanceOf[js.Any])
    
    inline def setRequestedCapabilitiesUndefined: Self = StObject.set(x, "requestedCapabilities", js.undefined)
    
    inline def setTransformRequest(value: /* requestOptions */ HTTPRequestOptions => HTTPRequestOptions): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
    
    inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    inline def setTransformResponse(value: (/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions) => HTTPResponse): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
    
    inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
