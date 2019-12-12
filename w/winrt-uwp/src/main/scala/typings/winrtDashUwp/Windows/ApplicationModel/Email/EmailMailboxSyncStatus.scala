package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.authenticationError
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.idle
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.manualAccountRemovalRequired
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.policyError
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.syncing
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.unknownError
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.upToDate
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxSyncStatus with Double] = js.native
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

