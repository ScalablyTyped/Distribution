package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUssdReply extends StObject {
  
  var message: UssdMessage = js.native
  
  var resultCode: UssdResultCode = js.native
}
object IUssdReply {
  
  @scala.inline
  def apply(message: UssdMessage, resultCode: UssdResultCode): IUssdReply = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUssdReply]
  }
  
  @scala.inline
  implicit class IUssdReplyMutableBuilder[Self <: IUssdReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: UssdMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCode(value: UssdResultCode): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
  }
}
