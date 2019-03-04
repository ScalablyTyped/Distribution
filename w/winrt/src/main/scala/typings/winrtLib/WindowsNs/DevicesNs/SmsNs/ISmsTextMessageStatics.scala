package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsTextMessageStatics extends js.Object {
  def fromBinaryData(format: SmsDataFormat, value: stdLib.Uint8Array): SmsTextMessage
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage
}

object ISmsTextMessageStatics {
  @scala.inline
  def apply(
    fromBinaryData: js.Function2[SmsDataFormat, stdLib.Uint8Array, SmsTextMessage],
    fromBinaryMessage: js.Function1[SmsBinaryMessage, SmsTextMessage]
  ): ISmsTextMessageStatics = {
    val __obj = js.Dynamic.literal(fromBinaryData = fromBinaryData, fromBinaryMessage = fromBinaryMessage)
  
    __obj.asInstanceOf[ISmsTextMessageStatics]
  }
}

