package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridCapabilities extends StObject {
  
  var environment: js.UndefOr[String] = js.undefined
  
  var maxInstances: js.UndefOr[Double] = js.undefined
  
  // Grid-specific
  var seleniumProtocol: js.UndefOr[String] = js.undefined
}
object GridCapabilities {
  
  @scala.inline
  def apply(): GridCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridCapabilities]
  }
  
  @scala.inline
  implicit class GridCapabilitiesMutableBuilder[Self <: GridCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
    
    @scala.inline
    def setSeleniumProtocol(value: String): Self = StObject.set(x, "seleniumProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeleniumProtocolUndefined: Self = StObject.set(x, "seleniumProtocol", js.undefined)
  }
}
