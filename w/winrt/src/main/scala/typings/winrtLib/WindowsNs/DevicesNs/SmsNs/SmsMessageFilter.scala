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
  
  val all: all with java.lang.String = js.native
  val draft: draft with java.lang.String = js.native
  val read: read with java.lang.String = js.native
  val sent: sent with java.lang.String = js.native
  val unread: unread with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsMessageFilter with java.lang.String] = js.native
}

