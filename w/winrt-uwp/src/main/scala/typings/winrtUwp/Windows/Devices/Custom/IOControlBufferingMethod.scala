package typings.winrtUwp.Windows.Devices.Custom

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
  
}

