package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCafeConfigurationOptions
  extends StObject
     with RunOptions
     with StartOptions {
  
  var appCommand: String
  
  var appInitDelay: js.UndefOr[Double] = js.undefined
  
  var browsers: BrowserOptions
  
  var clientScripts: ClientScriptOptions
  
  var compilerOptions: CompilerOptions
  
  var concurrency: ConcurrencyOption
  
  var filter: FilterDescriptor
  
  var proxy: String
  
  var proxyBypass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var reporter: ReporterOptions
  
  var screenshots: ScreenshotsOptions
  
  var src: SourceOptions
  
  var videoEncodingOptions: js.UndefOr[VideoEncodingOptions] = js.undefined
  
  var videoOptions: js.UndefOr[VideoOptions] = js.undefined
  
  var videoPath: String
}
object TestCafeConfigurationOptions {
  
  inline def apply(
    ajaxRequestTimeout: Double,
    appCommand: String,
    assertionTimeout: Double,
    browserInitTimeout: Double,
    browsers: BrowserOptions,
    cache: Boolean,
    clientScripts: ClientScriptOptions,
    compilerOptions: CompilerOptions,
    concurrency: ConcurrencyOption,
    configFile: String,
    debugMode: Boolean,
    debugOnFail: Boolean,
    developmentMode: Boolean,
    disableHttp2: Boolean,
    disableMultipleWindows: Boolean,
    disablePageCaching: Boolean,
    disableScreenshots: Boolean,
    filter: FilterDescriptor,
    hostname: String,
    pageLoadTimeout: Double,
    pageRequestTimeout: Double,
    port1: Double,
    port2: Double,
    proxy: String,
    quarantineMode: Boolean | QuarantineModeOptions,
    reporter: ReporterOptions,
    retryTestPages: Boolean,
    runExecutionTimeout: Double,
    screenshots: ScreenshotsOptions,
    selectorTimeout: Double,
    skipJsErrors: Boolean | SkipJsErrorsOptionsObject | SkipJsErrorsCallback | SkipJsErrorsCallbackWithOptionsObject,
    skipUncaughtErrors: Boolean,
    speed: Double,
    src: SourceOptions,
    ssl: TlsOptions,
    stopOnFirstFail: Boolean,
    testExecutionTimeout: Double,
    videoPath: String
  ): TestCafeConfigurationOptions = {
    val __obj = js.Dynamic.literal(ajaxRequestTimeout = ajaxRequestTimeout.asInstanceOf[js.Any], appCommand = appCommand.asInstanceOf[js.Any], assertionTimeout = assertionTimeout.asInstanceOf[js.Any], browserInitTimeout = browserInitTimeout.asInstanceOf[js.Any], browsers = browsers.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], clientScripts = clientScripts.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], concurrency = concurrency.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], debugMode = debugMode.asInstanceOf[js.Any], debugOnFail = debugOnFail.asInstanceOf[js.Any], developmentMode = developmentMode.asInstanceOf[js.Any], disableHttp2 = disableHttp2.asInstanceOf[js.Any], disableMultipleWindows = disableMultipleWindows.asInstanceOf[js.Any], disablePageCaching = disablePageCaching.asInstanceOf[js.Any], disableScreenshots = disableScreenshots.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pageRequestTimeout = pageRequestTimeout.asInstanceOf[js.Any], port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], quarantineMode = quarantineMode.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], retryTestPages = retryTestPages.asInstanceOf[js.Any], runExecutionTimeout = runExecutionTimeout.asInstanceOf[js.Any], screenshots = screenshots.asInstanceOf[js.Any], selectorTimeout = selectorTimeout.asInstanceOf[js.Any], skipJsErrors = skipJsErrors.asInstanceOf[js.Any], skipUncaughtErrors = skipUncaughtErrors.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], stopOnFirstFail = stopOnFirstFail.asInstanceOf[js.Any], testExecutionTimeout = testExecutionTimeout.asInstanceOf[js.Any], videoPath = videoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCafeConfigurationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestCafeConfigurationOptions] (val x: Self) extends AnyVal {
    
    inline def setAppCommand(value: String): Self = StObject.set(x, "appCommand", value.asInstanceOf[js.Any])
    
    inline def setAppInitDelay(value: Double): Self = StObject.set(x, "appInitDelay", value.asInstanceOf[js.Any])
    
    inline def setAppInitDelayUndefined: Self = StObject.set(x, "appInitDelay", js.undefined)
    
    inline def setBrowsers(value: BrowserOptions): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersVarargs(value: BrowserOption*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setClientScripts(value: ClientScriptOptions): Self = StObject.set(x, "clientScripts", value.asInstanceOf[js.Any])
    
    inline def setClientScriptsVarargs(value: ClientScript*): Self = StObject.set(x, "clientScripts", js.Array(value*))
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setConcurrency(value: ConcurrencyOption): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: FilterDescriptor): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyBypass(value: String | js.Array[String]): Self = StObject.set(x, "proxyBypass", value.asInstanceOf[js.Any])
    
    inline def setProxyBypassUndefined: Self = StObject.set(x, "proxyBypass", js.undefined)
    
    inline def setProxyBypassVarargs(value: String*): Self = StObject.set(x, "proxyBypass", js.Array(value*))
    
    inline def setReporter(value: ReporterOptions): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterVarargs(value: Any*): Self = StObject.set(x, "reporter", js.Array(value*))
    
    inline def setScreenshots(value: ScreenshotsOptions): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: SourceOptions): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcVarargs(value: SourceOption*): Self = StObject.set(x, "src", js.Array(value*))
    
    inline def setVideoEncodingOptions(value: VideoEncodingOptions): Self = StObject.set(x, "videoEncodingOptions", value.asInstanceOf[js.Any])
    
    inline def setVideoEncodingOptionsUndefined: Self = StObject.set(x, "videoEncodingOptions", js.undefined)
    
    inline def setVideoOptions(value: VideoOptions): Self = StObject.set(x, "videoOptions", value.asInstanceOf[js.Any])
    
    inline def setVideoOptionsUndefined: Self = StObject.set(x, "videoOptions", js.undefined)
    
    inline def setVideoPath(value: String): Self = StObject.set(x, "videoPath", value.asInstanceOf[js.Any])
  }
}
