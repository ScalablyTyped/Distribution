package typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs

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
  sealed trait class0 extends SmsMessageClass
  
  /** Mobile equipment (ME) specific message. */
  @js.native
  sealed trait class1 extends SmsMessageClass
  
  /** SIM specific message. */
  @js.native
  sealed trait class2 extends SmsMessageClass
  
  /** Terminal equipment (TE) specific message. Note that this message type is not currently supported. */
  @js.native
  sealed trait class3 extends SmsMessageClass
  
  /** No class was specified. */
  @js.native
  sealed trait none extends SmsMessageClass
  
  /* 1 */ val class0: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageClass.class0 with Double = js.native
  /* 2 */ val class1: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageClass.class1 with Double = js.native
  /* 3 */ val class2: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageClass.class2 with Double = js.native
  /* 4 */ val class3: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageClass.class3 with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs.SmsMessageClass.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageClass with Double] = js.native
}

