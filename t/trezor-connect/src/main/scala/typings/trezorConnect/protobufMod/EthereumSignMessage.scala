package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignMessage extends StObject {
  
  var address_n: js.Array[Double]
  
  var message: String
}
object EthereumSignMessage {
  
  inline def apply(address_n: js.Array[Double], message: String): EthereumSignMessage = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignMessage]
  }
  
  extension [Self <: EthereumSignMessage](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
