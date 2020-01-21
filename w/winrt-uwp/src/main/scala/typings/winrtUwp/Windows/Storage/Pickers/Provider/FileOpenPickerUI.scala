package typings.winrtUwp.Windows.Storage.Pickers.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.closing
import typings.winrtUwp.winrtUwpStrings.fileremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to interact with the file picker if your app provides files with the File Open Picker contract. */
@JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
@js.native
abstract class FileOpenPickerUI () extends js.Object {
  /** Gets a list of file types (extensions) that the user can choose. */
  var allowedFileTypes: IVectorView[String] = js.native
  /** Fires when the user closes the file picker. */
  @JSName("onclosing")
  var onclosing_Original: TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs] = js.native
  /** Fires when the user removes a file from the list of files that the user has chosen if that file was added by the app that is providing files. */
  @JSName("onfileremoved")
  var onfileremoved_Original: TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs] = js.native
  /** Gets an enumeration value that indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
  var selectionMode: FileSelectionMode = js.native
  /** Gets an identifier for the current context of the file picker. */
  var settingsIdentifier: String = js.native
  /** Gets or sets a title to display in the file picker UI that identifies the location that the file picker is displaying to the user. */
  var title: String = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closing(`type`: closing, listener: TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fileremoved(`type`: fileremoved, listener: TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs]): Unit = js.native
  /**
    * Adds the specified file to the list of files that the user has chosen.
    * @param id A unique identifier of the file to add.
    * @param file The file to add to the list of files that the user has chosen.
    * @return The enumeration value that indicates the result of this addFile method.
    */
  def addFile(id: String, file: IStorageFile): AddFileResult = js.native
  /**
    * Indicates whether the specified file can be added to the list of files the user has chosen.
    * @param file The file to test.
    * @return True if the file can be added to the file picker UI; otherwise false.
    */
  def canAddFile(file: IStorageFile): Boolean = js.native
  /**
    * Determines whether the specified file is in the list of files that the user has chosen.
    * @param id The identifier of the file.
    * @return True if the file is in the basket; otherwise false.
    */
  def containsFile(id: String): Boolean = js.native
  /** Fires when the user closes the file picker. */
  def onclosing(ev: PickerClosingEventArgs with WinRTEvent[FileOpenPickerUI]): Unit = js.native
  /** Fires when the user removes a file from the list of files that the user has chosen if that file was added by the app that is providing files. */
  def onfileremoved(ev: FileRemovedEventArgs with WinRTEvent[FileOpenPickerUI]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closing(`type`: closing, listener: TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fileremoved(`type`: fileremoved, listener: TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs]): Unit = js.native
  /**
    * Removes the specified file from the list of files the user has chosen.
    * @param id The identifier of the file to remove.
    */
  def removeFile(id: String): Unit = js.native
}

