package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsTextMessageStatics extends js.Object {
  def fromBinaryData(format: SmsDataFormat, value: Uint8Array): SmsTextMessage
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage
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
}

