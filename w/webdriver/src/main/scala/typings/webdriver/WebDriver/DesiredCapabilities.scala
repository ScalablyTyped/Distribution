package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.webdriver.Anon_Browser
import typings.webdriver.Anon_BufferUsageReportingInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesiredCapabilities extends Capabilities {
  var acceptSslCerts: js.UndefOr[Boolean] = js.undefined
  var adbExecTimeout: js.UndefOr[Double] = js.undefined
  var adbPort: js.UndefOr[Double] = js.undefined
  var addCustomRequestHeaders: js.UndefOr[Boolean] = js.undefined
  var allowTestPackages: js.UndefOr[Boolean] = js.undefined
  var androidCoverage: js.UndefOr[String] = js.undefined
  var androidCoverageEndIntent: js.UndefOr[String] = js.undefined
  var androidDeviceReadyTimeout: js.UndefOr[Double] = js.undefined
  var androidDeviceSocket: js.UndefOr[String] = js.undefined
  var androidInstallPath: js.UndefOr[String] = js.undefined
  var androidInstallTimeout: js.UndefOr[Double] = js.undefined
  var androidScreenshotPath: js.UndefOr[String] = js.undefined
  var app: js.UndefOr[String] = js.undefined
  // Appium Android Only
  var appActivity: js.UndefOr[String] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  var appPackage: js.UndefOr[String] = js.undefined
  var appWaitActivity: js.UndefOr[String] = js.undefined
  var appWaitDuration: js.UndefOr[Double] = js.undefined
  var appWaitPackage: js.UndefOr[String] = js.undefined
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.undefined
  var autoAcceptAlerts: js.UndefOr[Boolean] = js.undefined
  var autoDismissAlerts: js.UndefOr[Boolean] = js.undefined
  var autoGrantPermissions: js.UndefOr[Boolean] = js.undefined
  var autoLaunch: js.UndefOr[Boolean] = js.undefined
  var autoWebview: js.UndefOr[Boolean] = js.undefined
  var autoWebviewTimeout: js.UndefOr[Double] = js.undefined
  // Appium General Capabilities
  var automationName: js.UndefOr[String] = js.undefined
  var avd: js.UndefOr[String] = js.undefined
  var avdArgs: js.UndefOr[String] = js.undefined
  var avdLaunchTimeout: js.UndefOr[Double] = js.undefined
  var avdReadyTimeout: js.UndefOr[Double] = js.undefined
  var avoidProxy: js.UndefOr[Boolean] = js.undefined
  var browserAttachTimeout: js.UndefOr[Double] = js.undefined
  var browserConnectionEnabled: js.UndefOr[Boolean] = js.undefined
  var browserSideLog: js.UndefOr[Boolean] = js.undefined
  // Browserstack w3c specific
  var `bstack:options`: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  // wdio-sauce-service specific
  var build: js.UndefOr[String] = js.undefined
  var bundleId: js.UndefOr[String] = js.undefined
  // Appium iOS Only
  var calendarFormat: js.UndefOr[String] = js.undefined
  var captureNetworkTraffic: js.UndefOr[Boolean] = js.undefined
  var changeMaxConnections: js.UndefOr[Boolean] = js.undefined
  // Chrome specific
  var chromeOptions: js.UndefOr[ChromeOptions] = js.undefined
  var chromedriverArgs: js.UndefOr[js.Array[String]] = js.undefined
  var chromedriverChromeMappingFile: js.UndefOr[String] = js.undefined
  var chromedriverDisableBuildCheck: js.UndefOr[Boolean] = js.undefined
  var chromedriverExecutable: js.UndefOr[String] = js.undefined
  var chromedriverExecutableDir: js.UndefOr[String] = js.undefined
  var chromedriverPort: js.UndefOr[Double] = js.undefined
  var chromedriverPorts: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  var chromedriverUseSystemExecutable: js.UndefOr[Boolean] = js.undefined
  var cleanSession: js.UndefOr[Boolean] = js.undefined
  // Selenium RC (1.0) only
  var commandLineFlags: js.UndefOr[String] = js.undefined
  // Read-only capabilities
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined
  var customSSLCert: js.UndefOr[String] = js.undefined
  var databaseEnabled: js.UndefOr[Boolean] = js.undefined
  var deviceName: js.UndefOr[String] = js.undefined
  var deviceReadyTimeout: js.UndefOr[Double] = js.undefined
  var disableAndroidWatchers: js.UndefOr[Boolean] = js.undefined
  var disableWindowAnimation: js.UndefOr[Boolean] = js.undefined
  var dontInjectRegex: js.UndefOr[RegExp] = js.undefined
  var dontStopAppOnReset: js.UndefOr[Boolean] = js.undefined
  var elementScrollBehavior: js.UndefOr[Double] = js.undefined
  var enableAsyncExecuteFromHttps: js.UndefOr[Boolean] = js.undefined
  var enableElementCacheCleanup: js.UndefOr[Boolean] = js.undefined
  var enablePerformanceLogging: js.UndefOr[Boolean] = js.undefined
  var enablePersistentHover: js.UndefOr[Boolean] = js.undefined
  var environment: js.UndefOr[String] = js.undefined
  var espressoServerLaunchTimeout: js.UndefOr[Double] = js.undefined
  var eventTimings: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var executablePath: js.UndefOr[String] = js.undefined
  var extractPath: js.UndefOr[String] = js.undefined
  var firefoxProfileTemplate: js.UndefOr[String] = js.undefined
  // Firefox
  var firefox_binary: js.UndefOr[String] = js.undefined
  var fullReset: js.UndefOr[Boolean] = js.undefined
  var `goog:chromeOptions`: js.UndefOr[ChromeOptions] = js.undefined
  var gpsEnabled: js.UndefOr[Boolean] = js.undefined
  var handlesAlerts: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var `ie.browserCommandLineSwitches`: js.UndefOr[String] = js.undefined
  var `ie.ensureCleanSession`: js.UndefOr[Boolean] = js.undefined
  // IE specific
  var `ie.forceCreateProcessApi`: js.UndefOr[Boolean] = js.undefined
  var `ie.setProxyByServer`: js.UndefOr[Boolean] = js.undefined
  var `ie.usePerProcessProxy`: js.UndefOr[Boolean] = js.undefined
  var ignoreProtectedModeSettings: js.UndefOr[Boolean] = js.undefined
  var ignoreUnimportantViews: js.UndefOr[Boolean] = js.undefined
  var ignoreZoomSetting: js.UndefOr[Boolean] = js.undefined
  var initialBrowserUrl: js.UndefOr[String] = js.undefined
  var intentAction: js.UndefOr[String] = js.undefined
  var intentCategory: js.UndefOr[String] = js.undefined
  var intentFlags: js.UndefOr[String] = js.undefined
  var interKeyDelay: js.UndefOr[Double] = js.undefined
  var isHeadless: js.UndefOr[Boolean] = js.undefined
  // Read-write capabilities
  var javascriptEnabled: js.UndefOr[Boolean] = js.undefined
  var keepKeyChains: js.UndefOr[Boolean] = js.undefined
  var keyAlias: js.UndefOr[String] = js.undefined
  var keyPassword: js.UndefOr[String] = js.undefined
  var keystorePassword: js.UndefOr[String] = js.undefined
  var keystorePath: js.UndefOr[String] = js.undefined
  var killProcessesByName: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var launchTimeout: js.UndefOr[Double] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localeScript: js.UndefOr[String] = js.undefined
  var localizableStringsDir: js.UndefOr[String] = js.undefined
  var locationContextEnabled: js.UndefOr[Boolean] = js.undefined
  var locationServicesAuthorized: js.UndefOr[Boolean] = js.undefined
  var locationServicesEnabled: js.UndefOr[Boolean] = js.undefined
  var logFile: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[String] = js.undefined
  var loggingPrefs: js.UndefOr[Anon_Browser] = js.undefined
  var maxInstances: js.UndefOr[Double] = js.undefined
  var mobileEmulationEnabled: js.UndefOr[Boolean] = js.undefined
  var `moz:firefoxOptions`: js.UndefOr[FirefoxOptions] = js.undefined
  var `ms:extensionPaths`: js.UndefOr[js.Array[String]] = js.undefined
  // Edge specific
  var `ms:inPrivate`: js.UndefOr[Boolean] = js.undefined
  var `ms:startPage`: js.UndefOr[String] = js.undefined
  var nativeEvents: js.UndefOr[Boolean] = js.undefined
  var nativeInstrumentsLib: js.UndefOr[Boolean] = js.undefined
  var nativeWebScreenshot: js.UndefOr[Boolean] = js.undefined
  var nativeWebTap: js.UndefOr[Boolean] = js.undefined
  var networkSpeed: js.UndefOr[String] = js.undefined
  var newCommandTimeout: js.UndefOr[Double] = js.undefined
  var noReset: js.UndefOr[Boolean] = js.undefined
  var noSign: js.UndefOr[Boolean] = js.undefined
  var onlyProxySeleniumTraffic: js.UndefOr[Boolean] = js.undefined
  var optionalIntentArguments: js.UndefOr[String] = js.undefined
  var optionsSet: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var otherApps: js.UndefOr[String] = js.undefined
  var pageLoadingStrategy: js.UndefOr[String] = js.undefined
  var perfLoggingPrefs: js.UndefOr[Anon_BufferUsageReportingInterval] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var platformVersion: js.UndefOr[String] = js.undefined
  var printPageSourceOnFindFailure: js.UndefOr[Boolean] = js.undefined
  var processArguments: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var proxyEverything: js.UndefOr[Boolean] = js.undefined
  var proxyRequired: js.UndefOr[Boolean] = js.undefined
  var recreateChromeDriverSessions: js.UndefOr[Boolean] = js.undefined
  var remoteAdbHost: js.UndefOr[String] = js.undefined
  var remoteDebugProxy: js.UndefOr[String] = js.undefined
  var requireWindowFocus: js.UndefOr[Boolean] = js.undefined
  var resetKeyboard: js.UndefOr[Boolean] = js.undefined
  var rotatable: js.UndefOr[Boolean] = js.undefined
  // Safari specific
  var `safari.options`: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var safariAllowPopups: js.UndefOr[Boolean] = js.undefined
  var safariIgnoreFraudWarning: js.UndefOr[Boolean] = js.undefined
  var safariInitialUrl: js.UndefOr[String] = js.undefined
  var safariOpenLinksInBackground: js.UndefOr[Boolean] = js.undefined
  // Saucelabs w3c specific
  var `sauce:options`: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var screenshotWaitTimeout: js.UndefOr[Double] = js.undefined
  // Selenese-Backed-WebDriver specific
  var `selenium.server.url`: js.UndefOr[String] = js.undefined
  // Grid-specific
  var seleniumProtocol: js.UndefOr[String] = js.undefined
  var sendKeyStrategy: js.UndefOr[String] = js.undefined
  var showIOSLog: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[String] = js.undefined
  var singleWindow: js.UndefOr[Boolean] = js.undefined
  var skipDeviceInitialization: js.UndefOr[Boolean] = js.undefined
  var skipLogCapture: js.UndefOr[Boolean] = js.undefined
  var skipLogcatCapture: js.UndefOr[Boolean] = js.undefined
  var skipServerInstallation: js.UndefOr[Boolean] = js.undefined
  var skipUnlock: js.UndefOr[Boolean] = js.undefined
  // webdriverio specific
  var specs: js.UndefOr[js.Array[String]] = js.undefined
  var systemPort: js.UndefOr[Double] = js.undefined
  // Testingbot w3c specific
  var `tb:options`: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var timeoutInSeconds: js.UndefOr[Double] = js.undefined
  var trustAllSSLCertificates: js.UndefOr[Boolean] = js.undefined
  var udid: js.UndefOr[String] = js.undefined
  var uiautomator2ServerInstallTimeout: js.UndefOr[Double] = js.undefined
  var uiautomator2ServerLaunchTimeout: js.UndefOr[Double] = js.undefined
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.undefined
  var unicodeKeyboard: js.UndefOr[Boolean] = js.undefined
  var uninstallOtherPackages: js.UndefOr[String] = js.undefined
  var unlockKey: js.UndefOr[String] = js.undefined
  var unlockType: js.UndefOr[String] = js.undefined
  var useKeystore: js.UndefOr[Boolean] = js.undefined
  var userExtensions: js.UndefOr[String] = js.undefined
  var userJSInjection: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var waitForAppScript: js.UndefOr[String] = js.undefined
  var webStorageEnabled: js.UndefOr[Boolean] = js.undefined
  var `webdriver.remote.quietExceptions`: js.UndefOr[Boolean] = js.undefined
  // RemoteWebDriver specific
  var `webdriver.remote.sessionid`: js.UndefOr[String] = js.undefined
  var webkitDebugProxyPort: js.UndefOr[Double] = js.undefined
  var webkitResponseTimeout: js.UndefOr[Double] = js.undefined
  var webviewConnectRetries: js.UndefOr[Double] = js.undefined
}

object DesiredCapabilities {
  @scala.inline
  def apply(
    acceptInsecureCerts: js.UndefOr[Boolean] = js.undefined,
    acceptSslCerts: js.UndefOr[Boolean] = js.undefined,
    adbExecTimeout: Int | Double = null,
    adbPort: Int | Double = null,
    addCustomRequestHeaders: js.UndefOr[Boolean] = js.undefined,
    allowTestPackages: js.UndefOr[Boolean] = js.undefined,
    androidCoverage: String = null,
    androidCoverageEndIntent: String = null,
    androidDeviceReadyTimeout: Int | Double = null,
    androidDeviceSocket: String = null,
    androidInstallPath: String = null,
    androidInstallTimeout: Int | Double = null,
    androidScreenshotPath: String = null,
    app: String = null,
    appActivity: String = null,
    appName: String = null,
    appPackage: String = null,
    appWaitActivity: String = null,
    appWaitDuration: Int | Double = null,
    appWaitPackage: String = null,
    applicationCacheEnabled: js.UndefOr[Boolean] = js.undefined,
    autoAcceptAlerts: js.UndefOr[Boolean] = js.undefined,
    autoDismissAlerts: js.UndefOr[Boolean] = js.undefined,
    autoGrantPermissions: js.UndefOr[Boolean] = js.undefined,
    autoLaunch: js.UndefOr[Boolean] = js.undefined,
    autoWebview: js.UndefOr[Boolean] = js.undefined,
    autoWebviewTimeout: Int | Double = null,
    automationName: String = null,
    avd: String = null,
    avdArgs: String = null,
    avdLaunchTimeout: Int | Double = null,
    avdReadyTimeout: Int | Double = null,
    avoidProxy: js.UndefOr[Boolean] = js.undefined,
    browserAttachTimeout: Int | Double = null,
    browserConnectionEnabled: js.UndefOr[Boolean] = js.undefined,
    browserName: String = null,
    browserSideLog: js.UndefOr[Boolean] = js.undefined,
    browserVersion: String = null,
    `bstack:options`: StringDictionary[js.Any] = null,
    build: String = null,
    bundleId: String = null,
    calendarFormat: String = null,
    captureNetworkTraffic: js.UndefOr[Boolean] = js.undefined,
    changeMaxConnections: js.UndefOr[Boolean] = js.undefined,
    chromeOptions: ChromeOptions = null,
    chromedriverArgs: js.Array[String] = null,
    chromedriverChromeMappingFile: String = null,
    chromedriverDisableBuildCheck: js.UndefOr[Boolean] = js.undefined,
    chromedriverExecutable: String = null,
    chromedriverExecutableDir: String = null,
    chromedriverPort: Int | Double = null,
    chromedriverPorts: js.Array[Double | js.Array[Double]] = null,
    chromedriverUseSystemExecutable: js.UndefOr[Boolean] = js.undefined,
    cleanSession: js.UndefOr[Boolean] = js.undefined,
    commandLineFlags: String = null,
    cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined,
    customSSLCert: String = null,
    databaseEnabled: js.UndefOr[Boolean] = js.undefined,
    deviceName: String = null,
    deviceReadyTimeout: Int | Double = null,
    disableAndroidWatchers: js.UndefOr[Boolean] = js.undefined,
    disableWindowAnimation: js.UndefOr[Boolean] = js.undefined,
    dontInjectRegex: RegExp = null,
    dontStopAppOnReset: js.UndefOr[Boolean] = js.undefined,
    elementScrollBehavior: Int | Double = null,
    enableAsyncExecuteFromHttps: js.UndefOr[Boolean] = js.undefined,
    enableElementCacheCleanup: js.UndefOr[Boolean] = js.undefined,
    enablePerformanceLogging: js.UndefOr[Boolean] = js.undefined,
    enablePersistentHover: js.UndefOr[Boolean] = js.undefined,
    environment: String = null,
    espressoServerLaunchTimeout: Int | Double = null,
    eventTimings: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    executablePath: String = null,
    extractPath: String = null,
    firefoxProfileTemplate: String = null,
    firefox_binary: String = null,
    fullReset: js.UndefOr[Boolean] = js.undefined,
    `goog:chromeOptions`: ChromeOptions = null,
    gpsEnabled: js.UndefOr[Boolean] = js.undefined,
    handlesAlerts: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    `ie.browserCommandLineSwitches`: String = null,
    `ie.ensureCleanSession`: js.UndefOr[Boolean] = js.undefined,
    `ie.forceCreateProcessApi`: js.UndefOr[Boolean] = js.undefined,
    `ie.setProxyByServer`: js.UndefOr[Boolean] = js.undefined,
    `ie.usePerProcessProxy`: js.UndefOr[Boolean] = js.undefined,
    ignoreProtectedModeSettings: js.UndefOr[Boolean] = js.undefined,
    ignoreUnimportantViews: js.UndefOr[Boolean] = js.undefined,
    ignoreZoomSetting: js.UndefOr[Boolean] = js.undefined,
    initialBrowserUrl: String = null,
    intentAction: String = null,
    intentCategory: String = null,
    intentFlags: String = null,
    interKeyDelay: Int | Double = null,
    isHeadless: js.UndefOr[Boolean] = js.undefined,
    javascriptEnabled: js.UndefOr[Boolean] = js.undefined,
    keepKeyChains: js.UndefOr[Boolean] = js.undefined,
    keyAlias: String = null,
    keyPassword: String = null,
    keystorePassword: String = null,
    keystorePath: String = null,
    killProcessesByName: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    launchTimeout: Int | Double = null,
    locale: String = null,
    localeScript: String = null,
    localizableStringsDir: String = null,
    locationContextEnabled: js.UndefOr[Boolean] = js.undefined,
    locationServicesAuthorized: js.UndefOr[Boolean] = js.undefined,
    locationServicesEnabled: js.UndefOr[Boolean] = js.undefined,
    logFile: String = null,
    logLevel: String = null,
    loggingPrefs: Anon_Browser = null,
    maxInstances: Int | Double = null,
    mobileEmulationEnabled: js.UndefOr[Boolean] = js.undefined,
    `moz:firefoxOptions`: FirefoxOptions = null,
    `ms:extensionPaths`: js.Array[String] = null,
    `ms:inPrivate`: js.UndefOr[Boolean] = js.undefined,
    `ms:startPage`: String = null,
    nativeEvents: js.UndefOr[Boolean] = js.undefined,
    nativeInstrumentsLib: js.UndefOr[Boolean] = js.undefined,
    nativeWebScreenshot: js.UndefOr[Boolean] = js.undefined,
    nativeWebTap: js.UndefOr[Boolean] = js.undefined,
    networkSpeed: String = null,
    newCommandTimeout: Int | Double = null,
    noReset: js.UndefOr[Boolean] = js.undefined,
    noSign: js.UndefOr[Boolean] = js.undefined,
    onlyProxySeleniumTraffic: js.UndefOr[Boolean] = js.undefined,
    optionalIntentArguments: String = null,
    optionsSet: js.UndefOr[Boolean] = js.undefined,
    orientation: String = null,
    otherApps: String = null,
    pageLoadStrategy: PageLoadingStrategy = null,
    pageLoadingStrategy: String = null,
    perfLoggingPrefs: Anon_BufferUsageReportingInterval = null,
    platform: String = null,
    platformName: String = null,
    platformVersion: String = null,
    printPageSourceOnFindFailure: js.UndefOr[Boolean] = js.undefined,
    processArguments: String = null,
    profile: String = null,
    proxy: ProxyObject = null,
    proxyEverything: js.UndefOr[Boolean] = js.undefined,
    proxyRequired: js.UndefOr[Boolean] = js.undefined,
    recreateChromeDriverSessions: js.UndefOr[Boolean] = js.undefined,
    remoteAdbHost: String = null,
    remoteDebugProxy: String = null,
    requireWindowFocus: js.UndefOr[Boolean] = js.undefined,
    resetKeyboard: js.UndefOr[Boolean] = js.undefined,
    rotatable: js.UndefOr[Boolean] = js.undefined,
    `safari.options`: StringDictionary[js.Any] = null,
    safariAllowPopups: js.UndefOr[Boolean] = js.undefined,
    safariIgnoreFraudWarning: js.UndefOr[Boolean] = js.undefined,
    safariInitialUrl: String = null,
    safariOpenLinksInBackground: js.UndefOr[Boolean] = js.undefined,
    `sauce:options`: StringDictionary[js.Any] = null,
    screenshotWaitTimeout: Int | Double = null,
    `selenium.server.url`: String = null,
    seleniumProtocol: String = null,
    sendKeyStrategy: String = null,
    setWindowRect: js.UndefOr[Boolean] = js.undefined,
    showIOSLog: js.UndefOr[Boolean] = js.undefined,
    silent: String = null,
    singleWindow: js.UndefOr[Boolean] = js.undefined,
    skipDeviceInitialization: js.UndefOr[Boolean] = js.undefined,
    skipLogCapture: js.UndefOr[Boolean] = js.undefined,
    skipLogcatCapture: js.UndefOr[Boolean] = js.undefined,
    skipServerInstallation: js.UndefOr[Boolean] = js.undefined,
    skipUnlock: js.UndefOr[Boolean] = js.undefined,
    specs: js.Array[String] = null,
    systemPort: Int | Double = null,
    `tb:options`: StringDictionary[js.Any] = null,
    timeoutInSeconds: Int | Double = null,
    timeouts: Timeouts = null,
    trustAllSSLCertificates: js.UndefOr[Boolean] = js.undefined,
    udid: String = null,
    uiautomator2ServerInstallTimeout: Int | Double = null,
    uiautomator2ServerLaunchTimeout: Int | Double = null,
    unexpectedAlertBehaviour: String = null,
    unhandledPromptBehavior: String = null,
    unicodeKeyboard: js.UndefOr[Boolean] = js.undefined,
    uninstallOtherPackages: String = null,
    unlockKey: String = null,
    unlockType: String = null,
    useKeystore: js.UndefOr[Boolean] = js.undefined,
    userExtensions: String = null,
    userJSInjection: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    waitForAppScript: String = null,
    webStorageEnabled: js.UndefOr[Boolean] = js.undefined,
    `webdriver.remote.quietExceptions`: js.UndefOr[Boolean] = js.undefined,
    `webdriver.remote.sessionid`: String = null,
    webkitDebugProxyPort: Int | Double = null,
    webkitResponseTimeout: Int | Double = null,
    webviewConnectRetries: Int | Double = null
  ): DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptInsecureCerts)) __obj.updateDynamic("acceptInsecureCerts")(acceptInsecureCerts)
    if (!js.isUndefined(acceptSslCerts)) __obj.updateDynamic("acceptSslCerts")(acceptSslCerts)
    if (adbExecTimeout != null) __obj.updateDynamic("adbExecTimeout")(adbExecTimeout.asInstanceOf[js.Any])
    if (adbPort != null) __obj.updateDynamic("adbPort")(adbPort.asInstanceOf[js.Any])
    if (!js.isUndefined(addCustomRequestHeaders)) __obj.updateDynamic("addCustomRequestHeaders")(addCustomRequestHeaders)
    if (!js.isUndefined(allowTestPackages)) __obj.updateDynamic("allowTestPackages")(allowTestPackages)
    if (androidCoverage != null) __obj.updateDynamic("androidCoverage")(androidCoverage)
    if (androidCoverageEndIntent != null) __obj.updateDynamic("androidCoverageEndIntent")(androidCoverageEndIntent)
    if (androidDeviceReadyTimeout != null) __obj.updateDynamic("androidDeviceReadyTimeout")(androidDeviceReadyTimeout.asInstanceOf[js.Any])
    if (androidDeviceSocket != null) __obj.updateDynamic("androidDeviceSocket")(androidDeviceSocket)
    if (androidInstallPath != null) __obj.updateDynamic("androidInstallPath")(androidInstallPath)
    if (androidInstallTimeout != null) __obj.updateDynamic("androidInstallTimeout")(androidInstallTimeout.asInstanceOf[js.Any])
    if (androidScreenshotPath != null) __obj.updateDynamic("androidScreenshotPath")(androidScreenshotPath)
    if (app != null) __obj.updateDynamic("app")(app)
    if (appActivity != null) __obj.updateDynamic("appActivity")(appActivity)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (appPackage != null) __obj.updateDynamic("appPackage")(appPackage)
    if (appWaitActivity != null) __obj.updateDynamic("appWaitActivity")(appWaitActivity)
    if (appWaitDuration != null) __obj.updateDynamic("appWaitDuration")(appWaitDuration.asInstanceOf[js.Any])
    if (appWaitPackage != null) __obj.updateDynamic("appWaitPackage")(appWaitPackage)
    if (!js.isUndefined(applicationCacheEnabled)) __obj.updateDynamic("applicationCacheEnabled")(applicationCacheEnabled)
    if (!js.isUndefined(autoAcceptAlerts)) __obj.updateDynamic("autoAcceptAlerts")(autoAcceptAlerts)
    if (!js.isUndefined(autoDismissAlerts)) __obj.updateDynamic("autoDismissAlerts")(autoDismissAlerts)
    if (!js.isUndefined(autoGrantPermissions)) __obj.updateDynamic("autoGrantPermissions")(autoGrantPermissions)
    if (!js.isUndefined(autoLaunch)) __obj.updateDynamic("autoLaunch")(autoLaunch)
    if (!js.isUndefined(autoWebview)) __obj.updateDynamic("autoWebview")(autoWebview)
    if (autoWebviewTimeout != null) __obj.updateDynamic("autoWebviewTimeout")(autoWebviewTimeout.asInstanceOf[js.Any])
    if (automationName != null) __obj.updateDynamic("automationName")(automationName)
    if (avd != null) __obj.updateDynamic("avd")(avd)
    if (avdArgs != null) __obj.updateDynamic("avdArgs")(avdArgs)
    if (avdLaunchTimeout != null) __obj.updateDynamic("avdLaunchTimeout")(avdLaunchTimeout.asInstanceOf[js.Any])
    if (avdReadyTimeout != null) __obj.updateDynamic("avdReadyTimeout")(avdReadyTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidProxy)) __obj.updateDynamic("avoidProxy")(avoidProxy)
    if (browserAttachTimeout != null) __obj.updateDynamic("browserAttachTimeout")(browserAttachTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(browserConnectionEnabled)) __obj.updateDynamic("browserConnectionEnabled")(browserConnectionEnabled)
    if (browserName != null) __obj.updateDynamic("browserName")(browserName)
    if (!js.isUndefined(browserSideLog)) __obj.updateDynamic("browserSideLog")(browserSideLog)
    if (browserVersion != null) __obj.updateDynamic("browserVersion")(browserVersion)
    if (`bstack:options` != null) __obj.updateDynamic("bstack:options")(`bstack:options`)
    if (build != null) __obj.updateDynamic("build")(build)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (calendarFormat != null) __obj.updateDynamic("calendarFormat")(calendarFormat)
    if (!js.isUndefined(captureNetworkTraffic)) __obj.updateDynamic("captureNetworkTraffic")(captureNetworkTraffic)
    if (!js.isUndefined(changeMaxConnections)) __obj.updateDynamic("changeMaxConnections")(changeMaxConnections)
    if (chromeOptions != null) __obj.updateDynamic("chromeOptions")(chromeOptions)
    if (chromedriverArgs != null) __obj.updateDynamic("chromedriverArgs")(chromedriverArgs)
    if (chromedriverChromeMappingFile != null) __obj.updateDynamic("chromedriverChromeMappingFile")(chromedriverChromeMappingFile)
    if (!js.isUndefined(chromedriverDisableBuildCheck)) __obj.updateDynamic("chromedriverDisableBuildCheck")(chromedriverDisableBuildCheck)
    if (chromedriverExecutable != null) __obj.updateDynamic("chromedriverExecutable")(chromedriverExecutable)
    if (chromedriverExecutableDir != null) __obj.updateDynamic("chromedriverExecutableDir")(chromedriverExecutableDir)
    if (chromedriverPort != null) __obj.updateDynamic("chromedriverPort")(chromedriverPort.asInstanceOf[js.Any])
    if (chromedriverPorts != null) __obj.updateDynamic("chromedriverPorts")(chromedriverPorts)
    if (!js.isUndefined(chromedriverUseSystemExecutable)) __obj.updateDynamic("chromedriverUseSystemExecutable")(chromedriverUseSystemExecutable)
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession)
    if (commandLineFlags != null) __obj.updateDynamic("commandLineFlags")(commandLineFlags)
    if (!js.isUndefined(cssSelectorsEnabled)) __obj.updateDynamic("cssSelectorsEnabled")(cssSelectorsEnabled)
    if (customSSLCert != null) __obj.updateDynamic("customSSLCert")(customSSLCert)
    if (!js.isUndefined(databaseEnabled)) __obj.updateDynamic("databaseEnabled")(databaseEnabled)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (deviceReadyTimeout != null) __obj.updateDynamic("deviceReadyTimeout")(deviceReadyTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAndroidWatchers)) __obj.updateDynamic("disableAndroidWatchers")(disableAndroidWatchers)
    if (!js.isUndefined(disableWindowAnimation)) __obj.updateDynamic("disableWindowAnimation")(disableWindowAnimation)
    if (dontInjectRegex != null) __obj.updateDynamic("dontInjectRegex")(dontInjectRegex)
    if (!js.isUndefined(dontStopAppOnReset)) __obj.updateDynamic("dontStopAppOnReset")(dontStopAppOnReset)
    if (elementScrollBehavior != null) __obj.updateDynamic("elementScrollBehavior")(elementScrollBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAsyncExecuteFromHttps)) __obj.updateDynamic("enableAsyncExecuteFromHttps")(enableAsyncExecuteFromHttps)
    if (!js.isUndefined(enableElementCacheCleanup)) __obj.updateDynamic("enableElementCacheCleanup")(enableElementCacheCleanup)
    if (!js.isUndefined(enablePerformanceLogging)) __obj.updateDynamic("enablePerformanceLogging")(enablePerformanceLogging)
    if (!js.isUndefined(enablePersistentHover)) __obj.updateDynamic("enablePersistentHover")(enablePersistentHover)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (espressoServerLaunchTimeout != null) __obj.updateDynamic("espressoServerLaunchTimeout")(espressoServerLaunchTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(eventTimings)) __obj.updateDynamic("eventTimings")(eventTimings)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (executablePath != null) __obj.updateDynamic("executablePath")(executablePath)
    if (extractPath != null) __obj.updateDynamic("extractPath")(extractPath)
    if (firefoxProfileTemplate != null) __obj.updateDynamic("firefoxProfileTemplate")(firefoxProfileTemplate)
    if (firefox_binary != null) __obj.updateDynamic("firefox_binary")(firefox_binary)
    if (!js.isUndefined(fullReset)) __obj.updateDynamic("fullReset")(fullReset)
    if (`goog:chromeOptions` != null) __obj.updateDynamic("goog:chromeOptions")(`goog:chromeOptions`)
    if (!js.isUndefined(gpsEnabled)) __obj.updateDynamic("gpsEnabled")(gpsEnabled)
    if (!js.isUndefined(handlesAlerts)) __obj.updateDynamic("handlesAlerts")(handlesAlerts)
    if (host != null) __obj.updateDynamic("host")(host)
    if (`ie.browserCommandLineSwitches` != null) __obj.updateDynamic("ie.browserCommandLineSwitches")(`ie.browserCommandLineSwitches`)
    if (!js.isUndefined(`ie.ensureCleanSession`)) __obj.updateDynamic("ie.ensureCleanSession")(`ie.ensureCleanSession`)
    if (!js.isUndefined(`ie.forceCreateProcessApi`)) __obj.updateDynamic("ie.forceCreateProcessApi")(`ie.forceCreateProcessApi`)
    if (!js.isUndefined(`ie.setProxyByServer`)) __obj.updateDynamic("ie.setProxyByServer")(`ie.setProxyByServer`)
    if (!js.isUndefined(`ie.usePerProcessProxy`)) __obj.updateDynamic("ie.usePerProcessProxy")(`ie.usePerProcessProxy`)
    if (!js.isUndefined(ignoreProtectedModeSettings)) __obj.updateDynamic("ignoreProtectedModeSettings")(ignoreProtectedModeSettings)
    if (!js.isUndefined(ignoreUnimportantViews)) __obj.updateDynamic("ignoreUnimportantViews")(ignoreUnimportantViews)
    if (!js.isUndefined(ignoreZoomSetting)) __obj.updateDynamic("ignoreZoomSetting")(ignoreZoomSetting)
    if (initialBrowserUrl != null) __obj.updateDynamic("initialBrowserUrl")(initialBrowserUrl)
    if (intentAction != null) __obj.updateDynamic("intentAction")(intentAction)
    if (intentCategory != null) __obj.updateDynamic("intentCategory")(intentCategory)
    if (intentFlags != null) __obj.updateDynamic("intentFlags")(intentFlags)
    if (interKeyDelay != null) __obj.updateDynamic("interKeyDelay")(interKeyDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeadless)) __obj.updateDynamic("isHeadless")(isHeadless)
    if (!js.isUndefined(javascriptEnabled)) __obj.updateDynamic("javascriptEnabled")(javascriptEnabled)
    if (!js.isUndefined(keepKeyChains)) __obj.updateDynamic("keepKeyChains")(keepKeyChains)
    if (keyAlias != null) __obj.updateDynamic("keyAlias")(keyAlias)
    if (keyPassword != null) __obj.updateDynamic("keyPassword")(keyPassword)
    if (keystorePassword != null) __obj.updateDynamic("keystorePassword")(keystorePassword)
    if (keystorePath != null) __obj.updateDynamic("keystorePath")(keystorePath)
    if (!js.isUndefined(killProcessesByName)) __obj.updateDynamic("killProcessesByName")(killProcessesByName)
    if (language != null) __obj.updateDynamic("language")(language)
    if (launchTimeout != null) __obj.updateDynamic("launchTimeout")(launchTimeout.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (localeScript != null) __obj.updateDynamic("localeScript")(localeScript)
    if (localizableStringsDir != null) __obj.updateDynamic("localizableStringsDir")(localizableStringsDir)
    if (!js.isUndefined(locationContextEnabled)) __obj.updateDynamic("locationContextEnabled")(locationContextEnabled)
    if (!js.isUndefined(locationServicesAuthorized)) __obj.updateDynamic("locationServicesAuthorized")(locationServicesAuthorized)
    if (!js.isUndefined(locationServicesEnabled)) __obj.updateDynamic("locationServicesEnabled")(locationServicesEnabled)
    if (logFile != null) __obj.updateDynamic("logFile")(logFile)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (loggingPrefs != null) __obj.updateDynamic("loggingPrefs")(loggingPrefs)
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileEmulationEnabled)) __obj.updateDynamic("mobileEmulationEnabled")(mobileEmulationEnabled)
    if (`moz:firefoxOptions` != null) __obj.updateDynamic("moz:firefoxOptions")(`moz:firefoxOptions`)
    if (`ms:extensionPaths` != null) __obj.updateDynamic("ms:extensionPaths")(`ms:extensionPaths`)
    if (!js.isUndefined(`ms:inPrivate`)) __obj.updateDynamic("ms:inPrivate")(`ms:inPrivate`)
    if (`ms:startPage` != null) __obj.updateDynamic("ms:startPage")(`ms:startPage`)
    if (!js.isUndefined(nativeEvents)) __obj.updateDynamic("nativeEvents")(nativeEvents)
    if (!js.isUndefined(nativeInstrumentsLib)) __obj.updateDynamic("nativeInstrumentsLib")(nativeInstrumentsLib)
    if (!js.isUndefined(nativeWebScreenshot)) __obj.updateDynamic("nativeWebScreenshot")(nativeWebScreenshot)
    if (!js.isUndefined(nativeWebTap)) __obj.updateDynamic("nativeWebTap")(nativeWebTap)
    if (networkSpeed != null) __obj.updateDynamic("networkSpeed")(networkSpeed)
    if (newCommandTimeout != null) __obj.updateDynamic("newCommandTimeout")(newCommandTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(noReset)) __obj.updateDynamic("noReset")(noReset)
    if (!js.isUndefined(noSign)) __obj.updateDynamic("noSign")(noSign)
    if (!js.isUndefined(onlyProxySeleniumTraffic)) __obj.updateDynamic("onlyProxySeleniumTraffic")(onlyProxySeleniumTraffic)
    if (optionalIntentArguments != null) __obj.updateDynamic("optionalIntentArguments")(optionalIntentArguments)
    if (!js.isUndefined(optionsSet)) __obj.updateDynamic("optionsSet")(optionsSet)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (otherApps != null) __obj.updateDynamic("otherApps")(otherApps)
    if (pageLoadStrategy != null) __obj.updateDynamic("pageLoadStrategy")(pageLoadStrategy)
    if (pageLoadingStrategy != null) __obj.updateDynamic("pageLoadingStrategy")(pageLoadingStrategy)
    if (perfLoggingPrefs != null) __obj.updateDynamic("perfLoggingPrefs")(perfLoggingPrefs)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (platformName != null) __obj.updateDynamic("platformName")(platformName)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (!js.isUndefined(printPageSourceOnFindFailure)) __obj.updateDynamic("printPageSourceOnFindFailure")(printPageSourceOnFindFailure)
    if (processArguments != null) __obj.updateDynamic("processArguments")(processArguments)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(proxyEverything)) __obj.updateDynamic("proxyEverything")(proxyEverything)
    if (!js.isUndefined(proxyRequired)) __obj.updateDynamic("proxyRequired")(proxyRequired)
    if (!js.isUndefined(recreateChromeDriverSessions)) __obj.updateDynamic("recreateChromeDriverSessions")(recreateChromeDriverSessions)
    if (remoteAdbHost != null) __obj.updateDynamic("remoteAdbHost")(remoteAdbHost)
    if (remoteDebugProxy != null) __obj.updateDynamic("remoteDebugProxy")(remoteDebugProxy)
    if (!js.isUndefined(requireWindowFocus)) __obj.updateDynamic("requireWindowFocus")(requireWindowFocus)
    if (!js.isUndefined(resetKeyboard)) __obj.updateDynamic("resetKeyboard")(resetKeyboard)
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable)
    if (`safari.options` != null) __obj.updateDynamic("safari.options")(`safari.options`)
    if (!js.isUndefined(safariAllowPopups)) __obj.updateDynamic("safariAllowPopups")(safariAllowPopups)
    if (!js.isUndefined(safariIgnoreFraudWarning)) __obj.updateDynamic("safariIgnoreFraudWarning")(safariIgnoreFraudWarning)
    if (safariInitialUrl != null) __obj.updateDynamic("safariInitialUrl")(safariInitialUrl)
    if (!js.isUndefined(safariOpenLinksInBackground)) __obj.updateDynamic("safariOpenLinksInBackground")(safariOpenLinksInBackground)
    if (`sauce:options` != null) __obj.updateDynamic("sauce:options")(`sauce:options`)
    if (screenshotWaitTimeout != null) __obj.updateDynamic("screenshotWaitTimeout")(screenshotWaitTimeout.asInstanceOf[js.Any])
    if (`selenium.server.url` != null) __obj.updateDynamic("selenium.server.url")(`selenium.server.url`)
    if (seleniumProtocol != null) __obj.updateDynamic("seleniumProtocol")(seleniumProtocol)
    if (sendKeyStrategy != null) __obj.updateDynamic("sendKeyStrategy")(sendKeyStrategy)
    if (!js.isUndefined(setWindowRect)) __obj.updateDynamic("setWindowRect")(setWindowRect)
    if (!js.isUndefined(showIOSLog)) __obj.updateDynamic("showIOSLog")(showIOSLog)
    if (silent != null) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(singleWindow)) __obj.updateDynamic("singleWindow")(singleWindow)
    if (!js.isUndefined(skipDeviceInitialization)) __obj.updateDynamic("skipDeviceInitialization")(skipDeviceInitialization)
    if (!js.isUndefined(skipLogCapture)) __obj.updateDynamic("skipLogCapture")(skipLogCapture)
    if (!js.isUndefined(skipLogcatCapture)) __obj.updateDynamic("skipLogcatCapture")(skipLogcatCapture)
    if (!js.isUndefined(skipServerInstallation)) __obj.updateDynamic("skipServerInstallation")(skipServerInstallation)
    if (!js.isUndefined(skipUnlock)) __obj.updateDynamic("skipUnlock")(skipUnlock)
    if (specs != null) __obj.updateDynamic("specs")(specs)
    if (systemPort != null) __obj.updateDynamic("systemPort")(systemPort.asInstanceOf[js.Any])
    if (`tb:options` != null) __obj.updateDynamic("tb:options")(`tb:options`)
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    if (timeouts != null) __obj.updateDynamic("timeouts")(timeouts)
    if (!js.isUndefined(trustAllSSLCertificates)) __obj.updateDynamic("trustAllSSLCertificates")(trustAllSSLCertificates)
    if (udid != null) __obj.updateDynamic("udid")(udid)
    if (uiautomator2ServerInstallTimeout != null) __obj.updateDynamic("uiautomator2ServerInstallTimeout")(uiautomator2ServerInstallTimeout.asInstanceOf[js.Any])
    if (uiautomator2ServerLaunchTimeout != null) __obj.updateDynamic("uiautomator2ServerLaunchTimeout")(uiautomator2ServerLaunchTimeout.asInstanceOf[js.Any])
    if (unexpectedAlertBehaviour != null) __obj.updateDynamic("unexpectedAlertBehaviour")(unexpectedAlertBehaviour)
    if (unhandledPromptBehavior != null) __obj.updateDynamic("unhandledPromptBehavior")(unhandledPromptBehavior)
    if (!js.isUndefined(unicodeKeyboard)) __obj.updateDynamic("unicodeKeyboard")(unicodeKeyboard)
    if (uninstallOtherPackages != null) __obj.updateDynamic("uninstallOtherPackages")(uninstallOtherPackages)
    if (unlockKey != null) __obj.updateDynamic("unlockKey")(unlockKey)
    if (unlockType != null) __obj.updateDynamic("unlockType")(unlockType)
    if (!js.isUndefined(useKeystore)) __obj.updateDynamic("useKeystore")(useKeystore)
    if (userExtensions != null) __obj.updateDynamic("userExtensions")(userExtensions)
    if (!js.isUndefined(userJSInjection)) __obj.updateDynamic("userJSInjection")(userJSInjection)
    if (version != null) __obj.updateDynamic("version")(version)
    if (waitForAppScript != null) __obj.updateDynamic("waitForAppScript")(waitForAppScript)
    if (!js.isUndefined(webStorageEnabled)) __obj.updateDynamic("webStorageEnabled")(webStorageEnabled)
    if (!js.isUndefined(`webdriver.remote.quietExceptions`)) __obj.updateDynamic("webdriver.remote.quietExceptions")(`webdriver.remote.quietExceptions`)
    if (`webdriver.remote.sessionid` != null) __obj.updateDynamic("webdriver.remote.sessionid")(`webdriver.remote.sessionid`)
    if (webkitDebugProxyPort != null) __obj.updateDynamic("webkitDebugProxyPort")(webkitDebugProxyPort.asInstanceOf[js.Any])
    if (webkitResponseTimeout != null) __obj.updateDynamic("webkitResponseTimeout")(webkitResponseTimeout.asInstanceOf[js.Any])
    if (webviewConnectRetries != null) __obj.updateDynamic("webviewConnectRetries")(webviewConnectRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredCapabilities]
  }
}

