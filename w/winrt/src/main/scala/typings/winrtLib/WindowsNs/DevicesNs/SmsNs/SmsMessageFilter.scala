package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageFilter extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
@js.native
object SmsMessageFilter extends js.Object {
  @js.native
  sealed trait all
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  @js.native
  sealed trait draft
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  @js.native
  sealed trait read
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  @js.native
  sealed trait sent
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  @js.native
  sealed trait unread
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 4 */ val draft: draft with scala.Double = js.native
  /* 2 */ val read: read with scala.Double = js.native
  /* 3 */ val sent: sent with scala.Double = js.native
  /* 1 */ val unread: unread with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter with scala.Double] = js.native
}

