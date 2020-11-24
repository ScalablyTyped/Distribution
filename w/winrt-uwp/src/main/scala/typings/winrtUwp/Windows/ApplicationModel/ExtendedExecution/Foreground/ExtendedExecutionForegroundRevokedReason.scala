package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
