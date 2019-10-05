package typings.winrtDashUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IOControlBufferingMethod extends js.Object

/** Identifies the buffering method. */
@JSGlobal("Windows.Devices.Custom.IOControlBufferingMethod")
@js.native
object IOControlBufferingMethod extends js.Object {
  /** Buffered. */
  @js.native
  sealed trait buffered extends IOControlBufferingMethod
  
  /** Direct input. */
  @js.native
  sealed trait directInput extends IOControlBufferingMethod
  
  /** Direct output. */
  @js.native
  sealed trait directOutput extends IOControlBufferingMethod
  
  /** Neither. */
  @js.native
  sealed trait neither extends IOControlBufferingMethod
  
  /* 0 */ val buffered: typings.winrtDashUwp.Windows.Devices.Custom.IOControlBufferingMethod.buffered with Double = js.native
  /* 1 */ val directInput: typings.winrtDashUwp.Windows.Devices.Custom.IOControlBufferingMethod.directInput with Double = js.native
  /* 2 */ val directOutput: typings.winrtDashUwp.Windows.Devices.Custom.IOControlBufferingMethod.directOutput with Double = js.native
  /* 3 */ val neither: typings.winrtDashUwp.Windows.Devices.Custom.IOControlBufferingMethod.neither with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IOControlBufferingMethod with Double] = js.native
}

