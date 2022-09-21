package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckPrevMeta extends StObject {
  
  var tx: PrevTx
}
object TxAckPrevMeta {
  
  inline def apply(tx: PrevTx): TxAckPrevMeta = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckPrevMeta]
  }
  
  extension [Self <: TxAckPrevMeta](x: Self) {
    
    inline def setTx(value: PrevTx): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
