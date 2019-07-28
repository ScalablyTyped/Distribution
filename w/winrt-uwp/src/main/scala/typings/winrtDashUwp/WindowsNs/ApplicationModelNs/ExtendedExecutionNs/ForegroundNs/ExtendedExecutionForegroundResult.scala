package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs

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
  
  /* 0 */ val allowed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundResult.allowed with Double = js.native
  /* 1 */ val denied: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundResult.denied with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionForegroundResult with Double] = js.native
}

