package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtendedExecutionReason with Double] = js.native
  /* 1 */ @js.native
  object locationTracking extends TopLevel[locationTracking with Double]
  
  /* 2 */ @js.native
  object savingData extends TopLevel[savingData with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

