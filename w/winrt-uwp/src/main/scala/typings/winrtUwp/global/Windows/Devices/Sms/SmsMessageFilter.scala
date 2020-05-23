package typings.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumerated type specifies which messages in the device message store an operation is performed on. */
@JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
@js.native
object SmsMessageFilter extends js.Object {
  /* 0 */ val all: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.all with Double = js.native
  /* 4 */ val draft: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.draft with Double = js.native
  /* 2 */ val read: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.read with Double = js.native
  /* 3 */ val sent: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.sent with Double = js.native
  /* 1 */ val unread: typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter.unread with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsMessageFilter with Double] = js.native
}

