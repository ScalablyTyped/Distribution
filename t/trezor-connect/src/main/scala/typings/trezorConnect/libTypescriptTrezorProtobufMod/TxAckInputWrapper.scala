package typings.trezorConnect.libTypescriptTrezorProtobufMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TxAckInputWrapper] (val x: Self) extends AnyVal {
    
    inline def setInput(value: TxInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
