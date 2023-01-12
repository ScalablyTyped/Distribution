package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTypedDataStructAck extends StObject {
  
  var members: js.Array[EthereumStructMember]
}
object EthereumTypedDataStructAck {
  
  inline def apply(members: js.Array[EthereumStructMember]): EthereumTypedDataStructAck = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumTypedDataStructAck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthereumTypedDataStructAck] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[EthereumStructMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EthereumStructMember*): Self = StObject.set(x, "members", js.Array(value*))
  }
}
