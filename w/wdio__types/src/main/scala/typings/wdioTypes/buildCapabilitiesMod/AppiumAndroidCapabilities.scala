package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppiumAndroidCapabilities extends StObject {
  
  var adbExecTimeout: js.UndefOr[Double] = js.undefined
  
  var adbPort: js.UndefOr[Double] = js.undefined
  
  var allowTestPackages: js.UndefOr[Boolean] = js.undefined
  
  var androidCoverage: js.UndefOr[String] = js.undefined
  
  var androidCoverageEndIntent: js.UndefOr[String] = js.undefined
  
  var androidDeviceReadyTimeout: js.UndefOr[Double] = js.undefined
  
  var androidDeviceSocket: js.UndefOr[String] = js.undefined
  
  var androidInstallPath: js.UndefOr[String] = js.undefined
  
  var androidInstallTimeout: js.UndefOr[Double] = js.undefined
  
  var androidScreenshotPath: js.UndefOr[String] = js.undefined
  
  var appActivity: js.UndefOr[String] = js.undefined
  
  var appPackage: js.UndefOr[String] = js.undefined
  
  var appWaitActivity: js.UndefOr[String] = js.undefined
  
  var appWaitDuration: js.UndefOr[Double] = js.undefined
  
  var appWaitPackage: js.UndefOr[String] = js.undefined
  
  var appiumVersion: js.UndefOr[String] = js.undefined
  
  var autoGrantPermissions: js.UndefOr[Boolean] = js.undefined
  
  var autoLaunch: js.UndefOr[Boolean] = js.undefined
  
  var autoWebviewTimeout: js.UndefOr[Double] = js.undefined
  
  var avd: js.UndefOr[String] = js.undefined
  
  var avdArgs: js.UndefOr[String] = js.undefined
  
  var avdLaunchTimeout: js.UndefOr[Double] = js.undefined
  
  var avdReadyTimeout: js.UndefOr[Double] = js.undefined
  
  var chromedriverArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  var chromedriverChromeMappingFile: js.UndefOr[String] = js.undefined
  
  var chromedriverDisableBuildCheck: js.UndefOr[Boolean] = js.undefined
  
  var chromedriverExecutable: js.UndefOr[String] = js.undefined
  
  var chromedriverExecutableDir: js.UndefOr[String] = js.undefined
  
  var chromedriverPort: js.UndefOr[Double] = js.undefined
  
  var chromedriverPorts: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  
  var chromedriverUseSystemExecutable: js.UndefOr[Boolean] = js.undefined
  
  var deviceReadyTimeout: js.UndefOr[Double] = js.undefined
  
  var disableAndroidWatchers: js.UndefOr[Boolean] = js.undefined
  
  var disableSuppressAccessibilityService: js.UndefOr[Boolean] = js.undefined
  
  var disableWindowAnimation: js.UndefOr[Boolean] = js.undefined
  
  var dontStopAppOnReset: js.UndefOr[Boolean] = js.undefined
  
  var espressoServerLaunchTimeout: js.UndefOr[Double] = js.undefined
  
  var gpsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var ignoreUnimportantViews: js.UndefOr[Boolean] = js.undefined
  
  var intentAction: js.UndefOr[String] = js.undefined
  
  var intentCategory: js.UndefOr[String] = js.undefined
  
  var intentFlags: js.UndefOr[String] = js.undefined
  
  var isHeadless: js.UndefOr[Boolean] = js.undefined
  
  var keyAlias: js.UndefOr[String] = js.undefined
  
  var keyPassword: js.UndefOr[String] = js.undefined
  
  var keystorePassword: js.UndefOr[String] = js.undefined
  
  var keystorePath: js.UndefOr[String] = js.undefined
  
  var localeScript: js.UndefOr[String] = js.undefined
  
  var nativeWebScreenshot: js.UndefOr[Boolean] = js.undefined
  
  var networkSpeed: js.UndefOr[String] = js.undefined
  
  var noSign: js.UndefOr[Boolean] = js.undefined
  
  var optionalIntentArguments: js.UndefOr[String] = js.undefined
  
  var otherApps: js.UndefOr[String] = js.undefined
  
  var recreateChromeDriverSessions: js.UndefOr[Boolean] = js.undefined
  
  var remoteAdbHost: js.UndefOr[String] = js.undefined
  
  var resetKeyboard: js.UndefOr[Boolean] = js.undefined
  
  var skipDeviceInitialization: js.UndefOr[Boolean] = js.undefined
  
  var skipLogcatCapture: js.UndefOr[Boolean] = js.undefined
  
  var skipServerInstallation: js.UndefOr[Boolean] = js.undefined
  
  var skipUnlock: js.UndefOr[Boolean] = js.undefined
  
  var systemPort: js.UndefOr[Double] = js.undefined
  
  var uiautomator2ServerInstallTimeout: js.UndefOr[Double] = js.undefined
  
  var uiautomator2ServerLaunchTimeout: js.UndefOr[Double] = js.undefined
  
  var unicodeKeyboard: js.UndefOr[Boolean] = js.undefined
  
  var uninstallOtherPackages: js.UndefOr[String] = js.undefined
  
  var unlockKey: js.UndefOr[String] = js.undefined
  
  var unlockType: js.UndefOr[String] = js.undefined
  
  var useKeystore: js.UndefOr[Boolean] = js.undefined
}
object AppiumAndroidCapabilities {
  
  inline def apply(): AppiumAndroidCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppiumAndroidCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppiumAndroidCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAdbExecTimeout(value: Double): Self = StObject.set(x, "adbExecTimeout", value.asInstanceOf[js.Any])
    
    inline def setAdbExecTimeoutUndefined: Self = StObject.set(x, "adbExecTimeout", js.undefined)
    
    inline def setAdbPort(value: Double): Self = StObject.set(x, "adbPort", value.asInstanceOf[js.Any])
    
    inline def setAdbPortUndefined: Self = StObject.set(x, "adbPort", js.undefined)
    
    inline def setAllowTestPackages(value: Boolean): Self = StObject.set(x, "allowTestPackages", value.asInstanceOf[js.Any])
    
    inline def setAllowTestPackagesUndefined: Self = StObject.set(x, "allowTestPackages", js.undefined)
    
    inline def setAndroidCoverage(value: String): Self = StObject.set(x, "androidCoverage", value.asInstanceOf[js.Any])
    
    inline def setAndroidCoverageEndIntent(value: String): Self = StObject.set(x, "androidCoverageEndIntent", value.asInstanceOf[js.Any])
    
    inline def setAndroidCoverageEndIntentUndefined: Self = StObject.set(x, "androidCoverageEndIntent", js.undefined)
    
    inline def setAndroidCoverageUndefined: Self = StObject.set(x, "androidCoverage", js.undefined)
    
    inline def setAndroidDeviceReadyTimeout(value: Double): Self = StObject.set(x, "androidDeviceReadyTimeout", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceReadyTimeoutUndefined: Self = StObject.set(x, "androidDeviceReadyTimeout", js.undefined)
    
    inline def setAndroidDeviceSocket(value: String): Self = StObject.set(x, "androidDeviceSocket", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceSocketUndefined: Self = StObject.set(x, "androidDeviceSocket", js.undefined)
    
    inline def setAndroidInstallPath(value: String): Self = StObject.set(x, "androidInstallPath", value.asInstanceOf[js.Any])
    
    inline def setAndroidInstallPathUndefined: Self = StObject.set(x, "androidInstallPath", js.undefined)
    
    inline def setAndroidInstallTimeout(value: Double): Self = StObject.set(x, "androidInstallTimeout", value.asInstanceOf[js.Any])
    
    inline def setAndroidInstallTimeoutUndefined: Self = StObject.set(x, "androidInstallTimeout", js.undefined)
    
    inline def setAndroidScreenshotPath(value: String): Self = StObject.set(x, "androidScreenshotPath", value.asInstanceOf[js.Any])
    
    inline def setAndroidScreenshotPathUndefined: Self = StObject.set(x, "androidScreenshotPath", js.undefined)
    
    inline def setAppActivity(value: String): Self = StObject.set(x, "appActivity", value.asInstanceOf[js.Any])
    
    inline def setAppActivityUndefined: Self = StObject.set(x, "appActivity", js.undefined)
    
    inline def setAppPackage(value: String): Self = StObject.set(x, "appPackage", value.asInstanceOf[js.Any])
    
    inline def setAppPackageUndefined: Self = StObject.set(x, "appPackage", js.undefined)
    
    inline def setAppWaitActivity(value: String): Self = StObject.set(x, "appWaitActivity", value.asInstanceOf[js.Any])
    
    inline def setAppWaitActivityUndefined: Self = StObject.set(x, "appWaitActivity", js.undefined)
    
    inline def setAppWaitDuration(value: Double): Self = StObject.set(x, "appWaitDuration", value.asInstanceOf[js.Any])
    
    inline def setAppWaitDurationUndefined: Self = StObject.set(x, "appWaitDuration", js.undefined)
    
    inline def setAppWaitPackage(value: String): Self = StObject.set(x, "appWaitPackage", value.asInstanceOf[js.Any])
    
    inline def setAppWaitPackageUndefined: Self = StObject.set(x, "appWaitPackage", js.undefined)
    
    inline def setAppiumVersion(value: String): Self = StObject.set(x, "appiumVersion", value.asInstanceOf[js.Any])
    
    inline def setAppiumVersionUndefined: Self = StObject.set(x, "appiumVersion", js.undefined)
    
    inline def setAutoGrantPermissions(value: Boolean): Self = StObject.set(x, "autoGrantPermissions", value.asInstanceOf[js.Any])
    
    inline def setAutoGrantPermissionsUndefined: Self = StObject.set(x, "autoGrantPermissions", js.undefined)
    
    inline def setAutoLaunch(value: Boolean): Self = StObject.set(x, "autoLaunch", value.asInstanceOf[js.Any])
    
    inline def setAutoLaunchUndefined: Self = StObject.set(x, "autoLaunch", js.undefined)
    
    inline def setAutoWebviewTimeout(value: Double): Self = StObject.set(x, "autoWebviewTimeout", value.asInstanceOf[js.Any])
    
    inline def setAutoWebviewTimeoutUndefined: Self = StObject.set(x, "autoWebviewTimeout", js.undefined)
    
    inline def setAvd(value: String): Self = StObject.set(x, "avd", value.asInstanceOf[js.Any])
    
    inline def setAvdArgs(value: String): Self = StObject.set(x, "avdArgs", value.asInstanceOf[js.Any])
    
    inline def setAvdArgsUndefined: Self = StObject.set(x, "avdArgs", js.undefined)
    
    inline def setAvdLaunchTimeout(value: Double): Self = StObject.set(x, "avdLaunchTimeout", value.asInstanceOf[js.Any])
    
    inline def setAvdLaunchTimeoutUndefined: Self = StObject.set(x, "avdLaunchTimeout", js.undefined)
    
    inline def setAvdReadyTimeout(value: Double): Self = StObject.set(x, "avdReadyTimeout", value.asInstanceOf[js.Any])
    
    inline def setAvdReadyTimeoutUndefined: Self = StObject.set(x, "avdReadyTimeout", js.undefined)
    
    inline def setAvdUndefined: Self = StObject.set(x, "avd", js.undefined)
    
    inline def setChromedriverArgs(value: js.Array[String]): Self = StObject.set(x, "chromedriverArgs", value.asInstanceOf[js.Any])
    
    inline def setChromedriverArgsUndefined: Self = StObject.set(x, "chromedriverArgs", js.undefined)
    
    inline def setChromedriverArgsVarargs(value: String*): Self = StObject.set(x, "chromedriverArgs", js.Array(value*))
    
    inline def setChromedriverChromeMappingFile(value: String): Self = StObject.set(x, "chromedriverChromeMappingFile", value.asInstanceOf[js.Any])
    
    inline def setChromedriverChromeMappingFileUndefined: Self = StObject.set(x, "chromedriverChromeMappingFile", js.undefined)
    
    inline def setChromedriverDisableBuildCheck(value: Boolean): Self = StObject.set(x, "chromedriverDisableBuildCheck", value.asInstanceOf[js.Any])
    
    inline def setChromedriverDisableBuildCheckUndefined: Self = StObject.set(x, "chromedriverDisableBuildCheck", js.undefined)
    
    inline def setChromedriverExecutable(value: String): Self = StObject.set(x, "chromedriverExecutable", value.asInstanceOf[js.Any])
    
    inline def setChromedriverExecutableDir(value: String): Self = StObject.set(x, "chromedriverExecutableDir", value.asInstanceOf[js.Any])
    
    inline def setChromedriverExecutableDirUndefined: Self = StObject.set(x, "chromedriverExecutableDir", js.undefined)
    
    inline def setChromedriverExecutableUndefined: Self = StObject.set(x, "chromedriverExecutable", js.undefined)
    
    inline def setChromedriverPort(value: Double): Self = StObject.set(x, "chromedriverPort", value.asInstanceOf[js.Any])
    
    inline def setChromedriverPortUndefined: Self = StObject.set(x, "chromedriverPort", js.undefined)
    
    inline def setChromedriverPorts(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "chromedriverPorts", value.asInstanceOf[js.Any])
    
    inline def setChromedriverPortsUndefined: Self = StObject.set(x, "chromedriverPorts", js.undefined)
    
    inline def setChromedriverPortsVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "chromedriverPorts", js.Array(value*))
    
    inline def setChromedriverUseSystemExecutable(value: Boolean): Self = StObject.set(x, "chromedriverUseSystemExecutable", value.asInstanceOf[js.Any])
    
    inline def setChromedriverUseSystemExecutableUndefined: Self = StObject.set(x, "chromedriverUseSystemExecutable", js.undefined)
    
    inline def setDeviceReadyTimeout(value: Double): Self = StObject.set(x, "deviceReadyTimeout", value.asInstanceOf[js.Any])
    
    inline def setDeviceReadyTimeoutUndefined: Self = StObject.set(x, "deviceReadyTimeout", js.undefined)
    
    inline def setDisableAndroidWatchers(value: Boolean): Self = StObject.set(x, "disableAndroidWatchers", value.asInstanceOf[js.Any])
    
    inline def setDisableAndroidWatchersUndefined: Self = StObject.set(x, "disableAndroidWatchers", js.undefined)
    
    inline def setDisableSuppressAccessibilityService(value: Boolean): Self = StObject.set(x, "disableSuppressAccessibilityService", value.asInstanceOf[js.Any])
    
    inline def setDisableSuppressAccessibilityServiceUndefined: Self = StObject.set(x, "disableSuppressAccessibilityService", js.undefined)
    
    inline def setDisableWindowAnimation(value: Boolean): Self = StObject.set(x, "disableWindowAnimation", value.asInstanceOf[js.Any])
    
    inline def setDisableWindowAnimationUndefined: Self = StObject.set(x, "disableWindowAnimation", js.undefined)
    
    inline def setDontStopAppOnReset(value: Boolean): Self = StObject.set(x, "dontStopAppOnReset", value.asInstanceOf[js.Any])
    
    inline def setDontStopAppOnResetUndefined: Self = StObject.set(x, "dontStopAppOnReset", js.undefined)
    
    inline def setEspressoServerLaunchTimeout(value: Double): Self = StObject.set(x, "espressoServerLaunchTimeout", value.asInstanceOf[js.Any])
    
    inline def setEspressoServerLaunchTimeoutUndefined: Self = StObject.set(x, "espressoServerLaunchTimeout", js.undefined)
    
    inline def setGpsEnabled(value: Boolean): Self = StObject.set(x, "gpsEnabled", value.asInstanceOf[js.Any])
    
    inline def setGpsEnabledUndefined: Self = StObject.set(x, "gpsEnabled", js.undefined)
    
    inline def setIgnoreUnimportantViews(value: Boolean): Self = StObject.set(x, "ignoreUnimportantViews", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnimportantViewsUndefined: Self = StObject.set(x, "ignoreUnimportantViews", js.undefined)
    
    inline def setIntentAction(value: String): Self = StObject.set(x, "intentAction", value.asInstanceOf[js.Any])
    
    inline def setIntentActionUndefined: Self = StObject.set(x, "intentAction", js.undefined)
    
    inline def setIntentCategory(value: String): Self = StObject.set(x, "intentCategory", value.asInstanceOf[js.Any])
    
    inline def setIntentCategoryUndefined: Self = StObject.set(x, "intentCategory", js.undefined)
    
    inline def setIntentFlags(value: String): Self = StObject.set(x, "intentFlags", value.asInstanceOf[js.Any])
    
    inline def setIntentFlagsUndefined: Self = StObject.set(x, "intentFlags", js.undefined)
    
    inline def setIsHeadless(value: Boolean): Self = StObject.set(x, "isHeadless", value.asInstanceOf[js.Any])
    
    inline def setIsHeadlessUndefined: Self = StObject.set(x, "isHeadless", js.undefined)
    
    inline def setKeyAlias(value: String): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
    
    inline def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
    
    inline def setKeyPassword(value: String): Self = StObject.set(x, "keyPassword", value.asInstanceOf[js.Any])
    
    inline def setKeyPasswordUndefined: Self = StObject.set(x, "keyPassword", js.undefined)
    
    inline def setKeystorePassword(value: String): Self = StObject.set(x, "keystorePassword", value.asInstanceOf[js.Any])
    
    inline def setKeystorePasswordUndefined: Self = StObject.set(x, "keystorePassword", js.undefined)
    
    inline def setKeystorePath(value: String): Self = StObject.set(x, "keystorePath", value.asInstanceOf[js.Any])
    
    inline def setKeystorePathUndefined: Self = StObject.set(x, "keystorePath", js.undefined)
    
    inline def setLocaleScript(value: String): Self = StObject.set(x, "localeScript", value.asInstanceOf[js.Any])
    
    inline def setLocaleScriptUndefined: Self = StObject.set(x, "localeScript", js.undefined)
    
    inline def setNativeWebScreenshot(value: Boolean): Self = StObject.set(x, "nativeWebScreenshot", value.asInstanceOf[js.Any])
    
    inline def setNativeWebScreenshotUndefined: Self = StObject.set(x, "nativeWebScreenshot", js.undefined)
    
    inline def setNetworkSpeed(value: String): Self = StObject.set(x, "networkSpeed", value.asInstanceOf[js.Any])
    
    inline def setNetworkSpeedUndefined: Self = StObject.set(x, "networkSpeed", js.undefined)
    
    inline def setNoSign(value: Boolean): Self = StObject.set(x, "noSign", value.asInstanceOf[js.Any])
    
    inline def setNoSignUndefined: Self = StObject.set(x, "noSign", js.undefined)
    
    inline def setOptionalIntentArguments(value: String): Self = StObject.set(x, "optionalIntentArguments", value.asInstanceOf[js.Any])
    
    inline def setOptionalIntentArgumentsUndefined: Self = StObject.set(x, "optionalIntentArguments", js.undefined)
    
    inline def setOtherApps(value: String): Self = StObject.set(x, "otherApps", value.asInstanceOf[js.Any])
    
    inline def setOtherAppsUndefined: Self = StObject.set(x, "otherApps", js.undefined)
    
    inline def setRecreateChromeDriverSessions(value: Boolean): Self = StObject.set(x, "recreateChromeDriverSessions", value.asInstanceOf[js.Any])
    
    inline def setRecreateChromeDriverSessionsUndefined: Self = StObject.set(x, "recreateChromeDriverSessions", js.undefined)
    
    inline def setRemoteAdbHost(value: String): Self = StObject.set(x, "remoteAdbHost", value.asInstanceOf[js.Any])
    
    inline def setRemoteAdbHostUndefined: Self = StObject.set(x, "remoteAdbHost", js.undefined)
    
    inline def setResetKeyboard(value: Boolean): Self = StObject.set(x, "resetKeyboard", value.asInstanceOf[js.Any])
    
    inline def setResetKeyboardUndefined: Self = StObject.set(x, "resetKeyboard", js.undefined)
    
    inline def setSkipDeviceInitialization(value: Boolean): Self = StObject.set(x, "skipDeviceInitialization", value.asInstanceOf[js.Any])
    
    inline def setSkipDeviceInitializationUndefined: Self = StObject.set(x, "skipDeviceInitialization", js.undefined)
    
    inline def setSkipLogcatCapture(value: Boolean): Self = StObject.set(x, "skipLogcatCapture", value.asInstanceOf[js.Any])
    
    inline def setSkipLogcatCaptureUndefined: Self = StObject.set(x, "skipLogcatCapture", js.undefined)
    
    inline def setSkipServerInstallation(value: Boolean): Self = StObject.set(x, "skipServerInstallation", value.asInstanceOf[js.Any])
    
    inline def setSkipServerInstallationUndefined: Self = StObject.set(x, "skipServerInstallation", js.undefined)
    
    inline def setSkipUnlock(value: Boolean): Self = StObject.set(x, "skipUnlock", value.asInstanceOf[js.Any])
    
    inline def setSkipUnlockUndefined: Self = StObject.set(x, "skipUnlock", js.undefined)
    
    inline def setSystemPort(value: Double): Self = StObject.set(x, "systemPort", value.asInstanceOf[js.Any])
    
    inline def setSystemPortUndefined: Self = StObject.set(x, "systemPort", js.undefined)
    
    inline def setUiautomator2ServerInstallTimeout(value: Double): Self = StObject.set(x, "uiautomator2ServerInstallTimeout", value.asInstanceOf[js.Any])
    
    inline def setUiautomator2ServerInstallTimeoutUndefined: Self = StObject.set(x, "uiautomator2ServerInstallTimeout", js.undefined)
    
    inline def setUiautomator2ServerLaunchTimeout(value: Double): Self = StObject.set(x, "uiautomator2ServerLaunchTimeout", value.asInstanceOf[js.Any])
    
    inline def setUiautomator2ServerLaunchTimeoutUndefined: Self = StObject.set(x, "uiautomator2ServerLaunchTimeout", js.undefined)
    
    inline def setUnicodeKeyboard(value: Boolean): Self = StObject.set(x, "unicodeKeyboard", value.asInstanceOf[js.Any])
    
    inline def setUnicodeKeyboardUndefined: Self = StObject.set(x, "unicodeKeyboard", js.undefined)
    
    inline def setUninstallOtherPackages(value: String): Self = StObject.set(x, "uninstallOtherPackages", value.asInstanceOf[js.Any])
    
    inline def setUninstallOtherPackagesUndefined: Self = StObject.set(x, "uninstallOtherPackages", js.undefined)
    
    inline def setUnlockKey(value: String): Self = StObject.set(x, "unlockKey", value.asInstanceOf[js.Any])
    
    inline def setUnlockKeyUndefined: Self = StObject.set(x, "unlockKey", js.undefined)
    
    inline def setUnlockType(value: String): Self = StObject.set(x, "unlockType", value.asInstanceOf[js.Any])
    
    inline def setUnlockTypeUndefined: Self = StObject.set(x, "unlockType", js.undefined)
    
    inline def setUseKeystore(value: Boolean): Self = StObject.set(x, "useKeystore", value.asInstanceOf[js.Any])
    
    inline def setUseKeystoreUndefined: Self = StObject.set(x, "useKeystore", js.undefined)
  }
}
