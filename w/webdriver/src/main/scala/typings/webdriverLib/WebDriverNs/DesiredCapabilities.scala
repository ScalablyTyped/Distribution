package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesiredCapabilities extends Capabilities {
  var acceptSslCerts: js.UndefOr[scala.Boolean] = js.undefined
  var addCustomRequestHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var app: js.UndefOr[java.lang.String] = js.undefined
  var applicationCacheEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var avoidProxy: js.UndefOr[scala.Boolean] = js.undefined
  var browserAttachTimeout: js.UndefOr[scala.Double] = js.undefined
  var browserConnectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var browserSideLog: js.UndefOr[scala.Boolean] = js.undefined
  // wdio-sauce-service specific
  var build: js.UndefOr[java.lang.String] = js.undefined
  var captureNetworkTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var changeMaxConnections: js.UndefOr[scala.Boolean] = js.undefined
  // Chrome specific
  var chromeOptions: js.UndefOr[ChromeOptions] = js.undefined
  var cleanSession: js.UndefOr[scala.Boolean] = js.undefined
  // Selenium RC (1.0) only
  var commandLineFlags: js.UndefOr[java.lang.String] = js.undefined
  // Read-only capabilities
  var cssSelectorsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var databaseEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // Appium
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
  var dontInjectRegex: js.UndefOr[stdLib.RegExp] = js.undefined
  var elementScrollBehavior: js.UndefOr[scala.Double] = js.undefined
  var enableElementCacheCleanup: js.UndefOr[scala.Boolean] = js.undefined
  var enablePersistentHover: js.UndefOr[scala.Boolean] = js.undefined
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var executablePath: js.UndefOr[java.lang.String] = js.undefined
  var extractPath: js.UndefOr[java.lang.String] = js.undefined
  var firefoxProfileTemplate: js.UndefOr[java.lang.String] = js.undefined
  // Firefox
  var firefox_binary: js.UndefOr[java.lang.String] = js.undefined
  var `goog:chromeOptions`: js.UndefOr[ChromeOptions] = js.undefined
  var handlesAlerts: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var `ie.browserCommandLineSwitches`: js.UndefOr[java.lang.String] = js.undefined
  var `ie.ensureCleanSession`: js.UndefOr[scala.Boolean] = js.undefined
  // IE specific
  var `ie.forceCreateProcessApi`: js.UndefOr[scala.Boolean] = js.undefined
  var `ie.setProxyByServer`: js.UndefOr[scala.Boolean] = js.undefined
  var `ie.usePerProcessProxy`: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreProtectedModeSettings: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreZoomSetting: js.UndefOr[scala.Boolean] = js.undefined
  var initialBrowserUrl: js.UndefOr[java.lang.String] = js.undefined
  // Read-write capabilities
  var javascriptEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var killProcessesByName: js.UndefOr[scala.Boolean] = js.undefined
  var locationContextEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var logFile: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var loggingPrefs: js.UndefOr[webdriverLib.Anon_Browser] = js.undefined
  var maxInstances: js.UndefOr[scala.Double] = js.undefined
  var mobileEmulationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var `moz:firefoxOptions`: js.UndefOr[FirefoxOptions] = js.undefined
  var nativeEvents: js.UndefOr[scala.Boolean] = js.undefined
  var onlyProxySeleniumTraffic: js.UndefOr[scala.Boolean] = js.undefined
  var optionsSet: js.UndefOr[scala.Boolean] = js.undefined
  var pageLoadingStrategy: js.UndefOr[java.lang.String] = js.undefined
  var perfLoggingPrefs: js.UndefOr[webdriverLib.Anon_BufferUsageReportingInterval] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var platformVersion: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var proxyEverything: js.UndefOr[scala.Boolean] = js.undefined
  var proxyRequired: js.UndefOr[scala.Boolean] = js.undefined
  var requireWindowFocus: js.UndefOr[scala.Boolean] = js.undefined
  var rotatable: js.UndefOr[scala.Boolean] = js.undefined
  // Safari specific
  var `safari.options`: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  // Selenese-Backed-WebDriver specific
  var `selenium.server.url`: js.UndefOr[java.lang.String] = js.undefined
  // Grid-specific
  var seleniumProtocol: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[java.lang.String] = js.undefined
  var singleWindow: js.UndefOr[scala.Boolean] = js.undefined
  var timeoutInSeconds: js.UndefOr[scala.Double] = js.undefined
  var trustAllSSLCertificates: js.UndefOr[scala.Boolean] = js.undefined
  var udid: js.UndefOr[java.lang.String] = js.undefined
  var unexpectedAlertBehaviour: js.UndefOr[java.lang.String] = js.undefined
  var userExtensions: js.UndefOr[java.lang.String] = js.undefined
  var userJSInjection: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var webStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var `webdriver.remote.quietExceptions`: js.UndefOr[scala.Boolean] = js.undefined
  // RemoteWebDriver specific
  var `webdriver.remote.sessionid`: js.UndefOr[java.lang.String] = js.undefined
}

object DesiredCapabilities {
  @scala.inline
  def apply(
    acceptInsecureCerts: js.UndefOr[scala.Boolean] = js.undefined,
    acceptSslCerts: js.UndefOr[scala.Boolean] = js.undefined,
    addCustomRequestHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    app: java.lang.String = null,
    applicationCacheEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    avoidProxy: js.UndefOr[scala.Boolean] = js.undefined,
    browserAttachTimeout: scala.Int | scala.Double = null,
    browserConnectionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    browserName: java.lang.String = null,
    browserSideLog: js.UndefOr[scala.Boolean] = js.undefined,
    browserVersion: java.lang.String = null,
    build: java.lang.String = null,
    captureNetworkTraffic: js.UndefOr[scala.Boolean] = js.undefined,
    changeMaxConnections: js.UndefOr[scala.Boolean] = js.undefined,
    chromeOptions: ChromeOptions = null,
    cleanSession: js.UndefOr[scala.Boolean] = js.undefined,
    commandLineFlags: java.lang.String = null,
    cssSelectorsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    databaseEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    deviceName: java.lang.String = null,
    dontInjectRegex: stdLib.RegExp = null,
    elementScrollBehavior: scala.Int | scala.Double = null,
    enableElementCacheCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistentHover: js.UndefOr[scala.Boolean] = js.undefined,
    environment: java.lang.String = null,
    executablePath: java.lang.String = null,
    extractPath: java.lang.String = null,
    firefoxProfileTemplate: java.lang.String = null,
    firefox_binary: java.lang.String = null,
    `goog:chromeOptions`: ChromeOptions = null,
    handlesAlerts: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    `ie.browserCommandLineSwitches`: java.lang.String = null,
    `ie.ensureCleanSession`: js.UndefOr[scala.Boolean] = js.undefined,
    `ie.forceCreateProcessApi`: js.UndefOr[scala.Boolean] = js.undefined,
    `ie.setProxyByServer`: js.UndefOr[scala.Boolean] = js.undefined,
    `ie.usePerProcessProxy`: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreProtectedModeSettings: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreZoomSetting: js.UndefOr[scala.Boolean] = js.undefined,
    initialBrowserUrl: java.lang.String = null,
    javascriptEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    killProcessesByName: js.UndefOr[scala.Boolean] = js.undefined,
    locationContextEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    logFile: java.lang.String = null,
    logLevel: java.lang.String = null,
    loggingPrefs: webdriverLib.Anon_Browser = null,
    maxInstances: scala.Int | scala.Double = null,
    mobileEmulationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    `moz:firefoxOptions`: FirefoxOptions = null,
    nativeEvents: js.UndefOr[scala.Boolean] = js.undefined,
    onlyProxySeleniumTraffic: js.UndefOr[scala.Boolean] = js.undefined,
    optionsSet: js.UndefOr[scala.Boolean] = js.undefined,
    pageLoadStrategy: PageLoadingStrategy = null,
    pageLoadingStrategy: java.lang.String = null,
    perfLoggingPrefs: webdriverLib.Anon_BufferUsageReportingInterval = null,
    platform: java.lang.String = null,
    platformName: java.lang.String = null,
    platformVersion: java.lang.String = null,
    profile: java.lang.String = null,
    proxy: ProxyObject = null,
    proxyEverything: js.UndefOr[scala.Boolean] = js.undefined,
    proxyRequired: js.UndefOr[scala.Boolean] = js.undefined,
    requireWindowFocus: js.UndefOr[scala.Boolean] = js.undefined,
    rotatable: js.UndefOr[scala.Boolean] = js.undefined,
    `safari.options`: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `selenium.server.url`: java.lang.String = null,
    seleniumProtocol: java.lang.String = null,
    setWindowRect: js.UndefOr[scala.Boolean] = js.undefined,
    silent: java.lang.String = null,
    singleWindow: js.UndefOr[scala.Boolean] = js.undefined,
    timeoutInSeconds: scala.Int | scala.Double = null,
    timeouts: Timeouts = null,
    trustAllSSLCertificates: js.UndefOr[scala.Boolean] = js.undefined,
    udid: java.lang.String = null,
    unexpectedAlertBehaviour: java.lang.String = null,
    unhandledPromptBehavior: java.lang.String = null,
    userExtensions: java.lang.String = null,
    userJSInjection: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    webStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    `webdriver.remote.quietExceptions`: js.UndefOr[scala.Boolean] = js.undefined,
    `webdriver.remote.sessionid`: java.lang.String = null
  ): DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptInsecureCerts)) __obj.updateDynamic("acceptInsecureCerts")(acceptInsecureCerts)
    if (!js.isUndefined(acceptSslCerts)) __obj.updateDynamic("acceptSslCerts")(acceptSslCerts)
    if (!js.isUndefined(addCustomRequestHeaders)) __obj.updateDynamic("addCustomRequestHeaders")(addCustomRequestHeaders)
    if (app != null) __obj.updateDynamic("app")(app)
    if (!js.isUndefined(applicationCacheEnabled)) __obj.updateDynamic("applicationCacheEnabled")(applicationCacheEnabled)
    if (!js.isUndefined(avoidProxy)) __obj.updateDynamic("avoidProxy")(avoidProxy)
    if (browserAttachTimeout != null) __obj.updateDynamic("browserAttachTimeout")(browserAttachTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(browserConnectionEnabled)) __obj.updateDynamic("browserConnectionEnabled")(browserConnectionEnabled)
    if (browserName != null) __obj.updateDynamic("browserName")(browserName)
    if (!js.isUndefined(browserSideLog)) __obj.updateDynamic("browserSideLog")(browserSideLog)
    if (browserVersion != null) __obj.updateDynamic("browserVersion")(browserVersion)
    if (build != null) __obj.updateDynamic("build")(build)
    if (!js.isUndefined(captureNetworkTraffic)) __obj.updateDynamic("captureNetworkTraffic")(captureNetworkTraffic)
    if (!js.isUndefined(changeMaxConnections)) __obj.updateDynamic("changeMaxConnections")(changeMaxConnections)
    if (chromeOptions != null) __obj.updateDynamic("chromeOptions")(chromeOptions)
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession)
    if (commandLineFlags != null) __obj.updateDynamic("commandLineFlags")(commandLineFlags)
    if (!js.isUndefined(cssSelectorsEnabled)) __obj.updateDynamic("cssSelectorsEnabled")(cssSelectorsEnabled)
    if (!js.isUndefined(databaseEnabled)) __obj.updateDynamic("databaseEnabled")(databaseEnabled)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (dontInjectRegex != null) __obj.updateDynamic("dontInjectRegex")(dontInjectRegex)
    if (elementScrollBehavior != null) __obj.updateDynamic("elementScrollBehavior")(elementScrollBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(enableElementCacheCleanup)) __obj.updateDynamic("enableElementCacheCleanup")(enableElementCacheCleanup)
    if (!js.isUndefined(enablePersistentHover)) __obj.updateDynamic("enablePersistentHover")(enablePersistentHover)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (executablePath != null) __obj.updateDynamic("executablePath")(executablePath)
    if (extractPath != null) __obj.updateDynamic("extractPath")(extractPath)
    if (firefoxProfileTemplate != null) __obj.updateDynamic("firefoxProfileTemplate")(firefoxProfileTemplate)
    if (firefox_binary != null) __obj.updateDynamic("firefox_binary")(firefox_binary)
    if (`goog:chromeOptions` != null) __obj.updateDynamic("goog:chromeOptions")(`goog:chromeOptions`)
    if (!js.isUndefined(handlesAlerts)) __obj.updateDynamic("handlesAlerts")(handlesAlerts)
    if (host != null) __obj.updateDynamic("host")(host)
    if (`ie.browserCommandLineSwitches` != null) __obj.updateDynamic("ie.browserCommandLineSwitches")(`ie.browserCommandLineSwitches`)
    if (!js.isUndefined(`ie.ensureCleanSession`)) __obj.updateDynamic("ie.ensureCleanSession")(`ie.ensureCleanSession`)
    if (!js.isUndefined(`ie.forceCreateProcessApi`)) __obj.updateDynamic("ie.forceCreateProcessApi")(`ie.forceCreateProcessApi`)
    if (!js.isUndefined(`ie.setProxyByServer`)) __obj.updateDynamic("ie.setProxyByServer")(`ie.setProxyByServer`)
    if (!js.isUndefined(`ie.usePerProcessProxy`)) __obj.updateDynamic("ie.usePerProcessProxy")(`ie.usePerProcessProxy`)
    if (!js.isUndefined(ignoreProtectedModeSettings)) __obj.updateDynamic("ignoreProtectedModeSettings")(ignoreProtectedModeSettings)
    if (!js.isUndefined(ignoreZoomSetting)) __obj.updateDynamic("ignoreZoomSetting")(ignoreZoomSetting)
    if (initialBrowserUrl != null) __obj.updateDynamic("initialBrowserUrl")(initialBrowserUrl)
    if (!js.isUndefined(javascriptEnabled)) __obj.updateDynamic("javascriptEnabled")(javascriptEnabled)
    if (!js.isUndefined(killProcessesByName)) __obj.updateDynamic("killProcessesByName")(killProcessesByName)
    if (!js.isUndefined(locationContextEnabled)) __obj.updateDynamic("locationContextEnabled")(locationContextEnabled)
    if (logFile != null) __obj.updateDynamic("logFile")(logFile)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (loggingPrefs != null) __obj.updateDynamic("loggingPrefs")(loggingPrefs)
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileEmulationEnabled)) __obj.updateDynamic("mobileEmulationEnabled")(mobileEmulationEnabled)
    if (`moz:firefoxOptions` != null) __obj.updateDynamic("moz:firefoxOptions")(`moz:firefoxOptions`)
    if (!js.isUndefined(nativeEvents)) __obj.updateDynamic("nativeEvents")(nativeEvents)
    if (!js.isUndefined(onlyProxySeleniumTraffic)) __obj.updateDynamic("onlyProxySeleniumTraffic")(onlyProxySeleniumTraffic)
    if (!js.isUndefined(optionsSet)) __obj.updateDynamic("optionsSet")(optionsSet)
    if (pageLoadStrategy != null) __obj.updateDynamic("pageLoadStrategy")(pageLoadStrategy)
    if (pageLoadingStrategy != null) __obj.updateDynamic("pageLoadingStrategy")(pageLoadingStrategy)
    if (perfLoggingPrefs != null) __obj.updateDynamic("perfLoggingPrefs")(perfLoggingPrefs)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (platformName != null) __obj.updateDynamic("platformName")(platformName)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(proxyEverything)) __obj.updateDynamic("proxyEverything")(proxyEverything)
    if (!js.isUndefined(proxyRequired)) __obj.updateDynamic("proxyRequired")(proxyRequired)
    if (!js.isUndefined(requireWindowFocus)) __obj.updateDynamic("requireWindowFocus")(requireWindowFocus)
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable)
    if (`safari.options` != null) __obj.updateDynamic("safari.options")(`safari.options`)
    if (`selenium.server.url` != null) __obj.updateDynamic("selenium.server.url")(`selenium.server.url`)
    if (seleniumProtocol != null) __obj.updateDynamic("seleniumProtocol")(seleniumProtocol)
    if (!js.isUndefined(setWindowRect)) __obj.updateDynamic("setWindowRect")(setWindowRect)
    if (silent != null) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(singleWindow)) __obj.updateDynamic("singleWindow")(singleWindow)
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    if (timeouts != null) __obj.updateDynamic("timeouts")(timeouts)
    if (!js.isUndefined(trustAllSSLCertificates)) __obj.updateDynamic("trustAllSSLCertificates")(trustAllSSLCertificates)
    if (udid != null) __obj.updateDynamic("udid")(udid)
    if (unexpectedAlertBehaviour != null) __obj.updateDynamic("unexpectedAlertBehaviour")(unexpectedAlertBehaviour)
    if (unhandledPromptBehavior != null) __obj.updateDynamic("unhandledPromptBehavior")(unhandledPromptBehavior)
    if (userExtensions != null) __obj.updateDynamic("userExtensions")(userExtensions)
    if (!js.isUndefined(userJSInjection)) __obj.updateDynamic("userJSInjection")(userJSInjection)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(webStorageEnabled)) __obj.updateDynamic("webStorageEnabled")(webStorageEnabled)
    if (!js.isUndefined(`webdriver.remote.quietExceptions`)) __obj.updateDynamic("webdriver.remote.quietExceptions")(`webdriver.remote.quietExceptions`)
    if (`webdriver.remote.sessionid` != null) __obj.updateDynamic("webdriver.remote.sessionid")(`webdriver.remote.sessionid`)
    __obj.asInstanceOf[DesiredCapabilities]
  }
}

