package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtendedExecutionResult extends js.Object

/** Specifies the possible background execution request result values. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult")
@js.native
object ExtendedExecutionResult extends js.Object {
  /** App execution is allowed. */
  @js.native
  sealed trait allowed extends ExtendedExecutionResult
  
  /** App execution is denied. */
  @js.native
  sealed trait denied extends ExtendedExecutionResult
  
  /* 0 */ val allowed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionResult.allowed with Double = js.native
  /* 1 */ val denied: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionResult.denied with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionResult with Double] = js.native
}

