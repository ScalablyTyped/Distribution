package typings.webdriver

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Record
import typings.wdioProtocols.mod.ProtocolCommands
import typings.wdioProtocols.mod.ProtocolCommandsAsync
import typings.wdioTypes.anon.Http
import typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import typings.wdioTypes.buildCapabilitiesMod.W3CCapabilities
import typings.wdioTypes.buildOptionsMod.RequestLibOptions
import typings.wdioTypes.buildOptionsMod.RequestLibResponse
import typings.wdioTypes.buildOptionsMod.WebDriver
import typings.wdioTypes.buildOptionsMod.WebDriverLogTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  /* Inlined parent std.Partial<webdriver.webdriver/build/types.SessionFlags> */
  /* Inlined parent std.Partial<@wdio/types.@wdio/types.Options.WebDriver> */
  trait AttachOptions extends StObject {
    
    var agent: js.UndefOr[Http] = js.undefined
    
    var capabilities: js.UndefOr[DesiredCapabilities | W3CCapabilities] = js.undefined
    
    var connectionRetryCount: js.UndefOr[Double] = js.undefined
    
    var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var enableDirectConnect: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var isAndroid: js.UndefOr[Boolean] = js.undefined
    
    var isChrome: js.UndefOr[Boolean] = js.undefined
    
    var isDevTools: js.UndefOr[Boolean] = js.undefined
    
    var isFirefox: js.UndefOr[Boolean] = js.undefined
    
    var isIOS: js.UndefOr[Boolean] = js.undefined
    
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    var isSauce: js.UndefOr[Boolean] = js.undefined
    
    var isSeleniumStandalone: js.UndefOr[Boolean] = js.undefined
    
    var isW3C: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
    
    var logLevels: js.UndefOr[Record[String, WebDriverLogTypes]] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var sessionId: String
    
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
  }
  object AttachOptions {
    
    inline def apply(sessionId: String): AttachOptions = {
      val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttachOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
      
      inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
      
      inline def setEnableDirectConnect(value: Boolean): Self = StObject.set(x, "enableDirectConnect", value.asInstanceOf[js.Any])
      
      inline def setEnableDirectConnectUndefined: Self = StObject.set(x, "enableDirectConnect", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      inline def setIsAndroidUndefined: Self = StObject.set(x, "isAndroid", js.undefined)
      
      inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      inline def setIsChromeUndefined: Self = StObject.set(x, "isChrome", js.undefined)
      
      inline def setIsDevTools(value: Boolean): Self = StObject.set(x, "isDevTools", value.asInstanceOf[js.Any])
      
      inline def setIsDevToolsUndefined: Self = StObject.set(x, "isDevTools", js.undefined)
      
      inline def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
      
      inline def setIsFirefoxUndefined: Self = StObject.set(x, "isFirefox", js.undefined)
      
      inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      inline def setIsIOSUndefined: Self = StObject.set(x, "isIOS", js.undefined)
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      inline def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
      
      inline def setIsSauceUndefined: Self = StObject.set(x, "isSauce", js.undefined)
      
      inline def setIsSeleniumStandalone(value: Boolean): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
      
      inline def setIsSeleniumStandaloneUndefined: Self = StObject.set(x, "isSeleniumStandalone", js.undefined)
      
      inline def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
      
      inline def setIsW3CUndefined: Self = StObject.set(x, "isW3C", js.undefined)
      
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
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
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
    }
  }
  
  @js.native
  trait BaseClient
    extends EventEmitter
       with SessionFlags {
    
    var capabilities: DesiredCapabilities | W3CCapabilities = js.native
    
    var options: WebDriver = js.native
    
    var requestedCapabilities: DesiredCapabilities | W3CCapabilities = js.native
    
    var sessionId: String = js.native
  }
  
  @js.native
  trait Client
    extends BaseClient
       with ProtocolCommandsAsync
  
  @js.native
  trait ClientSync
    extends BaseClient
       with ProtocolCommands
  
  trait JSONWPCommandError
    extends StObject
       with Error {
    
    var code: js.UndefOr[String] = js.undefined
    
    var statusCode: js.UndefOr[String] = js.undefined
    
    var statusMessage: js.UndefOr[String] = js.undefined
  }
  object JSONWPCommandError {
    
    inline def apply(message: String, name: String): JSONWPCommandError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONWPCommandError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONWPCommandError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    }
  }
  
  trait SessionFlags extends StObject {
    
    var isAndroid: Boolean
    
    var isChrome: Boolean
    
    var isDevTools: Boolean
    
    var isFirefox: Boolean
    
    var isIOS: Boolean
    
    var isMobile: Boolean
    
    var isSauce: Boolean
    
    var isSeleniumStandalone: Boolean
    
    var isW3C: Boolean
  }
  object SessionFlags {
    
    inline def apply(
      isAndroid: Boolean,
      isChrome: Boolean,
      isDevTools: Boolean,
      isFirefox: Boolean,
      isIOS: Boolean,
      isMobile: Boolean,
      isSauce: Boolean,
      isSeleniumStandalone: Boolean,
      isW3C: Boolean
    ): SessionFlags = {
      val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isDevTools = isDevTools.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isSeleniumStandalone = isSeleniumStandalone.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionFlags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionFlags] (val x: Self) extends AnyVal {
      
      inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      inline def setIsDevTools(value: Boolean): Self = StObject.set(x, "isDevTools", value.asInstanceOf[js.Any])
      
      inline def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
      
      inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
      
      inline def setIsSeleniumStandalone(value: Boolean): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
      
      inline def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    }
  }
}
