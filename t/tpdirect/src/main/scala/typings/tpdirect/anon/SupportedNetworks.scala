package typings.tpdirect.anon

import typings.tpdirect.PaymentRequestAmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedNetworks extends StObject {
  
  var supportedNetworks: js.Array[typings.tpdirect.AllowedNetworks]
  
  var total: PaymentRequestAmount
}
object SupportedNetworks {
  
  inline def apply(supportedNetworks: js.Array[typings.tpdirect.AllowedNetworks], total: PaymentRequestAmount): SupportedNetworks = {
    val __obj = js.Dynamic.literal(supportedNetworks = supportedNetworks.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedNetworks]
  }
  
  extension [Self <: SupportedNetworks](x: Self) {
    
    inline def setSupportedNetworks(value: js.Array[typings.tpdirect.AllowedNetworks]): Self = StObject.set(x, "supportedNetworks", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworksVarargs(value: typings.tpdirect.AllowedNetworks*): Self = StObject.set(x, "supportedNetworks", js.Array(value*))
    
    inline def setTotal(value: PaymentRequestAmount): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
