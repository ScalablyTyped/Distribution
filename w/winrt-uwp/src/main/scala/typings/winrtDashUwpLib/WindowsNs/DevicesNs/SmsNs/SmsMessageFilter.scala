package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageFilter extends js.Object

/** This enumerated type specifies which messages in the device message store an operation is performed on. */
@JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
@js.native
object SmsMessageFilter extends js.Object {
  /** All messages in the device message store. */
  @js.native
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  /** All unsent and saved messages. */
  @js.native
  sealed trait draft
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  /** All read received messages. */
  @js.native
  sealed trait read
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  /** All sent and saved messages. */
  @js.native
  sealed trait sent
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  /** All unread received messages. */
  @js.native
  sealed trait unread
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 4 */ val draft: draft with scala.Double = js.native
  /* 2 */ val read: read with scala.Double = js.native
  /* 3 */ val sent: sent with scala.Double = js.native
  /* 1 */ val unread: unread with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter with scala.Double] = js.native
}

