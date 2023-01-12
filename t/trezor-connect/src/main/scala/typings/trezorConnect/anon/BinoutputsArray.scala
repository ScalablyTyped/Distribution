package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxAckResponse
import typings.trezorConnect.libTypescriptTrezorProtobufMod.TxOutputBinType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinoutputsArray
  extends StObject
     with TxAckResponse {
  
  var bin_outputs: js.Array[TxOutputBinType]
}
object BinoutputsArray {
  
  inline def apply(bin_outputs: js.Array[TxOutputBinType]): BinoutputsArray = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinoutputsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinoutputsArray] (val x: Self) extends AnyVal {
    
    inline def setBin_outputs(value: js.Array[TxOutputBinType]): Self = StObject.set(x, "bin_outputs", value.asInstanceOf[js.Any])
    
    inline def setBin_outputsVarargs(value: TxOutputBinType*): Self = StObject.set(x, "bin_outputs", js.Array(value*))
  }
}
