package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
