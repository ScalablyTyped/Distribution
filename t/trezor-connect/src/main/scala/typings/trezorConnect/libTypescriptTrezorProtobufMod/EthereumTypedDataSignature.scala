package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTypedDataSignature extends StObject {
  
  var address: String
  
  var signature: String
}
object EthereumTypedDataSignature {
  
  inline def apply(address: String, signature: String): EthereumTypedDataSignature = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumTypedDataSignature]
  }
  
  extension [Self <: EthereumTypedDataSignature](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
