package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IECapabilities extends StObject {
  
  var browserAttachTimeout: js.UndefOr[Double] = js.undefined
  
  var enableElementCacheCleanup: js.UndefOr[Boolean] = js.undefined
  
  var enablePersistentHover: js.UndefOr[Boolean] = js.undefined
  
  var extractPath: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  @JSName("ie.browserCommandLineSwitches")
  var ieDotbrowserCommandLineSwitches: js.UndefOr[String] = js.undefined
  
  @JSName("ie.edgechromium")
  var ieDotedgechromium: js.UndefOr[Boolean] = js.undefined
  
  @JSName("ie.edgepath")
  var ieDotedgepath: js.UndefOr[String] = js.undefined
  
  @JSName("ie.ensureCleanSession")
  var ieDotensureCleanSession: js.UndefOr[Boolean] = js.undefined
  
  @JSName("ie.fileUploadDialogTimeout")
  var ieDotfileUploadDialogTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("ie.forceCreateProcessApi")
  var ieDotforceCreateProcessApi: js.UndefOr[Boolean] = js.undefined
  
  @JSName("ie.setProxyByServer")
  var ieDotsetProxyByServer: js.UndefOr[Boolean] = js.undefined
  
  @JSName("ie.usePerProcessProxy")
  var ieDotusePerProcessProxy: js.UndefOr[Boolean] = js.undefined
  
  var ignoreProtectedModeSettings: js.UndefOr[Boolean] = js.undefined
  
  var ignoreZoomSetting: js.UndefOr[Boolean] = js.undefined
  
  var initialBrowserUrl: js.UndefOr[String] = js.undefined
  
  var killProcessesByName: js.UndefOr[Boolean] = js.undefined
  
  var logFile: js.UndefOr[String] = js.undefined
  
  var logLevel: js.UndefOr[String] = js.undefined
  
  var requireWindowFocus: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[String] = js.undefined
}
object IECapabilities {
  
  inline def apply(): IECapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IECapabilities]
  }
  
  extension [Self <: IECapabilities](x: Self) {
    
    inline def setBrowserAttachTimeout(value: Double): Self = StObject.set(x, "browserAttachTimeout", value.asInstanceOf[js.Any])
    
    inline def setBrowserAttachTimeoutUndefined: Self = StObject.set(x, "browserAttachTimeout", js.undefined)
    
    inline def setEnableElementCacheCleanup(value: Boolean): Self = StObject.set(x, "enableElementCacheCleanup", value.asInstanceOf[js.Any])
    
    inline def setEnableElementCacheCleanupUndefined: Self = StObject.set(x, "enableElementCacheCleanup", js.undefined)
    
    inline def setEnablePersistentHover(value: Boolean): Self = StObject.set(x, "enablePersistentHover", value.asInstanceOf[js.Any])
    
    inline def setEnablePersistentHoverUndefined: Self = StObject.set(x, "enablePersistentHover", js.undefined)
    
    inline def setExtractPath(value: String): Self = StObject.set(x, "extractPath", value.asInstanceOf[js.Any])
    
    inline def setExtractPathUndefined: Self = StObject.set(x, "extractPath", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIeDotbrowserCommandLineSwitches(value: String): Self = StObject.set(x, "ie.browserCommandLineSwitches", value.asInstanceOf[js.Any])
    
    inline def setIeDotbrowserCommandLineSwitchesUndefined: Self = StObject.set(x, "ie.browserCommandLineSwitches", js.undefined)
    
    inline def setIeDotedgechromium(value: Boolean): Self = StObject.set(x, "ie.edgechromium", value.asInstanceOf[js.Any])
    
    inline def setIeDotedgechromiumUndefined: Self = StObject.set(x, "ie.edgechromium", js.undefined)
    
    inline def setIeDotedgepath(value: String): Self = StObject.set(x, "ie.edgepath", value.asInstanceOf[js.Any])
    
    inline def setIeDotedgepathUndefined: Self = StObject.set(x, "ie.edgepath", js.undefined)
    
    inline def setIeDotensureCleanSession(value: Boolean): Self = StObject.set(x, "ie.ensureCleanSession", value.asInstanceOf[js.Any])
    
    inline def setIeDotensureCleanSessionUndefined: Self = StObject.set(x, "ie.ensureCleanSession", js.undefined)
    
    inline def setIeDotfileUploadDialogTimeout(value: Double): Self = StObject.set(x, "ie.fileUploadDialogTimeout", value.asInstanceOf[js.Any])
    
    inline def setIeDotfileUploadDialogTimeoutUndefined: Self = StObject.set(x, "ie.fileUploadDialogTimeout", js.undefined)
    
    inline def setIeDotforceCreateProcessApi(value: Boolean): Self = StObject.set(x, "ie.forceCreateProcessApi", value.asInstanceOf[js.Any])
    
    inline def setIeDotforceCreateProcessApiUndefined: Self = StObject.set(x, "ie.forceCreateProcessApi", js.undefined)
    
    inline def setIeDotsetProxyByServer(value: Boolean): Self = StObject.set(x, "ie.setProxyByServer", value.asInstanceOf[js.Any])
    
    inline def setIeDotsetProxyByServerUndefined: Self = StObject.set(x, "ie.setProxyByServer", js.undefined)
    
    inline def setIeDotusePerProcessProxy(value: Boolean): Self = StObject.set(x, "ie.usePerProcessProxy", value.asInstanceOf[js.Any])
    
    inline def setIeDotusePerProcessProxyUndefined: Self = StObject.set(x, "ie.usePerProcessProxy", js.undefined)
    
    inline def setIgnoreProtectedModeSettings(value: Boolean): Self = StObject.set(x, "ignoreProtectedModeSettings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreProtectedModeSettingsUndefined: Self = StObject.set(x, "ignoreProtectedModeSettings", js.undefined)
    
    inline def setIgnoreZoomSetting(value: Boolean): Self = StObject.set(x, "ignoreZoomSetting", value.asInstanceOf[js.Any])
    
    inline def setIgnoreZoomSettingUndefined: Self = StObject.set(x, "ignoreZoomSetting", js.undefined)
    
    inline def setInitialBrowserUrl(value: String): Self = StObject.set(x, "initialBrowserUrl", value.asInstanceOf[js.Any])
    
    inline def setInitialBrowserUrlUndefined: Self = StObject.set(x, "initialBrowserUrl", js.undefined)
    
    inline def setKillProcessesByName(value: Boolean): Self = StObject.set(x, "killProcessesByName", value.asInstanceOf[js.Any])
    
    inline def setKillProcessesByNameUndefined: Self = StObject.set(x, "killProcessesByName", js.undefined)
    
    inline def setLogFile(value: String): Self = StObject.set(x, "logFile", value.asInstanceOf[js.Any])
    
    inline def setLogFileUndefined: Self = StObject.set(x, "logFile", js.undefined)
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setRequireWindowFocus(value: Boolean): Self = StObject.set(x, "requireWindowFocus", value.asInstanceOf[js.Any])
    
    inline def setRequireWindowFocusUndefined: Self = StObject.set(x, "requireWindowFocus", js.undefined)
    
    inline def setSilent(value: String): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
