package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.webdriver.anon.Browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesiredCapabilities extends Capabilities {
  var acceptSslCerts: js.UndefOr[Boolean] = js.native
  var adbExecTimeout: js.UndefOr[Double] = js.native
  var adbPort: js.UndefOr[Double] = js.native
  var addCustomRequestHeaders: js.UndefOr[Boolean] = js.native
  var allowTestPackages: js.UndefOr[Boolean] = js.native
  var androidCoverage: js.UndefOr[String] = js.native
  var androidCoverageEndIntent: js.UndefOr[String] = js.native
  var androidDeviceReadyTimeout: js.UndefOr[Double] = js.native
  var androidDeviceSocket: js.UndefOr[String] = js.native
  var androidInstallPath: js.UndefOr[String] = js.native
  var androidInstallTimeout: js.UndefOr[Double] = js.native
  var androidScreenshotPath: js.UndefOr[String] = js.native
  var app: js.UndefOr[String] = js.native
  // Appium Android Only
  var appActivity: js.UndefOr[String] = js.native
  var appName: js.UndefOr[String] = js.native
  var appPackage: js.UndefOr[String] = js.native
  var appWaitActivity: js.UndefOr[String] = js.native
  var appWaitDuration: js.UndefOr[Double] = js.native
  var appWaitPackage: js.UndefOr[String] = js.native
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.native
  var autoAcceptAlerts: js.UndefOr[Boolean] = js.native
  var autoDismissAlerts: js.UndefOr[Boolean] = js.native
  var autoGrantPermissions: js.UndefOr[Boolean] = js.native
  var autoLaunch: js.UndefOr[Boolean] = js.native
  var autoWebview: js.UndefOr[Boolean] = js.native
  var autoWebviewTimeout: js.UndefOr[Double] = js.native
  // Appium General Capabilities
  var automationName: js.UndefOr[String] = js.native
  var avd: js.UndefOr[String] = js.native
  var avdArgs: js.UndefOr[String] = js.native
  var avdLaunchTimeout: js.UndefOr[Double] = js.native
  var avdReadyTimeout: js.UndefOr[Double] = js.native
  var avoidProxy: js.UndefOr[Boolean] = js.native
  var browserAttachTimeout: js.UndefOr[Double] = js.native
  var browserConnectionEnabled: js.UndefOr[Boolean] = js.native
  var browserSideLog: js.UndefOr[Boolean] = js.native
  // Browserstack w3c specific
  @JSName("bstack:options")
  var bstackColonoptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  // wdio-sauce-service specific
  var build: js.UndefOr[String] = js.native
  var bundleId: js.UndefOr[String] = js.native
  // Appium iOS Only
  var calendarFormat: js.UndefOr[String] = js.native
  var captureNetworkTraffic: js.UndefOr[Boolean] = js.native
  var changeMaxConnections: js.UndefOr[Boolean] = js.native
  // Chrome specific
  var chromeOptions: js.UndefOr[ChromeOptions] = js.native
  var chromedriverArgs: js.UndefOr[js.Array[String]] = js.native
  var chromedriverChromeMappingFile: js.UndefOr[String] = js.native
  var chromedriverDisableBuildCheck: js.UndefOr[Boolean] = js.native
  var chromedriverExecutable: js.UndefOr[String] = js.native
  var chromedriverExecutableDir: js.UndefOr[String] = js.native
  var chromedriverPort: js.UndefOr[Double] = js.native
  var chromedriverPorts: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  var chromedriverUseSystemExecutable: js.UndefOr[Boolean] = js.native
  // Selenium RC (1.0) only
  var commandLineFlags: js.UndefOr[String] = js.native
  // Read-only capabilities
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.native
  var customSSLCert: js.UndefOr[String] = js.native
  var databaseEnabled: js.UndefOr[Boolean] = js.native
  var deviceName: js.UndefOr[String] = js.native
  var deviceReadyTimeout: js.UndefOr[Double] = js.native
  var disableAndroidWatchers: js.UndefOr[Boolean] = js.native
  var disableWindowAnimation: js.UndefOr[Boolean] = js.native
  var dontInjectRegex: js.UndefOr[RegExp] = js.native
  var dontStopAppOnReset: js.UndefOr[Boolean] = js.native
  var elementScrollBehavior: js.UndefOr[Double] = js.native
  var enableAsyncExecuteFromHttps: js.UndefOr[Boolean] = js.native
  var enableElementCacheCleanup: js.UndefOr[Boolean] = js.native
  var enablePerformanceLogging: js.UndefOr[Boolean] = js.native
  var enablePersistentHover: js.UndefOr[Boolean] = js.native
  var environment: js.UndefOr[String] = js.native
  var espressoServerLaunchTimeout: js.UndefOr[Double] = js.native
  var eventTimings: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var executablePath: js.UndefOr[String] = js.native
  var extractPath: js.UndefOr[String] = js.native
  var firefoxProfileTemplate: js.UndefOr[String] = js.native
  // Firefox
  var firefox_binary: js.UndefOr[String] = js.native
  var fullReset: js.UndefOr[Boolean] = js.native
  @JSName("goog:chromeOptions")
  var googColonchromeOptions: js.UndefOr[ChromeOptions] = js.native
  var gpsEnabled: js.UndefOr[Boolean] = js.native
  var handlesAlerts: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  @JSName("ie.browserCommandLineSwitches")
  var ieDotbrowserCommandLineSwitches: js.UndefOr[String] = js.native
  @JSName("ie.edgechromium")
  var ieDotedgechromium: js.UndefOr[Boolean] = js.native
  @JSName("ie.edgepath")
  var ieDotedgepath: js.UndefOr[String] = js.native
  @JSName("ie.ensureCleanSession")
  var ieDotensureCleanSession: js.UndefOr[Boolean] = js.native
  @JSName("ie.fileUploadDialogTimeout")
  var ieDotfileUploadDialogTimeout: js.UndefOr[Double] = js.native
  // IE specific
  @JSName("ie.forceCreateProcessApi")
  var ieDotforceCreateProcessApi: js.UndefOr[Boolean] = js.native
  @JSName("ie.setProxyByServer")
  var ieDotsetProxyByServer: js.UndefOr[Boolean] = js.native
  @JSName("ie.usePerProcessProxy")
  var ieDotusePerProcessProxy: js.UndefOr[Boolean] = js.native
  var ignoreProtectedModeSettings: js.UndefOr[Boolean] = js.native
  var ignoreUnimportantViews: js.UndefOr[Boolean] = js.native
  var ignoreZoomSetting: js.UndefOr[Boolean] = js.native
  var initialBrowserUrl: js.UndefOr[String] = js.native
  var intentAction: js.UndefOr[String] = js.native
  var intentCategory: js.UndefOr[String] = js.native
  var intentFlags: js.UndefOr[String] = js.native
  var interKeyDelay: js.UndefOr[Double] = js.native
  var isHeadless: js.UndefOr[Boolean] = js.native
  // Read-write capabilities
  var javascriptEnabled: js.UndefOr[Boolean] = js.native
  var keepKeyChains: js.UndefOr[Boolean] = js.native
  var keyAlias: js.UndefOr[String] = js.native
  var keyPassword: js.UndefOr[String] = js.native
  var keystorePassword: js.UndefOr[String] = js.native
  var keystorePath: js.UndefOr[String] = js.native
  var killProcessesByName: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var launchTimeout: js.UndefOr[Double] = js.native
  var locale: js.UndefOr[String] = js.native
  var localeScript: js.UndefOr[String] = js.native
  var localizableStringsDir: js.UndefOr[String] = js.native
  var locationContextEnabled: js.UndefOr[Boolean] = js.native
  var locationServicesAuthorized: js.UndefOr[Boolean] = js.native
  var locationServicesEnabled: js.UndefOr[Boolean] = js.native
  var logFile: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[String] = js.native
  var loggingPrefs: js.UndefOr[Browser] = js.native
  var maxInstances: js.UndefOr[Double] = js.native
  var mobileEmulationEnabled: js.UndefOr[Boolean] = js.native
  @JSName("moz:firefoxOptions")
  var mozColonfirefoxOptions: js.UndefOr[FirefoxOptions] = js.native
  @JSName("ms:extensionPaths")
  var msColonextensionPaths: js.UndefOr[js.Array[String]] = js.native
  // Edge specific
  @JSName("ms:inPrivate")
  var msColoninPrivate: js.UndefOr[Boolean] = js.native
  @JSName("ms:startPage")
  var msColonstartPage: js.UndefOr[String] = js.native
  var nativeEvents: js.UndefOr[Boolean] = js.native
  var nativeInstrumentsLib: js.UndefOr[Boolean] = js.native
  var nativeWebScreenshot: js.UndefOr[Boolean] = js.native
  var nativeWebTap: js.UndefOr[Boolean] = js.native
  var networkSpeed: js.UndefOr[String] = js.native
  var newCommandTimeout: js.UndefOr[Double] = js.native
  var noReset: js.UndefOr[Boolean] = js.native
  var noSign: js.UndefOr[Boolean] = js.native
  var onlyProxySeleniumTraffic: js.UndefOr[Boolean] = js.native
  var optionalIntentArguments: js.UndefOr[String] = js.native
  var optionsSet: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[String] = js.native
  var otherApps: js.UndefOr[String] = js.native
  var pageLoadingStrategy: js.UndefOr[String] = js.native
  var platform: js.UndefOr[String] = js.native
  var platformVersion: js.UndefOr[String] = js.native
  var printPageSourceOnFindFailure: js.UndefOr[Boolean] = js.native
  var processArguments: js.UndefOr[String] = js.native
  var profile: js.UndefOr[String] = js.native
  var proxyEverything: js.UndefOr[Boolean] = js.native
  var proxyRequired: js.UndefOr[Boolean] = js.native
  var recreateChromeDriverSessions: js.UndefOr[Boolean] = js.native
  var remoteAdbHost: js.UndefOr[String] = js.native
  var remoteDebugProxy: js.UndefOr[String] = js.native
  var requireWindowFocus: js.UndefOr[Boolean] = js.native
  var resetKeyboard: js.UndefOr[Boolean] = js.native
  var rotatable: js.UndefOr[Boolean] = js.native
  var safariAllowPopups: js.UndefOr[Boolean] = js.native
  // Safari specific
  @JSName("safari.options")
  var safariDotoptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var safariIgnoreFraudWarning: js.UndefOr[Boolean] = js.native
  var safariInitialUrl: js.UndefOr[String] = js.native
  var safariOpenLinksInBackground: js.UndefOr[Boolean] = js.native
  // Saucelabs w3c specific
  @JSName("sauce:options")
  var sauceColonoptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var screenshotWaitTimeout: js.UndefOr[Double] = js.native
  // Selenese-Backed-WebDriver specific
  @JSName("selenium.server.url")
  var seleniumDotserverDoturl: js.UndefOr[String] = js.native
  // Grid-specific
  var seleniumProtocol: js.UndefOr[String] = js.native
  var sendKeyStrategy: js.UndefOr[String] = js.native
  var showIOSLog: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[String] = js.native
  var singleWindow: js.UndefOr[Boolean] = js.native
  var skipDeviceInitialization: js.UndefOr[Boolean] = js.native
  var skipLogCapture: js.UndefOr[Boolean] = js.native
  var skipLogcatCapture: js.UndefOr[Boolean] = js.native
  var skipServerInstallation: js.UndefOr[Boolean] = js.native
  var skipUnlock: js.UndefOr[Boolean] = js.native
  // webdriverio specific
  var specs: js.UndefOr[js.Array[String]] = js.native
  var systemPort: js.UndefOr[Double] = js.native
  // Testingbot w3c specific
  @JSName("tb:options")
  var tbColonoptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var timeoutInSeconds: js.UndefOr[Double] = js.native
  var trustAllSSLCertificates: js.UndefOr[Boolean] = js.native
  var udid: js.UndefOr[String] = js.native
  var uiautomator2ServerInstallTimeout: js.UndefOr[Double] = js.native
  var uiautomator2ServerLaunchTimeout: js.UndefOr[Double] = js.native
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.native
  var unicodeKeyboard: js.UndefOr[Boolean] = js.native
  var uninstallOtherPackages: js.UndefOr[String] = js.native
  var unlockKey: js.UndefOr[String] = js.native
  var unlockType: js.UndefOr[String] = js.native
  var useKeystore: js.UndefOr[Boolean] = js.native
  var userExtensions: js.UndefOr[String] = js.native
  var userJSInjection: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
  var waitForAppScript: js.UndefOr[String] = js.native
  var webStorageEnabled: js.UndefOr[Boolean] = js.native
  @JSName("webdriver.remote.quietExceptions")
  var webdriverDotremoteDotquietExceptions: js.UndefOr[Boolean] = js.native
  // RemoteWebDriver specific
  @JSName("webdriver.remote.sessionid")
  var webdriverDotremoteDotsessionid: js.UndefOr[String] = js.native
  var webkitDebugProxyPort: js.UndefOr[Double] = js.native
  var webkitResponseTimeout: js.UndefOr[Double] = js.native
  var webviewConnectRetries: js.UndefOr[Double] = js.native
}

object DesiredCapabilities {
  @scala.inline
  def apply(): DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredCapabilities]
  }
  @scala.inline
  implicit class DesiredCapabilitiesOps[Self <: DesiredCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptSslCerts(value: Boolean): Self = this.set("acceptSslCerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptSslCerts: Self = this.set("acceptSslCerts", js.undefined)
    @scala.inline
    def setAdbExecTimeout(value: Double): Self = this.set("adbExecTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdbExecTimeout: Self = this.set("adbExecTimeout", js.undefined)
    @scala.inline
    def setAdbPort(value: Double): Self = this.set("adbPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdbPort: Self = this.set("adbPort", js.undefined)
    @scala.inline
    def setAddCustomRequestHeaders(value: Boolean): Self = this.set("addCustomRequestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddCustomRequestHeaders: Self = this.set("addCustomRequestHeaders", js.undefined)
    @scala.inline
    def setAllowTestPackages(value: Boolean): Self = this.set("allowTestPackages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTestPackages: Self = this.set("allowTestPackages", js.undefined)
    @scala.inline
    def setAndroidCoverage(value: String): Self = this.set("androidCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidCoverage: Self = this.set("androidCoverage", js.undefined)
    @scala.inline
    def setAndroidCoverageEndIntent(value: String): Self = this.set("androidCoverageEndIntent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidCoverageEndIntent: Self = this.set("androidCoverageEndIntent", js.undefined)
    @scala.inline
    def setAndroidDeviceReadyTimeout(value: Double): Self = this.set("androidDeviceReadyTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDeviceReadyTimeout: Self = this.set("androidDeviceReadyTimeout", js.undefined)
    @scala.inline
    def setAndroidDeviceSocket(value: String): Self = this.set("androidDeviceSocket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDeviceSocket: Self = this.set("androidDeviceSocket", js.undefined)
    @scala.inline
    def setAndroidInstallPath(value: String): Self = this.set("androidInstallPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidInstallPath: Self = this.set("androidInstallPath", js.undefined)
    @scala.inline
    def setAndroidInstallTimeout(value: Double): Self = this.set("androidInstallTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidInstallTimeout: Self = this.set("androidInstallTimeout", js.undefined)
    @scala.inline
    def setAndroidScreenshotPath(value: String): Self = this.set("androidScreenshotPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidScreenshotPath: Self = this.set("androidScreenshotPath", js.undefined)
    @scala.inline
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setAppActivity(value: String): Self = this.set("appActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppActivity: Self = this.set("appActivity", js.undefined)
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    @scala.inline
    def setAppPackage(value: String): Self = this.set("appPackage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppPackage: Self = this.set("appPackage", js.undefined)
    @scala.inline
    def setAppWaitActivity(value: String): Self = this.set("appWaitActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppWaitActivity: Self = this.set("appWaitActivity", js.undefined)
    @scala.inline
    def setAppWaitDuration(value: Double): Self = this.set("appWaitDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppWaitDuration: Self = this.set("appWaitDuration", js.undefined)
    @scala.inline
    def setAppWaitPackage(value: String): Self = this.set("appWaitPackage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppWaitPackage: Self = this.set("appWaitPackage", js.undefined)
    @scala.inline
    def setApplicationCacheEnabled(value: Boolean): Self = this.set("applicationCacheEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationCacheEnabled: Self = this.set("applicationCacheEnabled", js.undefined)
    @scala.inline
    def setAutoAcceptAlerts(value: Boolean): Self = this.set("autoAcceptAlerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAcceptAlerts: Self = this.set("autoAcceptAlerts", js.undefined)
    @scala.inline
    def setAutoDismissAlerts(value: Boolean): Self = this.set("autoDismissAlerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDismissAlerts: Self = this.set("autoDismissAlerts", js.undefined)
    @scala.inline
    def setAutoGrantPermissions(value: Boolean): Self = this.set("autoGrantPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGrantPermissions: Self = this.set("autoGrantPermissions", js.undefined)
    @scala.inline
    def setAutoLaunch(value: Boolean): Self = this.set("autoLaunch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLaunch: Self = this.set("autoLaunch", js.undefined)
    @scala.inline
    def setAutoWebview(value: Boolean): Self = this.set("autoWebview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWebview: Self = this.set("autoWebview", js.undefined)
    @scala.inline
    def setAutoWebviewTimeout(value: Double): Self = this.set("autoWebviewTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWebviewTimeout: Self = this.set("autoWebviewTimeout", js.undefined)
    @scala.inline
    def setAutomationName(value: String): Self = this.set("automationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomationName: Self = this.set("automationName", js.undefined)
    @scala.inline
    def setAvd(value: String): Self = this.set("avd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvd: Self = this.set("avd", js.undefined)
    @scala.inline
    def setAvdArgs(value: String): Self = this.set("avdArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvdArgs: Self = this.set("avdArgs", js.undefined)
    @scala.inline
    def setAvdLaunchTimeout(value: Double): Self = this.set("avdLaunchTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvdLaunchTimeout: Self = this.set("avdLaunchTimeout", js.undefined)
    @scala.inline
    def setAvdReadyTimeout(value: Double): Self = this.set("avdReadyTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvdReadyTimeout: Self = this.set("avdReadyTimeout", js.undefined)
    @scala.inline
    def setAvoidProxy(value: Boolean): Self = this.set("avoidProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidProxy: Self = this.set("avoidProxy", js.undefined)
    @scala.inline
    def setBrowserAttachTimeout(value: Double): Self = this.set("browserAttachTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserAttachTimeout: Self = this.set("browserAttachTimeout", js.undefined)
    @scala.inline
    def setBrowserConnectionEnabled(value: Boolean): Self = this.set("browserConnectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserConnectionEnabled: Self = this.set("browserConnectionEnabled", js.undefined)
    @scala.inline
    def setBrowserSideLog(value: Boolean): Self = this.set("browserSideLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserSideLog: Self = this.set("browserSideLog", js.undefined)
    @scala.inline
    def setBstackColonoptions(value: StringDictionary[js.Any]): Self = this.set("bstack:options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBstackColonoptions: Self = this.set("bstack:options", js.undefined)
    @scala.inline
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setCalendarFormat(value: String): Self = this.set("calendarFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarFormat: Self = this.set("calendarFormat", js.undefined)
    @scala.inline
    def setCaptureNetworkTraffic(value: Boolean): Self = this.set("captureNetworkTraffic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureNetworkTraffic: Self = this.set("captureNetworkTraffic", js.undefined)
    @scala.inline
    def setChangeMaxConnections(value: Boolean): Self = this.set("changeMaxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeMaxConnections: Self = this.set("changeMaxConnections", js.undefined)
    @scala.inline
    def setChromeOptions(value: ChromeOptions): Self = this.set("chromeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromeOptions: Self = this.set("chromeOptions", js.undefined)
    @scala.inline
    def setChromedriverArgsVarargs(value: String*): Self = this.set("chromedriverArgs", js.Array(value :_*))
    @scala.inline
    def setChromedriverArgs(value: js.Array[String]): Self = this.set("chromedriverArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromedriverArgs: Self = this.set("chromedriverArgs", js.undefined)
    @scala.inline
    def setChromedriverChromeMappingFile(value: String): Self = this.set("chromedriverChromeMappingFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromedriverChromeMappingFile: Self = this.set("chromedriverChromeMappingFile", js.undefined)
    @scala.inline
    def setChromedriverDisableBuildCheck(value: Boolean): Self = this.set("chromedriverDisableBuildCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromedriverDisableBuildCheck: Self = this.set("chromedriverDisableBuildCheck", js.undefined)
    @scala.inline
    def setChromedriverExecutable(value: String): Self = this.set("chromedriverExecutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromedriverExecutable: Self = this.set("chromedriverExecutable", js.undefined)
    @scala.inline
    def setChromedriverExecutableDir(value: String): Self = this.set("chromedriverExecutableDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromedriverExecutableDir: Self = this.set("chromedriverExecutableDir", js.undefined)
    @scala.inline
    def setChromedriverPort(value: Double): Self = this.set("chromedriverPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromedriverPort: Self = this.set("chromedriverPort", js.undefined)
    @scala.inline
    def setChromedriverPortsVarargs(value: (Double | js.Array[Double])*): Self = this.set("chromedriverPorts", js.Array(value :_*))
    @scala.inline
    def setChromedriverPorts(value: js.Array[Double | js.Array[Double]]): Self = this.set("chromedriverPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromedriverPorts: Self = this.set("chromedriverPorts", js.undefined)
    @scala.inline
    def setChromedriverUseSystemExecutable(value: Boolean): Self = this.set("chromedriverUseSystemExecutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromedriverUseSystemExecutable: Self = this.set("chromedriverUseSystemExecutable", js.undefined)
    @scala.inline
    def setCommandLineFlags(value: String): Self = this.set("commandLineFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandLineFlags: Self = this.set("commandLineFlags", js.undefined)
    @scala.inline
    def setCssSelectorsEnabled(value: Boolean): Self = this.set("cssSelectorsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssSelectorsEnabled: Self = this.set("cssSelectorsEnabled", js.undefined)
    @scala.inline
    def setCustomSSLCert(value: String): Self = this.set("customSSLCert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSSLCert: Self = this.set("customSSLCert", js.undefined)
    @scala.inline
    def setDatabaseEnabled(value: Boolean): Self = this.set("databaseEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseEnabled: Self = this.set("databaseEnabled", js.undefined)
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setDeviceReadyTimeout(value: Double): Self = this.set("deviceReadyTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceReadyTimeout: Self = this.set("deviceReadyTimeout", js.undefined)
    @scala.inline
    def setDisableAndroidWatchers(value: Boolean): Self = this.set("disableAndroidWatchers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAndroidWatchers: Self = this.set("disableAndroidWatchers", js.undefined)
    @scala.inline
    def setDisableWindowAnimation(value: Boolean): Self = this.set("disableWindowAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWindowAnimation: Self = this.set("disableWindowAnimation", js.undefined)
    @scala.inline
    def setDontInjectRegex(value: RegExp): Self = this.set("dontInjectRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontInjectRegex: Self = this.set("dontInjectRegex", js.undefined)
    @scala.inline
    def setDontStopAppOnReset(value: Boolean): Self = this.set("dontStopAppOnReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontStopAppOnReset: Self = this.set("dontStopAppOnReset", js.undefined)
    @scala.inline
    def setElementScrollBehavior(value: Double): Self = this.set("elementScrollBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementScrollBehavior: Self = this.set("elementScrollBehavior", js.undefined)
    @scala.inline
    def setEnableAsyncExecuteFromHttps(value: Boolean): Self = this.set("enableAsyncExecuteFromHttps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAsyncExecuteFromHttps: Self = this.set("enableAsyncExecuteFromHttps", js.undefined)
    @scala.inline
    def setEnableElementCacheCleanup(value: Boolean): Self = this.set("enableElementCacheCleanup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableElementCacheCleanup: Self = this.set("enableElementCacheCleanup", js.undefined)
    @scala.inline
    def setEnablePerformanceLogging(value: Boolean): Self = this.set("enablePerformanceLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePerformanceLogging: Self = this.set("enablePerformanceLogging", js.undefined)
    @scala.inline
    def setEnablePersistentHover(value: Boolean): Self = this.set("enablePersistentHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistentHover: Self = this.set("enablePersistentHover", js.undefined)
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setEspressoServerLaunchTimeout(value: Double): Self = this.set("espressoServerLaunchTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEspressoServerLaunchTimeout: Self = this.set("espressoServerLaunchTimeout", js.undefined)
    @scala.inline
    def setEventTimings(value: Boolean): Self = this.set("eventTimings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTimings: Self = this.set("eventTimings", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExecutablePath(value: String): Self = this.set("executablePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutablePath: Self = this.set("executablePath", js.undefined)
    @scala.inline
    def setExtractPath(value: String): Self = this.set("extractPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractPath: Self = this.set("extractPath", js.undefined)
    @scala.inline
    def setFirefoxProfileTemplate(value: String): Self = this.set("firefoxProfileTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirefoxProfileTemplate: Self = this.set("firefoxProfileTemplate", js.undefined)
    @scala.inline
    def setFirefox_binary(value: String): Self = this.set("firefox_binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirefox_binary: Self = this.set("firefox_binary", js.undefined)
    @scala.inline
    def setFullReset(value: Boolean): Self = this.set("fullReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullReset: Self = this.set("fullReset", js.undefined)
    @scala.inline
    def setGoogColonchromeOptions(value: ChromeOptions): Self = this.set("goog:chromeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogColonchromeOptions: Self = this.set("goog:chromeOptions", js.undefined)
    @scala.inline
    def setGpsEnabled(value: Boolean): Self = this.set("gpsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGpsEnabled: Self = this.set("gpsEnabled", js.undefined)
    @scala.inline
    def setHandlesAlerts(value: Boolean): Self = this.set("handlesAlerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlesAlerts: Self = this.set("handlesAlerts", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIeDotbrowserCommandLineSwitches(value: String): Self = this.set("ie.browserCommandLineSwitches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeDotbrowserCommandLineSwitches: Self = this.set("ie.browserCommandLineSwitches", js.undefined)
    @scala.inline
    def setIeDotedgechromium(value: Boolean): Self = this.set("ie.edgechromium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeDotedgechromium: Self = this.set("ie.edgechromium", js.undefined)
    @scala.inline
    def setIeDotedgepath(value: String): Self = this.set("ie.edgepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeDotedgepath: Self = this.set("ie.edgepath", js.undefined)
    @scala.inline
    def setIeDotensureCleanSession(value: Boolean): Self = this.set("ie.ensureCleanSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeDotensureCleanSession: Self = this.set("ie.ensureCleanSession", js.undefined)
    @scala.inline
    def setIeDotfileUploadDialogTimeout(value: Double): Self = this.set("ie.fileUploadDialogTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeDotfileUploadDialogTimeout: Self = this.set("ie.fileUploadDialogTimeout", js.undefined)
    @scala.inline
    def setIeDotforceCreateProcessApi(value: Boolean): Self = this.set("ie.forceCreateProcessApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeDotforceCreateProcessApi: Self = this.set("ie.forceCreateProcessApi", js.undefined)
    @scala.inline
    def setIeDotsetProxyByServer(value: Boolean): Self = this.set("ie.setProxyByServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeDotsetProxyByServer: Self = this.set("ie.setProxyByServer", js.undefined)
    @scala.inline
    def setIeDotusePerProcessProxy(value: Boolean): Self = this.set("ie.usePerProcessProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIeDotusePerProcessProxy: Self = this.set("ie.usePerProcessProxy", js.undefined)
    @scala.inline
    def setIgnoreProtectedModeSettings(value: Boolean): Self = this.set("ignoreProtectedModeSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreProtectedModeSettings: Self = this.set("ignoreProtectedModeSettings", js.undefined)
    @scala.inline
    def setIgnoreUnimportantViews(value: Boolean): Self = this.set("ignoreUnimportantViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnimportantViews: Self = this.set("ignoreUnimportantViews", js.undefined)
    @scala.inline
    def setIgnoreZoomSetting(value: Boolean): Self = this.set("ignoreZoomSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreZoomSetting: Self = this.set("ignoreZoomSetting", js.undefined)
    @scala.inline
    def setInitialBrowserUrl(value: String): Self = this.set("initialBrowserUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialBrowserUrl: Self = this.set("initialBrowserUrl", js.undefined)
    @scala.inline
    def setIntentAction(value: String): Self = this.set("intentAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntentAction: Self = this.set("intentAction", js.undefined)
    @scala.inline
    def setIntentCategory(value: String): Self = this.set("intentCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntentCategory: Self = this.set("intentCategory", js.undefined)
    @scala.inline
    def setIntentFlags(value: String): Self = this.set("intentFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntentFlags: Self = this.set("intentFlags", js.undefined)
    @scala.inline
    def setInterKeyDelay(value: Double): Self = this.set("interKeyDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterKeyDelay: Self = this.set("interKeyDelay", js.undefined)
    @scala.inline
    def setIsHeadless(value: Boolean): Self = this.set("isHeadless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHeadless: Self = this.set("isHeadless", js.undefined)
    @scala.inline
    def setJavascriptEnabled(value: Boolean): Self = this.set("javascriptEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavascriptEnabled: Self = this.set("javascriptEnabled", js.undefined)
    @scala.inline
    def setKeepKeyChains(value: Boolean): Self = this.set("keepKeyChains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepKeyChains: Self = this.set("keepKeyChains", js.undefined)
    @scala.inline
    def setKeyAlias(value: String): Self = this.set("keyAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyAlias: Self = this.set("keyAlias", js.undefined)
    @scala.inline
    def setKeyPassword(value: String): Self = this.set("keyPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPassword: Self = this.set("keyPassword", js.undefined)
    @scala.inline
    def setKeystorePassword(value: String): Self = this.set("keystorePassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeystorePassword: Self = this.set("keystorePassword", js.undefined)
    @scala.inline
    def setKeystorePath(value: String): Self = this.set("keystorePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeystorePath: Self = this.set("keystorePath", js.undefined)
    @scala.inline
    def setKillProcessesByName(value: Boolean): Self = this.set("killProcessesByName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillProcessesByName: Self = this.set("killProcessesByName", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLaunchTimeout(value: Double): Self = this.set("launchTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTimeout: Self = this.set("launchTimeout", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLocaleScript(value: String): Self = this.set("localeScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleScript: Self = this.set("localeScript", js.undefined)
    @scala.inline
    def setLocalizableStringsDir(value: String): Self = this.set("localizableStringsDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizableStringsDir: Self = this.set("localizableStringsDir", js.undefined)
    @scala.inline
    def setLocationContextEnabled(value: Boolean): Self = this.set("locationContextEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationContextEnabled: Self = this.set("locationContextEnabled", js.undefined)
    @scala.inline
    def setLocationServicesAuthorized(value: Boolean): Self = this.set("locationServicesAuthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationServicesAuthorized: Self = this.set("locationServicesAuthorized", js.undefined)
    @scala.inline
    def setLocationServicesEnabled(value: Boolean): Self = this.set("locationServicesEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationServicesEnabled: Self = this.set("locationServicesEnabled", js.undefined)
    @scala.inline
    def setLogFile(value: String): Self = this.set("logFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogFile: Self = this.set("logFile", js.undefined)
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setLoggingPrefs(value: Browser): Self = this.set("loggingPrefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingPrefs: Self = this.set("loggingPrefs", js.undefined)
    @scala.inline
    def setMaxInstances(value: Double): Self = this.set("maxInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInstances: Self = this.set("maxInstances", js.undefined)
    @scala.inline
    def setMobileEmulationEnabled(value: Boolean): Self = this.set("mobileEmulationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileEmulationEnabled: Self = this.set("mobileEmulationEnabled", js.undefined)
    @scala.inline
    def setMozColonfirefoxOptions(value: FirefoxOptions): Self = this.set("moz:firefoxOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozColonfirefoxOptions: Self = this.set("moz:firefoxOptions", js.undefined)
    @scala.inline
    def setMsColonextensionPathsVarargs(value: String*): Self = this.set("ms:extensionPaths", js.Array(value :_*))
    @scala.inline
    def setMsColonextensionPaths(value: js.Array[String]): Self = this.set("ms:extensionPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsColonextensionPaths: Self = this.set("ms:extensionPaths", js.undefined)
    @scala.inline
    def setMsColoninPrivate(value: Boolean): Self = this.set("ms:inPrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsColoninPrivate: Self = this.set("ms:inPrivate", js.undefined)
    @scala.inline
    def setMsColonstartPage(value: String): Self = this.set("ms:startPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsColonstartPage: Self = this.set("ms:startPage", js.undefined)
    @scala.inline
    def setNativeEvents(value: Boolean): Self = this.set("nativeEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeEvents: Self = this.set("nativeEvents", js.undefined)
    @scala.inline
    def setNativeInstrumentsLib(value: Boolean): Self = this.set("nativeInstrumentsLib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeInstrumentsLib: Self = this.set("nativeInstrumentsLib", js.undefined)
    @scala.inline
    def setNativeWebScreenshot(value: Boolean): Self = this.set("nativeWebScreenshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeWebScreenshot: Self = this.set("nativeWebScreenshot", js.undefined)
    @scala.inline
    def setNativeWebTap(value: Boolean): Self = this.set("nativeWebTap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeWebTap: Self = this.set("nativeWebTap", js.undefined)
    @scala.inline
    def setNetworkSpeed(value: String): Self = this.set("networkSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkSpeed: Self = this.set("networkSpeed", js.undefined)
    @scala.inline
    def setNewCommandTimeout(value: Double): Self = this.set("newCommandTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewCommandTimeout: Self = this.set("newCommandTimeout", js.undefined)
    @scala.inline
    def setNoReset(value: Boolean): Self = this.set("noReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoReset: Self = this.set("noReset", js.undefined)
    @scala.inline
    def setNoSign(value: Boolean): Self = this.set("noSign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSign: Self = this.set("noSign", js.undefined)
    @scala.inline
    def setOnlyProxySeleniumTraffic(value: Boolean): Self = this.set("onlyProxySeleniumTraffic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyProxySeleniumTraffic: Self = this.set("onlyProxySeleniumTraffic", js.undefined)
    @scala.inline
    def setOptionalIntentArguments(value: String): Self = this.set("optionalIntentArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalIntentArguments: Self = this.set("optionalIntentArguments", js.undefined)
    @scala.inline
    def setOptionsSet(value: Boolean): Self = this.set("optionsSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsSet: Self = this.set("optionsSet", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOtherApps(value: String): Self = this.set("otherApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherApps: Self = this.set("otherApps", js.undefined)
    @scala.inline
    def setPageLoadingStrategy(value: String): Self = this.set("pageLoadingStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLoadingStrategy: Self = this.set("pageLoadingStrategy", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    @scala.inline
    def setPrintPageSourceOnFindFailure(value: Boolean): Self = this.set("printPageSourceOnFindFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintPageSourceOnFindFailure: Self = this.set("printPageSourceOnFindFailure", js.undefined)
    @scala.inline
    def setProcessArguments(value: String): Self = this.set("processArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessArguments: Self = this.set("processArguments", js.undefined)
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setProxyEverything(value: Boolean): Self = this.set("proxyEverything", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyEverything: Self = this.set("proxyEverything", js.undefined)
    @scala.inline
    def setProxyRequired(value: Boolean): Self = this.set("proxyRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyRequired: Self = this.set("proxyRequired", js.undefined)
    @scala.inline
    def setRecreateChromeDriverSessions(value: Boolean): Self = this.set("recreateChromeDriverSessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecreateChromeDriverSessions: Self = this.set("recreateChromeDriverSessions", js.undefined)
    @scala.inline
    def setRemoteAdbHost(value: String): Self = this.set("remoteAdbHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAdbHost: Self = this.set("remoteAdbHost", js.undefined)
    @scala.inline
    def setRemoteDebugProxy(value: String): Self = this.set("remoteDebugProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteDebugProxy: Self = this.set("remoteDebugProxy", js.undefined)
    @scala.inline
    def setRequireWindowFocus(value: Boolean): Self = this.set("requireWindowFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireWindowFocus: Self = this.set("requireWindowFocus", js.undefined)
    @scala.inline
    def setResetKeyboard(value: Boolean): Self = this.set("resetKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetKeyboard: Self = this.set("resetKeyboard", js.undefined)
    @scala.inline
    def setRotatable(value: Boolean): Self = this.set("rotatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotatable: Self = this.set("rotatable", js.undefined)
    @scala.inline
    def setSafariAllowPopups(value: Boolean): Self = this.set("safariAllowPopups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariAllowPopups: Self = this.set("safariAllowPopups", js.undefined)
    @scala.inline
    def setSafariDotoptions(value: StringDictionary[js.Any]): Self = this.set("safari.options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariDotoptions: Self = this.set("safari.options", js.undefined)
    @scala.inline
    def setSafariIgnoreFraudWarning(value: Boolean): Self = this.set("safariIgnoreFraudWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariIgnoreFraudWarning: Self = this.set("safariIgnoreFraudWarning", js.undefined)
    @scala.inline
    def setSafariInitialUrl(value: String): Self = this.set("safariInitialUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariInitialUrl: Self = this.set("safariInitialUrl", js.undefined)
    @scala.inline
    def setSafariOpenLinksInBackground(value: Boolean): Self = this.set("safariOpenLinksInBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafariOpenLinksInBackground: Self = this.set("safariOpenLinksInBackground", js.undefined)
    @scala.inline
    def setSauceColonoptions(value: StringDictionary[js.Any]): Self = this.set("sauce:options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSauceColonoptions: Self = this.set("sauce:options", js.undefined)
    @scala.inline
    def setScreenshotWaitTimeout(value: Double): Self = this.set("screenshotWaitTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshotWaitTimeout: Self = this.set("screenshotWaitTimeout", js.undefined)
    @scala.inline
    def setSeleniumDotserverDoturl(value: String): Self = this.set("selenium.server.url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeleniumDotserverDoturl: Self = this.set("selenium.server.url", js.undefined)
    @scala.inline
    def setSeleniumProtocol(value: String): Self = this.set("seleniumProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeleniumProtocol: Self = this.set("seleniumProtocol", js.undefined)
    @scala.inline
    def setSendKeyStrategy(value: String): Self = this.set("sendKeyStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendKeyStrategy: Self = this.set("sendKeyStrategy", js.undefined)
    @scala.inline
    def setShowIOSLog(value: Boolean): Self = this.set("showIOSLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIOSLog: Self = this.set("showIOSLog", js.undefined)
    @scala.inline
    def setSilent(value: String): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSingleWindow(value: Boolean): Self = this.set("singleWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleWindow: Self = this.set("singleWindow", js.undefined)
    @scala.inline
    def setSkipDeviceInitialization(value: Boolean): Self = this.set("skipDeviceInitialization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipDeviceInitialization: Self = this.set("skipDeviceInitialization", js.undefined)
    @scala.inline
    def setSkipLogCapture(value: Boolean): Self = this.set("skipLogCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLogCapture: Self = this.set("skipLogCapture", js.undefined)
    @scala.inline
    def setSkipLogcatCapture(value: Boolean): Self = this.set("skipLogcatCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLogcatCapture: Self = this.set("skipLogcatCapture", js.undefined)
    @scala.inline
    def setSkipServerInstallation(value: Boolean): Self = this.set("skipServerInstallation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipServerInstallation: Self = this.set("skipServerInstallation", js.undefined)
    @scala.inline
    def setSkipUnlock(value: Boolean): Self = this.set("skipUnlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipUnlock: Self = this.set("skipUnlock", js.undefined)
    @scala.inline
    def setSpecsVarargs(value: String*): Self = this.set("specs", js.Array(value :_*))
    @scala.inline
    def setSpecs(value: js.Array[String]): Self = this.set("specs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecs: Self = this.set("specs", js.undefined)
    @scala.inline
    def setSystemPort(value: Double): Self = this.set("systemPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemPort: Self = this.set("systemPort", js.undefined)
    @scala.inline
    def setTbColonoptions(value: StringDictionary[js.Any]): Self = this.set("tb:options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTbColonoptions: Self = this.set("tb:options", js.undefined)
    @scala.inline
    def setTimeoutInSeconds(value: Double): Self = this.set("timeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("timeoutInSeconds", js.undefined)
    @scala.inline
    def setTrustAllSSLCertificates(value: Boolean): Self = this.set("trustAllSSLCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustAllSSLCertificates: Self = this.set("trustAllSSLCertificates", js.undefined)
    @scala.inline
    def setUdid(value: String): Self = this.set("udid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUdid: Self = this.set("udid", js.undefined)
    @scala.inline
    def setUiautomator2ServerInstallTimeout(value: Double): Self = this.set("uiautomator2ServerInstallTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUiautomator2ServerInstallTimeout: Self = this.set("uiautomator2ServerInstallTimeout", js.undefined)
    @scala.inline
    def setUiautomator2ServerLaunchTimeout(value: Double): Self = this.set("uiautomator2ServerLaunchTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUiautomator2ServerLaunchTimeout: Self = this.set("uiautomator2ServerLaunchTimeout", js.undefined)
    @scala.inline
    def setUnexpectedAlertBehaviour(value: String): Self = this.set("unexpectedAlertBehaviour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnexpectedAlertBehaviour: Self = this.set("unexpectedAlertBehaviour", js.undefined)
    @scala.inline
    def setUnicodeKeyboard(value: Boolean): Self = this.set("unicodeKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeKeyboard: Self = this.set("unicodeKeyboard", js.undefined)
    @scala.inline
    def setUninstallOtherPackages(value: String): Self = this.set("uninstallOtherPackages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUninstallOtherPackages: Self = this.set("uninstallOtherPackages", js.undefined)
    @scala.inline
    def setUnlockKey(value: String): Self = this.set("unlockKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlockKey: Self = this.set("unlockKey", js.undefined)
    @scala.inline
    def setUnlockType(value: String): Self = this.set("unlockType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlockType: Self = this.set("unlockType", js.undefined)
    @scala.inline
    def setUseKeystore(value: Boolean): Self = this.set("useKeystore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseKeystore: Self = this.set("useKeystore", js.undefined)
    @scala.inline
    def setUserExtensions(value: String): Self = this.set("userExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserExtensions: Self = this.set("userExtensions", js.undefined)
    @scala.inline
    def setUserJSInjection(value: Boolean): Self = this.set("userJSInjection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserJSInjection: Self = this.set("userJSInjection", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWaitForAppScript(value: String): Self = this.set("waitForAppScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForAppScript: Self = this.set("waitForAppScript", js.undefined)
    @scala.inline
    def setWebStorageEnabled(value: Boolean): Self = this.set("webStorageEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebStorageEnabled: Self = this.set("webStorageEnabled", js.undefined)
    @scala.inline
    def setWebdriverDotremoteDotquietExceptions(value: Boolean): Self = this.set("webdriver.remote.quietExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebdriverDotremoteDotquietExceptions: Self = this.set("webdriver.remote.quietExceptions", js.undefined)
    @scala.inline
    def setWebdriverDotremoteDotsessionid(value: String): Self = this.set("webdriver.remote.sessionid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebdriverDotremoteDotsessionid: Self = this.set("webdriver.remote.sessionid", js.undefined)
    @scala.inline
    def setWebkitDebugProxyPort(value: Double): Self = this.set("webkitDebugProxyPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitDebugProxyPort: Self = this.set("webkitDebugProxyPort", js.undefined)
    @scala.inline
    def setWebkitResponseTimeout(value: Double): Self = this.set("webkitResponseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitResponseTimeout: Self = this.set("webkitResponseTimeout", js.undefined)
    @scala.inline
    def setWebviewConnectRetries(value: Double): Self = this.set("webviewConnectRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebviewConnectRetries: Self = this.set("webviewConnectRetries", js.undefined)
  }
  
}

