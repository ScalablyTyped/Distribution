package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTypedDataValueRequest extends StObject {
  
  var member_path: js.Array[Double]
}
object EthereumTypedDataValueRequest {
  
  inline def apply(member_path: js.Array[Double]): EthereumTypedDataValueRequest = {
    val __obj = js.Dynamic.literal(member_path = member_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumTypedDataValueRequest]
  }
  
  extension [Self <: EthereumTypedDataValueRequest](x: Self) {
    
    inline def setMember_path(value: js.Array[Double]): Self = StObject.set(x, "member_path", value.asInstanceOf[js.Any])
    
    inline def setMember_pathVarargs(value: Double*): Self = StObject.set(x, "member_path", js.Array(value*))
  }
}
