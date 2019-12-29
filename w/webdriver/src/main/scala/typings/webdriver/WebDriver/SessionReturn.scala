package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.webdriver.Anon_Browser
import typings.webdriver.Anon_BufferUsageReportingInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// webdriver.json
trait SessionReturn
  extends DesiredCapabilities
     with ProtocolCommandResponse

object SessionReturn {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
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
    bstackColonoptions: StringDictionary[js.Any] = null,
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
    googColonchromeOptions: ChromeOptions = null,
    gpsEnabled: js.UndefOr[Boolean] = js.undefined,
    handlesAlerts: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    ieDotbrowserCommandLineSwitches: String = null,
    ieDotensureCleanSession: js.UndefOr[Boolean] = js.undefined,
    ieDotforceCreateProcessApi: js.UndefOr[Boolean] = js.undefined,
    ieDotsetProxyByServer: js.UndefOr[Boolean] = js.undefined,
    ieDotusePerProcessProxy: js.UndefOr[Boolean] = js.undefined,
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
    mozColonfirefoxOptions: FirefoxOptions = null,
    msColonextensionPaths: js.Array[String] = null,
    msColoninPrivate: js.UndefOr[Boolean] = js.undefined,
    msColonstartPage: String = null,
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
    safariAllowPopups: js.UndefOr[Boolean] = js.undefined,
    safariDotoptions: StringDictionary[js.Any] = null,
    safariIgnoreFraudWarning: js.UndefOr[Boolean] = js.undefined,
    safariInitialUrl: String = null,
    safariOpenLinksInBackground: js.UndefOr[Boolean] = js.undefined,
    sauceColonoptions: StringDictionary[js.Any] = null,
    screenshotWaitTimeout: Int | Double = null,
    seleniumDotserverDoturl: String = null,
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
    tbColonoptions: StringDictionary[js.Any] = null,
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
    webdriverDotremoteDotquietExceptions: js.UndefOr[Boolean] = js.undefined,
    webdriverDotremoteDotsessionid: String = null,
    webkitDebugProxyPort: Int | Double = null,
    webkitResponseTimeout: Int | Double = null,
    webviewConnectRetries: Int | Double = null
  ): SessionReturn = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(acceptInsecureCerts)) __obj.updateDynamic("acceptInsecureCerts")(acceptInsecureCerts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptSslCerts)) __obj.updateDynamic("acceptSslCerts")(acceptSslCerts.asInstanceOf[js.Any])
    if (adbExecTimeout != null) __obj.updateDynamic("adbExecTimeout")(adbExecTimeout.asInstanceOf[js.Any])
    if (adbPort != null) __obj.updateDynamic("adbPort")(adbPort.asInstanceOf[js.Any])
    if (!js.isUndefined(addCustomRequestHeaders)) __obj.updateDynamic("addCustomRequestHeaders")(addCustomRequestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTestPackages)) __obj.updateDynamic("allowTestPackages")(allowTestPackages.asInstanceOf[js.Any])
    if (androidCoverage != null) __obj.updateDynamic("androidCoverage")(androidCoverage.asInstanceOf[js.Any])
    if (androidCoverageEndIntent != null) __obj.updateDynamic("androidCoverageEndIntent")(androidCoverageEndIntent.asInstanceOf[js.Any])
    if (androidDeviceReadyTimeout != null) __obj.updateDynamic("androidDeviceReadyTimeout")(androidDeviceReadyTimeout.asInstanceOf[js.Any])
    if (androidDeviceSocket != null) __obj.updateDynamic("androidDeviceSocket")(androidDeviceSocket.asInstanceOf[js.Any])
    if (androidInstallPath != null) __obj.updateDynamic("androidInstallPath")(androidInstallPath.asInstanceOf[js.Any])
    if (androidInstallTimeout != null) __obj.updateDynamic("androidInstallTimeout")(androidInstallTimeout.asInstanceOf[js.Any])
    if (androidScreenshotPath != null) __obj.updateDynamic("androidScreenshotPath")(androidScreenshotPath.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (appActivity != null) __obj.updateDynamic("appActivity")(appActivity.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (appPackage != null) __obj.updateDynamic("appPackage")(appPackage.asInstanceOf[js.Any])
    if (appWaitActivity != null) __obj.updateDynamic("appWaitActivity")(appWaitActivity.asInstanceOf[js.Any])
    if (appWaitDuration != null) __obj.updateDynamic("appWaitDuration")(appWaitDuration.asInstanceOf[js.Any])
    if (appWaitPackage != null) __obj.updateDynamic("appWaitPackage")(appWaitPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationCacheEnabled)) __obj.updateDynamic("applicationCacheEnabled")(applicationCacheEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAcceptAlerts)) __obj.updateDynamic("autoAcceptAlerts")(autoAcceptAlerts.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDismissAlerts)) __obj.updateDynamic("autoDismissAlerts")(autoDismissAlerts.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGrantPermissions)) __obj.updateDynamic("autoGrantPermissions")(autoGrantPermissions.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLaunch)) __obj.updateDynamic("autoLaunch")(autoLaunch.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWebview)) __obj.updateDynamic("autoWebview")(autoWebview.asInstanceOf[js.Any])
    if (autoWebviewTimeout != null) __obj.updateDynamic("autoWebviewTimeout")(autoWebviewTimeout.asInstanceOf[js.Any])
    if (automationName != null) __obj.updateDynamic("automationName")(automationName.asInstanceOf[js.Any])
    if (avd != null) __obj.updateDynamic("avd")(avd.asInstanceOf[js.Any])
    if (avdArgs != null) __obj.updateDynamic("avdArgs")(avdArgs.asInstanceOf[js.Any])
    if (avdLaunchTimeout != null) __obj.updateDynamic("avdLaunchTimeout")(avdLaunchTimeout.asInstanceOf[js.Any])
    if (avdReadyTimeout != null) __obj.updateDynamic("avdReadyTimeout")(avdReadyTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidProxy)) __obj.updateDynamic("avoidProxy")(avoidProxy.asInstanceOf[js.Any])
    if (browserAttachTimeout != null) __obj.updateDynamic("browserAttachTimeout")(browserAttachTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(browserConnectionEnabled)) __obj.updateDynamic("browserConnectionEnabled")(browserConnectionEnabled.asInstanceOf[js.Any])
    if (browserName != null) __obj.updateDynamic("browserName")(browserName.asInstanceOf[js.Any])
    if (!js.isUndefined(browserSideLog)) __obj.updateDynamic("browserSideLog")(browserSideLog.asInstanceOf[js.Any])
    if (browserVersion != null) __obj.updateDynamic("browserVersion")(browserVersion.asInstanceOf[js.Any])
    if (bstackColonoptions != null) __obj.updateDynamic("bstack:options")(bstackColonoptions.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (calendarFormat != null) __obj.updateDynamic("calendarFormat")(calendarFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(captureNetworkTraffic)) __obj.updateDynamic("captureNetworkTraffic")(captureNetworkTraffic.asInstanceOf[js.Any])
    if (!js.isUndefined(changeMaxConnections)) __obj.updateDynamic("changeMaxConnections")(changeMaxConnections.asInstanceOf[js.Any])
    if (chromeOptions != null) __obj.updateDynamic("chromeOptions")(chromeOptions.asInstanceOf[js.Any])
    if (chromedriverArgs != null) __obj.updateDynamic("chromedriverArgs")(chromedriverArgs.asInstanceOf[js.Any])
    if (chromedriverChromeMappingFile != null) __obj.updateDynamic("chromedriverChromeMappingFile")(chromedriverChromeMappingFile.asInstanceOf[js.Any])
    if (!js.isUndefined(chromedriverDisableBuildCheck)) __obj.updateDynamic("chromedriverDisableBuildCheck")(chromedriverDisableBuildCheck.asInstanceOf[js.Any])
    if (chromedriverExecutable != null) __obj.updateDynamic("chromedriverExecutable")(chromedriverExecutable.asInstanceOf[js.Any])
    if (chromedriverExecutableDir != null) __obj.updateDynamic("chromedriverExecutableDir")(chromedriverExecutableDir.asInstanceOf[js.Any])
    if (chromedriverPort != null) __obj.updateDynamic("chromedriverPort")(chromedriverPort.asInstanceOf[js.Any])
    if (chromedriverPorts != null) __obj.updateDynamic("chromedriverPorts")(chromedriverPorts.asInstanceOf[js.Any])
    if (!js.isUndefined(chromedriverUseSystemExecutable)) __obj.updateDynamic("chromedriverUseSystemExecutable")(chromedriverUseSystemExecutable.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanSession)) __obj.updateDynamic("cleanSession")(cleanSession.asInstanceOf[js.Any])
    if (commandLineFlags != null) __obj.updateDynamic("commandLineFlags")(commandLineFlags.asInstanceOf[js.Any])
    if (!js.isUndefined(cssSelectorsEnabled)) __obj.updateDynamic("cssSelectorsEnabled")(cssSelectorsEnabled.asInstanceOf[js.Any])
    if (customSSLCert != null) __obj.updateDynamic("customSSLCert")(customSSLCert.asInstanceOf[js.Any])
    if (!js.isUndefined(databaseEnabled)) __obj.updateDynamic("databaseEnabled")(databaseEnabled.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (deviceReadyTimeout != null) __obj.updateDynamic("deviceReadyTimeout")(deviceReadyTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAndroidWatchers)) __obj.updateDynamic("disableAndroidWatchers")(disableAndroidWatchers.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWindowAnimation)) __obj.updateDynamic("disableWindowAnimation")(disableWindowAnimation.asInstanceOf[js.Any])
    if (dontInjectRegex != null) __obj.updateDynamic("dontInjectRegex")(dontInjectRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(dontStopAppOnReset)) __obj.updateDynamic("dontStopAppOnReset")(dontStopAppOnReset.asInstanceOf[js.Any])
    if (elementScrollBehavior != null) __obj.updateDynamic("elementScrollBehavior")(elementScrollBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAsyncExecuteFromHttps)) __obj.updateDynamic("enableAsyncExecuteFromHttps")(enableAsyncExecuteFromHttps.asInstanceOf[js.Any])
    if (!js.isUndefined(enableElementCacheCleanup)) __obj.updateDynamic("enableElementCacheCleanup")(enableElementCacheCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePerformanceLogging)) __obj.updateDynamic("enablePerformanceLogging")(enablePerformanceLogging.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistentHover)) __obj.updateDynamic("enablePersistentHover")(enablePersistentHover.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (espressoServerLaunchTimeout != null) __obj.updateDynamic("espressoServerLaunchTimeout")(espressoServerLaunchTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(eventTimings)) __obj.updateDynamic("eventTimings")(eventTimings.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (executablePath != null) __obj.updateDynamic("executablePath")(executablePath.asInstanceOf[js.Any])
    if (extractPath != null) __obj.updateDynamic("extractPath")(extractPath.asInstanceOf[js.Any])
    if (firefoxProfileTemplate != null) __obj.updateDynamic("firefoxProfileTemplate")(firefoxProfileTemplate.asInstanceOf[js.Any])
    if (firefox_binary != null) __obj.updateDynamic("firefox_binary")(firefox_binary.asInstanceOf[js.Any])
    if (!js.isUndefined(fullReset)) __obj.updateDynamic("fullReset")(fullReset.asInstanceOf[js.Any])
    if (googColonchromeOptions != null) __obj.updateDynamic("goog:chromeOptions")(googColonchromeOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(gpsEnabled)) __obj.updateDynamic("gpsEnabled")(gpsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(handlesAlerts)) __obj.updateDynamic("handlesAlerts")(handlesAlerts.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (ieDotbrowserCommandLineSwitches != null) __obj.updateDynamic("ie.browserCommandLineSwitches")(ieDotbrowserCommandLineSwitches.asInstanceOf[js.Any])
    if (!js.isUndefined(ieDotensureCleanSession)) __obj.updateDynamic("ie.ensureCleanSession")(ieDotensureCleanSession.asInstanceOf[js.Any])
    if (!js.isUndefined(ieDotforceCreateProcessApi)) __obj.updateDynamic("ie.forceCreateProcessApi")(ieDotforceCreateProcessApi.asInstanceOf[js.Any])
    if (!js.isUndefined(ieDotsetProxyByServer)) __obj.updateDynamic("ie.setProxyByServer")(ieDotsetProxyByServer.asInstanceOf[js.Any])
    if (!js.isUndefined(ieDotusePerProcessProxy)) __obj.updateDynamic("ie.usePerProcessProxy")(ieDotusePerProcessProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreProtectedModeSettings)) __obj.updateDynamic("ignoreProtectedModeSettings")(ignoreProtectedModeSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnimportantViews)) __obj.updateDynamic("ignoreUnimportantViews")(ignoreUnimportantViews.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreZoomSetting)) __obj.updateDynamic("ignoreZoomSetting")(ignoreZoomSetting.asInstanceOf[js.Any])
    if (initialBrowserUrl != null) __obj.updateDynamic("initialBrowserUrl")(initialBrowserUrl.asInstanceOf[js.Any])
    if (intentAction != null) __obj.updateDynamic("intentAction")(intentAction.asInstanceOf[js.Any])
    if (intentCategory != null) __obj.updateDynamic("intentCategory")(intentCategory.asInstanceOf[js.Any])
    if (intentFlags != null) __obj.updateDynamic("intentFlags")(intentFlags.asInstanceOf[js.Any])
    if (interKeyDelay != null) __obj.updateDynamic("interKeyDelay")(interKeyDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeadless)) __obj.updateDynamic("isHeadless")(isHeadless.asInstanceOf[js.Any])
    if (!js.isUndefined(javascriptEnabled)) __obj.updateDynamic("javascriptEnabled")(javascriptEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(keepKeyChains)) __obj.updateDynamic("keepKeyChains")(keepKeyChains.asInstanceOf[js.Any])
    if (keyAlias != null) __obj.updateDynamic("keyAlias")(keyAlias.asInstanceOf[js.Any])
    if (keyPassword != null) __obj.updateDynamic("keyPassword")(keyPassword.asInstanceOf[js.Any])
    if (keystorePassword != null) __obj.updateDynamic("keystorePassword")(keystorePassword.asInstanceOf[js.Any])
    if (keystorePath != null) __obj.updateDynamic("keystorePath")(keystorePath.asInstanceOf[js.Any])
    if (!js.isUndefined(killProcessesByName)) __obj.updateDynamic("killProcessesByName")(killProcessesByName.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (launchTimeout != null) __obj.updateDynamic("launchTimeout")(launchTimeout.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeScript != null) __obj.updateDynamic("localeScript")(localeScript.asInstanceOf[js.Any])
    if (localizableStringsDir != null) __obj.updateDynamic("localizableStringsDir")(localizableStringsDir.asInstanceOf[js.Any])
    if (!js.isUndefined(locationContextEnabled)) __obj.updateDynamic("locationContextEnabled")(locationContextEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(locationServicesAuthorized)) __obj.updateDynamic("locationServicesAuthorized")(locationServicesAuthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(locationServicesEnabled)) __obj.updateDynamic("locationServicesEnabled")(locationServicesEnabled.asInstanceOf[js.Any])
    if (logFile != null) __obj.updateDynamic("logFile")(logFile.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (loggingPrefs != null) __obj.updateDynamic("loggingPrefs")(loggingPrefs.asInstanceOf[js.Any])
    if (maxInstances != null) __obj.updateDynamic("maxInstances")(maxInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileEmulationEnabled)) __obj.updateDynamic("mobileEmulationEnabled")(mobileEmulationEnabled.asInstanceOf[js.Any])
    if (mozColonfirefoxOptions != null) __obj.updateDynamic("moz:firefoxOptions")(mozColonfirefoxOptions.asInstanceOf[js.Any])
    if (msColonextensionPaths != null) __obj.updateDynamic("ms:extensionPaths")(msColonextensionPaths.asInstanceOf[js.Any])
    if (!js.isUndefined(msColoninPrivate)) __obj.updateDynamic("ms:inPrivate")(msColoninPrivate.asInstanceOf[js.Any])
    if (msColonstartPage != null) __obj.updateDynamic("ms:startPage")(msColonstartPage.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeEvents)) __obj.updateDynamic("nativeEvents")(nativeEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeInstrumentsLib)) __obj.updateDynamic("nativeInstrumentsLib")(nativeInstrumentsLib.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeWebScreenshot)) __obj.updateDynamic("nativeWebScreenshot")(nativeWebScreenshot.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeWebTap)) __obj.updateDynamic("nativeWebTap")(nativeWebTap.asInstanceOf[js.Any])
    if (networkSpeed != null) __obj.updateDynamic("networkSpeed")(networkSpeed.asInstanceOf[js.Any])
    if (newCommandTimeout != null) __obj.updateDynamic("newCommandTimeout")(newCommandTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(noReset)) __obj.updateDynamic("noReset")(noReset.asInstanceOf[js.Any])
    if (!js.isUndefined(noSign)) __obj.updateDynamic("noSign")(noSign.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyProxySeleniumTraffic)) __obj.updateDynamic("onlyProxySeleniumTraffic")(onlyProxySeleniumTraffic.asInstanceOf[js.Any])
    if (optionalIntentArguments != null) __obj.updateDynamic("optionalIntentArguments")(optionalIntentArguments.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsSet)) __obj.updateDynamic("optionsSet")(optionsSet.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (otherApps != null) __obj.updateDynamic("otherApps")(otherApps.asInstanceOf[js.Any])
    if (pageLoadStrategy != null) __obj.updateDynamic("pageLoadStrategy")(pageLoadStrategy.asInstanceOf[js.Any])
    if (pageLoadingStrategy != null) __obj.updateDynamic("pageLoadingStrategy")(pageLoadingStrategy.asInstanceOf[js.Any])
    if (perfLoggingPrefs != null) __obj.updateDynamic("perfLoggingPrefs")(perfLoggingPrefs.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (platformName != null) __obj.updateDynamic("platformName")(platformName.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(printPageSourceOnFindFailure)) __obj.updateDynamic("printPageSourceOnFindFailure")(printPageSourceOnFindFailure.asInstanceOf[js.Any])
    if (processArguments != null) __obj.updateDynamic("processArguments")(processArguments.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(proxyEverything)) __obj.updateDynamic("proxyEverything")(proxyEverything.asInstanceOf[js.Any])
    if (!js.isUndefined(proxyRequired)) __obj.updateDynamic("proxyRequired")(proxyRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(recreateChromeDriverSessions)) __obj.updateDynamic("recreateChromeDriverSessions")(recreateChromeDriverSessions.asInstanceOf[js.Any])
    if (remoteAdbHost != null) __obj.updateDynamic("remoteAdbHost")(remoteAdbHost.asInstanceOf[js.Any])
    if (remoteDebugProxy != null) __obj.updateDynamic("remoteDebugProxy")(remoteDebugProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(requireWindowFocus)) __obj.updateDynamic("requireWindowFocus")(requireWindowFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(resetKeyboard)) __obj.updateDynamic("resetKeyboard")(resetKeyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable.asInstanceOf[js.Any])
    if (!js.isUndefined(safariAllowPopups)) __obj.updateDynamic("safariAllowPopups")(safariAllowPopups.asInstanceOf[js.Any])
    if (safariDotoptions != null) __obj.updateDynamic("safari.options")(safariDotoptions.asInstanceOf[js.Any])
    if (!js.isUndefined(safariIgnoreFraudWarning)) __obj.updateDynamic("safariIgnoreFraudWarning")(safariIgnoreFraudWarning.asInstanceOf[js.Any])
    if (safariInitialUrl != null) __obj.updateDynamic("safariInitialUrl")(safariInitialUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(safariOpenLinksInBackground)) __obj.updateDynamic("safariOpenLinksInBackground")(safariOpenLinksInBackground.asInstanceOf[js.Any])
    if (sauceColonoptions != null) __obj.updateDynamic("sauce:options")(sauceColonoptions.asInstanceOf[js.Any])
    if (screenshotWaitTimeout != null) __obj.updateDynamic("screenshotWaitTimeout")(screenshotWaitTimeout.asInstanceOf[js.Any])
    if (seleniumDotserverDoturl != null) __obj.updateDynamic("selenium.server.url")(seleniumDotserverDoturl.asInstanceOf[js.Any])
    if (seleniumProtocol != null) __obj.updateDynamic("seleniumProtocol")(seleniumProtocol.asInstanceOf[js.Any])
    if (sendKeyStrategy != null) __obj.updateDynamic("sendKeyStrategy")(sendKeyStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(setWindowRect)) __obj.updateDynamic("setWindowRect")(setWindowRect.asInstanceOf[js.Any])
    if (!js.isUndefined(showIOSLog)) __obj.updateDynamic("showIOSLog")(showIOSLog.asInstanceOf[js.Any])
    if (silent != null) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(singleWindow)) __obj.updateDynamic("singleWindow")(singleWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(skipDeviceInitialization)) __obj.updateDynamic("skipDeviceInitialization")(skipDeviceInitialization.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLogCapture)) __obj.updateDynamic("skipLogCapture")(skipLogCapture.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLogcatCapture)) __obj.updateDynamic("skipLogcatCapture")(skipLogcatCapture.asInstanceOf[js.Any])
    if (!js.isUndefined(skipServerInstallation)) __obj.updateDynamic("skipServerInstallation")(skipServerInstallation.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnlock)) __obj.updateDynamic("skipUnlock")(skipUnlock.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    if (systemPort != null) __obj.updateDynamic("systemPort")(systemPort.asInstanceOf[js.Any])
    if (tbColonoptions != null) __obj.updateDynamic("tb:options")(tbColonoptions.asInstanceOf[js.Any])
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    if (timeouts != null) __obj.updateDynamic("timeouts")(timeouts.asInstanceOf[js.Any])
    if (!js.isUndefined(trustAllSSLCertificates)) __obj.updateDynamic("trustAllSSLCertificates")(trustAllSSLCertificates.asInstanceOf[js.Any])
    if (udid != null) __obj.updateDynamic("udid")(udid.asInstanceOf[js.Any])
    if (uiautomator2ServerInstallTimeout != null) __obj.updateDynamic("uiautomator2ServerInstallTimeout")(uiautomator2ServerInstallTimeout.asInstanceOf[js.Any])
    if (uiautomator2ServerLaunchTimeout != null) __obj.updateDynamic("uiautomator2ServerLaunchTimeout")(uiautomator2ServerLaunchTimeout.asInstanceOf[js.Any])
    if (unexpectedAlertBehaviour != null) __obj.updateDynamic("unexpectedAlertBehaviour")(unexpectedAlertBehaviour.asInstanceOf[js.Any])
    if (unhandledPromptBehavior != null) __obj.updateDynamic("unhandledPromptBehavior")(unhandledPromptBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(unicodeKeyboard)) __obj.updateDynamic("unicodeKeyboard")(unicodeKeyboard.asInstanceOf[js.Any])
    if (uninstallOtherPackages != null) __obj.updateDynamic("uninstallOtherPackages")(uninstallOtherPackages.asInstanceOf[js.Any])
    if (unlockKey != null) __obj.updateDynamic("unlockKey")(unlockKey.asInstanceOf[js.Any])
    if (unlockType != null) __obj.updateDynamic("unlockType")(unlockType.asInstanceOf[js.Any])
    if (!js.isUndefined(useKeystore)) __obj.updateDynamic("useKeystore")(useKeystore.asInstanceOf[js.Any])
    if (userExtensions != null) __obj.updateDynamic("userExtensions")(userExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(userJSInjection)) __obj.updateDynamic("userJSInjection")(userJSInjection.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (waitForAppScript != null) __obj.updateDynamic("waitForAppScript")(waitForAppScript.asInstanceOf[js.Any])
    if (!js.isUndefined(webStorageEnabled)) __obj.updateDynamic("webStorageEnabled")(webStorageEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(webdriverDotremoteDotquietExceptions)) __obj.updateDynamic("webdriver.remote.quietExceptions")(webdriverDotremoteDotquietExceptions.asInstanceOf[js.Any])
    if (webdriverDotremoteDotsessionid != null) __obj.updateDynamic("webdriver.remote.sessionid")(webdriverDotremoteDotsessionid.asInstanceOf[js.Any])
    if (webkitDebugProxyPort != null) __obj.updateDynamic("webkitDebugProxyPort")(webkitDebugProxyPort.asInstanceOf[js.Any])
    if (webkitResponseTimeout != null) __obj.updateDynamic("webkitResponseTimeout")(webkitResponseTimeout.asInstanceOf[js.Any])
    if (webviewConnectRetries != null) __obj.updateDynamic("webviewConnectRetries")(webviewConnectRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReturn]
  }
}

