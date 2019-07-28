package typings.winrt.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageType extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsMessageType")
@js.native
object SmsMessageType extends js.Object {
  @js.native
  sealed trait binary extends SmsMessageType
  
  @js.native
  sealed trait text extends SmsMessageType
  
  /* 0 */ val binary: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsMessageType.binary with Double = js.native
  /* 1 */ val text: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsMessageType.text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageType with Double] = js.native
}

