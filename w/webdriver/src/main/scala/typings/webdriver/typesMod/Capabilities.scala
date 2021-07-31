package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities
  extends StObject
     with VendorExtensions {
  
  var acceptInsecureCerts: js.UndefOr[Boolean] = js.undefined
  
  var browserName: js.UndefOr[String] = js.undefined
  
  var browserVersion: js.UndefOr[String] = js.undefined
  
  var pageLoadStrategy: js.UndefOr[PageLoadingStrategy] = js.undefined
  
  var platformName: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[ProxyObject] = js.undefined
  
  var setWindowRect: js.UndefOr[Boolean] = js.undefined
  
  var strictFileInteractability: js.UndefOr[Boolean] = js.undefined
  
  var timeouts: js.UndefOr[Timeouts] = js.undefined
  
  var unhandledPromptBehavior: js.UndefOr[String] = js.undefined
}
object Capabilities {
  
  @scala.inline
  def apply(): Capabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capabilities]
  }
  
  @scala.inline
  implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptInsecureCerts(value: Boolean): Self = StObject.set(x, "acceptInsecureCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptInsecureCertsUndefined: Self = StObject.set(x, "acceptInsecureCerts", js.undefined)
    
    @scala.inline
    def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    @scala.inline
    def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserVersionUndefined: Self = StObject.set(x, "browserVersion", js.undefined)
    
    @scala.inline
    def setPageLoadStrategy(value: PageLoadingStrategy): Self = StObject.set(x, "pageLoadStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLoadStrategyUndefined: Self = StObject.set(x, "pageLoadStrategy", js.undefined)
    
    @scala.inline
    def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformNameUndefined: Self = StObject.set(x, "platformName", js.undefined)
    
    @scala.inline
    def setProxy(value: ProxyObject): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setSetWindowRect(value: Boolean): Self = StObject.set(x, "setWindowRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWindowRectUndefined: Self = StObject.set(x, "setWindowRect", js.undefined)
    
    @scala.inline
    def setStrictFileInteractability(value: Boolean): Self = StObject.set(x, "strictFileInteractability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictFileInteractabilityUndefined: Self = StObject.set(x, "strictFileInteractability", js.undefined)
    
    @scala.inline
    def setTimeouts(value: Timeouts): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
    
    @scala.inline
    def setUnhandledPromptBehavior(value: String): Self = StObject.set(x, "unhandledPromptBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledPromptBehaviorUndefined: Self = StObject.set(x, "unhandledPromptBehavior", js.undefined)
  }
}
