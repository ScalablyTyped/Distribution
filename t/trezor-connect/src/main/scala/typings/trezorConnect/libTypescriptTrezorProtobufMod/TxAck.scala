package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAck extends StObject {
  
  var tx: TxAckResponse
}
object TxAck {
  
  inline def apply(tx: TxAckResponse): TxAck = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TxAck] (val x: Self) extends AnyVal {
    
    inline def setTx(value: TxAckResponse): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
