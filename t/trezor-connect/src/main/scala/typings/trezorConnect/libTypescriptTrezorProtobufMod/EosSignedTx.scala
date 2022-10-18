package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosSignedTx extends StObject {
  
  var signature: String
}
object EosSignedTx {
  
  inline def apply(signature: String): EosSignedTx = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosSignedTx]
  }
  
  extension [Self <: EosSignedTx](x: Self) {
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
