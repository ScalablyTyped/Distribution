package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtendedExecutionRevokedReason extends js.Object

/** Describes the reason background execution was revoked. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason")
@js.native
object ExtendedExecutionRevokedReason extends js.Object {
  /** The app was resumed while it was executing in the background. */
  @js.native
  sealed trait resumed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionRevokedReason
  
  /** Background execution is revoked due to system resources. */
  @js.native
  sealed trait systemPolicy
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionRevokedReason
  
  /* 0 */ val resumed: resumed with scala.Double = js.native
  /* 1 */ val systemPolicy: systemPolicy with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionRevokedReason with scala.Double
  ] = js.native
}

