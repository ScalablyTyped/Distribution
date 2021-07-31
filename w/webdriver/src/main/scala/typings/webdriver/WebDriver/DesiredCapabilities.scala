package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.webdriver.WebDriver.SeleniumRCCapabilities because var conflicts: avoidProxy. Inlined commandLineFlags, executablePath, timeoutInSeconds, onlyProxySeleniumTraffic, proxyEverything, proxyRequired, browserSideLog, optionsSet, singleWindow, dontInjectRegex, userJSInjection, userExtensions
- typings.webdriver.WebDriver.TestingbotCapabilities because var conflicts: public. Inlined name, tags, build, `tunnel-identifier` */ trait DesiredCapabilities
  extends StObject
     with Capabilities
     with SauceLabsCapabilities
     with AppiumIOSCapabilities
     with GeckodriverCapabilities
     with IECapabilities
     with AppiumAndroidCapabilities
     with AppiumCapabilities
     with GridCapabilities
     with ChromeCapabilities {
  
  var acceptSslCerts: js.UndefOr[Boolean] = js.undefined
  
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.undefined
  
  var browserConnectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  var browserSideLog: js.UndefOr[Boolean] = js.undefined
  
  var build: js.UndefOr[String | Double] = js.undefined
  
  // Selenium RC (1.0) only
  var commandLineFlags: js.UndefOr[String] = js.undefined
  
  // Read-only capabilities
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var databaseEnabled: js.UndefOr[Boolean] = js.undefined
  
  var dontInjectRegex: js.UndefOr[RegExp] = js.undefined
  
  var elementScrollBehavior: js.UndefOr[Double] = js.undefined
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var executablePath: js.UndefOr[String] = js.undefined
  
  var handlesAlerts: js.UndefOr[Boolean] = js.undefined
  
  // Read-write capabilities
  var javascriptEnabled: js.UndefOr[Boolean] = js.undefined
  
  var locationContextEnabled: js.UndefOr[Boolean] = js.undefined
  
  var loggingPrefs: js.UndefOr[typings.webdriver.anon.Client] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nativeEvents: js.UndefOr[Boolean] = js.undefined
  
  var onlyProxySeleniumTraffic: js.UndefOr[Boolean] = js.undefined
  
  var optionsSet: js.UndefOr[Boolean] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var proxyEverything: js.UndefOr[Boolean] = js.undefined
  
  var proxyRequired: js.UndefOr[Boolean] = js.undefined
  
  @JSName("public")
  var public_DesiredCapabilities: js.UndefOr[js.Any] = js.undefined
  
  var rotatable: js.UndefOr[Boolean] = js.undefined
  
  // Safari specific
  @JSName("safari.options")
  var safariDotoptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  // Selenese-Backed-WebDriver specific
  @JSName("selenium.server.url")
  var seleniumDotserverDoturl: js.UndefOr[String] = js.undefined
  
  var singleWindow: js.UndefOr[Boolean] = js.undefined
  
  // webdriverio specific
  var specs: js.UndefOr[js.Array[String]] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var timeoutInSeconds: js.UndefOr[Double] = js.undefined
  
  var `tunnel-identifier`: js.UndefOr[String] = js.undefined
  
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.undefined
  
  var userExtensions: js.UndefOr[String] = js.undefined
  
  var userJSInjection: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var webStorageEnabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("webdriver.remote.quietExceptions")
  var webdriverDotremoteDotquietExceptions: js.UndefOr[Boolean] = js.undefined
  
  // RemoteWebDriver specific
  @JSName("webdriver.remote.sessionid")
  var webdriverDotremoteDotsessionid: js.UndefOr[String] = js.undefined
}
object DesiredCapabilities {
  
  @scala.inline
  def apply(): DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredCapabilities]
  }
  
  @scala.inline
  implicit class DesiredCapabilitiesMutableBuilder[Self <: DesiredCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptSslCerts(value: Boolean): Self = StObject.set(x, "acceptSslCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptSslCertsUndefined: Self = StObject.set(x, "acceptSslCerts", js.undefined)
    
    @scala.inline
    def setApplicationCacheEnabled(value: Boolean): Self = StObject.set(x, "applicationCacheEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCacheEnabledUndefined: Self = StObject.set(x, "applicationCacheEnabled", js.undefined)
    
    @scala.inline
    def setBrowserConnectionEnabled(value: Boolean): Self = StObject.set(x, "browserConnectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserConnectionEnabledUndefined: Self = StObject.set(x, "browserConnectionEnabled", js.undefined)
    
    @scala.inline
    def setBrowserSideLog(value: Boolean): Self = StObject.set(x, "browserSideLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserSideLogUndefined: Self = StObject.set(x, "browserSideLog", js.undefined)
    
    @scala.inline
    def setBuild(value: String | Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setCommandLineFlags(value: String): Self = StObject.set(x, "commandLineFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLineFlagsUndefined: Self = StObject.set(x, "commandLineFlags", js.undefined)
    
    @scala.inline
    def setCssSelectorsEnabled(value: Boolean): Self = StObject.set(x, "cssSelectorsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssSelectorsEnabledUndefined: Self = StObject.set(x, "cssSelectorsEnabled", js.undefined)
    
    @scala.inline
    def setDatabaseEnabled(value: Boolean): Self = StObject.set(x, "databaseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseEnabledUndefined: Self = StObject.set(x, "databaseEnabled", js.undefined)
    
    @scala.inline
    def setDontInjectRegex(value: RegExp): Self = StObject.set(x, "dontInjectRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontInjectRegexUndefined: Self = StObject.set(x, "dontInjectRegex", js.undefined)
    
    @scala.inline
    def setElementScrollBehavior(value: Double): Self = StObject.set(x, "elementScrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementScrollBehaviorUndefined: Self = StObject.set(x, "elementScrollBehavior", js.undefined)
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    @scala.inline
    def setHandlesAlerts(value: Boolean): Self = StObject.set(x, "handlesAlerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlesAlertsUndefined: Self = StObject.set(x, "handlesAlerts", js.undefined)
    
    @scala.inline
    def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavascriptEnabledUndefined: Self = StObject.set(x, "javascriptEnabled", js.undefined)
    
    @scala.inline
    def setLocationContextEnabled(value: Boolean): Self = StObject.set(x, "locationContextEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationContextEnabledUndefined: Self = StObject.set(x, "locationContextEnabled", js.undefined)
    
    @scala.inline
    def setLoggingPrefs(value: typings.webdriver.anon.Client): Self = StObject.set(x, "loggingPrefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingPrefsUndefined: Self = StObject.set(x, "loggingPrefs", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNativeEvents(value: Boolean): Self = StObject.set(x, "nativeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeEventsUndefined: Self = StObject.set(x, "nativeEvents", js.undefined)
    
    @scala.inline
    def setOnlyProxySeleniumTraffic(value: Boolean): Self = StObject.set(x, "onlyProxySeleniumTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyProxySeleniumTrafficUndefined: Self = StObject.set(x, "onlyProxySeleniumTraffic", js.undefined)
    
    @scala.inline
    def setOptionsSet(value: Boolean): Self = StObject.set(x, "optionsSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsSetUndefined: Self = StObject.set(x, "optionsSet", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setProxyEverything(value: Boolean): Self = StObject.set(x, "proxyEverything", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyEverythingUndefined: Self = StObject.set(x, "proxyEverything", js.undefined)
    
    @scala.inline
    def setProxyRequired(value: Boolean): Self = StObject.set(x, "proxyRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyRequiredUndefined: Self = StObject.set(x, "proxyRequired", js.undefined)
    
    @scala.inline
    def setPublic(value: js.Any): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
    
    @scala.inline
    def setSafariDotoptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "safari.options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariDotoptionsUndefined: Self = StObject.set(x, "safari.options", js.undefined)
    
    @scala.inline
    def setSeleniumDotserverDoturl(value: String): Self = StObject.set(x, "selenium.server.url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeleniumDotserverDoturlUndefined: Self = StObject.set(x, "selenium.server.url", js.undefined)
    
    @scala.inline
    def setSingleWindow(value: Boolean): Self = StObject.set(x, "singleWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleWindowUndefined: Self = StObject.set(x, "singleWindow", js.undefined)
    
    @scala.inline
    def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
    
    @scala.inline
    def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimeoutInSeconds(value: Double): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    
    @scala.inline
    def `setTunnel-identifier`(value: String): Self = StObject.set(x, "tunnel-identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTunnel-identifierUndefined`: Self = StObject.set(x, "tunnel-identifier", js.undefined)
    
    @scala.inline
    def setUnexpectedAlertBehaviour(value: String): Self = StObject.set(x, "unexpectedAlertBehaviour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnexpectedAlertBehaviourUndefined: Self = StObject.set(x, "unexpectedAlertBehaviour", js.undefined)
    
    @scala.inline
    def setUserExtensions(value: String): Self = StObject.set(x, "userExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserExtensionsUndefined: Self = StObject.set(x, "userExtensions", js.undefined)
    
    @scala.inline
    def setUserJSInjection(value: Boolean): Self = StObject.set(x, "userJSInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserJSInjectionUndefined: Self = StObject.set(x, "userJSInjection", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWebStorageEnabled(value: Boolean): Self = StObject.set(x, "webStorageEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebStorageEnabledUndefined: Self = StObject.set(x, "webStorageEnabled", js.undefined)
    
    @scala.inline
    def setWebdriverDotremoteDotquietExceptions(value: Boolean): Self = StObject.set(x, "webdriver.remote.quietExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebdriverDotremoteDotquietExceptionsUndefined: Self = StObject.set(x, "webdriver.remote.quietExceptions", js.undefined)
    
    @scala.inline
    def setWebdriverDotremoteDotsessionid(value: String): Self = StObject.set(x, "webdriver.remote.sessionid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebdriverDotremoteDotsessionidUndefined: Self = StObject.set(x, "webdriver.remote.sessionid", js.undefined)
  }
}
