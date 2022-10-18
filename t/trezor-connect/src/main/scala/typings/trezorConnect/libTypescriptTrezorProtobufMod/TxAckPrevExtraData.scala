package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckPrevExtraData extends StObject {
  
  var tx: TxAckPrevExtraDataWrapper
}
object TxAckPrevExtraData {
  
  inline def apply(tx: TxAckPrevExtraDataWrapper): TxAckPrevExtraData = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckPrevExtraData]
  }
  
  extension [Self <: TxAckPrevExtraData](x: Self) {
    
    inline def setTx(value: TxAckPrevExtraDataWrapper): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
