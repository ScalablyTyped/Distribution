package typings.trezorConnect.libTypescriptTrezorProtobufMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TxAckPrevInput] (val x: Self) extends AnyVal {
    
    inline def setTx(value: TxAckPrevInputWrapper): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
