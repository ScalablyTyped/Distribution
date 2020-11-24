package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
