package typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution

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
  sealed trait resumed extends ExtendedExecutionRevokedReason
  
  /** Background execution is revoked due to system resources. */
  @js.native
  sealed trait systemPolicy extends ExtendedExecutionRevokedReason
  
  /* 0 */ val resumed: typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason.resumed with Double = js.native
  /* 1 */ val systemPolicy: typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedReason.systemPolicy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionRevokedReason with Double] = js.native
}

