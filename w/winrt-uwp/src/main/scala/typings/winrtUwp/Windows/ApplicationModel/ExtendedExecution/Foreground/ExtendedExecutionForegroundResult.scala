package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtendedExecutionForegroundResult extends js.Object

/** Specifies the possible extended execution request result values. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult")
@js.native
object ExtendedExecutionForegroundResult extends js.Object {
  /** Extended execution is allowed. */
  @js.native
  sealed trait allowed extends ExtendedExecutionForegroundResult
  
  /** App execution is not allowed. */
  @js.native
  sealed trait denied extends ExtendedExecutionForegroundResult
  
}

