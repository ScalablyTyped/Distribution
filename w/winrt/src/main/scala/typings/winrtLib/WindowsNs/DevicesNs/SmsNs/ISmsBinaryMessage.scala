package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsBinaryMessage extends ISmsMessage {
  var format: SmsDataFormat
  def getData(): stdLib.Uint8Array
  def setData(value: stdLib.Uint8Array): scala.Unit
}

object ISmsBinaryMessage {
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: js.Function0[stdLib.Uint8Array],
    id: scala.Double,
    messageClass: SmsMessageClass,
    setData: js.Function1[stdLib.Uint8Array, scala.Unit]
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("messageClass")(messageClass)
    __obj.updateDynamic("setData")(setData)
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
}

