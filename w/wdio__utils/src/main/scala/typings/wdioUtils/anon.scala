package typings.wdioUtils

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Partial
import typings.std.Record
import typings.wdioTypes.anon.Http
import typings.wdioTypes.buildCapabilitiesMod.RemoteCapability
import typings.wdioTypes.buildOptionsMod.AutoCompileConfig
import typings.wdioTypes.buildOptionsMod.RequestLibOptions
import typings.wdioTypes.buildOptionsMod.RequestLibResponse
import typings.wdioTypes.buildOptionsMod.SauceRegions
import typings.wdioTypes.buildOptionsMod.SupportedProtocols
import typings.wdioTypes.buildOptionsMod.WebDriverLogTypes
import typings.wdioTypes.buildReportersMod.ReporterEntry
import typings.wdioTypes.buildServicesMod.ServiceEntry
import typings.wdioTypes.buildServicesMod.ServiceInstance
import typings.wdioTypes.mod.global.WebdriverIO.BrowserRunnerOptions
import typings.wdioTypes.mod.global.WebdriverIO.CucumberOpts
import typings.wdioTypes.mod.global.WebdriverIO.JasmineOpts
import typings.wdioTypes.mod.global.WebdriverIO.MochaOpts
import typings.wdioUtils.wdioUtilsStrings.browser
import typings.wdioUtils.wdioUtilsStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(sessionId: String): Any = js.native
    def apply(sessionId: String, commandWrapper: js.Function): Any = js.native
    def apply(sessionId: String, commandWrapper: js.Function, eventMiddleware: Socket): Any = js.native
    def apply(sessionId: String, commandWrapper: Unit, eventMiddleware: Socket): Any = js.native
    
    /**
      * Enhance monad prototype with function
      * @param  {string}   name          name of function to attach to prototype
      * @param  {Function} func          function to be added to prototype
      * @param  {Object}   proto         prototype to add function to (optional)
      * @param  {Function} origCommand   original command to be passed to custom command as first argument
      */
    def lift(name: String, func: js.Function, proto: Record[String, Any]): Unit = js.native
    def lift(name: String, func: js.Function, proto: Record[String, Any], origCommand: js.Function): Unit = js.native
  }
  
  trait Capabilities extends StObject {
    
    var capabilities: RemoteCapability
    
    var requestedCapabilities: RemoteCapability
  }
  object Capabilities {
    
    inline def apply(capabilities: RemoteCapability, requestedCapabilities: RemoteCapability): Capabilities = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], requestedCapabilities = requestedCapabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      inline def setCapabilities(value: RemoteCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setRequestedCapabilities(value: RemoteCapability): Self = StObject.set(x, "requestedCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var __elementOverrides__ : js.UndefOr[Value] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def set__elementOverrides__(value: Value): Self = StObject.set(x, "__elementOverrides__", value.asInstanceOf[js.Any])
      
      inline def set__elementOverrides__Undefined: Self = StObject.set(x, "__elementOverrides__", js.undefined)
    }
  }
  
  trait File extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var script: js.UndefOr[String] = js.undefined
  }
  object File {
    
    inline def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](hookName: String): js.Promise[js.Array[js.Error | T]] = js.native
    def apply[T](hookName: String, hooks: js.Array[js.Function]): js.Promise[js.Array[js.Error | T]] = js.native
    def apply[T](hookName: String, hooks: js.Array[js.Function], args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = js.native
    def apply[T](hookName: String, hooks: js.Function): js.Promise[js.Array[js.Error | T]] = js.native
    def apply[T](hookName: String, hooks: js.Function, args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = js.native
    def apply[T](hookName: String, hooks: Unit, args: js.Array[Any]): js.Promise[js.Array[js.Error | T]] = js.native
  }
  
  trait IgnoredWorkerServices extends StObject {
    
    var ignoredWorkerServices: js.Array[String]
    
    var launcherServices: js.Array[ServiceInstance]
  }
  object IgnoredWorkerServices {
    
    inline def apply(ignoredWorkerServices: js.Array[String], launcherServices: js.Array[ServiceInstance]): IgnoredWorkerServices = {
      val __obj = js.Dynamic.literal(ignoredWorkerServices = ignoredWorkerServices.asInstanceOf[js.Any], launcherServices = launcherServices.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoredWorkerServices]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoredWorkerServices] (val x: Self) extends AnyVal {
      
      inline def setIgnoredWorkerServices(value: js.Array[String]): Self = StObject.set(x, "ignoredWorkerServices", value.asInstanceOf[js.Any])
      
      inline def setIgnoredWorkerServicesVarargs(value: String*): Self = StObject.set(x, "ignoredWorkerServices", js.Array(value*))
      
      inline def setLauncherServices(value: js.Array[ServiceInstance]): Self = StObject.set(x, "launcherServices", value.asInstanceOf[js.Any])
      
      inline def setLauncherServicesVarargs(value: ServiceInstance*): Self = StObject.set(x, "launcherServices", js.Array(value*))
    }
  }
  
  trait IsAndroid extends StObject {
    
    var isAndroid: Boolean
    
    var isChrome: Boolean
    
    var isFirefox: Boolean
    
    var isIOS: Boolean
    
    var isMobile: Boolean
    
    var isSauce: Boolean
  }
  object IsAndroid {
    
    inline def apply(
      isAndroid: Boolean,
      isChrome: Boolean,
      isFirefox: Boolean,
      isIOS: Boolean,
      isMobile: Boolean,
      isSauce: Boolean
    ): IsAndroid = {
      val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsAndroid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsAndroid] (val x: Self) extends AnyVal {
      
      inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      inline def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
      
      inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsChrome extends StObject {
    
    var isAndroid: Boolean
    
    var isChrome: Boolean
    
    var isFirefox: Boolean
    
    var isIOS: Boolean
    
    var isMobile: Boolean
    
    var isSauce: Boolean
    
    var isSeleniumStandalone: Boolean
    
    var isW3C: Boolean
  }
  object IsChrome {
    
    inline def apply(
      isAndroid: Boolean,
      isChrome: Boolean,
      isFirefox: Boolean,
      isIOS: Boolean,
      isMobile: Boolean,
      isSauce: Boolean,
      isSeleniumStandalone: Boolean,
      isW3C: Boolean
    ): IsChrome = {
      val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isSeleniumStandalone = isSeleniumStandalone.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsChrome]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsChrome] (val x: Self) extends AnyVal {
      
      inline def setIsAndroid(value: Boolean): Self = StObject.set(x, "isAndroid", value.asInstanceOf[js.Any])
      
      inline def setIsChrome(value: Boolean): Self = StObject.set(x, "isChrome", value.asInstanceOf[js.Any])
      
      inline def setIsFirefox(value: Boolean): Self = StObject.set(x, "isFirefox", value.asInstanceOf[js.Any])
      
      inline def setIsIOS(value: Boolean): Self = StObject.set(x, "isIOS", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setIsSauce(value: Boolean): Self = StObject.set(x, "isSauce", value.asInstanceOf[js.Any])
      
      inline def setIsSeleniumStandalone(value: Boolean): Self = StObject.set(x, "isSeleniumStandalone", value.asInstanceOf[js.Any])
      
      inline def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsDevTools extends StObject {
    
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
  object IsDevTools {
    
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
    ): IsDevTools = {
      val __obj = js.Dynamic.literal(isAndroid = isAndroid.asInstanceOf[js.Any], isChrome = isChrome.asInstanceOf[js.Any], isDevTools = isDevTools.asInstanceOf[js.Any], isFirefox = isFirefox.asInstanceOf[js.Any], isIOS = isIOS.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], isSauce = isSauce.asInstanceOf[js.Any], isSeleniumStandalone = isSeleniumStandalone.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDevTools]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsDevTools] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Omit<@wdio/types.@wdio/types.Options.Testrunner, 'capabilities' | keyof @wdio/types.@wdio/types.Services.HookFunctions> */
  trait OmitTestrunnercapabilitie extends StObject {
    
    var agent: js.UndefOr[Http] = js.undefined
    
    var autoCompileOpts: js.UndefOr[AutoCompileConfig] = js.undefined
    
    var automationProtocol: js.UndefOr[SupportedProtocols] = js.undefined
    
    var bail: js.UndefOr[Double] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var connectionRetryCount: js.UndefOr[Double] = js.undefined
    
    var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var cucumberFeaturesWithLineNumbers: js.UndefOr[js.Array[String]] = js.undefined
    
    var cucumberOpts: js.UndefOr[CucumberOpts] = js.undefined
    
    var enableDirectConnect: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[String]] = js.undefined
    
    var filesToWatch: js.UndefOr[js.Array[String]] = js.undefined
    
    var framework: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var injectGlobals: js.UndefOr[Boolean] = js.undefined
    
    var jasmineOpts: js.UndefOr[JasmineOpts] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
    
    var logLevels: js.UndefOr[Record[String, WebDriverLogTypes]] = js.undefined
    
    var maxInstances: js.UndefOr[Double] = js.undefined
    
    var maxInstancesPerCapability: js.UndefOr[Double] = js.undefined
    
    var mochaOpts: js.UndefOr[MochaOpts] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var region: js.UndefOr[SauceRegions] = js.undefined
    
    var reporterSyncInterval: js.UndefOr[Double] = js.undefined
    
    var reporterSyncTimeout: js.UndefOr[Double] = js.undefined
    
    var reporters: js.UndefOr[js.Array[ReporterEntry]] = js.undefined
    
    var rootDir: js.UndefOr[String] = js.undefined
    
    var runner: js.UndefOr[
        local | browser | (js.Tuple2[browser | local, BrowserRunnerOptions | scala.Nothing])
      ] = js.undefined
    
    var runnerEnv: js.UndefOr[Record[String, Any]] = js.undefined
    
    var services: js.UndefOr[js.Array[ServiceEntry]] = js.undefined
    
    var specFileRetries: js.UndefOr[Double] = js.undefined
    
    var specFileRetriesDeferred: js.UndefOr[Boolean] = js.undefined
    
    var specFileRetriesDelay: js.UndefOr[Double] = js.undefined
    
    var specs: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var suites: js.UndefOr[Record[String, js.Array[js.Array[String] | String]]] = js.undefined
    
    var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ RequestLibOptions, RequestLibOptions]] = js.undefined
    
    var transformResponse: js.UndefOr[
        js.Function2[
          /* response */ RequestLibResponse, 
          /* requestOptions */ RequestLibOptions, 
          RequestLibResponse
        ]
      ] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
    
    var waitforInterval: js.UndefOr[Double] = js.undefined
    
    var waitforTimeout: js.UndefOr[Double] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object OmitTestrunnercapabilitie {
    
    inline def apply(): OmitTestrunnercapabilitie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitTestrunnercapabilitie]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitTestrunnercapabilitie] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAutoCompileOpts(value: AutoCompileConfig): Self = StObject.set(x, "autoCompileOpts", value.asInstanceOf[js.Any])
      
      inline def setAutoCompileOptsUndefined: Self = StObject.set(x, "autoCompileOpts", js.undefined)
      
      inline def setAutomationProtocol(value: SupportedProtocols): Self = StObject.set(x, "automationProtocol", value.asInstanceOf[js.Any])
      
      inline def setAutomationProtocolUndefined: Self = StObject.set(x, "automationProtocol", js.undefined)
      
      inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
      
      inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
      
      inline def setCucumberFeaturesWithLineNumbers(value: js.Array[String]): Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setCucumberFeaturesWithLineNumbersUndefined: Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", js.undefined)
      
      inline def setCucumberFeaturesWithLineNumbersVarargs(value: String*): Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", js.Array(value*))
      
      inline def setCucumberOpts(value: CucumberOpts): Self = StObject.set(x, "cucumberOpts", value.asInstanceOf[js.Any])
      
      inline def setCucumberOptsUndefined: Self = StObject.set(x, "cucumberOpts", js.undefined)
      
      inline def setEnableDirectConnect(value: Boolean): Self = StObject.set(x, "enableDirectConnect", value.asInstanceOf[js.Any])
      
      inline def setEnableDirectConnectUndefined: Self = StObject.set(x, "enableDirectConnect", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
      inline def setFilesToWatch(value: js.Array[String]): Self = StObject.set(x, "filesToWatch", value.asInstanceOf[js.Any])
      
      inline def setFilesToWatchUndefined: Self = StObject.set(x, "filesToWatch", js.undefined)
      
      inline def setFilesToWatchVarargs(value: String*): Self = StObject.set(x, "filesToWatch", js.Array(value*))
      
      inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setInjectGlobals(value: Boolean): Self = StObject.set(x, "injectGlobals", value.asInstanceOf[js.Any])
      
      inline def setInjectGlobalsUndefined: Self = StObject.set(x, "injectGlobals", js.undefined)
      
      inline def setJasmineOpts(value: JasmineOpts): Self = StObject.set(x, "jasmineOpts", value.asInstanceOf[js.Any])
      
      inline def setJasmineOptsUndefined: Self = StObject.set(x, "jasmineOpts", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogLevels(value: Record[String, WebDriverLogTypes]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
      
      inline def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
      
      inline def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
      
      inline def setMaxInstancesPerCapability(value: Double): Self = StObject.set(x, "maxInstancesPerCapability", value.asInstanceOf[js.Any])
      
      inline def setMaxInstancesPerCapabilityUndefined: Self = StObject.set(x, "maxInstancesPerCapability", js.undefined)
      
      inline def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
      
      inline def setMochaOpts(value: MochaOpts): Self = StObject.set(x, "mochaOpts", value.asInstanceOf[js.Any])
      
      inline def setMochaOptsUndefined: Self = StObject.set(x, "mochaOpts", js.undefined)
      
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
      
      inline def setReporterSyncInterval(value: Double): Self = StObject.set(x, "reporterSyncInterval", value.asInstanceOf[js.Any])
      
      inline def setReporterSyncIntervalUndefined: Self = StObject.set(x, "reporterSyncInterval", js.undefined)
      
      inline def setReporterSyncTimeout(value: Double): Self = StObject.set(x, "reporterSyncTimeout", value.asInstanceOf[js.Any])
      
      inline def setReporterSyncTimeoutUndefined: Self = StObject.set(x, "reporterSyncTimeout", js.undefined)
      
      inline def setReporters(value: js.Array[ReporterEntry]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: ReporterEntry*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRunner(value: local | browser | (js.Tuple2[browser | local, BrowserRunnerOptions | scala.Nothing])): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setRunnerEnv(value: Record[String, Any]): Self = StObject.set(x, "runnerEnv", value.asInstanceOf[js.Any])
      
      inline def setRunnerEnvUndefined: Self = StObject.set(x, "runnerEnv", js.undefined)
      
      inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      inline def setServices(value: js.Array[ServiceEntry]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      inline def setServicesVarargs(value: ServiceEntry*): Self = StObject.set(x, "services", js.Array(value*))
      
      inline def setSpecFileRetries(value: Double): Self = StObject.set(x, "specFileRetries", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDeferred(value: Boolean): Self = StObject.set(x, "specFileRetriesDeferred", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDeferredUndefined: Self = StObject.set(x, "specFileRetriesDeferred", js.undefined)
      
      inline def setSpecFileRetriesDelay(value: Double): Self = StObject.set(x, "specFileRetriesDelay", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDelayUndefined: Self = StObject.set(x, "specFileRetriesDelay", js.undefined)
      
      inline def setSpecFileRetriesUndefined: Self = StObject.set(x, "specFileRetries", js.undefined)
      
      inline def setSpecs(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
      
      inline def setSpecsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "specs", js.Array(value*))
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setSuites(value: Record[String, js.Array[js.Array[String] | String]]): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
      
      inline def setSuitesUndefined: Self = StObject.set(x, "suites", js.undefined)
      
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
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait Socket extends StObject {
    
    var socket: Partial[EventEmitter]
  }
  object Socket {
    
    inline def apply(socket: Partial[EventEmitter]): Socket = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Socket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Socket] (val x: Self) extends AnyVal {
      
      inline def setSocket(value: Partial[EventEmitter]): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: Any
  }
  object Value {
    
    inline def apply(value: Any): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
