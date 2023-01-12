package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckPrevInputWrapper extends StObject {
  
  var input: PrevInput
}
object TxAckPrevInputWrapper {
  
  inline def apply(input: PrevInput): TxAckPrevInputWrapper = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckPrevInputWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TxAckPrevInputWrapper] (val x: Self) extends AnyVal {
    
    inline def setInput(value: PrevInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
