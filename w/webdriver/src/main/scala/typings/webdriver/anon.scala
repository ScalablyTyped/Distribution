package typings.webdriver

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.got.mod.Response
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.std.Record
import typings.webdriver.typesMod.AttachOptions
import typings.webdriver.typesMod.DesiredCapabilities
import typings.webdriver.typesMod.LoggingPreferences
import typings.webdriver.typesMod.Options
import typings.webdriver.typesMod.W3CCapabilities
import typings.webdriver.typesMod.WebDriverLogTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Array[String]
    
    var background: Boolean
    
    var executable: String
    
    var timeout: Double
  }
  object Args {
    
    @scala.inline
    def apply(args: js.Array[String], background: Boolean, executable: String, timeout: Double): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], executable = executable.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutable(value: String): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Browser extends StObject {
    
    var browser: js.UndefOr[LoggingPreferences] = js.undefined
    
    var client: js.UndefOr[LoggingPreferences] = js.undefined
    
    var driver: js.UndefOr[LoggingPreferences] = js.undefined
    
    var server: js.UndefOr[LoggingPreferences] = js.undefined
  }
  object Browser {
    
    @scala.inline
    def apply(): Browser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit class BrowserMutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: LoggingPreferences): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setClient(value: LoggingPreferences): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setDriver(value: LoggingPreferences): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
      
      @scala.inline
      def setServer(value: LoggingPreferences): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait BufferUsageReportingInterval extends StObject {
    
    var bufferUsageReportingInterval: js.UndefOr[Boolean] = js.undefined
    
    var enableNetwork: js.UndefOr[Boolean] = js.undefined
    
    var enablePage: js.UndefOr[Boolean] = js.undefined
    
    var enableTimeline: js.UndefOr[Boolean] = js.undefined
    
    var tracingCategories: js.UndefOr[Boolean] = js.undefined
  }
  object BufferUsageReportingInterval {
    
    @scala.inline
    def apply(): BufferUsageReportingInterval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferUsageReportingInterval]
    }
    
    @scala.inline
    implicit class BufferUsageReportingIntervalMutableBuilder[Self <: BufferUsageReportingInterval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferUsageReportingInterval(value: Boolean): Self = StObject.set(x, "bufferUsageReportingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUsageReportingIntervalUndefined: Self = StObject.set(x, "bufferUsageReportingInterval", js.undefined)
      
      @scala.inline
      def setEnableNetwork(value: Boolean): Self = StObject.set(x, "enableNetwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableNetworkUndefined: Self = StObject.set(x, "enableNetwork", js.undefined)
      
      @scala.inline
      def setEnablePage(value: Boolean): Self = StObject.set(x, "enablePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePageUndefined: Self = StObject.set(x, "enablePage", js.undefined)
      
      @scala.inline
      def setEnableTimeline(value: Boolean): Self = StObject.set(x, "enableTimeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimelineUndefined: Self = StObject.set(x, "enableTimeline", js.undefined)
      
      @scala.inline
      def setTracingCategories(value: Boolean): Self = StObject.set(x, "tracingCategories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracingCategoriesUndefined: Self = StObject.set(x, "tracingCategories", js.undefined)
    }
  }
  
  trait Capabilities extends StObject {
    
    var capabilities: DesiredCapabilities
    
    var sessionId: String
  }
  object Capabilities {
    
    @scala.inline
    def apply(capabilities: DesiredCapabilities, sessionId: String): Capabilities = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(value: DesiredCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Client extends StObject {
    
    var browser: js.UndefOr[typings.webdriver.WebDriver.LoggingPreferences] = js.undefined
    
    var client: js.UndefOr[typings.webdriver.WebDriver.LoggingPreferences] = js.undefined
    
    var driver: js.UndefOr[typings.webdriver.WebDriver.LoggingPreferences] = js.undefined
    
    var server: js.UndefOr[typings.webdriver.WebDriver.LoggingPreferences] = js.undefined
  }
  object Client {
    
    @scala.inline
    def apply(): Client = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: typings.webdriver.WebDriver.LoggingPreferences): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setClient(value: typings.webdriver.WebDriver.LoggingPreferences): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setDriver(value: typings.webdriver.WebDriver.LoggingPreferences): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
      
      @scala.inline
      def setServer(value: typings.webdriver.WebDriver.LoggingPreferences): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  trait Http extends StObject {
    
    var http: Agent
    
    var https: typings.node.httpsMod.Agent
  }
  object Http {
    
    @scala.inline
    def apply(http: Agent, https: typings.node.httpsMod.Agent): Http = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
      __obj.asInstanceOf[Http]
    }
    
    @scala.inline
    implicit class HttpMutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    }
  }
  
  trait Https extends StObject {
    
    var http: HTTPAgent
    
    var https: HTTPSAgent
  }
  object Https {
    
    @scala.inline
    def apply(http: HTTPAgent, https: HTTPSAgent): Https = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
      __obj.asInstanceOf[Https]
    }
    
    @scala.inline
    implicit class HttpsMutableBuilder[Self <: Https] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttp(value: HTTPAgent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttps(value: HTTPSAgent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsAndroid extends StObject {
    
    var isAndroid: Value
    
    var isChrome: Value
    
    var isIOS: Value
    
    var isMobile: Value
    
    var isSauce: Value
    
    var isSeleniumStandalone: Value
    
    var isW3C: Value
  }
  object IsAndroid {
    
    @scala.inline
    def apply(
      isAndroid: Value,
      isChrome: Value,
      isIOS: Value,
      isMobile: Value,
      isSauce: Value,
      isSeleniumStandalone: Value,
      isW3C: Value
    ): IsAndroid = {
      val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isSeleniumStandalone = isSeleniumStandalone.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsAndroid]
    }
    
    @scala.inline
    implicit class IsAndroidMutableBuilder[Self <: IsAndroid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAndroid(value: Value): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChrome(value: Value): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIOS(value: Value): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobile(value: Value): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSauce(value: Value): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSeleniumStandalone(value: Value): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsW3C(value: Value): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<webdriver.webdriver/build/types.Options> */
  trait PartialOptions extends StObject {
    
    var agent: js.UndefOr[Http] = js.undefined
    
    var capabilities: js.UndefOr[DesiredCapabilities | W3CCapabilities] = js.undefined
    
    var connectionPollInterval: js.UndefOr[Double] = js.undefined
    
    var connectionRetryCount: js.UndefOr[Double] = js.undefined
    
    var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var directConnectHost: js.UndefOr[String] = js.undefined
    
    var directConnectPath: js.UndefOr[String] = js.undefined
    
    var directConnectPort: js.UndefOr[Double] = js.undefined
    
    var directConnectProtocol: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
    
    var logLevels: js.UndefOr[Record[String, js.UndefOr[WebDriverLogTypes]]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var requestedCapabilities: js.UndefOr[DesiredCapabilities | W3CCapabilities] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var transformRequest: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ js.Any
        ]
      ] = js.undefined
    
    var transformResponse: js.UndefOr[
        js.Function2[
          /* response */ Response[Buffer | String | js.Object], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any, 
          Response[Buffer | String | js.Object]
        ]
      ] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      @scala.inline
      def setConnectionPollInterval(value: Double): Self = StObject.set(x, "connectionPollInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPollIntervalUndefined: Self = StObject.set(x, "connectionPollInterval", js.undefined)
      
      @scala.inline
      def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
      
      @scala.inline
      def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
      
      @scala.inline
      def setDirectConnectHost(value: String): Self = StObject.set(x, "directConnectHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectConnectHostUndefined: Self = StObject.set(x, "directConnectHost", js.undefined)
      
      @scala.inline
      def setDirectConnectPath(value: String): Self = StObject.set(x, "directConnectPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectConnectPathUndefined: Self = StObject.set(x, "directConnectPath", js.undefined)
      
      @scala.inline
      def setDirectConnectPort(value: Double): Self = StObject.set(x, "directConnectPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectConnectPortUndefined: Self = StObject.set(x, "directConnectPort", js.undefined)
      
      @scala.inline
      def setDirectConnectProtocol(value: String): Self = StObject.set(x, "directConnectProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectConnectProtocolUndefined: Self = StObject.set(x, "directConnectProtocol", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogLevels(value: Record[String, js.UndefOr[WebDriverLogTypes]]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setRequestedCapabilities(value: DesiredCapabilities | W3CCapabilities): Self = StObject.set(x, "requestedCapabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedCapabilitiesUndefined: Self = StObject.set(x, "requestedCapabilities", js.undefined)
      
      @scala.inline
      def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      @scala.inline
      def setTransformRequest(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ js.Any
      ): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
      
      @scala.inline
      def setTransformResponse(
        value: (/* response */ Response[Buffer | String | js.Object], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify got.HTTPSOptions */ /* requestOptions */ js.Any) => Response[Buffer | String | js.Object]
      ): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Inlined std.Partial<webdriver.webdriver/build/types.SessionFlags> */
  trait PartialSessionFlags extends StObject {
    
    var isAndroid: js.UndefOr[Boolean] = js.undefined
    
    var isChrome: js.UndefOr[Boolean] = js.undefined
    
    var isIOS: js.UndefOr[Boolean] = js.undefined
    
    var isMobile: js.UndefOr[Boolean] = js.undefined
    
    var isSauce: js.UndefOr[Boolean] = js.undefined
    
    var isSeleniumStandalone: js.UndefOr[Boolean] = js.undefined
    
    var isW3C: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSessionFlags {
    
    @scala.inline
    def apply(): PartialSessionFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSessionFlags]
    }
    
    @scala.inline
    implicit class PartialSessionFlagsMutableBuilder[Self <: PartialSessionFlags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAndroidUndefined: Self = StObject.set(x, "isAndroid", js.undefined)
      
      @scala.inline
      def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChromeUndefined: Self = StObject.set(x, "isChrome", js.undefined)
      
      @scala.inline
      def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIOSUndefined: Self = StObject.set(x, "isIOS", js.undefined)
      
      @scala.inline
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      @scala.inline
      def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSauceUndefined: Self = StObject.set(x, "isSauce", js.undefined)
      
      @scala.inline
      def setIsSeleniumStandalone(value: Boolean): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSeleniumStandaloneUndefined: Self = StObject.set(x, "isSeleniumStandalone", js.undefined)
      
      @scala.inline
      def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsW3CUndefined: Self = StObject.set(x, "isW3C", js.undefined)
    }
  }
  
  @js.native
  trait TypeofWebDriver
    extends StObject
       with Instantiable0[typings.webdriver.buildMod.WebDriver] {
    
    def WebDriver: /* import warning: importer.ImportType#apply Failed type conversion: typeof WebDriver */ js.Any = js.native
    
    def attachToSession(): typings.webdriver.typesMod.Client = js.native
    def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): typings.webdriver.typesMod.Client = js.native
    def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): typings.webdriver.typesMod.Client = js.native
    def attachToSession(options: Unit, modifier: Unit, userPrototype: js.Object): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: Unit,
      modifier: Unit,
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: Unit,
      modifier: Unit,
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): typings.webdriver.typesMod.Client = js.native
    def attachToSession(options: AttachOptions): typings.webdriver.typesMod.Client = js.native
    def attachToSession(options: AttachOptions, modifier: js.Function1[/* repeated */ js.Any, js.Any]): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object
    ): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): typings.webdriver.typesMod.Client = js.native
    def attachToSession(options: AttachOptions, modifier: Unit, userPrototype: js.Object): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): typings.webdriver.typesMod.Client = js.native
    def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): typings.webdriver.typesMod.Client = js.native
    
    def newSession(): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(options: Unit, modifier: Unit, userPrototype: js.Object): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(
      options: Unit,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(
      options: Unit,
      modifier: Unit,
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(options: Options): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(options: Options, modifier: Unit, userPrototype: js.Object): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(
      options: Options,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[typings.webdriver.typesMod.Client] = js.native
    def newSession(
      options: Options,
      modifier: Unit,
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[typings.webdriver.typesMod.Client] = js.native
    
    def reloadSession(instance: typings.webdriver.typesMod.Client): js.Promise[String] = js.native
  }
  
  trait Value extends StObject {
    
    var value: js.UndefOr[Boolean] = js.undefined
  }
  object Value {
    
    @scala.inline
    def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
