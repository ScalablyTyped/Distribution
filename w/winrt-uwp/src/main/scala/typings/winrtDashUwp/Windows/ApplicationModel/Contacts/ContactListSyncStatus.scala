package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

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
  
  /* 3 */ val authenticationError: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.authenticationError with Double = js.native
  /* 0 */ val idle: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.idle with Double = js.native
  /* 6 */ val manualAccountRemovalRequired: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.manualAccountRemovalRequired with Double = js.native
  /* 4 */ val policyError: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.policyError with Double = js.native
  /* 1 */ val syncing: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.syncing with Double = js.native
  /* 5 */ val unknownError: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.unknownError with Double = js.native
  /* 2 */ val upToDate: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.upToDate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactListSyncStatus with Double] = js.native
}

