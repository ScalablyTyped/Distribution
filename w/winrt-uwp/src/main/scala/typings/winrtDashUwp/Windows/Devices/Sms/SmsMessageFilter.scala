package typings.winrtDashUwp.Windows.Devices.Sms

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
  sealed trait all extends SmsMessageFilter
  
  /** All unsent and saved messages. */
  @js.native
  sealed trait draft extends SmsMessageFilter
  
  /** All read received messages. */
  @js.native
  sealed trait read extends SmsMessageFilter
  
  /** All sent and saved messages. */
  @js.native
  sealed trait sent extends SmsMessageFilter
  
  /** All unread received messages. */
  @js.native
  sealed trait unread extends SmsMessageFilter
  
  /* 0 */ val all: typings.winrtDashUwp.Windows.Devices.Sms.SmsMessageFilter.all with Double = js.native
  /* 4 */ val draft: typings.winrtDashUwp.Windows.Devices.Sms.SmsMessageFilter.draft with Double = js.native
  /* 2 */ val read: typings.winrtDashUwp.Windows.Devices.Sms.SmsMessageFilter.read with Double = js.native
  /* 3 */ val sent: typings.winrtDashUwp.Windows.Devices.Sms.SmsMessageFilter.sent with Double = js.native
  /* 1 */ val unread: typings.winrtDashUwp.Windows.Devices.Sms.SmsMessageFilter.unread with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageFilter with Double] = js.native
}

