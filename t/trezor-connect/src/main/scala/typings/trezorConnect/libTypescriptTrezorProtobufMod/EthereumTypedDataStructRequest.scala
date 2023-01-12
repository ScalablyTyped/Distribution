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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthereumTypedDataStructRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
