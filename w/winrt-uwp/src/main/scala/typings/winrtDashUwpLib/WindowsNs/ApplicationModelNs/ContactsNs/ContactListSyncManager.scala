package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for syncing contact information with the server. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListSyncManager")
@js.native
abstract class ContactListSyncManager () extends js.Object {
  /** Gets the last time a sync was attempted with the server. */
  var lastAttemptedSyncTime: stdLib.Date = js.native
  /** Gets the last time the ContactList was successfully synced with the server. */
  var lastSuccessfulSyncTime: stdLib.Date = js.native
  /** Occurs when the sync status with the server has changed. */
  @JSName("onsyncstatuschanged")
  var onsyncstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactListSyncManager, _] = js.native
  /** Gets the ContactListSyncStatus . */
  var status: ContactListSyncStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_syncstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.syncstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactListSyncManager, _]
  ): scala.Unit = js.native
  /** Occurs when the sync status with the server has changed. */
  def onsyncstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[ContactListSyncManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_syncstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.syncstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ContactListSyncManager, _]
  ): scala.Unit = js.native
  /**
                   * Asynchronously attempts to sync with the contacts server.
                   * @return A Boolean value indicating if the sync was successful.
                   */
  def syncAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

