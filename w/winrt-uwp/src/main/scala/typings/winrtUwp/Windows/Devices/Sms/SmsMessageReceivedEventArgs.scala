package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for ISmsBinaryMessage event handlers. */
@js.native
trait SmsMessageReceivedEventArgs extends StObject {
  
  /** Retrieves an object that holds the binary representation of the message. This is of interest only to clients who want to pass binary messages on directly or do their own interpretation of the binary message contents. */
  var binaryMessage: SmsBinaryMessage = js.native
  
  /** Retrieves an object that holds the text representation of the message. If the message is not successfully decoded, an error is returned. */
  var textMessage: SmsTextMessage = js.native
}
object SmsMessageReceivedEventArgs {
  
  @scala.inline
  def apply(binaryMessage: SmsBinaryMessage, textMessage: SmsTextMessage): SmsMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(binaryMessage = binaryMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class SmsMessageReceivedEventArgsMutableBuilder[Self <: SmsMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryMessage(value: SmsBinaryMessage): Self = StObject.set(x, "binaryMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMessage(value: SmsTextMessage): Self = StObject.set(x, "textMessage", value.asInstanceOf[js.Any])
  }
}
