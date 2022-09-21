package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleSignedTx extends StObject {
  
  var serialized_tx: String
  
  var signature: String
}
object RippleSignedTx {
  
  inline def apply(serialized_tx: String, signature: String): RippleSignedTx = {
    val __obj = js.Dynamic.literal(serialized_tx = serialized_tx.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleSignedTx]
  }
  
  extension [Self <: RippleSignedTx](x: Self) {
    
    inline def setSerialized_tx(value: String): Self = StObject.set(x, "serialized_tx", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
