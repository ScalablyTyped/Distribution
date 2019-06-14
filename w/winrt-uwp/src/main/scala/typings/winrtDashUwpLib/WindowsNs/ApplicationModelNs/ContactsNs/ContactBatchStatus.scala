package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait serverSearchSyncManagerError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactBatchStatus
  
  /** There was an unknown error. */
  @js.native
  sealed trait serverSearchUnknownError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactBatchStatus
  
  /** Success */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactBatchStatus
  
  /* 1 */ val serverSearchSyncManagerError: serverSearchSyncManagerError with scala.Double = js.native
  /* 2 */ val serverSearchUnknownError: serverSearchUnknownError with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactBatchStatus with scala.Double
  ] = js.native
}

