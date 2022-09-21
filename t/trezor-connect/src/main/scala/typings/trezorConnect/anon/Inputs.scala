package typings.trezorConnect.anon

import typings.trezorConnect.protobufMod.TxInputType
import typings.trezorConnect.protobufMod.TxOutputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inputs extends StObject {
  
  var inputs: js.Array[TxInputType]
  
  var outputs: js.Array[TxOutputType]
  
  var outputsPermutation: js.Array[Double]
}
object Inputs {
  
  inline def apply(
    inputs: js.Array[TxInputType],
    outputs: js.Array[TxOutputType],
    outputsPermutation: js.Array[Double]
  ): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], outputsPermutation = outputsPermutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  extension [Self <: Inputs](x: Self) {
    
    inline def setInputs(value: js.Array[TxInputType]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TxInputType*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setOutputs(value: js.Array[TxOutputType]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsPermutation(value: js.Array[Double]): Self = StObject.set(x, "outputsPermutation", value.asInstanceOf[js.Any])
    
    inline def setOutputsPermutationVarargs(value: Double*): Self = StObject.set(x, "outputsPermutation", js.Array(value*))
    
    inline def setOutputsVarargs(value: TxOutputType*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
