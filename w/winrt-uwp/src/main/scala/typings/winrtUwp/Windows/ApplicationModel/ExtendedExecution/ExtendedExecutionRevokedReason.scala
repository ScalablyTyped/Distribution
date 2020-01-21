package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionRevokedReason with Double] = js.native
  /* 0 */ @js.native
  object resumed extends TopLevel[resumed with Double]
  
  /* 1 */ @js.native
  object systemPolicy extends TopLevel[systemPolicy with Double]
  
}

