package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTypedData extends StObject {
  
  var address_n: js.Array[Double]
  
  var metamask_v4_compat: js.UndefOr[Boolean] = js.undefined
  
  var primary_type: String
}
object EthereumSignTypedData {
  
  inline def apply(address_n: js.Array[Double], primary_type: String): EthereumSignTypedData = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], primary_type = primary_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTypedData]
  }
  
  extension [Self <: EthereumSignTypedData](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setMetamask_v4_compat(value: Boolean): Self = StObject.set(x, "metamask_v4_compat", value.asInstanceOf[js.Any])
    
    inline def setMetamask_v4_compatUndefined: Self = StObject.set(x, "metamask_v4_compat", js.undefined)
    
    inline def setPrimary_type(value: String): Self = StObject.set(x, "primary_type", value.asInstanceOf[js.Any])
  }
}
