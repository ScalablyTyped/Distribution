package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxAckResponse
import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxOutputType
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outputs] (val x: Self) extends AnyVal {
    
    inline def setOutputs(value: js.Array[TxOutputType]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: TxOutputType*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
