package typings.webdriver.typesMod

import typings.std.RegExp
import typings.webdriver.anon.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.webdriver.typesMod.SeleniumRCCapabilities because var conflicts: avoidProxy. Inlined commandLineFlags, executablePath, timeoutInSeconds, onlyProxySeleniumTraffic, proxyEverything, proxyRequired, browserSideLog, optionsSet, singleWindow, dontInjectRegex, userJSInjection, userExtensions
- typings.webdriver.typesMod.TestingbotCapabilities because var conflicts: public. Inlined  */ trait DesiredCapabilities
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
  
  var commandLineFlags: js.UndefOr[String] = js.undefined
  
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var databaseEnabled: js.UndefOr[Boolean] = js.undefined
  
  var dontInjectRegex: js.UndefOr[RegExp] = js.undefined
  
  var elementScrollBehavior: js.UndefOr[Double] = js.undefined
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var executablePath: js.UndefOr[String] = js.undefined
  
  var handlesAlerts: js.UndefOr[Boolean] = js.undefined
  
  var javascriptEnabled: js.UndefOr[Boolean] = js.undefined
  
  var locationContextEnabled: js.UndefOr[Boolean] = js.undefined
  
  var loggingPrefs: js.UndefOr[Browser] = js.undefined
  
  var nativeEvents: js.UndefOr[Boolean] = js.undefined
  
  var onlyProxySeleniumTraffic: js.UndefOr[Boolean] = js.undefined
  
  var optionsSet: js.UndefOr[Boolean] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var proxyEverything: js.UndefOr[Boolean] = js.undefined
  
  var proxyRequired: js.UndefOr[Boolean] = js.undefined
  
  @JSName("public")
  var public_DesiredCapabilities: js.UndefOr[js.Any] = js.undefined
  
  var rotatable: js.UndefOr[Boolean] = js.undefined
  
  @JSName("selenium.server.url")
  var seleniumDotserverDoturl: js.UndefOr[String] = js.undefined
  
  var singleWindow: js.UndefOr[Boolean] = js.undefined
  
  var specs: js.UndefOr[js.Array[String]] = js.undefined
  
  var timeoutInSeconds: js.UndefOr[Double] = js.undefined
  
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.undefined
  
  var userExtensions: js.UndefOr[String] = js.undefined
  
  var userJSInjection: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var webStorageEnabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("webdriver.remote.quietExceptions")
  var webdriverDotremoteDotquietExceptions: js.UndefOr[Boolean] = js.undefined
  
  @JSName("webdriver.remote.sessionid")
  var webdriverDotremoteDotsessionid: js.UndefOr[String] = js.undefined
}
object DesiredCapabilities {
  
  inline def apply(): DesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredCapabilities]
  }
  
  extension [Self <: DesiredCapabilities](x: Self) {
    
    inline def setAcceptSslCerts(value: Boolean): Self = StObject.set(x, "acceptSslCerts", value.asInstanceOf[js.Any])
    
    inline def setAcceptSslCertsUndefined: Self = StObject.set(x, "acceptSslCerts", js.undefined)
    
    inline def setApplicationCacheEnabled(value: Boolean): Self = StObject.set(x, "applicationCacheEnabled", value.asInstanceOf[js.Any])
    
    inline def setApplicationCacheEnabledUndefined: Self = StObject.set(x, "applicationCacheEnabled", js.undefined)
    
    inline def setBrowserConnectionEnabled(value: Boolean): Self = StObject.set(x, "browserConnectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setBrowserConnectionEnabledUndefined: Self = StObject.set(x, "browserConnectionEnabled", js.undefined)
    
    inline def setBrowserSideLog(value: Boolean): Self = StObject.set(x, "browserSideLog", value.asInstanceOf[js.Any])
    
    inline def setBrowserSideLogUndefined: Self = StObject.set(x, "browserSideLog", js.undefined)
    
    inline def setCommandLineFlags(value: String): Self = StObject.set(x, "commandLineFlags", value.asInstanceOf[js.Any])
    
    inline def setCommandLineFlagsUndefined: Self = StObject.set(x, "commandLineFlags", js.undefined)
    
    inline def setCssSelectorsEnabled(value: Boolean): Self = StObject.set(x, "cssSelectorsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCssSelectorsEnabledUndefined: Self = StObject.set(x, "cssSelectorsEnabled", js.undefined)
    
    inline def setDatabaseEnabled(value: Boolean): Self = StObject.set(x, "databaseEnabled", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEnabledUndefined: Self = StObject.set(x, "databaseEnabled", js.undefined)
    
    inline def setDontInjectRegex(value: RegExp): Self = StObject.set(x, "dontInjectRegex", value.asInstanceOf[js.Any])
    
    inline def setDontInjectRegexUndefined: Self = StObject.set(x, "dontInjectRegex", js.undefined)
    
    inline def setElementScrollBehavior(value: Double): Self = StObject.set(x, "elementScrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setElementScrollBehaviorUndefined: Self = StObject.set(x, "elementScrollBehavior", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    inline def setHandlesAlerts(value: Boolean): Self = StObject.set(x, "handlesAlerts", value.asInstanceOf[js.Any])
    
    inline def setHandlesAlertsUndefined: Self = StObject.set(x, "handlesAlerts", js.undefined)
    
    inline def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
    
    inline def setJavascriptEnabledUndefined: Self = StObject.set(x, "javascriptEnabled", js.undefined)
    
    inline def setLocationContextEnabled(value: Boolean): Self = StObject.set(x, "locationContextEnabled", value.asInstanceOf[js.Any])
    
    inline def setLocationContextEnabledUndefined: Self = StObject.set(x, "locationContextEnabled", js.undefined)
    
    inline def setLoggingPrefs(value: Browser): Self = StObject.set(x, "loggingPrefs", value.asInstanceOf[js.Any])
    
    inline def setLoggingPrefsUndefined: Self = StObject.set(x, "loggingPrefs", js.undefined)
    
    inline def setNativeEvents(value: Boolean): Self = StObject.set(x, "nativeEvents", value.asInstanceOf[js.Any])
    
    inline def setNativeEventsUndefined: Self = StObject.set(x, "nativeEvents", js.undefined)
    
    inline def setOnlyProxySeleniumTraffic(value: Boolean): Self = StObject.set(x, "onlyProxySeleniumTraffic", value.asInstanceOf[js.Any])
    
    inline def setOnlyProxySeleniumTrafficUndefined: Self = StObject.set(x, "onlyProxySeleniumTraffic", js.undefined)
    
    inline def setOptionsSet(value: Boolean): Self = StObject.set(x, "optionsSet", value.asInstanceOf[js.Any])
    
    inline def setOptionsSetUndefined: Self = StObject.set(x, "optionsSet", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProxyEverything(value: Boolean): Self = StObject.set(x, "proxyEverything", value.asInstanceOf[js.Any])
    
    inline def setProxyEverythingUndefined: Self = StObject.set(x, "proxyEverything", js.undefined)
    
    inline def setProxyRequired(value: Boolean): Self = StObject.set(x, "proxyRequired", value.asInstanceOf[js.Any])
    
    inline def setProxyRequiredUndefined: Self = StObject.set(x, "proxyRequired", js.undefined)
    
    inline def setPublic(value: js.Any): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
    
    inline def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
    
    inline def setSeleniumDotserverDoturl(value: String): Self = StObject.set(x, "selenium.server.url", value.asInstanceOf[js.Any])
    
    inline def setSeleniumDotserverDoturlUndefined: Self = StObject.set(x, "selenium.server.url", js.undefined)
    
    inline def setSingleWindow(value: Boolean): Self = StObject.set(x, "singleWindow", value.asInstanceOf[js.Any])
    
    inline def setSingleWindowUndefined: Self = StObject.set(x, "singleWindow", js.undefined)
    
    inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
    
    inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value :_*))
    
    inline def setTimeoutInSeconds(value: Double): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    
    inline def setUnexpectedAlertBehaviour(value: String): Self = StObject.set(x, "unexpectedAlertBehaviour", value.asInstanceOf[js.Any])
    
    inline def setUnexpectedAlertBehaviourUndefined: Self = StObject.set(x, "unexpectedAlertBehaviour", js.undefined)
    
    inline def setUserExtensions(value: String): Self = StObject.set(x, "userExtensions", value.asInstanceOf[js.Any])
    
    inline def setUserExtensionsUndefined: Self = StObject.set(x, "userExtensions", js.undefined)
    
    inline def setUserJSInjection(value: Boolean): Self = StObject.set(x, "userJSInjection", value.asInstanceOf[js.Any])
    
    inline def setUserJSInjectionUndefined: Self = StObject.set(x, "userJSInjection", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWebStorageEnabled(value: Boolean): Self = StObject.set(x, "webStorageEnabled", value.asInstanceOf[js.Any])
    
    inline def setWebStorageEnabledUndefined: Self = StObject.set(x, "webStorageEnabled", js.undefined)
    
    inline def setWebdriverDotremoteDotquietExceptions(value: Boolean): Self = StObject.set(x, "webdriver.remote.quietExceptions", value.asInstanceOf[js.Any])
    
    inline def setWebdriverDotremoteDotquietExceptionsUndefined: Self = StObject.set(x, "webdriver.remote.quietExceptions", js.undefined)
    
    inline def setWebdriverDotremoteDotsessionid(value: String): Self = StObject.set(x, "webdriver.remote.sessionid", value.asInstanceOf[js.Any])
    
    inline def setWebdriverDotremoteDotsessionidUndefined: Self = StObject.set(x, "webdriver.remote.sessionid", js.undefined)
  }
}
