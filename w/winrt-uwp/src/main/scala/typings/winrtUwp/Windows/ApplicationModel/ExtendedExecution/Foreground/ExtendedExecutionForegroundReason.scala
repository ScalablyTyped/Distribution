package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution.Foreground

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtendedExecutionForegroundReason extends js.Object
/** Describes the reason for the extended execution request. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundReason")
@js.native
object ExtendedExecutionForegroundReason extends js.Object {
  
  /** To play audio. */
  @js.native
  sealed trait backgroundAudio extends ExtendedExecutionForegroundReason
  
  /** To save data. */
  @js.native
  sealed trait savingData extends ExtendedExecutionForegroundReason
  
  /** To perform any task that requires extended execution time. */
  @js.native
  sealed trait unconstrained extends ExtendedExecutionForegroundReason
  
  /** No reason specified. */
  @js.native
  sealed trait unspecified extends ExtendedExecutionForegroundReason
}
