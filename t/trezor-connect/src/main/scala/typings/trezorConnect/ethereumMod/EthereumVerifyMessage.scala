package typings.trezorConnect.ethereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumVerifyMessage extends StObject {
  
  var address: String
  
  var hex: js.UndefOr[Boolean] = js.undefined
  
  var message: String
  
  var signature: String
}
object EthereumVerifyMessage {
  
  inline def apply(address: String, message: String, signature: String): EthereumVerifyMessage = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumVerifyMessage]
  }
  
  extension [Self <: EthereumVerifyMessage](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
