package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromeCapabilities extends StObject {
  
  var chrome: js.UndefOr[String] = js.undefined
  
  var chromeOptions: js.UndefOr[ChromeOptions] = js.undefined
  
  var mobileEmulationEnabled: js.UndefOr[Boolean] = js.undefined
}
object ChromeCapabilities {
  
  @scala.inline
  def apply(): ChromeCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeCapabilities]
  }
  
  @scala.inline
  implicit class ChromeCapabilitiesMutableBuilder[Self <: ChromeCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChrome(value: String): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeOptions(value: ChromeOptions): Self = StObject.set(x, "chromeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeOptionsUndefined: Self = StObject.set(x, "chromeOptions", js.undefined)
    
    @scala.inline
    def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
    
    @scala.inline
    def setMobileEmulationEnabled(value: Boolean): Self = StObject.set(x, "mobileEmulationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileEmulationEnabledUndefined: Self = StObject.set(x, "mobileEmulationEnabled", js.undefined)
  }
}
