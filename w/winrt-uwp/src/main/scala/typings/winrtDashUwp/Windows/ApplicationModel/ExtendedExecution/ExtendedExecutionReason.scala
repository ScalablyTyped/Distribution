package typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution

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
  sealed trait locationTracking extends ExtendedExecutionReason
  
  /** To save data. */
  @js.native
  sealed trait savingData extends ExtendedExecutionReason
  
  /** No reason specified. */
  @js.native
  sealed trait unspecified extends ExtendedExecutionReason
  
  /* 1 */ val locationTracking: typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.locationTracking with Double = js.native
  /* 2 */ val savingData: typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.savingData with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionReason.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionReason with Double] = js.native
}

