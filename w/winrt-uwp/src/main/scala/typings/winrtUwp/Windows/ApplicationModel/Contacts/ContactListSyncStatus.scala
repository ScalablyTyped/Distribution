package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactListSyncStatus with Double] = js.native
  /* 3 */ @js.native
  object authenticationError extends TopLevel[authenticationError with Double]
  
  /* 0 */ @js.native
  object idle extends TopLevel[idle with Double]
  
  /* 6 */ @js.native
  object manualAccountRemovalRequired extends TopLevel[manualAccountRemovalRequired with Double]
  
  /* 4 */ @js.native
  object policyError extends TopLevel[policyError with Double]
  
  /* 1 */ @js.native
  object syncing extends TopLevel[syncing with Double]
  
  /* 5 */ @js.native
  object unknownError extends TopLevel[unknownError with Double]
  
  /* 2 */ @js.native
  object upToDate extends TopLevel[upToDate with Double]
  
}

