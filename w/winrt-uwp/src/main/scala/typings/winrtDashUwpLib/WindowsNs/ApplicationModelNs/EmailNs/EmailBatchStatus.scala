package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait serverSearchSyncManagerError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailBatchStatus
  
  /** The batch operation has failed due to an unknown error. */
  @js.native
  sealed trait serverSearchUnknownError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailBatchStatus
  
  /** The batch operation has completed successfully. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailBatchStatus
  
  /* 1 */ val serverSearchSyncManagerError: serverSearchSyncManagerError with scala.Double = js.native
  /* 2 */ val serverSearchUnknownError: serverSearchUnknownError with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailBatchStatus with scala.Double
  ] = js.native
}

