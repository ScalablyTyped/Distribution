package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckOutput extends StObject {
  
  var tx: TxAckOutputWrapper
}
object TxAckOutput {
  
  inline def apply(tx: TxAckOutputWrapper): TxAckOutput = {
    val __obj = js.Dynamic.literal(tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TxAckOutput] (val x: Self) extends AnyVal {
    
    inline def setTx(value: TxAckOutputWrapper): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
