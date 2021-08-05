package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUssdReply extends StObject {
  
  var message: UssdMessage
  
  var resultCode: UssdResultCode
}
object IUssdReply {
  
  inline def apply(message: UssdMessage, resultCode: UssdResultCode): IUssdReply = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUssdReply]
  }
  
  extension [Self <: IUssdReply](x: Self) {
    
    inline def setMessage(value: UssdMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setResultCode(value: UssdResultCode): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
  }
}
