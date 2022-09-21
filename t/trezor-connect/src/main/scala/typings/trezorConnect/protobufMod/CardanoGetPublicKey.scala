package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoGetPublicKey extends StObject {
  
  var address_n: js.Array[Double]
  
  var derivation_type: CardanoDerivationType
  
  var show_display: js.UndefOr[Boolean] = js.undefined
}
object CardanoGetPublicKey {
  
  inline def apply(address_n: js.Array[Double], derivation_type: CardanoDerivationType): CardanoGetPublicKey = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], derivation_type = derivation_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoGetPublicKey]
  }
  
  extension [Self <: CardanoGetPublicKey](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setDerivation_type(value: CardanoDerivationType): Self = StObject.set(x, "derivation_type", value.asInstanceOf[js.Any])
    
    inline def setShow_display(value: Boolean): Self = StObject.set(x, "show_display", value.asInstanceOf[js.Any])
    
    inline def setShow_displayUndefined: Self = StObject.set(x, "show_display", js.undefined)
  }
}
