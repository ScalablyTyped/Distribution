package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxSyncStatus extends js.Object

/** Defines the sync status of the mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxSyncStatus")
@js.native
object EmailMailboxSyncStatus extends js.Object {
  /** The mailbox has encountered an authentication error and cannot sync. */
  @js.native
  sealed trait authenticationError extends EmailMailboxSyncStatus
  
  /** The mailbox is idle. */
  @js.native
  sealed trait idle extends EmailMailboxSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired extends EmailMailboxSyncStatus
  
  /** The mailbox has encountered a policy error and cannot sync. */
  @js.native
  sealed trait policyError extends EmailMailboxSyncStatus
  
  /** The mailbox is currently syncing. */
  @js.native
  sealed trait syncing extends EmailMailboxSyncStatus
  
  /** The mailbox has encountered an unknown error and cannot sync. */
  @js.native
  sealed trait unknownError extends EmailMailboxSyncStatus
  
  /** The mailbox is up to date. */
  @js.native
  sealed trait upToDate extends EmailMailboxSyncStatus
  
  /* 3 */ val authenticationError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus.authenticationError with Double = js.native
  /* 0 */ val idle: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus.idle with Double = js.native
  /* 6 */ val manualAccountRemovalRequired: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus.manualAccountRemovalRequired with Double = js.native
  /* 4 */ val policyError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus.policyError with Double = js.native
  /* 1 */ val syncing: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus.syncing with Double = js.native
  /* 5 */ val unknownError: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus.unknownError with Double = js.native
  /* 2 */ val upToDate: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus.upToDate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxSyncStatus with Double] = js.native
}

