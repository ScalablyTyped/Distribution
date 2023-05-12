package typings.wdioTypes.buildCapabilitiesMod

import typings.wdioTypes.anon.AllowAllCookies
import typings.wdioTypes.anon.Arch
import typings.wdioTypes.anon.CaptureContent
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

trait BrowserStackCapabilities extends StObject {
  
  /**
    * Ignore invalid certificate errors.
    *
    * @default false
    */
  var acceptSslCerts: js.UndefOr[Boolean] = js.undefined
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  var appiumLogs: js.UndefOr[Boolean] = js.undefined
  
  var appiumVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a custom delay between the execution of Selenium commands.
    *
    * @default 20
    */
  var autoWait: js.UndefOr[Double] = js.undefined
  
  /**
    * IE 11 uses cached pages when navigating using the backward or forward buttons.
    * To disable page caching, set this value to 1.
    *
    * @default 0
    */
  var bfcache: js.UndefOr[`0` | `1`] = js.undefined
  
  var browser: js.UndefOr[String] = js.undefined
  
  var browserName: js.UndefOr[String] = js.undefined
  
  var browserVersion: js.UndefOr[String] = js.undefined
  
  var browser_version: js.UndefOr[String] = js.undefined
  
  @JSName("browserstack.buildIdentifier")
  var browserstackDotbuildIdentifier: js.UndefOr[String] = js.undefined
  
  @JSName("browserstack.localIdentifier")
  var browserstackDotlocalIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Mask the data sent or retrieved by certain commands.
    *
    * Note: Multiple commands can be passed in a single array, separated by commas.
    */
  @JSName("browserstack.maskCommands")
  var browserstackDotmaskCommands: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("browserstack.sendKeys")
  var browserstackDotsendKeys: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify an identifier for a build consists group of tests.
    */
  var buildIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a name for a logical group of tests.
    */
  var buildName: js.UndefOr[String] = js.undefined
  
  /**
    * Use this capability to add a custom tag to the builds.
    * These tags can be used to filter the builds on the Automate dashboard.
    */
  var buildTag: js.UndefOr[String] = js.undefined
  
  var chrome: js.UndefOr[Driver] = js.undefined
  
  /**
    * Capture browser console logs at various steps in the test.
    * Console Logs are available for Selenium tests on Desktop Chrome
    * and Mobile Chrome (Android devices).
    *
    * @default 'errors'
    */
  var consoleLogs: js.UndefOr[disable | errors | warnings | info_ | verbose] = js.undefined
  
  var customNetwork: js.UndefOr[String] = js.undefined
  
  /**
    * Generate screenshots at various steps of the test.
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var desired: js.UndefOr[DesiredCapabilities] = js.undefined
  
  var device: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a particular mobile device for the test environment.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  var deviceOrientation: js.UndefOr[portrait | landscape] = js.undefined
  
  /**
    * Use this capability to disable cross origin restrictions in Safari.
    * Available for Monterey, Big Sur, Catalina and Mojave.
    *
    * @default false
    */
  var disableCorsRestrictions: js.UndefOr[Boolean] = js.undefined
  
  var edge: js.UndefOr[EnablePopups] = js.undefined
  
  var firefox: js.UndefOr[Driver] = js.undefined
  
  var geoLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Add a host entry (/etc/hosts) to the remote BrowserStack machine.
    *
    * Format: ip_address domain_name
    * @example
    * { "bstack:options": { hosts: "1.2.3.4 staging.website.com" } }
    */
  var hosts: js.UndefOr[String] = js.undefined
  
  /**
    * BrowerStack triggers `BROWSERSTACK_IDLE_TIMEOUT` error when a session
    * is left idle for more than `idleTimeout` seconds. This happens as BrowserStack by
    * default waits for the timeout duration for additional steps or commands
    * to run. If no command is received during that time, the session is stopped,
    * changing the session status to `TIMEOUT` on the Automate dashboard.
    *
    * Valid range: 0-300 seconds.
    *
    * @default 90
    */
  var idleTimeout: js.UndefOr[Double] = js.undefined
  
  var ie: js.UndefOr[Arch] = js.undefined
  
  /**
    * https://www.browserstack.com/docs/app-automate/appium/debug-failed-tests/interactive-session
    * Enable an interactive debugging session while your test session is running
    */
  var interactiveDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Test locally hosted websites on BrowserStack.
    * To enable access to the local machine you need to setup the
    * [BrowserStack Local Binary](https://www.browserstack.com/local-testing/automate).
    */
  var local: js.UndefOr[Boolean] = js.undefined
  
  var localIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Mask credentials from test logs if using basic authentication.
    */
  var maskBasicAuth: js.UndefOr[Boolean] = js.undefined
  
  var networkLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * https://www.browserstack.com/docs/app-automate/appium/debug-failed-tests/network-logs
    * Enable viewing the response data in the Network Logs tab on your session
    */
  var networkLogsOptions: js.UndefOr[CaptureContent] = js.undefined
  
  var networkProfile: js.UndefOr[String] = js.undefined
  
  var os: js.UndefOr[String] = js.undefined
  
  var osVersion: js.UndefOr[String] = js.undefined
  
  var os_version: js.UndefOr[String] = js.undefined
  
  /**
    * Specify a name for a logical group of builds.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * Use this flag to test on a physical mobile device.
    *
    * @default false
    */
  var realMobile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the resolution of the VM.
    */
  var resolution: js.UndefOr[String] = js.undefined
  
  var safari: js.UndefOr[AllowAllCookies] = js.undefined
  
  var seleniumCdp: js.UndefOr[Boolean] = js.undefined
  
  var seleniumLogs: js.UndefOr[Boolean] = js.undefined
  
  var seleniumVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specify an identifier for the test run.
    */
  var sessionName: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var userName: js.UndefOr[String] = js.undefined
  
  var video: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @private
    */
  var wdioService: js.UndefOr[String] = js.undefined
  
  /**
    * Enable WSS (WebSocket Secure) connections to work with Network Logs
    * on Chrome v71 and above.
    *
    * Note: if using `localhost` in your test, change it to `bs-local.com`.
    *
    * @default false
    */
  var wsLocalSupport: js.UndefOr[Boolean] = js.undefined
}
object BrowserStackCapabilities {
  
  inline def apply(): BrowserStackCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserStackCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserStackCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAcceptSslCerts(value: Boolean): Self = StObject.set(x, "acceptSslCerts", value.asInstanceOf[js.Any])
    
    inline def setAcceptSslCertsUndefined: Self = StObject.set(x, "acceptSslCerts", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setAppiumLogs(value: Boolean): Self = StObject.set(x, "appiumLogs", value.asInstanceOf[js.Any])
    
    inline def setAppiumLogsUndefined: Self = StObject.set(x, "appiumLogs", js.undefined)
    
    inline def setAppiumVersion(value: String): Self = StObject.set(x, "appiumVersion", value.asInstanceOf[js.Any])
    
    inline def setAppiumVersionUndefined: Self = StObject.set(x, "appiumVersion", js.undefined)
    
    inline def setAutoWait(value: Double): Self = StObject.set(x, "autoWait", value.asInstanceOf[js.Any])
    
    inline def setAutoWaitUndefined: Self = StObject.set(x, "autoWait", js.undefined)
    
    inline def setBfcache(value: `0` | `1`): Self = StObject.set(x, "bfcache", value.asInstanceOf[js.Any])
    
    inline def setBfcacheUndefined: Self = StObject.set(x, "bfcache", js.undefined)
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersionUndefined: Self = StObject.set(x, "browserVersion", js.undefined)
    
    inline def setBrowser_version(value: String): Self = StObject.set(x, "browser_version", value.asInstanceOf[js.Any])
    
    inline def setBrowser_versionUndefined: Self = StObject.set(x, "browser_version", js.undefined)
    
    inline def setBrowserstackDotbuildIdentifier(value: String): Self = StObject.set(x, "browserstack.buildIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotbuildIdentifierUndefined: Self = StObject.set(x, "browserstack.buildIdentifier", js.undefined)
    
    inline def setBrowserstackDotlocalIdentifier(value: String): Self = StObject.set(x, "browserstack.localIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotlocalIdentifierUndefined: Self = StObject.set(x, "browserstack.localIdentifier", js.undefined)
    
    inline def setBrowserstackDotmaskCommands(value: js.Array[String]): Self = StObject.set(x, "browserstack.maskCommands", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotmaskCommandsUndefined: Self = StObject.set(x, "browserstack.maskCommands", js.undefined)
    
    inline def setBrowserstackDotmaskCommandsVarargs(value: String*): Self = StObject.set(x, "browserstack.maskCommands", js.Array(value*))
    
    inline def setBrowserstackDotsendKeys(value: Boolean): Self = StObject.set(x, "browserstack.sendKeys", value.asInstanceOf[js.Any])
    
    inline def setBrowserstackDotsendKeysUndefined: Self = StObject.set(x, "browserstack.sendKeys", js.undefined)
    
    inline def setBuildIdentifier(value: String): Self = StObject.set(x, "buildIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBuildIdentifierUndefined: Self = StObject.set(x, "buildIdentifier", js.undefined)
    
    inline def setBuildName(value: String): Self = StObject.set(x, "buildName", value.asInstanceOf[js.Any])
    
    inline def setBuildNameUndefined: Self = StObject.set(x, "buildName", js.undefined)
    
    inline def setBuildTag(value: String): Self = StObject.set(x, "buildTag", value.asInstanceOf[js.Any])
    
    inline def setBuildTagUndefined: Self = StObject.set(x, "buildTag", js.undefined)
    
    inline def setChrome(value: Driver): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
    
    inline def setConsoleLogs(value: disable | errors | warnings | info_ | verbose): Self = StObject.set(x, "consoleLogs", value.asInstanceOf[js.Any])
    
    inline def setConsoleLogsUndefined: Self = StObject.set(x, "consoleLogs", js.undefined)
    
    inline def setCustomNetwork(value: String): Self = StObject.set(x, "customNetwork", value.asInstanceOf[js.Any])
    
    inline def setCustomNetworkUndefined: Self = StObject.set(x, "customNetwork", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDesired(value: DesiredCapabilities): Self = StObject.set(x, "desired", value.asInstanceOf[js.Any])
    
    inline def setDesiredUndefined: Self = StObject.set(x, "desired", js.undefined)
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceOrientation(value: portrait | landscape): Self = StObject.set(x, "deviceOrientation", value.asInstanceOf[js.Any])
    
    inline def setDeviceOrientationUndefined: Self = StObject.set(x, "deviceOrientation", js.undefined)
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDisableCorsRestrictions(value: Boolean): Self = StObject.set(x, "disableCorsRestrictions", value.asInstanceOf[js.Any])
    
    inline def setDisableCorsRestrictionsUndefined: Self = StObject.set(x, "disableCorsRestrictions", js.undefined)
    
    inline def setEdge(value: EnablePopups): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setFirefox(value: Driver): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
    
    inline def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
    
    inline def setGeoLocation(value: String): Self = StObject.set(x, "geoLocation", value.asInstanceOf[js.Any])
    
    inline def setGeoLocationUndefined: Self = StObject.set(x, "geoLocation", js.undefined)
    
    inline def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setIe(value: Arch): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
    
    inline def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
    
    inline def setInteractiveDebugging(value: Boolean): Self = StObject.set(x, "interactiveDebugging", value.asInstanceOf[js.Any])
    
    inline def setInteractiveDebuggingUndefined: Self = StObject.set(x, "interactiveDebugging", js.undefined)
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalIdentifier(value: String): Self = StObject.set(x, "localIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLocalIdentifierUndefined: Self = StObject.set(x, "localIdentifier", js.undefined)
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setMaskBasicAuth(value: Boolean): Self = StObject.set(x, "maskBasicAuth", value.asInstanceOf[js.Any])
    
    inline def setMaskBasicAuthUndefined: Self = StObject.set(x, "maskBasicAuth", js.undefined)
    
    inline def setNetworkLogs(value: Boolean): Self = StObject.set(x, "networkLogs", value.asInstanceOf[js.Any])
    
    inline def setNetworkLogsOptions(value: CaptureContent): Self = StObject.set(x, "networkLogsOptions", value.asInstanceOf[js.Any])
    
    inline def setNetworkLogsOptionsUndefined: Self = StObject.set(x, "networkLogsOptions", js.undefined)
    
    inline def setNetworkLogsUndefined: Self = StObject.set(x, "networkLogs", js.undefined)
    
    inline def setNetworkProfile(value: String): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setOs_version(value: String): Self = StObject.set(x, "os_version", value.asInstanceOf[js.Any])
    
    inline def setOs_versionUndefined: Self = StObject.set(x, "os_version", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setRealMobile(value: Boolean): Self = StObject.set(x, "realMobile", value.asInstanceOf[js.Any])
    
    inline def setRealMobileUndefined: Self = StObject.set(x, "realMobile", js.undefined)
    
    inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSafari(value: AllowAllCookies): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
    
    inline def setSafariUndefined: Self = StObject.set(x, "safari", js.undefined)
    
    inline def setSeleniumCdp(value: Boolean): Self = StObject.set(x, "seleniumCdp", value.asInstanceOf[js.Any])
    
    inline def setSeleniumCdpUndefined: Self = StObject.set(x, "seleniumCdp", js.undefined)
    
    inline def setSeleniumLogs(value: Boolean): Self = StObject.set(x, "seleniumLogs", value.asInstanceOf[js.Any])
    
    inline def setSeleniumLogsUndefined: Self = StObject.set(x, "seleniumLogs", js.undefined)
    
    inline def setSeleniumVersion(value: String): Self = StObject.set(x, "seleniumVersion", value.asInstanceOf[js.Any])
    
    inline def setSeleniumVersionUndefined: Self = StObject.set(x, "seleniumVersion", js.undefined)
    
    inline def setSessionName(value: String): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
    
    inline def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setWdioService(value: String): Self = StObject.set(x, "wdioService", value.asInstanceOf[js.Any])
    
    inline def setWdioServiceUndefined: Self = StObject.set(x, "wdioService", js.undefined)
    
    inline def setWsLocalSupport(value: Boolean): Self = StObject.set(x, "wsLocalSupport", value.asInstanceOf[js.Any])
    
    inline def setWsLocalSupportUndefined: Self = StObject.set(x, "wsLocalSupport", js.undefined)
  }
}
