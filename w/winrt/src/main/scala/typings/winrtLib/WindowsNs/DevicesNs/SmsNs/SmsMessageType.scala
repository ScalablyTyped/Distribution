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
  
  val binary: binary with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageType with java.lang.String] = js.native
}

