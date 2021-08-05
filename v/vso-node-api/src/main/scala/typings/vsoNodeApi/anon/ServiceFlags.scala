package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceFlags extends StObject {
  
  var disabled: scala.Double
  
  var none: scala.Double
  
  var serviceFlags: scala.Double
  
  var unChanged: scala.Double
  
  var verified: scala.Double
}
object ServiceFlags {
  
  inline def apply(
    disabled: scala.Double,
    none: scala.Double,
    serviceFlags: scala.Double,
    unChanged: scala.Double,
    verified: scala.Double
  ): ServiceFlags = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceFlags = serviceFlags.asInstanceOf[js.Any], unChanged = unChanged.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceFlags]
  }
  
  extension [Self <: ServiceFlags](x: Self) {
    
    inline def setDisabled(value: scala.Double): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setServiceFlags(value: scala.Double): Self = StObject.set(x, "serviceFlags", value.asInstanceOf[js.Any])
    
    inline def setUnChanged(value: scala.Double): Self = StObject.set(x, "unChanged", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: scala.Double): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
