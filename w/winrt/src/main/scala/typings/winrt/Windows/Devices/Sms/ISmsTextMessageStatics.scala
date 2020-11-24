package typings.winrt.Windows.Devices.Sms

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmsTextMessageStatics extends js.Object {
  
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
  implicit class ISmsTextMessageStaticsOps[Self <: ISmsTextMessageStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromBinaryData(value: (SmsDataFormat, Uint8Array) => SmsTextMessage): Self = this.set("fromBinaryData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFromBinaryMessage(value: SmsBinaryMessage => SmsTextMessage): Self = this.set("fromBinaryMessage", js.Any.fromFunction1(value))
  }
}
