package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinanceTransferMsg extends StObject {
  
  var inputs: js.Array[BinanceInputOutput]
  
  var outputs: js.Array[BinanceInputOutput]
}
object BinanceTransferMsg {
  
  inline def apply(inputs: js.Array[BinanceInputOutput], outputs: js.Array[BinanceInputOutput]): BinanceTransferMsg = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinanceTransferMsg]
  }
  
  extension [Self <: BinanceTransferMsg](x: Self) {
    
    inline def setInputs(value: js.Array[BinanceInputOutput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: BinanceInputOutput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setOutputs(value: js.Array[BinanceInputOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: BinanceInputOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
