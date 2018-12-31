package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxSyncManager")
@js.native
abstract class EmailMailboxSyncManager () extends js.Object {
  /** Gets the last time the mailbox attempted to sync. */
  var lastAttemptedSyncTime: stdLib.Date = js.native
  /** Gets the last time the mailbox was successfully synced. */
  var lastSuccessfulSyncTime: stdLib.Date = js.native
  /** Fires whenever a mailbox's sync status changes. */
  @JSName("onsyncstatuschanged")
  var onsyncstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EmailMailboxSyncManager, _] = js.native
  /** Gets the sync state of the mailbox. */
  var status: EmailMailboxSyncStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_syncstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.syncstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EmailMailboxSyncManager, _]
  ): scala.Unit = js.native
  /** Fires whenever a mailbox's sync status changes. */
  def onsyncstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[EmailMailboxSyncManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_syncstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.syncstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EmailMailboxSyncManager, _]
  ): scala.Unit = js.native
  /**
    * Initiates a sync of this mailbox.
    * @return A Boolean value indicating success.
    */
  def syncAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

