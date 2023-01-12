package typings.wdioTypes.buildOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wdioTypes.anon.Http
import typings.wdioTypes.buildCapabilitiesMod.RemoteCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@wdio/types.@wdio/types/build/Options.WebDriver, 'capabilities'> */
trait WebdriverIO extends StObject {
  
  var agent: js.UndefOr[Http] = js.undefined
  
  /**
    * Define the protocol you want to use for your browser automation.
    * Currently only [`webdriver`](https://www.npmjs.com/package/webdriver) and
    * [`devtools`](https://www.npmjs.com/package/devtools) are supported,
    * as these are the main browser automation technologies available.
    */
  var automationProtocol: js.UndefOr[SupportedProtocols] = js.undefined
  
  /**
    * Shorten url command calls by setting a base URL.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the capabilities you want to run in your WebDriver session. Check out the
    * [WebDriver Protocol](https://w3c.github.io/webdriver/#capabilities) for more details.
    * If you want to run a multiremote session you need to define instead of an array of
    * capabilities an object that has an arbitrary browser instance name as string and its
    * capabilities as values.
    *
    * @example
    * ```js
    * // wdio.conf.js
    * exports.config
    *   // ...
    *   capabilities: {
    *     browserName: 'safari',
    *     platformName: 'MacOS 10.13',
    *     ...
    *   }
    * }
    * ```
    *
    * @example
    * ```
    * // wdio.conf.js
    * exports.config
    *   // ...
    *   capabilities: {
    *     browserA: {
    *       browserName: 'chrome',
    *       browserVersion: 86
    *       platformName: 'Windows 10'
    *     },
    *     browserB: {
    *       browserName: 'firefox',
    *       browserVersion: 74
    *       platformName: 'Mac OS X'
    *     }
    *   }
    * })
    * ```
    */
  var capabilities: RemoteCapability
  
  var connectionRetryCount: js.UndefOr[Double] = js.undefined
  
  var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
  
  var enableDirectConnect: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Sauce Labs provides a headless offering that allows you to run Chrome and Firefox tests headless.
    */
  var headless: js.UndefOr[Boolean] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
  
  var logLevels: js.UndefOr[Record[String, WebDriverLogTypes]] = js.undefined
  
  var outputDir: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * If running on Sauce Labs, you can choose to run tests between different datacenters:
    * US or EU. To change your region to EU, add region: 'eu' to your config.
    */
  var region: js.UndefOr[SauceRegions] = js.undefined
  
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  
  var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ RequestLibOptions, RequestLibOptions]] = js.undefined
  
  var transformResponse: js.UndefOr[
    js.Function2[
      /* response */ RequestLibResponse, 
      /* requestOptions */ RequestLibOptions, 
      RequestLibResponse
    ]
  ] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
  
  /**
    * Default interval for all `waitFor*` commands to check if an expected state (e.g.,
    * visibility) has been changed.
    */
  var waitforInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Default timeout for all `waitFor*` commands. (Note the lowercase f in the option name.)
    * This timeout only affects commands starting with `waitFor*` and their default wait time.
    */
  var waitforTimeout: js.UndefOr[Double] = js.undefined
}
object WebdriverIO {
  
  inline def apply(capabilities: RemoteCapability): WebdriverIO = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebdriverIO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebdriverIO] (val x: Self) extends AnyVal {
    
    inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAutomationProtocol(value: SupportedProtocols): Self = StObject.set(x, "automationProtocol", value.asInstanceOf[js.Any])
    
    inline def setAutomationProtocolUndefined: Self = StObject.set(x, "automationProtocol", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setCapabilities(value: RemoteCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
    
    inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
    
    inline def setEnableDirectConnect(value: Boolean): Self = StObject.set(x, "enableDirectConnect", value.asInstanceOf[js.Any])
    
    inline def setEnableDirectConnectUndefined: Self = StObject.set(x, "enableDirectConnect", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogLevels(value: Record[String, WebDriverLogTypes]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
    
    inline def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
    
    inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
    
    inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setRegion(value: SauceRegions): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
    
    inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
    
    inline def setTransformRequest(value: /* requestOptions */ RequestLibOptions => RequestLibOptions): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
    
    inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    inline def setTransformResponse(
      value: (/* response */ RequestLibResponse, /* requestOptions */ RequestLibOptions) => RequestLibResponse
    ): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
    
    inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWaitforInterval(value: Double): Self = StObject.set(x, "waitforInterval", value.asInstanceOf[js.Any])
    
    inline def setWaitforIntervalUndefined: Self = StObject.set(x, "waitforInterval", js.undefined)
    
    inline def setWaitforTimeout(value: Double): Self = StObject.set(x, "waitforTimeout", value.asInstanceOf[js.Any])
    
    inline def setWaitforTimeoutUndefined: Self = StObject.set(x, "waitforTimeout", js.undefined)
  }
}
