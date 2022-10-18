package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTypedDataStructRequest extends StObject {
  
  var name: String
}
object EthereumTypedDataStructRequest {
  
  inline def apply(name: String): EthereumTypedDataStructRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumTypedDataStructRequest]
  }
  
  extension [Self <: EthereumTypedDataStructRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
