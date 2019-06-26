package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesiredCapabilities extends Capabilities {
  var acceptSslCerts: js.UndefOr[scala.Boolean] = js.undefined
  var adbExecTimeout: js.UndefOr[scala.Double] = js.undefined
  var adbPort: js.UndefOr[scala.Double] = js.undefined
  var addCustomRequestHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var allowTestPackages: js.UndefOr[scala.Boolean] = js.undefined
  var androidCoverage: js.UndefOr[java.lang.String] = js.undefined
  var androidCoverageEndIntent: js.UndefOr[java.lang.String] = js.undefined
  var androidDeviceReadyTimeout: js.UndefOr[scala.Double] = js.undefined
  var androidDeviceSocket: js.UndefOr[java.lang.String] = js.undefined
  var androidInstallPath: js.UndefOr[java.lang.String] = js.undefined
  var androidInstallTimeout: js.UndefOr[scala.Double] = js.undefined
  var androidScreenshotPath: js.UndefOr[java.lang.String] = js.undefined
  var app: js.UndefOr[java.lang.String] = js.undefined
  // Appium Android Only
  var appActivity: js.UndefOr[java.lang.String] = js.undefined
  var appName: js.UndefOr[java.lang.String] = js.undefined
  var appPackage: js.UndefOr[java.lang.String] = js.undefined
  var appWaitActivity: js.UndefOr[java.lang.String] = js.undefined
  var appWaitDuration: js.UndefOr[scala.Double] = js.undefined
  var appWaitPackage: js.UndefOr[java.lang.String] = js.undefined
  var applicationCacheEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var autoAcceptAlerts: js.UndefOr[scala.Boolean] = js.undefined
  var autoDismissAlerts: js.UndefOr[scala.Boolean] = js.undefined
  var autoGrantPermissions: js.UndefOr[scala.Boolean] = js.undefined
  var autoLaunch: js.UndefOr[scala.Boolean] = js.undefined
  var autoWebview: js.UndefOr[scala.Boolean] = js.undefined
  var autoWebviewTimeout: js.UndefOr[scala.Double] = js.undefined
  // Appium General Capabilities
  var automationName: js.UndefOr[java.lang.String] = js.undefined
  var avd: js.UndefOr[java.lang.String] = js.undefined
  var avdArgs: js.UndefOr[java.lang.String] = js.undefined
  var avdLaunchTimeout: js.UndefOr[scala.Double] = js.undefined
  var avdReadyTimeout: js.UndefOr[scala.Double] = js.undefined
  var avoidProxy: js.UndefOr[scala.Boolean] = js.undefined
  var browserAttachTimeout: js.UndefOr[scala.Double] = js.undefined
  var browserConnectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var browserSideLog: js.UndefOr[scala.Boolean] = js.undefined
  // wdio-sauce-service specific
  var build: js.UndefOr[java.lang.String] = js.undefined
  var bundleId: js.UndefOr[java.lang.String] = js.undefined
  // Appium iOS Only
  var calendarFormat: js.UndefOr[java.lang.String] = js.undefined
  var captureNetworkTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var changeMaxConnections: js.UndefOr[scala.Boolean] = js.undefined
  // Chrome specific
  var chromeOptions: js.UndefOr[ChromeOptions] = js.undefined
  var chromedriverArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var chromedriverChromeMappingFile: js.UndefOr[java.lang.String] = js.undefined
  var chromedriverDisableBuildCheck: js.UndefOr[scala.Boolean] = js.undefined
  var chromedriverExecutable: js.UndefOr[java.lang.String] = js.undefined
  var chromedriverExecutableDir: js.UndefOr[java.lang.String] = js.undefined
  var chromedriverPort: js.UndefOr[scala.Double] = js.undefined
  var chromedriverPorts: js.UndefOr[js.Array[scala.Double | js.Array[scala.Double]]] = js.undefined
  var chromedriverUseSystemExecutable: js.UndefOr[scala.Boolean] = js.undefined
  var cleanSession: js.UndefOr[scala.Boolean] = js.undefined
  // Selenium RC (1.0) only
  var commandLineFlags: js.UndefOr[java.lang.String] = js.undefined
  // Read-only capabilities
  var cssSelectorsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var customSSLCert: js.UndefOr[java.lang.String] = js.undefined
  var databaseEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
  var deviceReadyTimeout: js.UndefOr[scala.Double] = js.undefined
  var disableAndroidWatchers: js.UndefOr[scala.Boolean] = js.undefined
  var disableWindowAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var dontInjectRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var dontStopAppOnReset: js.UndefOr[scala.Boolean] = js.undefined
  var elementScrollBehavior: js.UndefOr[scala.Double] = js.undefined
  var enableAsyncExecuteFromHttps: js.UndefOr[scala.Boolean] = js.undefined
  var enableElementCacheCleanup: js.UndefOr[scala.Boolean] = js.undefined
  var enablePerformanceLogging: js.UndefOr[scala.Boolean] = js.undefined
  var enablePersistentHover: js.UndefOr[scala.Boolean] = js.undefined
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var espressoServerLaunchTimeout: js.UndefOr[scala.Double] = js.undefined
  var eventTimings: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var executablePath: js.UndefOr[java.lang.String] = js.undefined
  var extractPath: js.UndefOr[java.lang.String] = js.undefined
  var firefoxProfileTemplate: js.UndefOr[java.lang.String] = js.undefined
  // Firefox
  var firefox_binary: js.UndefOr[java.lang.String] = js.undefined
  var fullReset: js.UndefOr[scala.Boolean] = js.undefined
  var `goog:chromeOptions`: js.UndefOr[ChromeOptions] = js.undefined
  var gpsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var handlesAlerts: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var `ie.browserCommandLineSwitches`: js.UndefOr[java.lang.String] = js.undefined
  var `ie.ensureCleanSession`: js.UndefOr[scala.Boolean] = js.undefined
  // IE specific
  var `ie.forceCreateProcessApi`: js.UndefOr[scala.Boolean] = js.undefined
  var `ie.setProxyByServer`: js.UndefOr[scala.Boolean] = js.undefined
  var `ie.usePerProcessProxy`: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreProtectedModeSettings: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnimportantViews: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreZoomSetting: js.UndefOr[scala.Boolean] = js.undefined
  var initialBrowserUrl: js.UndefOr[java.lang.String] = js.undefined
  var intentAction: js.UndefOr[java.lang.String] = js.undefined
  var intentCategory: js.UndefOr[java.lang.String] = js.undefined
  var intentFlags: js.UndefOr[java.lang.String] = js.undefined
  var interKeyDelay: js.UndefOr[scala.Double] = js.undefined
  var isHeadless: js.UndefOr[scala.Boolean] = js.undefined
  // Read-write capabilities
  var javascriptEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var keepKeyChains: js.UndefOr[scala.Boolean] = js.undefined
  var keyAlias: js.UndefOr[java.lang.String] = js.undefined
  var keyPassword: js.UndefOr[java.lang.String] = js.undefined
  var keystorePassword: js.UndefOr[java.lang.String] = js.undefined
  var keystorePath: js.UndefOr[java.lang.String] = js.undefined
  var killProcessesByName: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var launchTimeout: js.UndefOr[scala.Double] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var localeScript: js.UndefOr[java.lang.String] = js.undefined
  var localizableStringsDir: js.UndefOr[java.lang.String] = js.undefined
  var locationContextEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var locationServicesAuthorized: js.UndefOr[scala.Boolean] = js.undefined
  var locationServicesEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var logFile: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var loggingPrefs: js.UndefOr[webdriverLib.Anon_Browser] = js.undefined
  var maxInstances: js.UndefOr[scala.Double] = js.undefined
  var mobileEmulationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var `moz:firefoxOptions`: js.UndefOr[FirefoxOptions] = js.undefined
  var `ms:extensionPaths`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Edge specific
  var `ms:inPrivate`: js.UndefOr[scala.Boolean] = js.undefined
  var `ms:startPage`: js.UndefOr[java.lang.String] = js.undefined
  var nativeEvents: js.UndefOr[scala.Boolean] = js.undefined
  var nativeInstrumentsLib: js.UndefOr[scala.Boolean] = js.undefined
  var nativeWebScreenshot: js.UndefOr[scala.Boolean] = js.undefined
  var nativeWebTap: js.UndefOr[scala.Boolean] = js.undefined
  var networkSpeed: js.UndefOr[java.lang.String] = js.undefined
  var newCommandTimeout: js.UndefOr[scala.Double] = js.undefined
  var noReset: js.UndefOr[scala.Boolean] = js.undefined
  var noSign: js.UndefOr[scala.Boolean] = js.undefined
  var onlyProxySeleniumTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var optionalIntentArguments: js.UndefOr[java.lang.String] = js.undefined
  var optionsSet: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var otherApps: js.UndefOr[java.lang.String] = js.undefined
  var pageLoadingStrategy: js.UndefOr[java.lang.String] = js.undefined
  var perfLoggingPrefs: js.UndefOr[webdriverLib.Anon_BufferUsageReportingInterval] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var platformVersion: js.UndefOr[java.lang.String] = js.undefined
  var printPageSourceOnFindFailure: js.UndefOr[scala.Boolean] = js.undefined
  var processArguments: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var proxyEverything: js.UndefOr[scala.Boolean] = js.undefined
  var proxyRequired: js.UndefOr[scala.Boolean] = js.undefined
  var recreateChromeDriverSessions: js.UndefOr[scala.Boolean] = js.undefined
  var remoteAdbHost: js.UndefOr[java.lang.String] = js.undefined
  var remoteDebugProxy: js.UndefOr[java.lang.String] = js.undefined
  var requireWindowFocus: js.UndefOr[scala.Boolean] = js.undefined
  var resetKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  var rotatable: js.UndefOr[scala.Boolean] = js.undefined
  // Safari specific
  var `safari.options`: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var safariAllowPopups: js.UndefOr[scala.Boolean] = js.undefined
  var safariIgnoreFraudWarning: js.UndefOr[scala.Boolean] = js.undefined
  var safariInitialUrl: js.UndefOr[java.lang.String] = js.undefined
  var safariOpenLinksInBackground: js.UndefOr[scala.Boolean] = js.undefined
  var screenshotWaitTimeout: js.UndefOr[scala.Double] = js.undefined
  // Selenese-Backed-WebDriver specific
  var `selenium.server.url`: js.UndefOr[java.lang.String] = js.undefined
  // Grid-specific
  var seleniumProtocol: js.UndefOr[java.lang.String] = js.undefined
  var sendKeyStrategy: js.UndefOr[java.lang.String] = js.undefined
  var showIOSLog: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[java.lang.String] = js.undefined
  var singleWindow: js.UndefOr[scala.Boolean] = js.undefined
  var skipDeviceInitialization: js.UndefOr[scala.Boolean] = js.undefined
  var skipLogCapture: js.UndefOr[scala.Boolean] = js.undefined
  var skipLogcatCapture: js.UndefOr[scala.Boolean] = js.undefined
  var skipServerInstallation: js.UndefOr[scala.Boolean] = js.undefined
  var skipUnlock: js.UndefOr[scala.Boolean] = js.undefined
  // webdriverio specific
  var specs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var systemPort: js.UndefOr[scala.Double] = js.undefined
  var timeoutInSeconds: js.UndefOr[scala.Double] = js.undefined
  var trustAllSSLCertificates: js.UndefOr[scala.Boolean] = js.undefined
  var udid: js.UndefOr[java.lang.String] = js.undefined
  var uiautomator2ServerInstallTimeout: js.UndefOr[scala.Double] = js.undefined
  var uiautomator2ServerLaunchTimeout: js.UndefOr[scala.Double] = js.undefined
  var unexpectedAlertBehaviour: js.UndefOr[java.lang.String] = js.undefined
  var unicodeKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  var uninstallOtherPackages: js.UndefOr[java.lang.String] = js.undefined
  var unlockKey: js.UndefOr[java.lang.String] = js.undefined
  var unlockType: js.UndefOr[java.lang.String] = js.undefined
  var useKeystore: js.UndefOr[scala.Boolean] = js.undefined
  var userExtensions: js.UndefOr[java.lang.String] = js.undefined
  var userJSInjection: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var waitForAppScript: js.UndefOr[java.lang.String] = js.undefined
  var webStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var `webdriver.remote.quietExceptions`: js.UndefOr[scala.Boolean] = js.undefined
  // RemoteWebDriver specific
  var `webdriver.remote.sessionid`: js.UndefOr[java.lang.String] = js.undefined
  var webkitDebugProxyPort: js.UndefOr[scala.Double] = js.undefined
  var webkitResponseTimeout: js.UndefOr[scala.Double] = js.undefined
  var webviewConnectRetries: js.UndefOr[scala.Double] = js.undefined
}

object DesiredCapabilities {
  @scala.inline
  def apply(
    acceptInsecureCerts: js.UndefOr[scala.Boolean] = js.undefined,
    acceptSslCerts: js.UndefOr[scala.Boolean] = js.undefined,
    adbExecTimeout: scala.Int | scala.Double = null,
    adbPort: scala.Int | scala.Double = null,
    addCustomRequestHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    allowTestPackages: js.UndefOr[scala.Boolean] = js.undefined,
    androidCoverage: java.lang.String = null,
    androidCoverageEndIntent: java.lang.String = null,
    androidDeviceReadyTimeout: scala.Int | scala.Double = null,
    androidDeviceSocket: java.lang.String = null,
    androidInstallPath: java.lang.String = null,
    androidInstallTimeout: scala.Int | scala.Double = null,
    androidScreenshotPath: java.lang.String = null,
    app: java.lang.String = null,
    appActivity: java.lang.String = null,
    appName: java.lang.String = null,
    appPackage: java.lang.String = null,
    appWaitActivity: java.lang.String = null,
    appWaitDuration: scala.Int | scala.Double = null,
    appWaitPackage: java.lang.String = null,
    applicationCacheEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    autoAcceptAlerts: js.UndefOr[scala.Boolean] = js.undefined,
    autoDismissAlerts: js.UndefOr[scala.Boolean] = js.undefined,
    autoGrantPermissions: js.UndefOr[scala.Boolean] = js.undefined,
    autoLaunch: js.UndefOr[scala.Boolean] = js.undefined,
    autoWebview: js.UndefOr[scala.Boolean] = js.undefined,
    autoWebviewTimeout: scala.Int | scala.Double = null,
    automationName: java.lang.String = null,
    avd: java.lang.String = null,
    avdArgs: java.lang.String = null,
    avdLaunchTimeout: scala.Int | scala.Double = null,
    avdReadyTimeout: scala.Int | scala.Double = null,
    avoidProxy: js.UndefOr[scala.Boolean] = js.undefined,
    browserAttachTimeout: scala.Int | scala.Double = null,
    browserConnectionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    browserName: java.lang.String = null,
    browserSideLog: js.UndefOr[scala.Boolean] = js.undefined,
    browserVersion: java.lang.String = null,
    build: java.lang.String = null,
    bundleId: java.lang.String = null,
    calendarFormat: java.lang.String = null,
    captureNetworkTraffic: js.UndefOr[scala.Boolean] = js.undefined,
    changeMaxConnections: js.UndefOr[scala.Boolean] = js.undefined,
    chromeOptions: ChromeOptions = null,
    chromedriverArgs: js.Array[java.lang.String] = null,
    chromedriverChromeMappingFile: java.lang.String = null,
    chromedriverDisableBuildCheck: js.UndefOr[scala.Boolean] = js.undefined,
    chromedriverExecutable: java.lang.String = null,
    chromedriverExecutableDir: java.lang.String = null,
    chromedriverPort: scala.Int | scala.Double = null,
    chromedriverPorts: js.Array[scala.Double | js.Array[scala.Double]] = null,
    chromedriverUseSystemExecutable: js.UndefOr[scala.Boolean] = js.undefined,
    cleanSession: js.UndefOr[scala.Boolean] = js.undefined,
    commandLineFlags: java.lang.String = null,
    cssSelectorsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    customSSLCert: java.lang.String = null,
    databaseEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    deviceName: java.lang.String = null,
    deviceReadyTimeout: scala.Int | scala.Double = null,
    disableAndroidWatchers: js.UndefOr[scala.Boolean] = js.undefined,
    disableWindowAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    dontInjectRegex: stdLib.RegExp = null,
    dontStopAppOnReset: js.UndefOr[scala.Boolean] = js.undefined,
    elementScrollBehavior: scala.Int | scala.Double = null,
    enableAsyncExecuteFromHttps: js.UndefOr[scala.Boolean] = js.undefined,
    enableElementCacheCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    enablePerformanceLogging: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistentHover: js.UndefOr[scala.Boolean] = js.undefined,
    environment: java.lang.String = null,
    espressoServerLaunchTimeout: scala.Int | scala.Double = null,
    eventTimings: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String] = null,
    executablePath: java.lang.String = null,
    extractPath: java.lang.String = null,
    firefoxProfileTemplate: java.lang.String = null,
    firefox_binary: java.lang.String = null,
    fullReset: js.UndefOr[scala.Boolean] = js.undefined,
    `goog:chromeOptions`: ChromeOptions = null,
    gpsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    handlesAlerts: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    `ie.browserCommandLineSwitches`: java.lang.String = null,
    `ie.ensureCleanSession`: js.UndefOr[scala.Boolean] = js.undefined,
    `ie.forceCreateProcessApi`: js.UndefOr[scala.Boolean] = js.undefined,
    `ie.setProxyByServer`: js.UndefOr[scala.Boolean] = js.undefined,
    `ie.usePerProcessProxy`: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreProtectedModeSettings: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUnimportantViews: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreZoomSetting: js.UndefOr[scala.Boolean] = js.undefined,
    initialBrowserUrl: java.lang.String = null,
    intentAction: java.lang.String = null,
    intentCategory: java.lang.String = null,
    intentFlags: java.lang.String = null,
    interKeyDelay: scala.Int | scala.Double = null,
    isHeadless: js.UndefOr[scala.Boolean] = js.undefined,
    javascriptEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    keepKeyChains: js.UndefOr[scala.Boolean] = js.undefined,
    keyAlias: java.lang.String = null,
    keyPassword: java.lang.String = null,
    keystorePassword: java.lang.String = null,
    keystorePath: java.lang.String = null,
    killProcessesByName: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    launchTimeout: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    localeScript: java.lang.String = null,
    localizableStringsDir: java.lang.String = null,
    locationContextEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    locationServicesAuthorized: js.UndefOr[scala.Boolean] = js.undefined,
    locationServicesEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    logFile: java.lang.String = null,
    logLevel: java.lang.String = null,
    loggingPrefs: webdriverLib.Anon_Browser = null,
    maxInstances: scala.Int | scala.Double = null,
    mobileEmulationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    `moz:firefoxOptions`: FirefoxOptions = null,
    `ms:extensionPaths`: js.Array[java.lang.String] = null,
    `ms:inPrivate`: js.UndefOr[scala.Boolean] = js.undefined,
    `ms:startPage`: java.lang.String = null,
    nativeEvents: js.UndefOr[scala.Boolean] = js.undefined,
    nativeInstrumentsLib: js.UndefOr[scala.Boolean] = js.undefined,
    nativeWebScreenshot: js.UndefOr[scala.Boolean] = js.undefined,
    nativeWebTap: js.UndefOr[scala.Boolean] = js.undefined,
    networkSpeed: java.lang.String = null,
    newCommandTimeout: scala.Int | scala.Double = null,
    noReset: js.UndefOr[scala.Boolean] = js.undefined,
    noSign: js.UndefOr[scala.Boolean] = js.undefined,
    onlyProxySeleniumTraffic: js.UndefOr[scala.Boolean] = js.undefined,
    optionalIntentArguments: java.lang.String = null,
    optionsSet: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: java.lang.String = null,
    otherApps: java.lang.String = null,
    pageLoadStrategy: PageLoadingStrategy = null,
    pageLoadingStrategy: java.lang.String = null,
    perfLoggingPrefs: webdriverLib.Anon_BufferUsageReportingInterval = null,
    platform: java.lang.String = null,
    platformName: java.lang.String = null,
    platformVersion: java.lang.String = null,
    printPageSourceOnFindFailure: js.UndefOr[scala.Boolean] = js.undefined,
    processArguments: java.lang.String = null,
    profile: java.lang.String = null,
    proxy: ProxyObject = null,
    proxyEverything: js.UndefOr[scala.Boolean] = js.undefined,
    proxyRequired: js.UndefOr[scala.Boolean] = js.undefined,
    recreateChromeDriverSessions: js.UndefOr[scala.Boolean] = js.undefined,
    remoteAdbHost: java.lang.String = null,
    remoteDebugProxy: java.lang.String = null,
    requireWindowFocus: js.UndefOr[scala.Boolean] = js.undefined,
    resetKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    rotatable: js.UndefOr[scala.Boolean] = js.undefined,
    `safari.options`: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    safariAllowPopups: js.UndefOr[scala.Boolean] = js.undefined,
    safariIgnoreFraudWarning: js.UndefOr[scala.Boolean] = js.undefined,
    safariInitialUrl: java.lang.String = null,
    safariOpenLinksInBackground: js.UndefOr[scala.Boolean] = js.undefined,
    screenshotWaitTimeout: scala.Int | scala.Double = null,
    `selenium.server.url`: java.lang.String = null,
    seleniumProtocol: java.lang.String = null,
    sendKeyStrategy: java.lang.String = null,
    setWindowRect: js.UndefOr[scala.Boolean] = js.undefined,
    showIOSLog: js.UndefOr[scala.Boolean] = js.undefined,
    silent: java.lang.String = null,
    singleWindow: js.UndefOr[scala.Boolean] = js.undefined,
    skipDeviceInitialization: js.UndefOr[scala.Boolean] = js.undefined,
    skipLogCapture: js.UndefOr[scala.Boolean] = js.undefined,
    skipLogcatCapture: js.UndefOr[scala.Boolean] = js.undefined,
    skipServerInstallation: js.UndefOr[scala.Boolean] = js.undefined,
    skipUnlock: js.UndefOr[scala.Boolean] = js.undefined,
    specs: js.Array[java.lang.String] = null,
    systemPort: scala.Int | scala.Double = null,
    timeoutInSeconds: scala.Int | scala.Double = null,
    timeouts: Timeouts = null,
    trustAllSSLCertificates: js.UndefOr[scala.Boolean] = js.undefined,
    udid: java.lang.String = null,
    uiautomator2ServerInstallTimeout: scala.Int | scala.Double = null,
    uiautomator2ServerLaunchTimeout: scala.Int | scala.Double = null,
    unexpectedAlertBehaviour: java.lang.String = null,
    unhandledPromptBehavior: java.lang.String = null,
    unicodeKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    uninstallOtherPackages: java.lang.String = null,
    unlockKey: java.lang.String = null,
    unlockType: java.lang.String = null,
    useKeystore: js.UndefOr[scala.Boolean] = js.undefined,
    userExtensions: java.lang.String = null,
    userJSInjection: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    waitForAppScript: java.lang.String = null,
    webStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    `webdriver.remote.quietExceptions`: js.UndefOr[scala.Boolean] = js.undefined,
    `webdriver.remote.sessionid`: java.lang.String = null,
    webkitDebugProxyPort: scala.Int | scala.Double = null,
    webkitResponseTimeout: scala.Int | scala.Double = null,
    webviewConnectRetries: scala.Int | scala.Double = null
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

