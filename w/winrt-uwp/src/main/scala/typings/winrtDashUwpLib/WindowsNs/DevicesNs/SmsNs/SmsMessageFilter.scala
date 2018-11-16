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
  
  val all: all with java.lang.String = js.native
  val draft: draft with java.lang.String = js.native
  val read: read with java.lang.String = js.native
  val sent: sent with java.lang.String = js.native
  val unread: unread with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter with java.lang.String] = js.native
}

