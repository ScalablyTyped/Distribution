package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckPrevOutput extends StObject {
  
  var tx: TxAckPrevOutputWrapper
}
object TxAckPrevOutput {
  
  inline def apply(tx: TxAckPrevOutputWrapper): TxAckPrevOutput = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckPrevOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TxAckPrevOutput] (val x: Self) extends AnyVal {
    
    inline def setTx(value: TxAckPrevOutputWrapper): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
