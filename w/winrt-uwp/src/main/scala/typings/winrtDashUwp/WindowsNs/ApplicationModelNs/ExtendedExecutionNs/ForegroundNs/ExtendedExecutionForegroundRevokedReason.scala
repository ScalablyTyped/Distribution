package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs

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
  sealed trait resumed extends ExtendedExecutionForegroundRevokedReason
  
  /** Extended execution is revoked due to system resources. */
  @js.native
  sealed trait systemPolicy extends ExtendedExecutionForegroundRevokedReason
  
  /* 0 */ val resumed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundRevokedReason.resumed with Double = js.native
  /* 1 */ val systemPolicy: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundRevokedReason.systemPolicy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionForegroundRevokedReason with Double] = js.native
}

