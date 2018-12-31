package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsDevice extends js.Object {
  var accountPhoneNumber: java.lang.String
  var cellularClass: CellularClass
  var deviceStatus: SmsDeviceStatus
  var messageStore: SmsDeviceMessageStore
  var onsmsdevicestatuschanged: js.Any
  var onsmsmessagereceived: js.Any
  def calculateLength(message: SmsTextMessage): SmsEncodedLength
  def sendMessageAsync(message: ISmsMessage): SendSmsMessageOperation
}

