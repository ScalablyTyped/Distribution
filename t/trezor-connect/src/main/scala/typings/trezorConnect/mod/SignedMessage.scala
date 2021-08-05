package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedMessage extends StObject {
  
  var address: String
  
  // signer address
  var signature: String
}
object SignedMessage {
  
  inline def apply(address: String, signature: String): SignedMessage = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedMessage]
  }
  
  extension [Self <: SignedMessage](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
