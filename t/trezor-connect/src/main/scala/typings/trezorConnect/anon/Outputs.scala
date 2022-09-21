package typings.trezorConnect.anon

import typings.trezorConnect.protobufMod.TxAckResponse
import typings.trezorConnect.protobufMod.TxOutputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outputs
  extends StObject
     with TxAckResponse {
  
  var outputs: js.Array[TxOutputType]
}
object Outputs {
  
  inline def apply(outputs: js.Array[TxOutputType]): Outputs = {
    val __obj = js.Dynamic.literal(outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputs]
  }
  
  extension [Self <: Outputs](x: Self) {
    
    inline def setOutputs(value: js.Array[TxOutputType]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: TxOutputType*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
