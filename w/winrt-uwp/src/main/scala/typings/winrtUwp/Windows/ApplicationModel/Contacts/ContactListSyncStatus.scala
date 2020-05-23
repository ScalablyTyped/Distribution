package typings.winrtUwp.Windows.ApplicationModel.Contacts

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
  sealed trait authenticationError extends ContactListSyncStatus
  
  /** Idle. */
  @js.native
  sealed trait idle extends ContactListSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired extends ContactListSyncStatus
  
  /** There was a policy error. */
  @js.native
  sealed trait policyError extends ContactListSyncStatus
  
  /** Currently syncing. */
  @js.native
  sealed trait syncing extends ContactListSyncStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError extends ContactListSyncStatus
  
  /** The contact list is up-to-date. */
  @js.native
  sealed trait upToDate extends ContactListSyncStatus
  
}

