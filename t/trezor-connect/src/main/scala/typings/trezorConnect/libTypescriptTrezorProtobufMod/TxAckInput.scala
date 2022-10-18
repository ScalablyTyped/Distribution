package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckInput extends StObject {
  
  var tx: TxAckInputWrapper
}
object TxAckInput {
  
  inline def apply(tx: TxAckInputWrapper): TxAckInput = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckInput]
  }
  
  extension [Self <: TxAckInput](x: Self) {
    
    inline def setTx(value: TxAckInputWrapper): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
