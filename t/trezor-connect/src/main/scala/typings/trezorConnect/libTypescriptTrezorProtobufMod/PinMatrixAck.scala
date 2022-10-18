package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinMatrixAck extends StObject {
  
  var pin: String
}
object PinMatrixAck {
  
  inline def apply(pin: String): PinMatrixAck = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinMatrixAck]
  }
  
  extension [Self <: PinMatrixAck](x: Self) {
    
    inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
  }
}
