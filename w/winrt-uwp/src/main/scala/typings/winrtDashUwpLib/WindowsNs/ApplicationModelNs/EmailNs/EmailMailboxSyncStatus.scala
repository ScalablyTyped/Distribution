package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait authenticationError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus
  
  /** The mailbox is idle. */
  @js.native
  sealed trait idle
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus
  
  /** The mailbox has encountered a policy error and cannot sync. */
  @js.native
  sealed trait policyError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus
  
  /** The mailbox is currently syncing. */
  @js.native
  sealed trait syncing
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus
  
  /** The mailbox has encountered an unknown error and cannot sync. */
  @js.native
  sealed trait unknownError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus
  
  /** The mailbox is up to date. */
  @js.native
  sealed trait upToDate
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus
  
  val authenticationError: authenticationError with java.lang.String = js.native
  val idle: idle with java.lang.String = js.native
  val manualAccountRemovalRequired: manualAccountRemovalRequired with java.lang.String = js.native
  val policyError: policyError with java.lang.String = js.native
  val syncing: syncing with java.lang.String = js.native
  val unknownError: unknownError with java.lang.String = js.native
  val upToDate: upToDate with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSyncStatus with java.lang.String
  ] = js.native
}

