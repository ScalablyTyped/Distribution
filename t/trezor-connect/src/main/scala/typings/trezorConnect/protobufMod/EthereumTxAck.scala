package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumTxAck extends StObject {
  
  var data_chunk: String
}
object EthereumTxAck {
  
  inline def apply(data_chunk: String): EthereumTxAck = {
    val __obj = js.Dynamic.literal(data_chunk = data_chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumTxAck]
  }
  
  extension [Self <: EthereumTxAck](x: Self) {
    
    inline def setData_chunk(value: String): Self = StObject.set(x, "data_chunk", value.asInstanceOf[js.Any])
  }
}
