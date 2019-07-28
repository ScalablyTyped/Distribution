package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactBatchStatus extends js.Object

/** Specifies if the last batch access operation was successful or if there was a server error. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactBatchStatus")
@js.native
object ContactBatchStatus extends js.Object {
  /** There was a server error. */
  @js.native
  sealed trait serverSearchSyncManagerError extends ContactBatchStatus
  
  /** There was an unknown error. */
  @js.native
  sealed trait serverSearchUnknownError extends ContactBatchStatus
  
  /** Success */
  @js.native
  sealed trait success extends ContactBatchStatus
  
  /* 1 */ val serverSearchSyncManagerError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactBatchStatus.serverSearchSyncManagerError with Double = js.native
  /* 2 */ val serverSearchUnknownError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactBatchStatus.serverSearchUnknownError with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactBatchStatus.success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactBatchStatus with Double] = js.native
}

