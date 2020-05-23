package typings.winrtUwp.Windows.Devices.Sms

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
  
}

