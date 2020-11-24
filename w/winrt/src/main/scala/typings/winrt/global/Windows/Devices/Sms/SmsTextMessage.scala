package typings.winrt.global.Windows.Devices.Sms

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
class SmsTextMessage ()
  extends typings.winrt.Windows.Devices.Sms.SmsTextMessage
/* static members */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
object SmsTextMessage extends js.Object {
  
  def fromBinaryData(format: typings.winrt.Windows.Devices.Sms.SmsDataFormat, value: Uint8Array): typings.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
  
  def fromBinaryMessage(binaryMessage: typings.winrt.Windows.Devices.Sms.SmsBinaryMessage): typings.winrt.Windows.Devices.Sms.SmsTextMessage = js.native
}
