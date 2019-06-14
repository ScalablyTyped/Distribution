package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtendedExecutionForegroundRevokedReason extends js.Object

/** Describes the reason extended execution was revoked. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedReason")
@js.native
object ExtendedExecutionForegroundRevokedReason extends js.Object {
  /** The app was resumed during its extended execution. */
  @js.native
  sealed trait resumed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundRevokedReason
  
  /** Extended execution is revoked due to system resources. */
  @js.native
  sealed trait systemPolicy
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundRevokedReason
  
  /* 0 */ val resumed: resumed with scala.Double = js.native
  /* 1 */ val systemPolicy: systemPolicy with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundRevokedReason with scala.Double
  ] = js.native
}

