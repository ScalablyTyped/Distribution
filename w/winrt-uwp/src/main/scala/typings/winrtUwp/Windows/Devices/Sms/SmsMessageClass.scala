package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageClass with Double] = js.native
  /* 1 */ @js.native
  object class0 extends TopLevel[class0 with Double]
  
  /* 2 */ @js.native
  object class1 extends TopLevel[class1 with Double]
  
  /* 3 */ @js.native
  object class2 extends TopLevel[class2 with Double]
  
  /* 4 */ @js.native
  object class3 extends TopLevel[class3 with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

