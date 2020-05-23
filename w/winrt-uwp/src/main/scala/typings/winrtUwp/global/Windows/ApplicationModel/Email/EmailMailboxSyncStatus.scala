package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the sync status of the mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxSyncStatus")
@js.native
object EmailMailboxSyncStatus extends js.Object {
  /* 3 */ val authenticationError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.authenticationError with Double = js.native
  /* 0 */ val idle: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.idle with Double = js.native
  /* 6 */ val manualAccountRemovalRequired: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.manualAccountRemovalRequired with Double = js.native
  /* 4 */ val policyError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.policyError with Double = js.native
  /* 1 */ val syncing: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.syncing with Double = js.native
  /* 5 */ val unknownError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.unknownError with Double = js.native
  /* 2 */ val upToDate: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.upToDate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus with Double
  ] = js.native
}

