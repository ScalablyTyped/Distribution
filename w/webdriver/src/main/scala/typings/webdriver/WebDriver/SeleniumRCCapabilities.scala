package typings.webdriver.WebDriver

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeleniumRCCapabilities extends StObject {
  
  var avoidProxy: js.UndefOr[Boolean] = js.undefined
  
  var browserSideLog: js.UndefOr[Boolean] = js.undefined
  
  // Selenium RC (1.0) only
  var commandLineFlags: js.UndefOr[String] = js.undefined
  
  var dontInjectRegex: js.UndefOr[RegExp] = js.undefined
  
  var executablePath: js.UndefOr[String] = js.undefined
  
  var onlyProxySeleniumTraffic: js.UndefOr[Boolean] = js.undefined
  
  var optionsSet: js.UndefOr[Boolean] = js.undefined
  
  var proxyEverything: js.UndefOr[Boolean] = js.undefined
  
  var proxyRequired: js.UndefOr[Boolean] = js.undefined
  
  var singleWindow: js.UndefOr[Boolean] = js.undefined
  
  var timeoutInSeconds: js.UndefOr[Double] = js.undefined
  
  var userExtensions: js.UndefOr[String] = js.undefined
  
  var userJSInjection: js.UndefOr[Boolean] = js.undefined
}
object SeleniumRCCapabilities {
  
  inline def apply(): SeleniumRCCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeleniumRCCapabilities]
  }
  
  extension [Self <: SeleniumRCCapabilities](x: Self) {
    
    inline def setAvoidProxy(value: Boolean): Self = StObject.set(x, "avoidProxy", value.asInstanceOf[js.Any])
    
    inline def setAvoidProxyUndefined: Self = StObject.set(x, "avoidProxy", js.undefined)
    
    inline def setBrowserSideLog(value: Boolean): Self = StObject.set(x, "browserSideLog", value.asInstanceOf[js.Any])
    
    inline def setBrowserSideLogUndefined: Self = StObject.set(x, "browserSideLog", js.undefined)
    
    inline def setCommandLineFlags(value: String): Self = StObject.set(x, "commandLineFlags", value.asInstanceOf[js.Any])
    
    inline def setCommandLineFlagsUndefined: Self = StObject.set(x, "commandLineFlags", js.undefined)
    
    inline def setDontInjectRegex(value: RegExp): Self = StObject.set(x, "dontInjectRegex", value.asInstanceOf[js.Any])
    
    inline def setDontInjectRegexUndefined: Self = StObject.set(x, "dontInjectRegex", js.undefined)
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    inline def setOnlyProxySeleniumTraffic(value: Boolean): Self = StObject.set(x, "onlyProxySeleniumTraffic", value.asInstanceOf[js.Any])
    
    inline def setOnlyProxySeleniumTrafficUndefined: Self = StObject.set(x, "onlyProxySeleniumTraffic", js.undefined)
    
    inline def setOptionsSet(value: Boolean): Self = StObject.set(x, "optionsSet", value.asInstanceOf[js.Any])
    
    inline def setOptionsSetUndefined: Self = StObject.set(x, "optionsSet", js.undefined)
    
    inline def setProxyEverything(value: Boolean): Self = StObject.set(x, "proxyEverything", value.asInstanceOf[js.Any])
    
    inline def setProxyEverythingUndefined: Self = StObject.set(x, "proxyEverything", js.undefined)
    
    inline def setProxyRequired(value: Boolean): Self = StObject.set(x, "proxyRequired", value.asInstanceOf[js.Any])
    
    inline def setProxyRequiredUndefined: Self = StObject.set(x, "proxyRequired", js.undefined)
    
    inline def setSingleWindow(value: Boolean): Self = StObject.set(x, "singleWindow", value.asInstanceOf[js.Any])
    
    inline def setSingleWindowUndefined: Self = StObject.set(x, "singleWindow", js.undefined)
    
    inline def setTimeoutInSeconds(value: Double): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    
    inline def setUserExtensions(value: String): Self = StObject.set(x, "userExtensions", value.asInstanceOf[js.Any])
    
    inline def setUserExtensionsUndefined: Self = StObject.set(x, "userExtensions", js.undefined)
    
    inline def setUserJSInjection(value: Boolean): Self = StObject.set(x, "userJSInjection", value.asInstanceOf[js.Any])
    
    inline def setUserJSInjectionUndefined: Self = StObject.set(x, "userJSInjection", js.undefined)
  }
}
