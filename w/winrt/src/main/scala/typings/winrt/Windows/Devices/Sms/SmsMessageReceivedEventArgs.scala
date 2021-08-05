package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsMessageReceivedEventArgs
  extends StObject
     with ISmsMessageReceivedEventArgs
object SmsMessageReceivedEventArgs {
  
  inline def apply(binaryMessage: SmsBinaryMessage, textMessage: SmsTextMessage): SmsMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(binaryMessage = binaryMessage.asInstanceOf[js.Any], textMessage = textMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsMessageReceivedEventArgs]
  }
}
