package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the network response after sending a USSD message. */
trait UssdReply extends StObject {
  
  /** Gets the message for the USSD response. */
  var message: UssdMessage
  
  /** Gets the result code for the USSD response. */
  var resultCode: UssdResultCode
}
object UssdReply {
  
  inline def apply(message: UssdMessage, resultCode: UssdResultCode): UssdReply = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UssdReply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UssdReply] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: UssdMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setResultCode(value: UssdResultCode): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
  }
}
