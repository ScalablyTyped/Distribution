package typings.wdioTypes.capabilitiesMod

import typings.wdioTypes.anon.AllowAllCookies
import typings.wdioTypes.anon.Arch
import typings.wdioTypes.anon.Browser
import typings.wdioTypes.anon.Driver
import typings.wdioTypes.anon.EnablePopups
import typings.wdioTypes.wdioTypesInts.`0`
import typings.wdioTypes.wdioTypesInts.`1`
import typings.wdioTypes.wdioTypesStrings.disable
import typings.wdioTypes.wdioTypesStrings.errors
import typings.wdioTypes.wdioTypesStrings.info_
import typings.wdioTypes.wdioTypesStrings.landscape
import typings.wdioTypes.wdioTypesStrings.portrait
import typings.wdioTypes.wdioTypesStrings.verbose
import typings.wdioTypes.wdioTypesStrings.warnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.wdioTypes.capabilitiesMod.AppiumXCUITestCapabilities because var conflicts: appiumColonapp, appiumColondeviceName, appiumColonenablePerformanceLogging, appiumColonnativeWebTap, appiumColonplatformName, appiumColonudid. Inlined appiumColonbrowserName, appiumColoncalendarFormat, appiumColonbundleId, appiumColonautoAcceptAlerts, appiumColonautoDismissAlerts, appiumColonsafariInitialUrl, appiumColonsafariAllowPopups, appiumColonsafariIgnoreFraudWarning, appiumColonsafariOpenLinksInBackground, appiumColonsafariShowFullResponse, appiumColonkeepKeyChains, appiumColonlocationServicesEnabled, appiumColonlocationServicesAuthorized, appiumColonresetLocationService, appiumColonlocalizableStringsDir, appiumColonprocessArguments, appiumColonshowIOSLog, appiumColonwebviewConnectRetries, appiumColonclearSystemFiles, appiumColoncustomSSLCert, appiumColonwebkitResponseTimeout, appiumColonwebkitDebugProxyPort, appiumColonremoteDebugProxy, appiumColonenableAsyncExecuteFromHttps, appiumColonfullContextList, appiumColonignoreAboutBlankUrl, appiumColonskipLogCapture, appiumColonshowXcodeLog, appiumColonwdaLocalPort, appiumColonwdaBaseUrl, appiumColoniosInstallPause, appiumColonxcodeConfigFile, appiumColonxcodeOrgId, appiumColonxcodeSigningId, appiumColonkeychainPath, appiumColonkeychainPassword, appiumColonbootstrapPath, appiumColonagentPath, appiumColontapWithShortPressDuration, appiumColonscaleFactor, appiumColonusePrebuiltWDA, appiumColonwebDriverAgentUrl, appiumColonderivedDataPath, appiumColonlaunchWithIDB, appiumColonuseNewWDA, appiumColonwdaLaunchTimeout, appiumColonwdaConnectionTimeout, appiumColonupdatedWDABundleId, appiumColonresetOnSessionStartOnly, appiumColoncommandTimeouts, appiumColonwdaStartupRetries, appiumColonwdaStartupRetryInterval, appiumColonprebuildWDA, appiumColonconnectHardwareKeyboard, appiumColonforceTurnOnSoftwareKeyboardSimulator, appiumColonsimulatorPasteboardAutomaticSync, appiumColonsimulatorDevicesSetPath, appiumColoncalendarAccessAuthorized, appiumColonuseSimpleBuildTest, appiumColonwaitForQuiescence, appiumColonmaxTypingFrequency, appiumColonnativeTyping, appiumColonsimpleIsVisibleCheck, appiumColonshouldUseSingletonTestManager, appiumColonisHeadless, appiumColonuseXctestrunFile, appiumColonabsoluteWebLocations, appiumColonsimulatorWindowCenter, appiumColonsimulatorStartupTimeout, appiumColonsimulatorTracePointer, appiumColonuseJSONSource, appiumColonenforceFreshSimulatorCreation, appiumColonshutdownOtherSimulators, appiumColonkeychainsExcludePatterns, appiumColonshowSafariConsoleLog, appiumColonshowSafariNetworkLog, appiumColonsafariGarbageCollect, appiumColonsafariGlobalPreferences, appiumColonsafariLogAllCommunication, appiumColonsafariLogAllCommunicationHexDump, appiumColonsafariSocketChunkSize, appiumColonmjpegServerPort, appiumColonreduceMotion, appiumColonmjpegScreenshotUrl, appiumColonpermissions, appiumColonscreenshotQuality, appiumColonwdaEventloopIdleDelay, appiumColonotherApps, appiumColonincludeSafariInWebviews, appiumColonadditionalWebviewBundleIds, appiumColonwebviewConnectTimeout, appiumColoniosSimulatorLogsPredicate, appiumColonappPushTimeout, appiumColonnativeWebTapStrict, appiumColonsafariWebInspectorMaxFrameLength, appiumColonallowProvisioningDeviceRegistration, appiumColonwaitForIdleTimeout, appiumColonresultBundlePath, appiumColonresultBundleVersion, appiumColonsafariIgnoreWebHostnames, appiumColonincludeDeviceCapsToSessionInfo, appiumColondisableAutomaticScreenshots, appiumColonshouldTerminateApp, appiumColonforceAppLaunch, appiumColonuseNativeCachingStrategy, appiumColonappInstallStrategy, appiumColonappArguments
- typings.wdioTypes.capabilitiesMod.BrowserStackCapabilities because var conflicts: appiumVersion, browserName, browserVersion, deviceName, idleTimeout, projectName, seleniumVersion. Inlined browser, browser_version, os, os_version, osVersion, desired, device, buildName, sessionName, local, debug, networkLogs, ie, userName, accessKey, localIdentifier, consoleLogs, appiumLogs, video, seleniumLogs, geoLocation, timezone, resolution, browserstackDotmaskCommands, maskBasicAuth, autoWait, hosts, bfcache, wsLocalSupport, realMobile, deviceOrientation, customNetwork, networkProfile, chrome, edge, browserstackDotsendKeys, safari, firefox, acceptSslCerts, wdioService
- typings.wdioTypes.capabilitiesMod.SeleniumRCCapabilities because var conflicts: avoidProxy. Inlined commandLineFlags, executablePath, timeoutInSeconds, onlyProxySeleniumTraffic, proxyEverything, proxyRequired, browserSideLog, optionsSet, singleWindow, dontInjectRegex, userJSInjection, userExtensions
- typings.wdioTypes.capabilitiesMod.TestingbotCapabilities because var conflicts: build, name, public, tags. Inlined `tunnel-identifier` */ trait DesiredCapabilities
  extends StObject
     with Capabilities
     with SauceLabsCapabilities
     with SauceLabsVisualCapabilities
     with AppiumIOSCapabilities
     with GeckodriverCapabilities
     with IECapabilities
     with AppiumAndroidCapabilities
     with AppiumCapabilities
     with GridCapabilities
     with ChromeCapabilities
     with _RemoteCapability {
  
  var acceptSslCerts: js.UndefOr[Boolean] = js.undefined
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  @JSName("appium:absoluteWebLocations")
  var appiumColonabsoluteWebLocations: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:additionalWebviewBundleIds")
  var appiumColonadditionalWebviewBundleIds: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("appium:agentPath")
  var appiumColonagentPath: js.UndefOr[String] = js.undefined
  
  @JSName("appium:allowProvisioningDeviceRegistration")
  var appiumColonallowProvisioningDeviceRegistration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Windows Application Driver capabilities
    */
  @JSName("appium:appArguments")
  var appiumColonappArguments: js.UndefOr[String] = js.undefined
  
  @JSName("appium:appInstallStrategy")
  var appiumColonappInstallStrategy: js.UndefOr[String] = js.undefined
  
  @JSName("appium:appPushTimeout")
  var appiumColonappPushTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:autoAcceptAlerts")
  var appiumColonautoAcceptAlerts: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:autoDismissAlerts")
  var appiumColonautoDismissAlerts: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:bootstrapPath")
  var appiumColonbootstrapPath: js.UndefOr[String] = js.undefined
  
  @JSName("appium:browserName")
  var appiumColonbrowserName: js.UndefOr[String] = js.undefined
  
  @JSName("appium:bundleId")
  var appiumColonbundleId: js.UndefOr[String] = js.undefined
  
  @JSName("appium:calendarAccessAuthorized")
  var appiumColoncalendarAccessAuthorized: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:calendarFormat")
  var appiumColoncalendarFormat: js.UndefOr[String] = js.undefined
  
  @JSName("appium:clearSystemFiles")
  var appiumColonclearSystemFiles: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:commandTimeouts")
  var appiumColoncommandTimeouts: js.UndefOr[String | AppiumXCUICommandTimeouts] = js.undefined
  
  @JSName("appium:connectHardwareKeyboard")
  var appiumColonconnectHardwareKeyboard: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:customSSLCert")
  var appiumColoncustomSSLCert: js.UndefOr[String] = js.undefined
  
  @JSName("appium:derivedDataPath")
  var appiumColonderivedDataPath: js.UndefOr[String] = js.undefined
  
  @JSName("appium:disableAutomaticScreenshots")
  var appiumColondisableAutomaticScreenshots: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:enableAsyncExecuteFromHttps")
  var appiumColonenableAsyncExecuteFromHttps: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:enforceFreshSimulatorCreation")
  var appiumColonenforceFreshSimulatorCreation: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:forceAppLaunch")
  var appiumColonforceAppLaunch: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:forceTurnOnSoftwareKeyboardSimulator")
  var appiumColonforceTurnOnSoftwareKeyboardSimulator: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:fullContextList")
  var appiumColonfullContextList: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:ignoreAboutBlankUrl")
  var appiumColonignoreAboutBlankUrl: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:includeDeviceCapsToSessionInfo")
  var appiumColonincludeDeviceCapsToSessionInfo: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:includeSafariInWebviews")
  var appiumColonincludeSafariInWebviews: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:iosInstallPause")
  var appiumColoniosInstallPause: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:iosSimulatorLogsPredicate")
  var appiumColoniosSimulatorLogsPredicate: js.UndefOr[String] = js.undefined
  
  @JSName("appium:isHeadless")
  var appiumColonisHeadless: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:keepKeyChains")
  var appiumColonkeepKeyChains: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:keychainPassword")
  var appiumColonkeychainPassword: js.UndefOr[String] = js.undefined
  
  @JSName("appium:keychainPath")
  var appiumColonkeychainPath: js.UndefOr[String] = js.undefined
  
  @JSName("appium:keychainsExcludePatterns")
  var appiumColonkeychainsExcludePatterns: js.UndefOr[String] = js.undefined
  
  @JSName("appium:launchWithIDB")
  var appiumColonlaunchWithIDB: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:localizableStringsDir")
  var appiumColonlocalizableStringsDir: js.UndefOr[String] = js.undefined
  
  @JSName("appium:locationServicesAuthorized")
  var appiumColonlocationServicesAuthorized: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:locationServicesEnabled")
  var appiumColonlocationServicesEnabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:maxTypingFrequency")
  var appiumColonmaxTypingFrequency: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:mjpegScreenshotUrl")
  var appiumColonmjpegScreenshotUrl: js.UndefOr[String] = js.undefined
  
  @JSName("appium:mjpegServerPort")
  var appiumColonmjpegServerPort: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:nativeTyping")
  var appiumColonnativeTyping: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:nativeWebTapStrict")
  var appiumColonnativeWebTapStrict: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:otherApps")
  var appiumColonotherApps: js.UndefOr[String] = js.undefined
  
  @JSName("appium:permissions")
  var appiumColonpermissions: js.UndefOr[String] = js.undefined
  
  @JSName("appium:prebuildWDA")
  var appiumColonprebuildWDA: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:processArguments")
  var appiumColonprocessArguments: js.UndefOr[String | AppiumXCUIProcessArguments] = js.undefined
  
  @JSName("appium:reduceMotion")
  var appiumColonreduceMotion: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:remoteDebugProxy")
  var appiumColonremoteDebugProxy: js.UndefOr[String] = js.undefined
  
  @JSName("appium:resetLocationService")
  var appiumColonresetLocationService: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:resetOnSessionStartOnly")
  var appiumColonresetOnSessionStartOnly: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:resultBundlePath")
  var appiumColonresultBundlePath: js.UndefOr[String] = js.undefined
  
  @JSName("appium:resultBundleVersion")
  var appiumColonresultBundleVersion: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:safariAllowPopups")
  var appiumColonsafariAllowPopups: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:safariGarbageCollect")
  var appiumColonsafariGarbageCollect: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:safariGlobalPreferences")
  var appiumColonsafariGlobalPreferences: js.UndefOr[AppiumXCUISafariGlobalPreferences] = js.undefined
  
  @JSName("appium:safariIgnoreFraudWarning")
  var appiumColonsafariIgnoreFraudWarning: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:safariIgnoreWebHostnames")
  var appiumColonsafariIgnoreWebHostnames: js.UndefOr[String] = js.undefined
  
  @JSName("appium:safariInitialUrl")
  var appiumColonsafariInitialUrl: js.UndefOr[String] = js.undefined
  
  @JSName("appium:safariLogAllCommunication")
  var appiumColonsafariLogAllCommunication: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:safariLogAllCommunicationHexDump")
  var appiumColonsafariLogAllCommunicationHexDump: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:safariOpenLinksInBackground")
  var appiumColonsafariOpenLinksInBackground: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:safariShowFullResponse")
  var appiumColonsafariShowFullResponse: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:safariSocketChunkSize")
  var appiumColonsafariSocketChunkSize: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:safariWebInspectorMaxFrameLength")
  var appiumColonsafariWebInspectorMaxFrameLength: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:scaleFactor")
  var appiumColonscaleFactor: js.UndefOr[String] = js.undefined
  
  @JSName("appium:screenshotQuality")
  var appiumColonscreenshotQuality: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:shouldTerminateApp")
  var appiumColonshouldTerminateApp: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:shouldUseSingletonTestManager")
  var appiumColonshouldUseSingletonTestManager: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:showIOSLog")
  var appiumColonshowIOSLog: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:showSafariConsoleLog")
  var appiumColonshowSafariConsoleLog: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:showSafariNetworkLog")
  var appiumColonshowSafariNetworkLog: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:showXcodeLog")
  var appiumColonshowXcodeLog: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:shutdownOtherSimulators")
  var appiumColonshutdownOtherSimulators: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:simpleIsVisibleCheck")
  var appiumColonsimpleIsVisibleCheck: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:simulatorDevicesSetPath")
  var appiumColonsimulatorDevicesSetPath: js.UndefOr[String] = js.undefined
  
  @JSName("appium:simulatorPasteboardAutomaticSync")
  var appiumColonsimulatorPasteboardAutomaticSync: js.UndefOr[String] = js.undefined
  
  @JSName("appium:simulatorStartupTimeout")
  var appiumColonsimulatorStartupTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:simulatorTracePointer")
  var appiumColonsimulatorTracePointer: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:simulatorWindowCenter")
  var appiumColonsimulatorWindowCenter: js.UndefOr[String] = js.undefined
  
  @JSName("appium:skipLogCapture")
  var appiumColonskipLogCapture: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:tapWithShortPressDuration")
  var appiumColontapWithShortPressDuration: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:updatedWDABundleId")
  var appiumColonupdatedWDABundleId: js.UndefOr[String] = js.undefined
  
  @JSName("appium:useJSONSource")
  var appiumColonuseJSONSource: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:useNativeCachingStrategy")
  var appiumColonuseNativeCachingStrategy: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:useNewWDA")
  var appiumColonuseNewWDA: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:usePrebuiltWDA")
  var appiumColonusePrebuiltWDA: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:useSimpleBuildTest")
  var appiumColonuseSimpleBuildTest: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:useXctestrunFile")
  var appiumColonuseXctestrunFile: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:waitForIdleTimeout")
  var appiumColonwaitForIdleTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:waitForQuiescence")
  var appiumColonwaitForQuiescence: js.UndefOr[Boolean] = js.undefined
  
  @JSName("appium:wdaBaseUrl")
  var appiumColonwdaBaseUrl: js.UndefOr[String] = js.undefined
  
  @JSName("appium:wdaConnectionTimeout")
  var appiumColonwdaConnectionTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:wdaEventloopIdleDelay")
  var appiumColonwdaEventloopIdleDelay: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:wdaLaunchTimeout")
  var appiumColonwdaLaunchTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:wdaLocalPort")
  var appiumColonwdaLocalPort: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:wdaStartupRetries")
  var appiumColonwdaStartupRetries: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:wdaStartupRetryInterval")
  var appiumColonwdaStartupRetryInterval: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:webDriverAgentUrl")
  var appiumColonwebDriverAgentUrl: js.UndefOr[String] = js.undefined
  
  @JSName("appium:webkitDebugProxyPort")
  var appiumColonwebkitDebugProxyPort: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:webkitResponseTimeout")
  var appiumColonwebkitResponseTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:webviewConnectRetries")
  var appiumColonwebviewConnectRetries: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:webviewConnectTimeout")
  var appiumColonwebviewConnectTimeout: js.UndefOr[Double] = js.undefined
  
  @JSName("appium:xcodeConfigFile")
  var appiumColonxcodeConfigFile: js.UndefOr[String] = js.undefined
  
  @JSName("appium:xcodeOrgId")
  var appiumColonxcodeOrgId: js.UndefOr[String] = js.undefined
  
  @JSName("appium:xcodeSigningId")
  var appiumColonxcodeSigningId: js.UndefOr[String] = js.undefined
  
  var appiumLogs: js.UndefOr[Boolean] = js.undefined
  
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.undefined
  
  var autoWait: js.UndefOr[Double] = js.undefined
  
  var bfcache: js.UndefOr[`0` | `1`] = js.undefined
  
  var browser: js.UndefOr[String] = js.undefined
  
  var browserConnectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  var browserSideLog: js.UndefOr[Boolean] = js.undefined
  
  var browser_version: js.UndefOr[String] = js.undefined
  
  @JSName("browserstack.maskCommands")
  var browserstackDotmaskCommands: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("browserstack.sendKeys")
  var browserstackDotsendKeys: js.UndefOr[Boolean] = js.undefined
  
  var buildName: js.UndefOr[String] = js.undefined
  
  var chrome: js.UndefOr[Driver] = js.undefined
  
  var commandLineFlags: js.UndefOr[String] = js.undefined
  
  var consoleLogs: js.UndefOr[disable | errors | warnings | info_ | verbose] = js.undefined
  
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var customNetwork: js.UndefOr[String] = js.undefined
  
  var databaseEnabled: js.UndefOr[Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var desired: js.UndefOr[DesiredCapabilities] = js.undefined
  
  var device: js.UndefOr[String] = js.undefined
  
  var deviceOrientation: js.UndefOr[portrait | landscape] = js.undefined
  
  var dontInjectRegex: js.UndefOr[js.RegExp] = js.undefined
  
  var edge: js.UndefOr[EnablePopups] = js.undefined
  
  var elementScrollBehavior: js.UndefOr[Double] = js.undefined
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var excludeDriverLogs: js.UndefOr[js.Array[String]] = js.undefined
  
  var executablePath: js.UndefOr[String] = js.undefined
  
  var firefox: js.UndefOr[Driver] = js.undefined
  
  var geoLocation: js.UndefOr[String] = js.undefined
  
  var handlesAlerts: js.UndefOr[Boolean] = js.undefined
  
  var hosts: js.UndefOr[String] = js.undefined
  
  var ie: js.UndefOr[Arch] = js.undefined
  
  var javascriptEnabled: js.UndefOr[Boolean] = js.undefined
  
  var local: js.UndefOr[Boolean] = js.undefined
  
  var localIdentifier: js.UndefOr[String] = js.undefined
  
  var locationContextEnabled: js.UndefOr[Boolean] = js.undefined
  
  var loggingPrefs: js.UndefOr[Browser] = js.undefined
  
  var maskBasicAuth: js.UndefOr[Boolean] = js.undefined
  
  var nativeEvents: js.UndefOr[Boolean] = js.undefined
  
  var networkLogs: js.UndefOr[Boolean] = js.undefined
  
  var networkProfile: js.UndefOr[String] = js.undefined
  
  var onlyProxySeleniumTraffic: js.UndefOr[Boolean] = js.undefined
  
  var optionsSet: js.UndefOr[Boolean] = js.undefined
  
  var os: js.UndefOr[String] = js.undefined
  
  var osVersion: js.UndefOr[String] = js.undefined
  
  var os_version: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var proxyEverything: js.UndefOr[Boolean] = js.undefined
  
  var proxyRequired: js.UndefOr[Boolean] = js.undefined
  
  @JSName("public")
  var public_DesiredCapabilities: js.UndefOr[Any] = js.undefined
  
  var realMobile: js.UndefOr[Boolean] = js.undefined
  
  var resolution: js.UndefOr[String] = js.undefined
  
  var rotatable: js.UndefOr[Boolean] = js.undefined
  
  var safari: js.UndefOr[AllowAllCookies] = js.undefined
  
  @JSName("selenium.server.url")
  var seleniumDotserverDoturl: js.UndefOr[String] = js.undefined
  
  var seleniumLogs: js.UndefOr[Boolean] = js.undefined
  
  var sessionName: js.UndefOr[String] = js.undefined
  
  var singleWindow: js.UndefOr[Boolean] = js.undefined
  
  var specs: js.UndefOr[js.Array[String]] = js.undefined
  
  var timeoutInSeconds: js.UndefOr[Double] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var `tunnel-identifier`: js.UndefOr[String] = js.undefined
  
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.undefined
  
  var userExtensions: js.UndefOr[String] = js.undefined
  
  var userJSInjection: js.UndefOr[Boolean] = js.undefined
  
  var userName: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var video: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @private
    */
  var wdioService: js.UndefOr[String] = js.undefined
  
  var webStorageEnabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("webdriver.remote.quietExceptions")
  var webdriverDotremoteDotquietExceptions: js.UndefOr[Boolean] = js.undefined
  
  @JSName("webdriver.remote.sessionid")
  var webdriverDotremoteDotsessionid: js.UndefOr[String] = js.undefined
  
  var wsLocalSupport: js.UndefOr[Boolean] = js.undefined
}
object DesiredCapabilities {
  
  inline def apply(): DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredCapabilities]
  }
  
  extension [Self <: DesiredCapabilities](x: Self) {
    
    inline def setAcceptSslCerts(value: Boolean): Self = StObject.set(x, "acceptSslCerts", value.asInstanceOf[js.Any])
    
    inline def setAcceptSslCertsUndefined: Self = StObject.set(x, "acceptSslCerts", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAppiumColonabsoluteWebLocations(value: Boolean): Self = StObject.set(x, "appium:absoluteWebLocations", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonabsoluteWebLocationsUndefined: Self = StObject.set(x, "appium:absoluteWebLocations", js.undefined)
    
    inline def setAppiumColonadditionalWebviewBundleIds(value: js.Array[String]): Self = StObject.set(x, "appium:additionalWebviewBundleIds", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonadditionalWebviewBundleIdsUndefined: Self = StObject.set(x, "appium:additionalWebviewBundleIds", js.undefined)
    
    inline def setAppiumColonadditionalWebviewBundleIdsVarargs(value: String*): Self = StObject.set(x, "appium:additionalWebviewBundleIds", js.Array(value*))
    
    inline def setAppiumColonagentPath(value: String): Self = StObject.set(x, "appium:agentPath", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonagentPathUndefined: Self = StObject.set(x, "appium:agentPath", js.undefined)
    
    inline def setAppiumColonallowProvisioningDeviceRegistration(value: Boolean): Self = StObject.set(x, "appium:allowProvisioningDeviceRegistration", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonallowProvisioningDeviceRegistrationUndefined: Self = StObject.set(x, "appium:allowProvisioningDeviceRegistration", js.undefined)
    
    inline def setAppiumColonappArguments(value: String): Self = StObject.set(x, "appium:appArguments", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonappArgumentsUndefined: Self = StObject.set(x, "appium:appArguments", js.undefined)
    
    inline def setAppiumColonappInstallStrategy(value: String): Self = StObject.set(x, "appium:appInstallStrategy", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonappInstallStrategyUndefined: Self = StObject.set(x, "appium:appInstallStrategy", js.undefined)
    
    inline def setAppiumColonappPushTimeout(value: Double): Self = StObject.set(x, "appium:appPushTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonappPushTimeoutUndefined: Self = StObject.set(x, "appium:appPushTimeout", js.undefined)
    
    inline def setAppiumColonautoAcceptAlerts(value: Boolean): Self = StObject.set(x, "appium:autoAcceptAlerts", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonautoAcceptAlertsUndefined: Self = StObject.set(x, "appium:autoAcceptAlerts", js.undefined)
    
    inline def setAppiumColonautoDismissAlerts(value: Boolean): Self = StObject.set(x, "appium:autoDismissAlerts", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonautoDismissAlertsUndefined: Self = StObject.set(x, "appium:autoDismissAlerts", js.undefined)
    
    inline def setAppiumColonbootstrapPath(value: String): Self = StObject.set(x, "appium:bootstrapPath", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonbootstrapPathUndefined: Self = StObject.set(x, "appium:bootstrapPath", js.undefined)
    
    inline def setAppiumColonbrowserName(value: String): Self = StObject.set(x, "appium:browserName", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonbrowserNameUndefined: Self = StObject.set(x, "appium:browserName", js.undefined)
    
    inline def setAppiumColonbundleId(value: String): Self = StObject.set(x, "appium:bundleId", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonbundleIdUndefined: Self = StObject.set(x, "appium:bundleId", js.undefined)
    
    inline def setAppiumColoncalendarAccessAuthorized(value: Boolean): Self = StObject.set(x, "appium:calendarAccessAuthorized", value.asInstanceOf[js.Any])
    
    inline def setAppiumColoncalendarAccessAuthorizedUndefined: Self = StObject.set(x, "appium:calendarAccessAuthorized", js.undefined)
    
    inline def setAppiumColoncalendarFormat(value: String): Self = StObject.set(x, "appium:calendarFormat", value.asInstanceOf[js.Any])
    
    inline def setAppiumColoncalendarFormatUndefined: Self = StObject.set(x, "appium:calendarFormat", js.undefined)
    
    inline def setAppiumColonclearSystemFiles(value: Boolean): Self = StObject.set(x, "appium:clearSystemFiles", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonclearSystemFilesUndefined: Self = StObject.set(x, "appium:clearSystemFiles", js.undefined)
    
    inline def setAppiumColoncommandTimeouts(value: String | AppiumXCUICommandTimeouts): Self = StObject.set(x, "appium:commandTimeouts", value.asInstanceOf[js.Any])
    
    inline def setAppiumColoncommandTimeoutsUndefined: Self = StObject.set(x, "appium:commandTimeouts", js.undefined)
    
    inline def setAppiumColonconnectHardwareKeyboard(value: Boolean): Self = StObject.set(x, "appium:connectHardwareKeyboard", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonconnectHardwareKeyboardUndefined: Self = StObject.set(x, "appium:connectHardwareKeyboard", js.undefined)
    
    inline def setAppiumColoncustomSSLCert(value: String): Self = StObject.set(x, "appium:customSSLCert", value.asInstanceOf[js.Any])
    
    inline def setAppiumColoncustomSSLCertUndefined: Self = StObject.set(x, "appium:customSSLCert", js.undefined)
    
    inline def setAppiumColonderivedDataPath(value: String): Self = StObject.set(x, "appium:derivedDataPath", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonderivedDataPathUndefined: Self = StObject.set(x, "appium:derivedDataPath", js.undefined)
    
    inline def setAppiumColondisableAutomaticScreenshots(value: Boolean): Self = StObject.set(x, "appium:disableAutomaticScreenshots", value.asInstanceOf[js.Any])
    
    inline def setAppiumColondisableAutomaticScreenshotsUndefined: Self = StObject.set(x, "appium:disableAutomaticScreenshots", js.undefined)
    
    inline def setAppiumColonenableAsyncExecuteFromHttps(value: Boolean): Self = StObject.set(x, "appium:enableAsyncExecuteFromHttps", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonenableAsyncExecuteFromHttpsUndefined: Self = StObject.set(x, "appium:enableAsyncExecuteFromHttps", js.undefined)
    
    inline def setAppiumColonenforceFreshSimulatorCreation(value: Boolean): Self = StObject.set(x, "appium:enforceFreshSimulatorCreation", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonenforceFreshSimulatorCreationUndefined: Self = StObject.set(x, "appium:enforceFreshSimulatorCreation", js.undefined)
    
    inline def setAppiumColonforceAppLaunch(value: Boolean): Self = StObject.set(x, "appium:forceAppLaunch", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonforceAppLaunchUndefined: Self = StObject.set(x, "appium:forceAppLaunch", js.undefined)
    
    inline def setAppiumColonforceTurnOnSoftwareKeyboardSimulator(value: Boolean): Self = StObject.set(x, "appium:forceTurnOnSoftwareKeyboardSimulator", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonforceTurnOnSoftwareKeyboardSimulatorUndefined: Self = StObject.set(x, "appium:forceTurnOnSoftwareKeyboardSimulator", js.undefined)
    
    inline def setAppiumColonfullContextList(value: Boolean): Self = StObject.set(x, "appium:fullContextList", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonfullContextListUndefined: Self = StObject.set(x, "appium:fullContextList", js.undefined)
    
    inline def setAppiumColonignoreAboutBlankUrl(value: Boolean): Self = StObject.set(x, "appium:ignoreAboutBlankUrl", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonignoreAboutBlankUrlUndefined: Self = StObject.set(x, "appium:ignoreAboutBlankUrl", js.undefined)
    
    inline def setAppiumColonincludeDeviceCapsToSessionInfo(value: Boolean): Self = StObject.set(x, "appium:includeDeviceCapsToSessionInfo", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonincludeDeviceCapsToSessionInfoUndefined: Self = StObject.set(x, "appium:includeDeviceCapsToSessionInfo", js.undefined)
    
    inline def setAppiumColonincludeSafariInWebviews(value: Boolean): Self = StObject.set(x, "appium:includeSafariInWebviews", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonincludeSafariInWebviewsUndefined: Self = StObject.set(x, "appium:includeSafariInWebviews", js.undefined)
    
    inline def setAppiumColoniosInstallPause(value: Double): Self = StObject.set(x, "appium:iosInstallPause", value.asInstanceOf[js.Any])
    
    inline def setAppiumColoniosInstallPauseUndefined: Self = StObject.set(x, "appium:iosInstallPause", js.undefined)
    
    inline def setAppiumColoniosSimulatorLogsPredicate(value: String): Self = StObject.set(x, "appium:iosSimulatorLogsPredicate", value.asInstanceOf[js.Any])
    
    inline def setAppiumColoniosSimulatorLogsPredicateUndefined: Self = StObject.set(x, "appium:iosSimulatorLogsPredicate", js.undefined)
    
    inline def setAppiumColonisHeadless(value: Boolean): Self = StObject.set(x, "appium:isHeadless", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonisHeadlessUndefined: Self = StObject.set(x, "appium:isHeadless", js.undefined)
    
    inline def setAppiumColonkeepKeyChains(value: Boolean): Self = StObject.set(x, "appium:keepKeyChains", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonkeepKeyChainsUndefined: Self = StObject.set(x, "appium:keepKeyChains", js.undefined)
    
    inline def setAppiumColonkeychainPassword(value: String): Self = StObject.set(x, "appium:keychainPassword", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonkeychainPasswordUndefined: Self = StObject.set(x, "appium:keychainPassword", js.undefined)
    
    inline def setAppiumColonkeychainPath(value: String): Self = StObject.set(x, "appium:keychainPath", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonkeychainPathUndefined: Self = StObject.set(x, "appium:keychainPath", js.undefined)
    
    inline def setAppiumColonkeychainsExcludePatterns(value: String): Self = StObject.set(x, "appium:keychainsExcludePatterns", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonkeychainsExcludePatternsUndefined: Self = StObject.set(x, "appium:keychainsExcludePatterns", js.undefined)
    
    inline def setAppiumColonlaunchWithIDB(value: Boolean): Self = StObject.set(x, "appium:launchWithIDB", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonlaunchWithIDBUndefined: Self = StObject.set(x, "appium:launchWithIDB", js.undefined)
    
    inline def setAppiumColonlocalizableStringsDir(value: String): Self = StObject.set(x, "appium:localizableStringsDir", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonlocalizableStringsDirUndefined: Self = StObject.set(x, "appium:localizableStringsDir", js.undefined)
    
    inline def setAppiumColonlocationServicesAuthorized(value: Boolean): Self = StObject.set(x, "appium:locationServicesAuthorized", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonlocationServicesAuthorizedUndefined: Self = StObject.set(x, "appium:locationServicesAuthorized", js.undefined)
    
    inline def setAppiumColonlocationServicesEnabled(value: Boolean): Self = StObject.set(x, "appium:locationServicesEnabled", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonlocationServicesEnabledUndefined: Self = StObject.set(x, "appium:locationServicesEnabled", js.undefined)
    
    inline def setAppiumColonmaxTypingFrequency(value: Double): Self = StObject.set(x, "appium:maxTypingFrequency", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonmaxTypingFrequencyUndefined: Self = StObject.set(x, "appium:maxTypingFrequency", js.undefined)
    
    inline def setAppiumColonmjpegScreenshotUrl(value: String): Self = StObject.set(x, "appium:mjpegScreenshotUrl", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonmjpegScreenshotUrlUndefined: Self = StObject.set(x, "appium:mjpegScreenshotUrl", js.undefined)
    
    inline def setAppiumColonmjpegServerPort(value: Double): Self = StObject.set(x, "appium:mjpegServerPort", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonmjpegServerPortUndefined: Self = StObject.set(x, "appium:mjpegServerPort", js.undefined)
    
    inline def setAppiumColonnativeTyping(value: Boolean): Self = StObject.set(x, "appium:nativeTyping", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonnativeTypingUndefined: Self = StObject.set(x, "appium:nativeTyping", js.undefined)
    
    inline def setAppiumColonnativeWebTapStrict(value: Boolean): Self = StObject.set(x, "appium:nativeWebTapStrict", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonnativeWebTapStrictUndefined: Self = StObject.set(x, "appium:nativeWebTapStrict", js.undefined)
    
    inline def setAppiumColonotherApps(value: String): Self = StObject.set(x, "appium:otherApps", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonotherAppsUndefined: Self = StObject.set(x, "appium:otherApps", js.undefined)
    
    inline def setAppiumColonpermissions(value: String): Self = StObject.set(x, "appium:permissions", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonpermissionsUndefined: Self = StObject.set(x, "appium:permissions", js.undefined)
    
    inline def setAppiumColonprebuildWDA(value: Boolean): Self = StObject.set(x, "appium:prebuildWDA", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonprebuildWDAUndefined: Self = StObject.set(x, "appium:prebuildWDA", js.undefined)
    
    inline def setAppiumColonprocessArguments(value: String | AppiumXCUIProcessArguments): Self = StObject.set(x, "appium:processArguments", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonprocessArgumentsUndefined: Self = StObject.set(x, "appium:processArguments", js.undefined)
    
    inline def setAppiumColonreduceMotion(value: Boolean): Self = StObject.set(x, "appium:reduceMotion", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonreduceMotionUndefined: Self = StObject.set(x, "appium:reduceMotion", js.undefined)
    
    inline def setAppiumColonremoteDebugProxy(value: String): Self = StObject.set(x, "appium:remoteDebugProxy", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonremoteDebugProxyUndefined: Self = StObject.set(x, "appium:remoteDebugProxy", js.undefined)
    
    inline def setAppiumColonresetLocationService(value: Boolean): Self = StObject.set(x, "appium:resetLocationService", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonresetLocationServiceUndefined: Self = StObject.set(x, "appium:resetLocationService", js.undefined)
    
    inline def setAppiumColonresetOnSessionStartOnly(value: Boolean): Self = StObject.set(x, "appium:resetOnSessionStartOnly", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonresetOnSessionStartOnlyUndefined: Self = StObject.set(x, "appium:resetOnSessionStartOnly", js.undefined)
    
    inline def setAppiumColonresultBundlePath(value: String): Self = StObject.set(x, "appium:resultBundlePath", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonresultBundlePathUndefined: Self = StObject.set(x, "appium:resultBundlePath", js.undefined)
    
    inline def setAppiumColonresultBundleVersion(value: Double): Self = StObject.set(x, "appium:resultBundleVersion", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonresultBundleVersionUndefined: Self = StObject.set(x, "appium:resultBundleVersion", js.undefined)
    
    inline def setAppiumColonsafariAllowPopups(value: Boolean): Self = StObject.set(x, "appium:safariAllowPopups", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariAllowPopupsUndefined: Self = StObject.set(x, "appium:safariAllowPopups", js.undefined)
    
    inline def setAppiumColonsafariGarbageCollect(value: Boolean): Self = StObject.set(x, "appium:safariGarbageCollect", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariGarbageCollectUndefined: Self = StObject.set(x, "appium:safariGarbageCollect", js.undefined)
    
    inline def setAppiumColonsafariGlobalPreferences(value: AppiumXCUISafariGlobalPreferences): Self = StObject.set(x, "appium:safariGlobalPreferences", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariGlobalPreferencesUndefined: Self = StObject.set(x, "appium:safariGlobalPreferences", js.undefined)
    
    inline def setAppiumColonsafariIgnoreFraudWarning(value: Boolean): Self = StObject.set(x, "appium:safariIgnoreFraudWarning", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariIgnoreFraudWarningUndefined: Self = StObject.set(x, "appium:safariIgnoreFraudWarning", js.undefined)
    
    inline def setAppiumColonsafariIgnoreWebHostnames(value: String): Self = StObject.set(x, "appium:safariIgnoreWebHostnames", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariIgnoreWebHostnamesUndefined: Self = StObject.set(x, "appium:safariIgnoreWebHostnames", js.undefined)
    
    inline def setAppiumColonsafariInitialUrl(value: String): Self = StObject.set(x, "appium:safariInitialUrl", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariInitialUrlUndefined: Self = StObject.set(x, "appium:safariInitialUrl", js.undefined)
    
    inline def setAppiumColonsafariLogAllCommunication(value: Boolean): Self = StObject.set(x, "appium:safariLogAllCommunication", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariLogAllCommunicationHexDump(value: Boolean): Self = StObject.set(x, "appium:safariLogAllCommunicationHexDump", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariLogAllCommunicationHexDumpUndefined: Self = StObject.set(x, "appium:safariLogAllCommunicationHexDump", js.undefined)
    
    inline def setAppiumColonsafariLogAllCommunicationUndefined: Self = StObject.set(x, "appium:safariLogAllCommunication", js.undefined)
    
    inline def setAppiumColonsafariOpenLinksInBackground(value: Boolean): Self = StObject.set(x, "appium:safariOpenLinksInBackground", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariOpenLinksInBackgroundUndefined: Self = StObject.set(x, "appium:safariOpenLinksInBackground", js.undefined)
    
    inline def setAppiumColonsafariShowFullResponse(value: Boolean): Self = StObject.set(x, "appium:safariShowFullResponse", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariShowFullResponseUndefined: Self = StObject.set(x, "appium:safariShowFullResponse", js.undefined)
    
    inline def setAppiumColonsafariSocketChunkSize(value: Double): Self = StObject.set(x, "appium:safariSocketChunkSize", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariSocketChunkSizeUndefined: Self = StObject.set(x, "appium:safariSocketChunkSize", js.undefined)
    
    inline def setAppiumColonsafariWebInspectorMaxFrameLength(value: Double): Self = StObject.set(x, "appium:safariWebInspectorMaxFrameLength", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsafariWebInspectorMaxFrameLengthUndefined: Self = StObject.set(x, "appium:safariWebInspectorMaxFrameLength", js.undefined)
    
    inline def setAppiumColonscaleFactor(value: String): Self = StObject.set(x, "appium:scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonscaleFactorUndefined: Self = StObject.set(x, "appium:scaleFactor", js.undefined)
    
    inline def setAppiumColonscreenshotQuality(value: Double): Self = StObject.set(x, "appium:screenshotQuality", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonscreenshotQualityUndefined: Self = StObject.set(x, "appium:screenshotQuality", js.undefined)
    
    inline def setAppiumColonshouldTerminateApp(value: Boolean): Self = StObject.set(x, "appium:shouldTerminateApp", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonshouldTerminateAppUndefined: Self = StObject.set(x, "appium:shouldTerminateApp", js.undefined)
    
    inline def setAppiumColonshouldUseSingletonTestManager(value: Boolean): Self = StObject.set(x, "appium:shouldUseSingletonTestManager", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonshouldUseSingletonTestManagerUndefined: Self = StObject.set(x, "appium:shouldUseSingletonTestManager", js.undefined)
    
    inline def setAppiumColonshowIOSLog(value: Boolean): Self = StObject.set(x, "appium:showIOSLog", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonshowIOSLogUndefined: Self = StObject.set(x, "appium:showIOSLog", js.undefined)
    
    inline def setAppiumColonshowSafariConsoleLog(value: Boolean): Self = StObject.set(x, "appium:showSafariConsoleLog", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonshowSafariConsoleLogUndefined: Self = StObject.set(x, "appium:showSafariConsoleLog", js.undefined)
    
    inline def setAppiumColonshowSafariNetworkLog(value: Boolean): Self = StObject.set(x, "appium:showSafariNetworkLog", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonshowSafariNetworkLogUndefined: Self = StObject.set(x, "appium:showSafariNetworkLog", js.undefined)
    
    inline def setAppiumColonshowXcodeLog(value: Boolean): Self = StObject.set(x, "appium:showXcodeLog", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonshowXcodeLogUndefined: Self = StObject.set(x, "appium:showXcodeLog", js.undefined)
    
    inline def setAppiumColonshutdownOtherSimulators(value: Boolean): Self = StObject.set(x, "appium:shutdownOtherSimulators", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonshutdownOtherSimulatorsUndefined: Self = StObject.set(x, "appium:shutdownOtherSimulators", js.undefined)
    
    inline def setAppiumColonsimpleIsVisibleCheck(value: Boolean): Self = StObject.set(x, "appium:simpleIsVisibleCheck", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsimpleIsVisibleCheckUndefined: Self = StObject.set(x, "appium:simpleIsVisibleCheck", js.undefined)
    
    inline def setAppiumColonsimulatorDevicesSetPath(value: String): Self = StObject.set(x, "appium:simulatorDevicesSetPath", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsimulatorDevicesSetPathUndefined: Self = StObject.set(x, "appium:simulatorDevicesSetPath", js.undefined)
    
    inline def setAppiumColonsimulatorPasteboardAutomaticSync(value: String): Self = StObject.set(x, "appium:simulatorPasteboardAutomaticSync", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsimulatorPasteboardAutomaticSyncUndefined: Self = StObject.set(x, "appium:simulatorPasteboardAutomaticSync", js.undefined)
    
    inline def setAppiumColonsimulatorStartupTimeout(value: Double): Self = StObject.set(x, "appium:simulatorStartupTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsimulatorStartupTimeoutUndefined: Self = StObject.set(x, "appium:simulatorStartupTimeout", js.undefined)
    
    inline def setAppiumColonsimulatorTracePointer(value: Boolean): Self = StObject.set(x, "appium:simulatorTracePointer", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsimulatorTracePointerUndefined: Self = StObject.set(x, "appium:simulatorTracePointer", js.undefined)
    
    inline def setAppiumColonsimulatorWindowCenter(value: String): Self = StObject.set(x, "appium:simulatorWindowCenter", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonsimulatorWindowCenterUndefined: Self = StObject.set(x, "appium:simulatorWindowCenter", js.undefined)
    
    inline def setAppiumColonskipLogCapture(value: Boolean): Self = StObject.set(x, "appium:skipLogCapture", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonskipLogCaptureUndefined: Self = StObject.set(x, "appium:skipLogCapture", js.undefined)
    
    inline def setAppiumColontapWithShortPressDuration(value: Double): Self = StObject.set(x, "appium:tapWithShortPressDuration", value.asInstanceOf[js.Any])
    
    inline def setAppiumColontapWithShortPressDurationUndefined: Self = StObject.set(x, "appium:tapWithShortPressDuration", js.undefined)
    
    inline def setAppiumColonupdatedWDABundleId(value: String): Self = StObject.set(x, "appium:updatedWDABundleId", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonupdatedWDABundleIdUndefined: Self = StObject.set(x, "appium:updatedWDABundleId", js.undefined)
    
    inline def setAppiumColonuseJSONSource(value: Boolean): Self = StObject.set(x, "appium:useJSONSource", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonuseJSONSourceUndefined: Self = StObject.set(x, "appium:useJSONSource", js.undefined)
    
    inline def setAppiumColonuseNativeCachingStrategy(value: Boolean): Self = StObject.set(x, "appium:useNativeCachingStrategy", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonuseNativeCachingStrategyUndefined: Self = StObject.set(x, "appium:useNativeCachingStrategy", js.undefined)
    
    inline def setAppiumColonuseNewWDA(value: Boolean): Self = StObject.set(x, "appium:useNewWDA", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonuseNewWDAUndefined: Self = StObject.set(x, "appium:useNewWDA", js.undefined)
    
    inline def setAppiumColonusePrebuiltWDA(value: Boolean): Self = StObject.set(x, "appium:usePrebuiltWDA", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonusePrebuiltWDAUndefined: Self = StObject.set(x, "appium:usePrebuiltWDA", js.undefined)
    
    inline def setAppiumColonuseSimpleBuildTest(value: Boolean): Self = StObject.set(x, "appium:useSimpleBuildTest", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonuseSimpleBuildTestUndefined: Self = StObject.set(x, "appium:useSimpleBuildTest", js.undefined)
    
    inline def setAppiumColonuseXctestrunFile(value: Boolean): Self = StObject.set(x, "appium:useXctestrunFile", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonuseXctestrunFileUndefined: Self = StObject.set(x, "appium:useXctestrunFile", js.undefined)
    
    inline def setAppiumColonwaitForIdleTimeout(value: Double): Self = StObject.set(x, "appium:waitForIdleTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwaitForIdleTimeoutUndefined: Self = StObject.set(x, "appium:waitForIdleTimeout", js.undefined)
    
    inline def setAppiumColonwaitForQuiescence(value: Boolean): Self = StObject.set(x, "appium:waitForQuiescence", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwaitForQuiescenceUndefined: Self = StObject.set(x, "appium:waitForQuiescence", js.undefined)
    
    inline def setAppiumColonwdaBaseUrl(value: String): Self = StObject.set(x, "appium:wdaBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwdaBaseUrlUndefined: Self = StObject.set(x, "appium:wdaBaseUrl", js.undefined)
    
    inline def setAppiumColonwdaConnectionTimeout(value: Double): Self = StObject.set(x, "appium:wdaConnectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwdaConnectionTimeoutUndefined: Self = StObject.set(x, "appium:wdaConnectionTimeout", js.undefined)
    
    inline def setAppiumColonwdaEventloopIdleDelay(value: Double): Self = StObject.set(x, "appium:wdaEventloopIdleDelay", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwdaEventloopIdleDelayUndefined: Self = StObject.set(x, "appium:wdaEventloopIdleDelay", js.undefined)
    
    inline def setAppiumColonwdaLaunchTimeout(value: Double): Self = StObject.set(x, "appium:wdaLaunchTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwdaLaunchTimeoutUndefined: Self = StObject.set(x, "appium:wdaLaunchTimeout", js.undefined)
    
    inline def setAppiumColonwdaLocalPort(value: Double): Self = StObject.set(x, "appium:wdaLocalPort", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwdaLocalPortUndefined: Self = StObject.set(x, "appium:wdaLocalPort", js.undefined)
    
    inline def setAppiumColonwdaStartupRetries(value: Double): Self = StObject.set(x, "appium:wdaStartupRetries", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwdaStartupRetriesUndefined: Self = StObject.set(x, "appium:wdaStartupRetries", js.undefined)
    
    inline def setAppiumColonwdaStartupRetryInterval(value: Double): Self = StObject.set(x, "appium:wdaStartupRetryInterval", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwdaStartupRetryIntervalUndefined: Self = StObject.set(x, "appium:wdaStartupRetryInterval", js.undefined)
    
    inline def setAppiumColonwebDriverAgentUrl(value: String): Self = StObject.set(x, "appium:webDriverAgentUrl", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwebDriverAgentUrlUndefined: Self = StObject.set(x, "appium:webDriverAgentUrl", js.undefined)
    
    inline def setAppiumColonwebkitDebugProxyPort(value: Double): Self = StObject.set(x, "appium:webkitDebugProxyPort", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwebkitDebugProxyPortUndefined: Self = StObject.set(x, "appium:webkitDebugProxyPort", js.undefined)
    
    inline def setAppiumColonwebkitResponseTimeout(value: Double): Self = StObject.set(x, "appium:webkitResponseTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwebkitResponseTimeoutUndefined: Self = StObject.set(x, "appium:webkitResponseTimeout", js.undefined)
    
    inline def setAppiumColonwebviewConnectRetries(value: Double): Self = StObject.set(x, "appium:webviewConnectRetries", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwebviewConnectRetriesUndefined: Self = StObject.set(x, "appium:webviewConnectRetries", js.undefined)
    
    inline def setAppiumColonwebviewConnectTimeout(value: Double): Self = StObject.set(x, "appium:webviewConnectTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonwebviewConnectTimeoutUndefined: Self = StObject.set(x, "appium:webviewConnectTimeout", js.undefined)
    
    inline def setAppiumColonxcodeConfigFile(value: String): Self = StObject.set(x, "appium:xcodeConfigFile", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonxcodeConfigFileUndefined: Self = StObject.set(x, "appium:xcodeConfigFile", js.undefined)
    
    inline def setAppiumColonxcodeOrgId(value: String): Self = StObject.set(x, "appium:xcodeOrgId", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonxcodeOrgIdUndefined: Self = StObject.set(x, "appium:xcodeOrgId", js.undefined)
    
    inline def setAppiumColonxcodeSigningId(value: String): Self = StObject.set(x, "appium:xcodeSigningId", value.asInstanceOf[js.Any])
    
    inline def setAppiumColonxcodeSigningIdUndefined: Self = StObject.set(x, "appium:xcodeSigningId", js.undefined)
    
    inline def setAppiumLogs(value: Boolean): Self = StObject.set(x, "appiumLogs", value.asInstanceOf[js.Any])
    
    inline def setAppiumLogsUndefined: Self = StObject.set(x, "appiumLogs", js.undefined)
    
    inline def setApplicationCacheEnabled(value: Boolean): Self = StObject.set(x, "applicationCacheEnabled", value.asInstanceOf[js.Any])
    
    inline def setApplicationCacheEnabledUndefined: Self = StObject.set(x, "applicationCacheEnabled", js.undefined)
    
    inline def setAutoWait(value: Double): Self = StObject.set(x, "autoWait", value.asInstanceOf[js.Any])
    
    inline def setAutoWaitUndefined: Self = StObject.set(x, "autoWait", js.undefined)
    
    inline def setBfcache(value: `0` | `1`): Self = StObject.set(x, "bfcache", value.asInstanceOf[js.Any])
    
    inline def setBfcacheUndefined: Self = StObject.set(x, "bfcache", js.undefined)
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserConnectionEnabled(value: Boolean): Self = StObject.set(x, "browserConnectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setBrowserConnectionEnabledUndefined: Self = StObject.set(x, "browserConnectionEnabled", js.undefined)
    
    inline def setBrowserSideLog(value: Boolean): Self = StObject.set(x, "browserSideLog", value.asInstanceOf[js.Any])
    
    inline def setBrowserSideLogUndefined: Self = StObject.set(x, "browserSideLog", js.undefined)
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setBrowser_version(value: String): Self = StObject.set(x, "browser_version", value.asInstanceOf[js.Any])
    
    inline def setBrowser_versionUndefined: Self = StObject.set(x, "browser_version", js.undefined)
    
    inline def setBrowserstackDotmaskCommands(value: js.Array[String]): Self = StObject.set(x, "browserstack.maskCommands", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotmaskCommandsUndefined: Self = StObject.set(x, "browserstack.maskCommands", js.undefined)
    
    inline def setBrowserstackDotmaskCommandsVarargs(value: String*): Self = StObject.set(x, "browserstack.maskCommands", js.Array(value*))
    
    inline def setBrowserstackDotsendKeys(value: Boolean): Self = StObject.set(x, "browserstack.sendKeys", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotsendKeysUndefined: Self = StObject.set(x, "browserstack.sendKeys", js.undefined)
    
    inline def setBuildName(value: String): Self = StObject.set(x, "buildName", value.asInstanceOf[js.Any])
    
    inline def setBuildNameUndefined: Self = StObject.set(x, "buildName", js.undefined)
    
    inline def setChrome(value: Driver): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
    
    inline def setCommandLineFlags(value: String): Self = StObject.set(x, "commandLineFlags", value.asInstanceOf[js.Any])
    
    inline def setCommandLineFlagsUndefined: Self = StObject.set(x, "commandLineFlags", js.undefined)
    
    inline def setConsoleLogs(value: disable | errors | warnings | info_ | verbose): Self = StObject.set(x, "consoleLogs", value.asInstanceOf[js.Any])
    
    inline def setConsoleLogsUndefined: Self = StObject.set(x, "consoleLogs", js.undefined)
    
    inline def setCssSelectorsEnabled(value: Boolean): Self = StObject.set(x, "cssSelectorsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCssSelectorsEnabledUndefined: Self = StObject.set(x, "cssSelectorsEnabled", js.undefined)
    
    inline def setCustomNetwork(value: String): Self = StObject.set(x, "customNetwork", value.asInstanceOf[js.Any])
    
    inline def setCustomNetworkUndefined: Self = StObject.set(x, "customNetwork", js.undefined)
    
    inline def setDatabaseEnabled(value: Boolean): Self = StObject.set(x, "databaseEnabled", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEnabledUndefined: Self = StObject.set(x, "databaseEnabled", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDesired(value: DesiredCapabilities): Self = StObject.set(x, "desired", value.asInstanceOf[js.Any])
    
    inline def setDesiredUndefined: Self = StObject.set(x, "desired", js.undefined)
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceOrientation(value: portrait | landscape): Self = StObject.set(x, "deviceOrientation", value.asInstanceOf[js.Any])
    
    inline def setDeviceOrientationUndefined: Self = StObject.set(x, "deviceOrientation", js.undefined)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDontInjectRegex(value: js.RegExp): Self = StObject.set(x, "dontInjectRegex", value.asInstanceOf[js.Any])
    
    inline def setDontInjectRegexUndefined: Self = StObject.set(x, "dontInjectRegex", js.undefined)
    
    inline def setEdge(value: EnablePopups): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setElementScrollBehavior(value: Double): Self = StObject.set(x, "elementScrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setElementScrollBehaviorUndefined: Self = StObject.set(x, "elementScrollBehavior", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeDriverLogs(value: js.Array[String]): Self = StObject.set(x, "excludeDriverLogs", value.asInstanceOf[js.Any])
    
    inline def setExcludeDriverLogsUndefined: Self = StObject.set(x, "excludeDriverLogs", js.undefined)
    
    inline def setExcludeDriverLogsVarargs(value: String*): Self = StObject.set(x, "excludeDriverLogs", js.Array(value*))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    inline def setFirefox(value: Driver): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
    
    inline def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
    
    inline def setGeoLocation(value: String): Self = StObject.set(x, "geoLocation", value.asInstanceOf[js.Any])
    
    inline def setGeoLocationUndefined: Self = StObject.set(x, "geoLocation", js.undefined)
    
    inline def setHandlesAlerts(value: Boolean): Self = StObject.set(x, "handlesAlerts", value.asInstanceOf[js.Any])
    
    inline def setHandlesAlertsUndefined: Self = StObject.set(x, "handlesAlerts", js.undefined)
    
    inline def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setIe(value: Arch): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
    
    inline def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
    
    inline def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
    
    inline def setJavascriptEnabledUndefined: Self = StObject.set(x, "javascriptEnabled", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalIdentifier(value: String): Self = StObject.set(x, "localIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLocalIdentifierUndefined: Self = StObject.set(x, "localIdentifier", js.undefined)
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setLocationContextEnabled(value: Boolean): Self = StObject.set(x, "locationContextEnabled", value.asInstanceOf[js.Any])
    
    inline def setLocationContextEnabledUndefined: Self = StObject.set(x, "locationContextEnabled", js.undefined)
    
    inline def setLoggingPrefs(value: Browser): Self = StObject.set(x, "loggingPrefs", value.asInstanceOf[js.Any])
    
    inline def setLoggingPrefsUndefined: Self = StObject.set(x, "loggingPrefs", js.undefined)
    
    inline def setMaskBasicAuth(value: Boolean): Self = StObject.set(x, "maskBasicAuth", value.asInstanceOf[js.Any])
    
    inline def setMaskBasicAuthUndefined: Self = StObject.set(x, "maskBasicAuth", js.undefined)
    
    inline def setNativeEvents(value: Boolean): Self = StObject.set(x, "nativeEvents", value.asInstanceOf[js.Any])
    
    inline def setNativeEventsUndefined: Self = StObject.set(x, "nativeEvents", js.undefined)
    
    inline def setNetworkLogs(value: Boolean): Self = StObject.set(x, "networkLogs", value.asInstanceOf[js.Any])
    
    inline def setNetworkLogsUndefined: Self = StObject.set(x, "networkLogs", js.undefined)
    
    inline def setNetworkProfile(value: String): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
    
    inline def setOnlyProxySeleniumTraffic(value: Boolean): Self = StObject.set(x, "onlyProxySeleniumTraffic", value.asInstanceOf[js.Any])
    
    inline def setOnlyProxySeleniumTrafficUndefined: Self = StObject.set(x, "onlyProxySeleniumTraffic", js.undefined)
    
    inline def setOptionsSet(value: Boolean): Self = StObject.set(x, "optionsSet", value.asInstanceOf[js.Any])
    
    inline def setOptionsSetUndefined: Self = StObject.set(x, "optionsSet", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setOs_version(value: String): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
    
    inline def setOs_versionUndefined: Self = StObject.set(x, "os_version", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProxyEverything(value: Boolean): Self = StObject.set(x, "proxyEverything", value.asInstanceOf[js.Any])
    
    inline def setProxyEverythingUndefined: Self = StObject.set(x, "proxyEverything", js.undefined)
    
    inline def setProxyRequired(value: Boolean): Self = StObject.set(x, "proxyRequired", value.asInstanceOf[js.Any])
    
    inline def setProxyRequiredUndefined: Self = StObject.set(x, "proxyRequired", js.undefined)
    
    inline def setPublic(value: Any): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setRealMobile(value: Boolean): Self = StObject.set(x, "realMobile", value.asInstanceOf[js.Any])
    
    inline def setRealMobileUndefined: Self = StObject.set(x, "realMobile", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
    
    inline def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
    
    inline def setSafari(value: AllowAllCookies): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
    
    inline def setSafariUndefined: Self = StObject.set(x, "safari", js.undefined)
    
    inline def setSeleniumDotserverDoturl(value: String): Self = StObject.set(x, "selenium.server.url", value.asInstanceOf[js.Any])
    
    inline def setSeleniumDotserverDoturlUndefined: Self = StObject.set(x, "selenium.server.url", js.undefined)
    
    inline def setSeleniumLogs(value: Boolean): Self = StObject.set(x, "seleniumLogs", value.asInstanceOf[js.Any])
    
    inline def setSeleniumLogsUndefined: Self = StObject.set(x, "seleniumLogs", js.undefined)
    
    inline def setSessionName(value: String): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
    
    inline def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
    
    inline def setSingleWindow(value: Boolean): Self = StObject.set(x, "singleWindow", value.asInstanceOf[js.Any])
    
    inline def setSingleWindowUndefined: Self = StObject.set(x, "singleWindow", js.undefined)
    
    inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
    
    inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value*))
    
    inline def setTimeoutInSeconds(value: Double): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def `setTunnel-identifier`(value: String): Self = StObject.set(x, "tunnel-identifier", value.asInstanceOf[js.Any])
    
    inline def `setTunnel-identifierUndefined`: Self = StObject.set(x, "tunnel-identifier", js.undefined)
    
    inline def setUnexpectedAlertBehaviour(value: String): Self = StObject.set(x, "unexpectedAlertBehaviour", value.asInstanceOf[js.Any])
    
    inline def setUnexpectedAlertBehaviourUndefined: Self = StObject.set(x, "unexpectedAlertBehaviour", js.undefined)
    
    inline def setUserExtensions(value: String): Self = StObject.set(x, "userExtensions", value.asInstanceOf[js.Any])
    
    inline def setUserExtensionsUndefined: Self = StObject.set(x, "userExtensions", js.undefined)
    
    inline def setUserJSInjection(value: Boolean): Self = StObject.set(x, "userJSInjection", value.asInstanceOf[js.Any])
    
    inline def setUserJSInjectionUndefined: Self = StObject.set(x, "userJSInjection", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setWdioService(value: String): Self = StObject.set(x, "wdioService", value.asInstanceOf[js.Any])
    
    inline def setWdioServiceUndefined: Self = StObject.set(x, "wdioService", js.undefined)
    
    inline def setWebStorageEnabled(value: Boolean): Self = StObject.set(x, "webStorageEnabled", value.asInstanceOf[js.Any])
    
    inline def setWebStorageEnabledUndefined: Self = StObject.set(x, "webStorageEnabled", js.undefined)
    
    inline def setWebdriverDotremoteDotquietExceptions(value: Boolean): Self = StObject.set(x, "webdriver.remote.quietExceptions", value.asInstanceOf[js.Any])
    
    inline def setWebdriverDotremoteDotquietExceptionsUndefined: Self = StObject.set(x, "webdriver.remote.quietExceptions", js.undefined)
    
    inline def setWebdriverDotremoteDotsessionid(value: String): Self = StObject.set(x, "webdriver.remote.sessionid", value.asInstanceOf[js.Any])
    
    inline def setWebdriverDotremoteDotsessionidUndefined: Self = StObject.set(x, "webdriver.remote.sessionid", js.undefined)
    
    inline def setWsLocalSupport(value: Boolean): Self = StObject.set(x, "wsLocalSupport", value.asInstanceOf[js.Any])
    
    inline def setWsLocalSupportUndefined: Self = StObject.set(x, "wsLocalSupport", js.undefined)
  }
}
