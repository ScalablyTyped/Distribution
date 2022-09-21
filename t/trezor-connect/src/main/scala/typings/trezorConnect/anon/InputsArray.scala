package typings.trezorConnect.anon

import typings.trezorConnect.protobufMod.PrevInput
import typings.trezorConnect.protobufMod.TxAckResponse
import typings.trezorConnect.protobufMod.TxInputType
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
  
  extension [Self <: InputsArray](x: Self) {
    
    inline def setInputs(value: js.Array[TxInputType | PrevInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: (TxInputType | PrevInput)*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
