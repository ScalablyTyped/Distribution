package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailBatchStatus.serverSearchSyncManagerError
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailBatchStatus.serverSearchUnknownError
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailBatchStatus.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailBatchStatus extends js.Object

/** Defines the states of an email batch operation. */
@JSGlobal("Windows.ApplicationModel.Email.EmailBatchStatus")
@js.native
object EmailBatchStatus extends js.Object {
  /** The batch operation has failed due to a sync manager error. */
  @js.native
  sealed trait serverSearchSyncManagerError extends EmailBatchStatus
  
  /** The batch operation has failed due to an unknown error. */
  @js.native
  sealed trait serverSearchUnknownError extends EmailBatchStatus
  
  /** The batch operation has completed successfully. */
  @js.native
  sealed trait success extends EmailBatchStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailBatchStatus with Double] = js.native
  /* 1 */ @js.native
  object serverSearchSyncManagerError extends TopLevel[serverSearchSyncManagerError with Double]
  
  /* 2 */ @js.native
  object serverSearchUnknownError extends TopLevel[serverSearchUnknownError with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
}

