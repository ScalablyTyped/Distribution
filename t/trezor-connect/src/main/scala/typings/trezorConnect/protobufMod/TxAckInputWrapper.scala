package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TxAckInputWrapper extends StObject {
  
  var input: TxInput
}
object TxAckInputWrapper {
  
  inline def apply(input: TxInput): TxAckInputWrapper = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxAckInputWrapper]
  }
  
  extension [Self <: TxAckInputWrapper](x: Self) {
    
    inline def setInput(value: TxInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
