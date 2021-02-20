package typings.winrt.Windows.Devices.Sms

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsTextMessageStatics extends StObject {
  
  def fromBinaryData(format: SmsDataFormat, value: Uint8Array): SmsTextMessage = js.native
  
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage = js.native
}
object ISmsTextMessageStatics {
  
  @scala.inline
  def apply(
    fromBinaryData: (SmsDataFormat, Uint8Array) => SmsTextMessage,
    fromBinaryMessage: SmsBinaryMessage => SmsTextMessage
  ): ISmsTextMessageStatics = {
    val __obj = js.Dynamic.literal(fromBinaryData = js.Any.fromFunction2(fromBinaryData), fromBinaryMessage = js.Any.fromFunction1(fromBinaryMessage))
    __obj.asInstanceOf[ISmsTextMessageStatics]
  }
  
  @scala.inline
  implicit class ISmsTextMessageStaticsMutableBuilder[Self <: ISmsTextMessageStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromBinaryData(value: (SmsDataFormat, Uint8Array) => SmsTextMessage): Self = StObject.set(x, "fromBinaryData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFromBinaryMessage(value: SmsBinaryMessage => SmsTextMessage): Self = StObject.set(x, "fromBinaryMessage", js.Any.fromFunction1(value))
  }
}
