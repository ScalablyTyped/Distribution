package typings.trezorConnect.stellarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarSignedTx extends StObject {
  
  var publicKey: String
  
  var signature: String
}
object StellarSignedTx {
  
  inline def apply(publicKey: String, signature: String): StellarSignedTx = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarSignedTx]
  }
  
  extension [Self <: StellarSignedTx](x: Self) {
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
