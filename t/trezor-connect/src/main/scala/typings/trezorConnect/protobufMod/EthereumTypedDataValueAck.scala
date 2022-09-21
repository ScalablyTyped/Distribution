package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTypedDataValueAck extends StObject {
  
  var value: String
}
object EthereumTypedDataValueAck {
  
  inline def apply(value: String): EthereumTypedDataValueAck = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumTypedDataValueAck]
  }
  
  extension [Self <: EthereumTypedDataValueAck](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
