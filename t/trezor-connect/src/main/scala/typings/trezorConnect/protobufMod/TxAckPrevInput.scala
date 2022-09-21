package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckPrevInput extends StObject {
  
  var tx: TxAckPrevInputWrapper
}
object TxAckPrevInput {
  
  inline def apply(tx: TxAckPrevInputWrapper): TxAckPrevInput = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckPrevInput]
  }
  
  extension [Self <: TxAckPrevInput](x: Self) {
    
    inline def setTx(value: TxAckPrevInputWrapper): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
