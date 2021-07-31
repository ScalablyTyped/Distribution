package typings.webdriver.typesMod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeleniumRCCapabilities extends StObject {
  
  var avoidProxy: js.UndefOr[Boolean] = js.undefined
  
  var browserSideLog: js.UndefOr[Boolean] = js.undefined
  
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
  
  @scala.inline
  def apply(): SeleniumRCCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeleniumRCCapabilities]
  }
  
  @scala.inline
  implicit class SeleniumRCCapabilitiesMutableBuilder[Self <: SeleniumRCCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidProxy(value: Boolean): Self = StObject.set(x, "avoidProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidProxyUndefined: Self = StObject.set(x, "avoidProxy", js.undefined)
    
    @scala.inline
    def setBrowserSideLog(value: Boolean): Self = StObject.set(x, "browserSideLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserSideLogUndefined: Self = StObject.set(x, "browserSideLog", js.undefined)
    
    @scala.inline
    def setCommandLineFlags(value: String): Self = StObject.set(x, "commandLineFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLineFlagsUndefined: Self = StObject.set(x, "commandLineFlags", js.undefined)
    
    @scala.inline
    def setDontInjectRegex(value: RegExp): Self = StObject.set(x, "dontInjectRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontInjectRegexUndefined: Self = StObject.set(x, "dontInjectRegex", js.undefined)
    
    @scala.inline
    def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
    
    @scala.inline
    def setOnlyProxySeleniumTraffic(value: Boolean): Self = StObject.set(x, "onlyProxySeleniumTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyProxySeleniumTrafficUndefined: Self = StObject.set(x, "onlyProxySeleniumTraffic", js.undefined)
    
    @scala.inline
    def setOptionsSet(value: Boolean): Self = StObject.set(x, "optionsSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsSetUndefined: Self = StObject.set(x, "optionsSet", js.undefined)
    
    @scala.inline
    def setProxyEverything(value: Boolean): Self = StObject.set(x, "proxyEverything", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyEverythingUndefined: Self = StObject.set(x, "proxyEverything", js.undefined)
    
    @scala.inline
    def setProxyRequired(value: Boolean): Self = StObject.set(x, "proxyRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyRequiredUndefined: Self = StObject.set(x, "proxyRequired", js.undefined)
    
    @scala.inline
    def setSingleWindow(value: Boolean): Self = StObject.set(x, "singleWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleWindowUndefined: Self = StObject.set(x, "singleWindow", js.undefined)
    
    @scala.inline
    def setTimeoutInSeconds(value: Double): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
    
    @scala.inline
    def setUserExtensions(value: String): Self = StObject.set(x, "userExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserExtensionsUndefined: Self = StObject.set(x, "userExtensions", js.undefined)
    
    @scala.inline
    def setUserJSInjection(value: Boolean): Self = StObject.set(x, "userJSInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserJSInjectionUndefined: Self = StObject.set(x, "userJSInjection", js.undefined)
  }
}
