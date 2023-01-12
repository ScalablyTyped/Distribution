package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptNetworksBinanceMod.BinancePreparedMessage
import typings.trezorConnect.libTypescriptTrezorProtobufMod.BinanceInputOutput
import typings.trezorConnect.trezorConnectStrings.BinanceTransferMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/trezor/protobuf.BinanceTransferMsg & {  type :'BinanceTransferMsg'} */
trait BinanceTransferMsgtypeBin
  extends StObject
     with BinancePreparedMessage {
  
  var inputs: js.Array[BinanceInputOutput]
  
  var outputs: js.Array[BinanceInputOutput]
  
  var `type`: BinanceTransferMsg
}
object BinanceTransferMsgtypeBin {
  
  inline def apply(inputs: js.Array[BinanceInputOutput], outputs: js.Array[BinanceInputOutput]): BinanceTransferMsgtypeBin = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinanceTransferMsg")
    __obj.asInstanceOf[BinanceTransferMsgtypeBin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinanceTransferMsgtypeBin] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: js.Array[BinanceInputOutput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: BinanceInputOutput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setOutputs(value: js.Array[BinanceInputOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: BinanceInputOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setType(value: BinanceTransferMsg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
