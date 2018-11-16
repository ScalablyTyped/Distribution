package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to interact with the file picker when your app provides a save location with the File Save Picker contract. */
@JSGlobal("Windows.Storage.Pickers.Provider.FileSavePickerUI")
@js.native
abstract class FileSavePickerUI () extends js.Object {
  /** Gets a list of file types (extensions) that can be saved to the app that is providing the save location. */
  var allowedFileTypes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the full file name of the file to save, including the file type extension. The file name and extension are specified by the user. */
  var fileName: java.lang.String = js.native
  /** Fired when the user changes the file name in the file name text box or changes the extension in the file type drop-down menu. */
  @JSName("onfilenamechanged")
  var onfilenamechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileSavePickerUI, _] = js.native
  /** Fires when the user commits a file to be saved in the file picker. */
  @JSName("ontargetfilerequested")
  var ontargetfilerequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs] = js.native
  /** Gets an identifier for the current context of the file picker. */
  var settingsIdentifier: java.lang.String = js.native
  /** Gets or sets a title to display in the file picker UI that identifies the location that the file picker is displaying to the user. */
  var title: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_filenamechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.filenamechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileSavePickerUI, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetfilerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.targetfilerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs]
  ): scala.Unit = js.native
  /** Fired when the user changes the file name in the file name text box or changes the extension in the file type drop-down menu. */
  def onfilenamechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[FileSavePickerUI]): scala.Unit = js.native
  /** Fires when the user commits a file to be saved in the file picker. */
  def ontargetfilerequested(ev: TargetFileRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[FileSavePickerUI]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_filenamechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.filenamechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileSavePickerUI, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_targetfilerequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.targetfilerequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs]
  ): scala.Unit = js.native
  /**
                       * Tries to set the file name and extension in the file picker UI.
                       * @param value The file name and extension that are used to update the file name text box and file type drop-down menu in the file picker UI.
                       * @return The enumeration value that indicates whether the file name and extension were updated in the file picker UI.
                       */
  def trySetFileName(value: java.lang.String): SetFileNameResult = js.native
}

