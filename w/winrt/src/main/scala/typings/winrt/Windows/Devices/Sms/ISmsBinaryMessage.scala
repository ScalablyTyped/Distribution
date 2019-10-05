package typings.winrt.Windows.Devices.Sms

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsBinaryMessage extends ISmsMessage {
  var format: SmsDataFormat
  def getData(): Uint8Array
  def setData(value: Uint8Array): Unit
}

object ISmsBinaryMessage {
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: () => Uint8Array,
    id: Double,
    messageClass: SmsMessageClass,
    setData: Uint8Array => Unit
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format, getData = js.Any.fromFunction0(getData), id = id, messageClass = messageClass, setData = js.Any.fromFunction1(setData))
  
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
}

