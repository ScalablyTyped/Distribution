package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.PrevInput
import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxAckResponse
import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsArray
  extends StObject
     with TxAckResponse {
  
  var inputs: js.Array[TxInputType | PrevInput]
}
object InputsArray {
  
  inline def apply(inputs: js.Array[TxInputType | PrevInput]): InputsArray = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsArray] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: js.Array[TxInputType | PrevInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: (TxInputType | PrevInput)*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
