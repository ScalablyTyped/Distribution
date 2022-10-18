package typings.testcafe

import typings.testcafe.mod.global.BrowserOption
import typings.testcafe.mod.global.BrowserOptions
import typings.testcafe.mod.global.ClientScript
import typings.testcafe.mod.global.ClientScriptOptions
import typings.testcafe.mod.global.CompilerOptions
import typings.testcafe.mod.global.ConcurrencyOption
import typings.testcafe.mod.global.FilterDescriptor
import typings.testcafe.mod.global.QuarantineModeOptions
import typings.testcafe.mod.global.ReporterOptions
import typings.testcafe.mod.global.ScreenshotsOptions
import typings.testcafe.mod.global.SkipJsErrorsCallback
import typings.testcafe.mod.global.SkipJsErrorsCallbackWithOptionsObject
import typings.testcafe.mod.global.SkipJsErrorsOptionsObject
import typings.testcafe.mod.global.SourceOption
import typings.testcafe.mod.global.SourceOptions
import typings.testcafe.mod.global.TlsOptions
import typings.testcafe.mod.global.VideoEncodingOptions
import typings.testcafe.mod.global.VideoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message extends StObject {
    
    var message: String
    
    var pageUrl: String
    
    var stack: String
  }
  object Message {
    
    inline def apply(message: String, pageUrl: String, stack: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var version: String
  }
  object Name {
    
    inline def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<testcafe.testcafe.<global>.RunOptions> */
  trait PartialRunOptions extends StObject {
    
    var ajaxRequestTimeout: js.UndefOr[Double] = js.undefined
    
    var assertionTimeout: js.UndefOr[Double] = js.undefined
    
    var browserInitTimeout: js.UndefOr[Double] = js.undefined
    
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    var debugOnFail: js.UndefOr[Boolean] = js.undefined
    
    var disableMultipleWindows: js.UndefOr[Boolean] = js.undefined
    
    var disablePageCaching: js.UndefOr[Boolean] = js.undefined
    
    var disableScreenshots: js.UndefOr[Boolean] = js.undefined
    
    var pageLoadTimeout: js.UndefOr[Double] = js.undefined
    
    var pageRequestTimeout: js.UndefOr[Double] = js.undefined
    
    var quarantineMode: js.UndefOr[Boolean | QuarantineModeOptions] = js.undefined
    
    var runExecutionTimeout: js.UndefOr[Double] = js.undefined
    
    var selectorTimeout: js.UndefOr[Double] = js.undefined
    
    var skipJsErrors: js.UndefOr[
        Boolean | SkipJsErrorsOptionsObject | SkipJsErrorsCallback | SkipJsErrorsCallbackWithOptionsObject
      ] = js.undefined
    
    var skipUncaughtErrors: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var stopOnFirstFail: js.UndefOr[Boolean] = js.undefined
    
    var testExecutionTimeout: js.UndefOr[Double] = js.undefined
  }
  object PartialRunOptions {
    
    inline def apply(): PartialRunOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRunOptions]
    }
    
    extension [Self <: PartialRunOptions](x: Self) {
      
      inline def setAjaxRequestTimeout(value: Double): Self = StObject.set(x, "ajaxRequestTimeout", value.asInstanceOf[js.Any])
      
      inline def setAjaxRequestTimeoutUndefined: Self = StObject.set(x, "ajaxRequestTimeout", js.undefined)
      
      inline def setAssertionTimeout(value: Double): Self = StObject.set(x, "assertionTimeout", value.asInstanceOf[js.Any])
      
      inline def setAssertionTimeoutUndefined: Self = StObject.set(x, "assertionTimeout", js.undefined)
      
      inline def setBrowserInitTimeout(value: Double): Self = StObject.set(x, "browserInitTimeout", value.asInstanceOf[js.Any])
      
      inline def setBrowserInitTimeoutUndefined: Self = StObject.set(x, "browserInitTimeout", js.undefined)
      
      inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      inline def setDebugOnFail(value: Boolean): Self = StObject.set(x, "debugOnFail", value.asInstanceOf[js.Any])
      
      inline def setDebugOnFailUndefined: Self = StObject.set(x, "debugOnFail", js.undefined)
      
      inline def setDisableMultipleWindows(value: Boolean): Self = StObject.set(x, "disableMultipleWindows", value.asInstanceOf[js.Any])
      
      inline def setDisableMultipleWindowsUndefined: Self = StObject.set(x, "disableMultipleWindows", js.undefined)
      
      inline def setDisablePageCaching(value: Boolean): Self = StObject.set(x, "disablePageCaching", value.asInstanceOf[js.Any])
      
      inline def setDisablePageCachingUndefined: Self = StObject.set(x, "disablePageCaching", js.undefined)
      
      inline def setDisableScreenshots(value: Boolean): Self = StObject.set(x, "disableScreenshots", value.asInstanceOf[js.Any])
      
      inline def setDisableScreenshotsUndefined: Self = StObject.set(x, "disableScreenshots", js.undefined)
      
      inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
      
      inline def setPageLoadTimeoutUndefined: Self = StObject.set(x, "pageLoadTimeout", js.undefined)
      
      inline def setPageRequestTimeout(value: Double): Self = StObject.set(x, "pageRequestTimeout", value.asInstanceOf[js.Any])
      
      inline def setPageRequestTimeoutUndefined: Self = StObject.set(x, "pageRequestTimeout", js.undefined)
      
      inline def setQuarantineMode(value: Boolean | QuarantineModeOptions): Self = StObject.set(x, "quarantineMode", value.asInstanceOf[js.Any])
      
      inline def setQuarantineModeUndefined: Self = StObject.set(x, "quarantineMode", js.undefined)
      
      inline def setRunExecutionTimeout(value: Double): Self = StObject.set(x, "runExecutionTimeout", value.asInstanceOf[js.Any])
      
      inline def setRunExecutionTimeoutUndefined: Self = StObject.set(x, "runExecutionTimeout", js.undefined)
      
      inline def setSelectorTimeout(value: Double): Self = StObject.set(x, "selectorTimeout", value.asInstanceOf[js.Any])
      
      inline def setSelectorTimeoutUndefined: Self = StObject.set(x, "selectorTimeout", js.undefined)
      
      inline def setSkipJsErrors(
        value: Boolean | SkipJsErrorsOptionsObject | SkipJsErrorsCallback | SkipJsErrorsCallbackWithOptionsObject
      ): Self = StObject.set(x, "skipJsErrors", value.asInstanceOf[js.Any])
      
      inline def setSkipJsErrorsFunction1(value: /* opts */ js.UndefOr[Message] => Boolean): Self = StObject.set(x, "skipJsErrors", js.Any.fromFunction1(value))
      
      inline def setSkipJsErrorsUndefined: Self = StObject.set(x, "skipJsErrors", js.undefined)
      
      inline def setSkipUncaughtErrors(value: Boolean): Self = StObject.set(x, "skipUncaughtErrors", value.asInstanceOf[js.Any])
      
      inline def setSkipUncaughtErrorsUndefined: Self = StObject.set(x, "skipUncaughtErrors", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStopOnFirstFail(value: Boolean): Self = StObject.set(x, "stopOnFirstFail", value.asInstanceOf[js.Any])
      
      inline def setStopOnFirstFailUndefined: Self = StObject.set(x, "stopOnFirstFail", js.undefined)
      
      inline def setTestExecutionTimeout(value: Double): Self = StObject.set(x, "testExecutionTimeout", value.asInstanceOf[js.Any])
      
      inline def setTestExecutionTimeoutUndefined: Self = StObject.set(x, "testExecutionTimeout", js.undefined)
    }
  }
  
  /* Inlined std.Partial<testcafe.testcafe.<global>.TestCafeConfigurationOptions> */
  trait PartialTestCafeConfigurat extends StObject {
    
    var ajaxRequestTimeout: js.UndefOr[Double] = js.undefined
    
    var appCommand: js.UndefOr[String] = js.undefined
    
    var appInitDelay: js.UndefOr[Double] = js.undefined
    
    var assertionTimeout: js.UndefOr[Double] = js.undefined
    
    var browserInitTimeout: js.UndefOr[Double] = js.undefined
    
    var browsers: js.UndefOr[BrowserOptions] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var clientScripts: js.UndefOr[ClientScriptOptions] = js.undefined
    
    var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
    
    var concurrency: js.UndefOr[ConcurrencyOption] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    var debugOnFail: js.UndefOr[Boolean] = js.undefined
    
    var developmentMode: js.UndefOr[Boolean] = js.undefined
    
    var disableHttp2: js.UndefOr[Boolean] = js.undefined
    
    var disableMultipleWindows: js.UndefOr[Boolean] = js.undefined
    
    var disablePageCaching: js.UndefOr[Boolean] = js.undefined
    
    var disableScreenshots: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[FilterDescriptor] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var pageLoadTimeout: js.UndefOr[Double] = js.undefined
    
    var pageRequestTimeout: js.UndefOr[Double] = js.undefined
    
    var port1: js.UndefOr[Double] = js.undefined
    
    var port2: js.UndefOr[Double] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var proxyBypass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var quarantineMode: js.UndefOr[Boolean | QuarantineModeOptions] = js.undefined
    
    var reporter: js.UndefOr[ReporterOptions] = js.undefined
    
    var retryTestPages: js.UndefOr[Boolean] = js.undefined
    
    var runExecutionTimeout: js.UndefOr[Double] = js.undefined
    
    var screenshots: js.UndefOr[ScreenshotsOptions] = js.undefined
    
    var selectorTimeout: js.UndefOr[Double] = js.undefined
    
    var skipJsErrors: js.UndefOr[
        Boolean | SkipJsErrorsOptionsObject | SkipJsErrorsCallback | SkipJsErrorsCallbackWithOptionsObject
      ] = js.undefined
    
    var skipUncaughtErrors: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var src: js.UndefOr[SourceOptions] = js.undefined
    
    var ssl: js.UndefOr[TlsOptions] = js.undefined
    
    var stopOnFirstFail: js.UndefOr[Boolean] = js.undefined
    
    var testExecutionTimeout: js.UndefOr[Double] = js.undefined
    
    var videoEncodingOptions: js.UndefOr[VideoEncodingOptions] = js.undefined
    
    var videoOptions: js.UndefOr[VideoOptions] = js.undefined
    
    var videoPath: js.UndefOr[String] = js.undefined
  }
  object PartialTestCafeConfigurat {
    
    inline def apply(): PartialTestCafeConfigurat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTestCafeConfigurat]
    }
    
    extension [Self <: PartialTestCafeConfigurat](x: Self) {
      
      inline def setAjaxRequestTimeout(value: Double): Self = StObject.set(x, "ajaxRequestTimeout", value.asInstanceOf[js.Any])
      
      inline def setAjaxRequestTimeoutUndefined: Self = StObject.set(x, "ajaxRequestTimeout", js.undefined)
      
      inline def setAppCommand(value: String): Self = StObject.set(x, "appCommand", value.asInstanceOf[js.Any])
      
      inline def setAppCommandUndefined: Self = StObject.set(x, "appCommand", js.undefined)
      
      inline def setAppInitDelay(value: Double): Self = StObject.set(x, "appInitDelay", value.asInstanceOf[js.Any])
      
      inline def setAppInitDelayUndefined: Self = StObject.set(x, "appInitDelay", js.undefined)
      
      inline def setAssertionTimeout(value: Double): Self = StObject.set(x, "assertionTimeout", value.asInstanceOf[js.Any])
      
      inline def setAssertionTimeoutUndefined: Self = StObject.set(x, "assertionTimeout", js.undefined)
      
      inline def setBrowserInitTimeout(value: Double): Self = StObject.set(x, "browserInitTimeout", value.asInstanceOf[js.Any])
      
      inline def setBrowserInitTimeoutUndefined: Self = StObject.set(x, "browserInitTimeout", js.undefined)
      
      inline def setBrowsers(value: BrowserOptions): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: BrowserOption*): Self = StObject.set(x, "browsers", js.Array(value*))
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setClientScripts(value: ClientScriptOptions): Self = StObject.set(x, "clientScripts", value.asInstanceOf[js.Any])
      
      inline def setClientScriptsUndefined: Self = StObject.set(x, "clientScripts", js.undefined)
      
      inline def setClientScriptsVarargs(value: ClientScript*): Self = StObject.set(x, "clientScripts", js.Array(value*))
      
      inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setConcurrency(value: ConcurrencyOption): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      inline def setDebugOnFail(value: Boolean): Self = StObject.set(x, "debugOnFail", value.asInstanceOf[js.Any])
      
      inline def setDebugOnFailUndefined: Self = StObject.set(x, "debugOnFail", js.undefined)
      
      inline def setDevelopmentMode(value: Boolean): Self = StObject.set(x, "developmentMode", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentModeUndefined: Self = StObject.set(x, "developmentMode", js.undefined)
      
      inline def setDisableHttp2(value: Boolean): Self = StObject.set(x, "disableHttp2", value.asInstanceOf[js.Any])
      
      inline def setDisableHttp2Undefined: Self = StObject.set(x, "disableHttp2", js.undefined)
      
      inline def setDisableMultipleWindows(value: Boolean): Self = StObject.set(x, "disableMultipleWindows", value.asInstanceOf[js.Any])
      
      inline def setDisableMultipleWindowsUndefined: Self = StObject.set(x, "disableMultipleWindows", js.undefined)
      
      inline def setDisablePageCaching(value: Boolean): Self = StObject.set(x, "disablePageCaching", value.asInstanceOf[js.Any])
      
      inline def setDisablePageCachingUndefined: Self = StObject.set(x, "disablePageCaching", js.undefined)
      
      inline def setDisableScreenshots(value: Boolean): Self = StObject.set(x, "disableScreenshots", value.asInstanceOf[js.Any])
      
      inline def setDisableScreenshotsUndefined: Self = StObject.set(x, "disableScreenshots", js.undefined)
      
      inline def setFilter(value: FilterDescriptor): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
      
      inline def setPageLoadTimeoutUndefined: Self = StObject.set(x, "pageLoadTimeout", js.undefined)
      
      inline def setPageRequestTimeout(value: Double): Self = StObject.set(x, "pageRequestTimeout", value.asInstanceOf[js.Any])
      
      inline def setPageRequestTimeoutUndefined: Self = StObject.set(x, "pageRequestTimeout", js.undefined)
      
      inline def setPort1(value: Double): Self = StObject.set(x, "port1", value.asInstanceOf[js.Any])
      
      inline def setPort1Undefined: Self = StObject.set(x, "port1", js.undefined)
      
      inline def setPort2(value: Double): Self = StObject.set(x, "port2", value.asInstanceOf[js.Any])
      
      inline def setPort2Undefined: Self = StObject.set(x, "port2", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyBypass(value: String | js.Array[String]): Self = StObject.set(x, "proxyBypass", value.asInstanceOf[js.Any])
      
      inline def setProxyBypassUndefined: Self = StObject.set(x, "proxyBypass", js.undefined)
      
      inline def setProxyBypassVarargs(value: String*): Self = StObject.set(x, "proxyBypass", js.Array(value*))
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQuarantineMode(value: Boolean | QuarantineModeOptions): Self = StObject.set(x, "quarantineMode", value.asInstanceOf[js.Any])
      
      inline def setQuarantineModeUndefined: Self = StObject.set(x, "quarantineMode", js.undefined)
      
      inline def setReporter(value: ReporterOptions): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setReporterVarargs(value: Any*): Self = StObject.set(x, "reporter", js.Array(value*))
      
      inline def setRetryTestPages(value: Boolean): Self = StObject.set(x, "retryTestPages", value.asInstanceOf[js.Any])
      
      inline def setRetryTestPagesUndefined: Self = StObject.set(x, "retryTestPages", js.undefined)
      
      inline def setRunExecutionTimeout(value: Double): Self = StObject.set(x, "runExecutionTimeout", value.asInstanceOf[js.Any])
      
      inline def setRunExecutionTimeoutUndefined: Self = StObject.set(x, "runExecutionTimeout", js.undefined)
      
      inline def setScreenshots(value: ScreenshotsOptions): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
      
      inline def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
      
      inline def setSelectorTimeout(value: Double): Self = StObject.set(x, "selectorTimeout", value.asInstanceOf[js.Any])
      
      inline def setSelectorTimeoutUndefined: Self = StObject.set(x, "selectorTimeout", js.undefined)
      
      inline def setSkipJsErrors(
        value: Boolean | SkipJsErrorsOptionsObject | SkipJsErrorsCallback | SkipJsErrorsCallbackWithOptionsObject
      ): Self = StObject.set(x, "skipJsErrors", value.asInstanceOf[js.Any])
      
      inline def setSkipJsErrorsFunction1(value: /* opts */ js.UndefOr[Message] => Boolean): Self = StObject.set(x, "skipJsErrors", js.Any.fromFunction1(value))
      
      inline def setSkipJsErrorsUndefined: Self = StObject.set(x, "skipJsErrors", js.undefined)
      
      inline def setSkipUncaughtErrors(value: Boolean): Self = StObject.set(x, "skipUncaughtErrors", value.asInstanceOf[js.Any])
      
      inline def setSkipUncaughtErrorsUndefined: Self = StObject.set(x, "skipUncaughtErrors", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSrc(value: SourceOptions): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcVarargs(value: SourceOption*): Self = StObject.set(x, "src", js.Array(value*))
      
      inline def setSsl(value: TlsOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setStopOnFirstFail(value: Boolean): Self = StObject.set(x, "stopOnFirstFail", value.asInstanceOf[js.Any])
      
      inline def setStopOnFirstFailUndefined: Self = StObject.set(x, "stopOnFirstFail", js.undefined)
      
      inline def setTestExecutionTimeout(value: Double): Self = StObject.set(x, "testExecutionTimeout", value.asInstanceOf[js.Any])
      
      inline def setTestExecutionTimeoutUndefined: Self = StObject.set(x, "testExecutionTimeout", js.undefined)
      
      inline def setVideoEncodingOptions(value: VideoEncodingOptions): Self = StObject.set(x, "videoEncodingOptions", value.asInstanceOf[js.Any])
      
      inline def setVideoEncodingOptionsUndefined: Self = StObject.set(x, "videoEncodingOptions", js.undefined)
      
      inline def setVideoOptions(value: VideoOptions): Self = StObject.set(x, "videoOptions", value.asInstanceOf[js.Any])
      
      inline def setVideoOptionsUndefined: Self = StObject.set(x, "videoOptions", js.undefined)
      
      inline def setVideoPath(value: String): Self = StObject.set(x, "videoPath", value.asInstanceOf[js.Any])
      
      inline def setVideoPathUndefined: Self = StObject.set(x, "videoPath", js.undefined)
    }
  }
  
  trait ReturnDOMNodes extends StObject {
    
    var returnDOMNodes: js.UndefOr[Boolean] = js.undefined
  }
  object ReturnDOMNodes {
    
    inline def apply(): ReturnDOMNodes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReturnDOMNodes]
    }
    
    extension [Self <: ReturnDOMNodes](x: Self) {
      
      inline def setReturnDOMNodes(value: Boolean): Self = StObject.set(x, "returnDOMNodes", value.asInstanceOf[js.Any])
      
      inline def setReturnDOMNodesUndefined: Self = StObject.set(x, "returnDOMNodes", js.undefined)
    }
  }
}
