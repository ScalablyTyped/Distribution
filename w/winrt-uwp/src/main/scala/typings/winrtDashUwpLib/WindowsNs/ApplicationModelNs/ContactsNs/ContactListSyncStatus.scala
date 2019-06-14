package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactListSyncStatus extends js.Object

/** Defines the ContactList sync status. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListSyncStatus")
@js.native
object ContactListSyncStatus extends js.Object {
  /** There was an authentication error. */
  @js.native
  sealed trait authenticationError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListSyncStatus
  
  /** Idle. */
  @js.native
  sealed trait idle
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListSyncStatus
  
  /** There was a policy error. */
  @js.native
  sealed trait policyError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListSyncStatus
  
  /** Currently syncing. */
  @js.native
  sealed trait syncing
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListSyncStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListSyncStatus
  
  /** The contact list is up-to-date. */
  @js.native
  sealed trait upToDate
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListSyncStatus
  
  /* 3 */ val authenticationError: authenticationError with scala.Double = js.native
  /* 0 */ val idle: idle with scala.Double = js.native
  /* 6 */ val manualAccountRemovalRequired: manualAccountRemovalRequired with scala.Double = js.native
  /* 4 */ val policyError: policyError with scala.Double = js.native
  /* 1 */ val syncing: syncing with scala.Double = js.native
  /* 5 */ val unknownError: unknownError with scala.Double = js.native
  /* 2 */ val upToDate: upToDate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListSyncStatus with scala.Double
  ] = js.native
}

