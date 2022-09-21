package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectedAddress extends StObject {
  
  var projectedAddress: js.UndefOr[String] = js.undefined
  
  var proxyAddress: js.UndefOr[String] = js.undefined
}
object ProjectedAddress {
  
  inline def apply(): ProjectedAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectedAddress]
  }
  
  extension [Self <: ProjectedAddress](x: Self) {
    
    inline def setProjectedAddress(value: String): Self = StObject.set(x, "projectedAddress", value.asInstanceOf[js.Any])
    
    inline def setProjectedAddressUndefined: Self = StObject.set(x, "projectedAddress", js.undefined)
    
    inline def setProxyAddress(value: String): Self = StObject.set(x, "proxyAddress", value.asInstanceOf[js.Any])
    
    inline def setProxyAddressUndefined: Self = StObject.set(x, "proxyAddress", js.undefined)
  }
}
