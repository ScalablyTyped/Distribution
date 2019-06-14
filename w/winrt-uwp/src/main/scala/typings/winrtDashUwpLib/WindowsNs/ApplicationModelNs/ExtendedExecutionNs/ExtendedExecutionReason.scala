package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtendedExecutionReason extends js.Object

/** Describes the reason for the background execution request. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason")
@js.native
object ExtendedExecutionReason extends js.Object {
  /** To support location tracking. */
  @js.native
  sealed trait locationTracking
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionReason
  
  /** To save data. */
  @js.native
  sealed trait savingData
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionReason
  
  /** No reason specified. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionReason
  
  /* 1 */ val locationTracking: locationTracking with scala.Double = js.native
  /* 2 */ val savingData: savingData with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ExtendedExecutionReason with scala.Double
  ] = js.native
}

