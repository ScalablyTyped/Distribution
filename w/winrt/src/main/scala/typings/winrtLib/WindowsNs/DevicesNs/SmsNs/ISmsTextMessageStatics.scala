package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsTextMessageStatics extends js.Object {
  def fromBinaryData(format: SmsDataFormat, value: stdLib.Uint8Array): SmsTextMessage
  def fromBinaryMessage(binaryMessage: SmsBinaryMessage): SmsTextMessage
}

