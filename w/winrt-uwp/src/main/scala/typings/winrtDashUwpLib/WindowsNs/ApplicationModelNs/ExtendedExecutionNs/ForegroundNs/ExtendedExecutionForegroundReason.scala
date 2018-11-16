package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs

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
  sealed trait backgroundAudio
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason
  
  /** To save data. */
  @js.native
  sealed trait savingData
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason
  
  /** To perform any task that requires extended execution time. */
  @js.native
  sealed trait unconstrained
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason
  
  /** No reason specified. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason
  
  val backgroundAudio: backgroundAudio with java.lang.String = js.native
  val savingData: savingData with java.lang.String = js.native
  val unconstrained: unconstrained with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs.ExtendedExecutionForegroundReason with java.lang.String
  ] = js.native
}

