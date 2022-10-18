package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckPrevOutputWrapper extends StObject {
  
  var output: PrevOutput
}
object TxAckPrevOutputWrapper {
  
  inline def apply(output: PrevOutput): TxAckPrevOutputWrapper = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckPrevOutputWrapper]
  }
  
  extension [Self <: TxAckPrevOutputWrapper](x: Self) {
    
    inline def setOutput(value: PrevOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
