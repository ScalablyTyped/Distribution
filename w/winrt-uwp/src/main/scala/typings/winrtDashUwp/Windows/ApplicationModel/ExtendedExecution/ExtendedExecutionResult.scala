package typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult.allowed
import typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult.denied
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionResult with Double] = js.native
  /* 0 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 1 */ @js.native
  object denied extends TopLevel[denied with Double]
  
}

