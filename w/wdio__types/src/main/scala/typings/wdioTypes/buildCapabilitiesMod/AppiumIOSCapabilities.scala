package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppiumIOSCapabilities extends StObject {
  
  var appName: js.UndefOr[String] = js.undefined
  
  var autoAcceptAlerts: js.UndefOr[Boolean] = js.undefined
  
  var autoDismissAlerts: js.UndefOr[Boolean] = js.undefined
  
  var bundleId: js.UndefOr[String] = js.undefined
  
  var calendarFormat: js.UndefOr[String] = js.undefined
  
  var customSSLCert: js.UndefOr[String] = js.undefined
  
  var enableAsyncExecuteFromHttps: js.UndefOr[Boolean] = js.undefined
  
  var interKeyDelay: js.UndefOr[Double] = js.undefined
  
  var keepKeyChains: js.UndefOr[Boolean] = js.undefined
  
  var launchTimeout: js.UndefOr[Double] = js.undefined
  
  var localizableStringsDir: js.UndefOr[String] = js.undefined
  
  var locationServicesAuthorized: js.UndefOr[Boolean] = js.undefined
  
  var locationServicesEnabled: js.UndefOr[Boolean] = js.undefined
  
  var nativeInstrumentsLib: js.UndefOr[Boolean] = js.undefined
  
  var nativeWebTap: js.UndefOr[Boolean] = js.undefined
  
  var processArguments: js.UndefOr[String] = js.undefined
  
  var remoteDebugProxy: js.UndefOr[String] = js.undefined
  
  var safariAllowPopups: js.UndefOr[Boolean] = js.undefined
  
  var safariIgnoreFraudWarning: js.UndefOr[Boolean] = js.undefined
  
  var safariInitialUrl: js.UndefOr[String] = js.undefined
  
  var safariOpenLinksInBackground: js.UndefOr[Boolean] = js.undefined
  
  var screenshotWaitTimeout: js.UndefOr[Double] = js.undefined
  
  var sendKeyStrategy: js.UndefOr[String] = js.undefined
  
  var showIOSLog: js.UndefOr[Boolean] = js.undefined
  
  var skipLogCapture: js.UndefOr[Boolean] = js.undefined
  
  var waitForAppScript: js.UndefOr[String] = js.undefined
  
  var webkitDebugProxyPort: js.UndefOr[Double] = js.undefined
  
  var webkitResponseTimeout: js.UndefOr[Double] = js.undefined
  
  var webviewConnectRetries: js.UndefOr[Double] = js.undefined
}
object AppiumIOSCapabilities {
  
  inline def apply(): AppiumIOSCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppiumIOSCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppiumIOSCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setAutoAcceptAlerts(value: Boolean): Self = StObject.set(x, "autoAcceptAlerts", value.asInstanceOf[js.Any])
    
    inline def setAutoAcceptAlertsUndefined: Self = StObject.set(x, "autoAcceptAlerts", js.undefined)
    
    inline def setAutoDismissAlerts(value: Boolean): Self = StObject.set(x, "autoDismissAlerts", value.asInstanceOf[js.Any])
    
    inline def setAutoDismissAlertsUndefined: Self = StObject.set(x, "autoDismissAlerts", js.undefined)
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setCalendarFormat(value: String): Self = StObject.set(x, "calendarFormat", value.asInstanceOf[js.Any])
    
    inline def setCalendarFormatUndefined: Self = StObject.set(x, "calendarFormat", js.undefined)
    
    inline def setCustomSSLCert(value: String): Self = StObject.set(x, "customSSLCert", value.asInstanceOf[js.Any])
    
    inline def setCustomSSLCertUndefined: Self = StObject.set(x, "customSSLCert", js.undefined)
    
    inline def setEnableAsyncExecuteFromHttps(value: Boolean): Self = StObject.set(x, "enableAsyncExecuteFromHttps", value.asInstanceOf[js.Any])
    
    inline def setEnableAsyncExecuteFromHttpsUndefined: Self = StObject.set(x, "enableAsyncExecuteFromHttps", js.undefined)
    
    inline def setInterKeyDelay(value: Double): Self = StObject.set(x, "interKeyDelay", value.asInstanceOf[js.Any])
    
    inline def setInterKeyDelayUndefined: Self = StObject.set(x, "interKeyDelay", js.undefined)
    
    inline def setKeepKeyChains(value: Boolean): Self = StObject.set(x, "keepKeyChains", value.asInstanceOf[js.Any])
    
    inline def setKeepKeyChainsUndefined: Self = StObject.set(x, "keepKeyChains", js.undefined)
    
    inline def setLaunchTimeout(value: Double): Self = StObject.set(x, "launchTimeout", value.asInstanceOf[js.Any])
    
    inline def setLaunchTimeoutUndefined: Self = StObject.set(x, "launchTimeout", js.undefined)
    
    inline def setLocalizableStringsDir(value: String): Self = StObject.set(x, "localizableStringsDir", value.asInstanceOf[js.Any])
    
    inline def setLocalizableStringsDirUndefined: Self = StObject.set(x, "localizableStringsDir", js.undefined)
    
    inline def setLocationServicesAuthorized(value: Boolean): Self = StObject.set(x, "locationServicesAuthorized", value.asInstanceOf[js.Any])
    
    inline def setLocationServicesAuthorizedUndefined: Self = StObject.set(x, "locationServicesAuthorized", js.undefined)
    
    inline def setLocationServicesEnabled(value: Boolean): Self = StObject.set(x, "locationServicesEnabled", value.asInstanceOf[js.Any])
    
    inline def setLocationServicesEnabledUndefined: Self = StObject.set(x, "locationServicesEnabled", js.undefined)
    
    inline def setNativeInstrumentsLib(value: Boolean): Self = StObject.set(x, "nativeInstrumentsLib", value.asInstanceOf[js.Any])
    
    inline def setNativeInstrumentsLibUndefined: Self = StObject.set(x, "nativeInstrumentsLib", js.undefined)
    
    inline def setNativeWebTap(value: Boolean): Self = StObject.set(x, "nativeWebTap", value.asInstanceOf[js.Any])
    
    inline def setNativeWebTapUndefined: Self = StObject.set(x, "nativeWebTap", js.undefined)
    
    inline def setProcessArguments(value: String): Self = StObject.set(x, "processArguments", value.asInstanceOf[js.Any])
    
    inline def setProcessArgumentsUndefined: Self = StObject.set(x, "processArguments", js.undefined)
    
    inline def setRemoteDebugProxy(value: String): Self = StObject.set(x, "remoteDebugProxy", value.asInstanceOf[js.Any])
    
    inline def setRemoteDebugProxyUndefined: Self = StObject.set(x, "remoteDebugProxy", js.undefined)
    
    inline def setSafariAllowPopups(value: Boolean): Self = StObject.set(x, "safariAllowPopups", value.asInstanceOf[js.Any])
    
    inline def setSafariAllowPopupsUndefined: Self = StObject.set(x, "safariAllowPopups", js.undefined)
    
    inline def setSafariIgnoreFraudWarning(value: Boolean): Self = StObject.set(x, "safariIgnoreFraudWarning", value.asInstanceOf[js.Any])
    
    inline def setSafariIgnoreFraudWarningUndefined: Self = StObject.set(x, "safariIgnoreFraudWarning", js.undefined)
    
    inline def setSafariInitialUrl(value: String): Self = StObject.set(x, "safariInitialUrl", value.asInstanceOf[js.Any])
    
    inline def setSafariInitialUrlUndefined: Self = StObject.set(x, "safariInitialUrl", js.undefined)
    
    inline def setSafariOpenLinksInBackground(value: Boolean): Self = StObject.set(x, "safariOpenLinksInBackground", value.asInstanceOf[js.Any])
    
    inline def setSafariOpenLinksInBackgroundUndefined: Self = StObject.set(x, "safariOpenLinksInBackground", js.undefined)
    
    inline def setScreenshotWaitTimeout(value: Double): Self = StObject.set(x, "screenshotWaitTimeout", value.asInstanceOf[js.Any])
    
    inline def setScreenshotWaitTimeoutUndefined: Self = StObject.set(x, "screenshotWaitTimeout", js.undefined)
    
    inline def setSendKeyStrategy(value: String): Self = StObject.set(x, "sendKeyStrategy", value.asInstanceOf[js.Any])
    
    inline def setSendKeyStrategyUndefined: Self = StObject.set(x, "sendKeyStrategy", js.undefined)
    
    inline def setShowIOSLog(value: Boolean): Self = StObject.set(x, "showIOSLog", value.asInstanceOf[js.Any])
    
    inline def setShowIOSLogUndefined: Self = StObject.set(x, "showIOSLog", js.undefined)
    
    inline def setSkipLogCapture(value: Boolean): Self = StObject.set(x, "skipLogCapture", value.asInstanceOf[js.Any])
    
    inline def setSkipLogCaptureUndefined: Self = StObject.set(x, "skipLogCapture", js.undefined)
    
    inline def setWaitForAppScript(value: String): Self = StObject.set(x, "waitForAppScript", value.asInstanceOf[js.Any])
    
    inline def setWaitForAppScriptUndefined: Self = StObject.set(x, "waitForAppScript", js.undefined)
    
    inline def setWebkitDebugProxyPort(value: Double): Self = StObject.set(x, "webkitDebugProxyPort", value.asInstanceOf[js.Any])
    
    inline def setWebkitDebugProxyPortUndefined: Self = StObject.set(x, "webkitDebugProxyPort", js.undefined)
    
    inline def setWebkitResponseTimeout(value: Double): Self = StObject.set(x, "webkitResponseTimeout", value.asInstanceOf[js.Any])
    
    inline def setWebkitResponseTimeoutUndefined: Self = StObject.set(x, "webkitResponseTimeout", js.undefined)
    
    inline def setWebviewConnectRetries(value: Double): Self = StObject.set(x, "webviewConnectRetries", value.asInstanceOf[js.Any])
    
    inline def setWebviewConnectRetriesUndefined: Self = StObject.set(x, "webviewConnectRetries", js.undefined)
  }
}
