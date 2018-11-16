package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs

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
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionResult
  
  /** App execution is denied. */
  @js.native
  sealed trait denied
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionResult
  
  val allowed: allowed with java.lang.String = js.native
  val denied: denied with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionResult with java.lang.String
  ] = js.native
}

