package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs

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
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundResult
  
  /** App execution is not allowed. */
  @js.native
  sealed trait denied
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundResult
  
  val allowed: allowed with java.lang.String = js.native
  val denied: denied with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundResult with java.lang.String
  ] = js.native
}

