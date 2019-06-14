package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageType extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsMessageType")
@js.native
object SmsMessageType extends js.Object {
  @js.native
  sealed trait binary
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  @js.native
  sealed trait text
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType
  
  /* 0 */ val binary: binary with scala.Double = js.native
  /* 1 */ val text: text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType with scala.Double] = js.native
}

