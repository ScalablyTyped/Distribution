package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.syncstatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@js.native
trait EmailMailboxSyncManager extends js.Object {
  /** Gets the last time the mailbox attempted to sync. */
  var lastAttemptedSyncTime: Date = js.native
  /** Gets the last time the mailbox was successfully synced. */
  var lastSuccessfulSyncTime: Date = js.native
  /** Fires whenever a mailbox's sync status changes. */
  @JSName("onsyncstatuschanged")
  var onsyncstatuschanged_Original: TypedEventHandler[EmailMailboxSyncManager, _] = js.native
  /** Gets the sync state of the mailbox. */
  var status: EmailMailboxSyncStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[EmailMailboxSyncManager, _]): Unit = js.native
  /** Fires whenever a mailbox's sync status changes. */
  def onsyncstatuschanged(ev: js.Any with WinRTEvent[EmailMailboxSyncManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[EmailMailboxSyncManager, _]): Unit = js.native
  /**
    * Initiates a sync of this mailbox.
    * @return A Boolean value indicating success.
    */
  def syncAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}

