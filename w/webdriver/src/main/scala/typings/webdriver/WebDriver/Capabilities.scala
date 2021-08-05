package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities
  extends StObject
     with VendorExtensions {
  
  /**
    * Indicates whether untrusted and self-signed TLS certificates are implicitly trusted on navigation for the duration of the session.
    */
  var acceptInsecureCerts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies the user agent.
    */
  var browserName: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the version of the user agent.
    */
  var browserVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the current session’s page load strategy.
    */
  var pageLoadStrategy: js.UndefOr[PageLoadingStrategy] = js.undefined
  
  /**
    * Identifies the operating system of the endpoint node.
    */
  var platformName: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the current session’s proxy configuration.
    */
  var proxy: js.UndefOr[ProxyObject] = js.undefined
  
  /**
    * Indicates whether the remote end supports all of the resizing and repositioning commands.
    */
  var setWindowRect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the current session’s strict file interactability.
    */
  var strictFileInteractability: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the timeouts imposed on certain session operations.
    */
  var timeouts: js.UndefOr[Timeouts] = js.undefined
  
  /**
    * Describes the current session’s user prompt handler. Defaults to the dismiss and notify state.
    */
  var unhandledPromptBehavior: js.UndefOr[String] = js.undefined
}
object Capabilities {
  
  inline def apply(): Capabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capabilities]
  }
  
  extension [Self <: Capabilities](x: Self) {
    
    inline def setAcceptInsecureCerts(value: Boolean): Self = StObject.set(x, "acceptInsecureCerts", value.asInstanceOf[js.Any])
    
    inline def setAcceptInsecureCertsUndefined: Self = StObject.set(x, "acceptInsecureCerts", js.undefined)
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    inline def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersionUndefined: Self = StObject.set(x, "browserVersion", js.undefined)
    
    inline def setPageLoadStrategy(value: PageLoadingStrategy): Self = StObject.set(x, "pageLoadStrategy", value.asInstanceOf[js.Any])
    
    inline def setPageLoadStrategyUndefined: Self = StObject.set(x, "pageLoadStrategy", js.undefined)
    
    inline def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    
    inline def setPlatformNameUndefined: Self = StObject.set(x, "platformName", js.undefined)
    
    inline def setProxy(value: ProxyObject): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setSetWindowRect(value: Boolean): Self = StObject.set(x, "setWindowRect", value.asInstanceOf[js.Any])
    
    inline def setSetWindowRectUndefined: Self = StObject.set(x, "setWindowRect", js.undefined)
    
    inline def setStrictFileInteractability(value: Boolean): Self = StObject.set(x, "strictFileInteractability", value.asInstanceOf[js.Any])
    
    inline def setStrictFileInteractabilityUndefined: Self = StObject.set(x, "strictFileInteractability", js.undefined)
    
    inline def setTimeouts(value: Timeouts): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    
    inline def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
    
    inline def setUnhandledPromptBehavior(value: String): Self = StObject.set(x, "unhandledPromptBehavior", value.asInstanceOf[js.Any])
    
    inline def setUnhandledPromptBehaviorUndefined: Self = StObject.set(x, "unhandledPromptBehavior", js.undefined)
  }
}
