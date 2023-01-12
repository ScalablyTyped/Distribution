package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMGetAddress extends StObject {
  
  var address_n: js.Array[Double]
  
  var network: js.UndefOr[Double] = js.undefined
  
  var show_display: js.UndefOr[Boolean] = js.undefined
}
object NEMGetAddress {
  
  inline def apply(address_n: js.Array[Double]): NEMGetAddress = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMGetAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMGetAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setNetwork(value: Double): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setShow_display(value: Boolean): Self = StObject.set(x, "show_display", value.asInstanceOf[js.Any])
    
    inline def setShow_displayUndefined: Self = StObject.set(x, "show_display", js.undefined)
  }
}
