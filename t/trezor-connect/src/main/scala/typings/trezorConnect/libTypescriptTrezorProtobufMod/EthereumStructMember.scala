package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumStructMember extends StObject {
  
  var name: String
  
  var `type`: EthereumFieldType
}
object EthereumStructMember {
  
  inline def apply(name: String, `type`: EthereumFieldType): EthereumStructMember = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumStructMember]
  }
  
  extension [Self <: EthereumStructMember](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: EthereumFieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
