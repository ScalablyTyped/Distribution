package typings.trezorConnect.ethereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignMessage extends StObject {
  
  var hex: js.UndefOr[Boolean] = js.undefined
  
  var message: String
  
  var path: String | js.Array[Double]
}
object EthereumSignMessage {
  
  inline def apply(message: String, path: String | js.Array[Double]): EthereumSignMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignMessage]
  }
  
  extension [Self <: EthereumSignMessage](x: Self) {
    
    inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
