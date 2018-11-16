package typings
package winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to interact with the file picker if your app provides file updates through the Cached File Updater contract. */
@JSGlobal("Windows.Storage.Provider.CachedFileUpdaterUI")
@js.native
abstract class CachedFileUpdaterUI () extends js.Object {
  /** Fires when the Windows requests a file update. This event fires once for each requested update. */
  @JSName("onfileupdaterequested")
  var onfileupdaterequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CachedFileUpdaterUI, FileUpdateRequestedEventArgs] = js.native
  /** Fires when the calling app needs to display the file picker letterbox UI that is represented by the CachedFileUpdaterUI object. */
  @JSName("onuirequested")
  var onuirequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CachedFileUpdaterUI, _] = js.native
  /** Gets or sets the title to display in the top-left the file picker UI. The title identifies the location or context of the app's page (which is hosted in the file picker UI) for the user. */
  var title: java.lang.String = js.native
  /** Gets an enum value that indicates the status of the file picker UI. */
  var uiStatus: UIStatus = js.native
  /** Gets the file update request currently being processed by the cached file updater. */
  var updateRequest: FileUpdateRequest = js.native
  /** Gets a value that indicates which version of the file needs to be updated: the local version or the version in the app's repository. */
  var updateTarget: CachedFileTarget = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fileupdaterequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.fileupdaterequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CachedFileUpdaterUI, FileUpdateRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_uirequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.uirequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CachedFileUpdaterUI, _]
  ): scala.Unit = js.native
  /**
                   * Gets an object used to complete a file update request asynchronously.
                   * @return The object that the app uses to indicate, asynchronously, that it has finished responding to a FileUpdateRequested event and that the Request is complete.
                   */
  def getDeferral(): FileUpdateRequestDeferral = js.native
  /** Fires when the Windows requests a file update. This event fires once for each requested update. */
  def onfileupdaterequested(ev: FileUpdateRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CachedFileUpdaterUI]): scala.Unit = js.native
  /** Fires when the calling app needs to display the file picker letterbox UI that is represented by the CachedFileUpdaterUI object. */
  def onuirequested(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[CachedFileUpdaterUI]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fileupdaterequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.fileupdaterequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CachedFileUpdaterUI, FileUpdateRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_uirequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.uirequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CachedFileUpdaterUI, _]
  ): scala.Unit = js.native
}

