package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageClass extends js.Object

/** This enumerated type specifies the message class of a message. The message class typically originates on the network, not the mobile device. */
@JSGlobal("Windows.Devices.Sms.SmsMessageClass")
@js.native
object SmsMessageClass extends js.Object {
  /** Message should be immediately displayed. */
  @js.native
  sealed trait class0
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageClass
  
  /** Mobile equipment (ME) specific message. */
  @js.native
  sealed trait class1
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageClass
  
  /** SIM specific message. */
  @js.native
  sealed trait class2
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageClass
  
  /** Terminal equipment (TE) specific message. Note that this message type is not currently supported. */
  @js.native
  sealed trait class3
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageClass
  
  /** No class was specified. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageClass
  
  val class0: class0 with java.lang.String = js.native
  val class1: class1 with java.lang.String = js.native
  val class2: class2 with java.lang.String = js.native
  val class3: class3 with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsMessageClass with java.lang.String] = js.native
}

