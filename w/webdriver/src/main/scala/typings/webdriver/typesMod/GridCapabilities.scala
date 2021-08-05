package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridCapabilities extends StObject {
  
  var environment: js.UndefOr[String] = js.undefined
  
  var maxInstances: js.UndefOr[Double] = js.undefined
  
  var seleniumProtocol: js.UndefOr[String] = js.undefined
}
object GridCapabilities {
  
  inline def apply(): GridCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridCapabilities]
  }
  
  extension [Self <: GridCapabilities](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    inline def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
    
    inline def setSeleniumProtocol(value: String): Self = StObject.set(x, "seleniumProtocol", value.asInstanceOf[js.Any])
    
    inline def setSeleniumProtocolUndefined: Self = StObject.set(x, "seleniumProtocol", js.undefined)
  }
}
