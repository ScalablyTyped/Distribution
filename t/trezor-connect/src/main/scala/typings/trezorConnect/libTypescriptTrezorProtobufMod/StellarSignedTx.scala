package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarSignedTx extends StObject {
  
  var public_key: String
  
  var signature: String
}
object StellarSignedTx {
  
  inline def apply(public_key: String, signature: String): StellarSignedTx = {
    val __obj = js.Dynamic.literal(public_key = public_key.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarSignedTx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StellarSignedTx] (val x: Self) extends AnyVal {
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
