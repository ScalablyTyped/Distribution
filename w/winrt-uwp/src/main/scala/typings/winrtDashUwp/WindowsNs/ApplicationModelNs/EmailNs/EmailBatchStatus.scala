package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  
  /* 1 */ val serverSearchSyncManagerError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailBatchStatus.serverSearchSyncManagerError with Double = js.native
  /* 2 */ val serverSearchUnknownError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailBatchStatus.serverSearchUnknownError with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailBatchStatus.success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailBatchStatus with Double] = js.native
}

