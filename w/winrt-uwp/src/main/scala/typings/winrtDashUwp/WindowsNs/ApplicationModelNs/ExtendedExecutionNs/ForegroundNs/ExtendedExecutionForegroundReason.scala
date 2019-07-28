package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val backgroundAudio: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason.backgroundAudio with Double = js.native
  /* 1 */ val savingData: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason.savingData with Double = js.native
  /* 3 */ val unconstrained: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason.unconstrained with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionForegroundReason with Double] = js.native
}

