package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var projectedAddress: js.UndefOr[String] = js.undefined
  
  var proxyAddress: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setProjectedAddress(value: String): Self = StObject.set(x, "projectedAddress", value.asInstanceOf[js.Any])
    
    inline def setProjectedAddressUndefined: Self = StObject.set(x, "projectedAddress", js.undefined)
    
    inline def setProxyAddress(value: String): Self = StObject.set(x, "proxyAddress", value.asInstanceOf[js.Any])
    
    inline def setProxyAddressUndefined: Self = StObject.set(x, "proxyAddress", js.undefined)
  }
}
