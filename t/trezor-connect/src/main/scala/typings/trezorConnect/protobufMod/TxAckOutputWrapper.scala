package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckOutputWrapper extends StObject {
  
  var output: TxOutput
}
object TxAckOutputWrapper {
  
  inline def apply(output: TxOutput): TxAckOutputWrapper = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckOutputWrapper]
  }
  
  extension [Self <: TxAckOutputWrapper](x: Self) {
    
    inline def setOutput(value: TxOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
