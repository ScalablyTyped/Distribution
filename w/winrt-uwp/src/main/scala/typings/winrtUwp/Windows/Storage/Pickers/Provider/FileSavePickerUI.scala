package typings.winrtUwp.Windows.Storage.Pickers.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.filenamechanged
import typings.winrtUwp.winrtUwpStrings.targetfilerequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to interact with the file picker when your app provides a save location with the File Save Picker contract. */
@js.native
trait FileSavePickerUI extends js.Object {
  /** Gets a list of file types (extensions) that can be saved to the app that is providing the save location. */
  var allowedFileTypes: IVectorView[String] = js.native
  /** Gets the full file name of the file to save, including the file type extension. The file name and extension are specified by the user. */
  var fileName: String = js.native
  /** Fired when the user changes the file name in the file name text box or changes the extension in the file type drop-down menu. */
  @JSName("onfilenamechanged")
  var onfilenamechanged_Original: TypedEventHandler[FileSavePickerUI, _] = js.native
  /** Fires when the user commits a file to be saved in the file picker. */
  @JSName("ontargetfilerequested")
  var ontargetfilerequested_Original: TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs] = js.native
  /** Gets an identifier for the current context of the file picker. */
  var settingsIdentifier: String = js.native
  /** Gets or sets a title to display in the file picker UI that identifies the location that the file picker is displaying to the user. */
  var title: String = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_filenamechanged(`type`: filenamechanged, listener: TypedEventHandler[FileSavePickerUI, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetfilerequested(
    `type`: targetfilerequested,
    listener: TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs]
  ): Unit = js.native
  /** Fired when the user changes the file name in the file name text box or changes the extension in the file type drop-down menu. */
  def onfilenamechanged(ev: js.Any with WinRTEvent[FileSavePickerUI]): Unit = js.native
  /** Fires when the user commits a file to be saved in the file picker. */
  def ontargetfilerequested(ev: TargetFileRequestedEventArgs with WinRTEvent[FileSavePickerUI]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_filenamechanged(`type`: filenamechanged, listener: TypedEventHandler[FileSavePickerUI, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_targetfilerequested(
    `type`: targetfilerequested,
    listener: TypedEventHandler[FileSavePickerUI, TargetFileRequestedEventArgs]
  ): Unit = js.native
  /**
    * Tries to set the file name and extension in the file picker UI.
    * @param value The file name and extension that are used to update the file name text box and file type drop-down menu in the file picker UI.
    * @return The enumeration value that indicates whether the file name and extension were updated in the file picker UI.
    */
  def trySetFileName(value: String): SetFileNameResult = js.native
}

