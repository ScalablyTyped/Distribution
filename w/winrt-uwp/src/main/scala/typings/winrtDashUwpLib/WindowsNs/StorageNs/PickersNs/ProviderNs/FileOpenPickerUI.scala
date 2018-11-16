package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to interact with the file picker if your app provides files with the File Open Picker contract. */
@JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
@js.native
abstract class FileOpenPickerUI () extends js.Object {
  /** Gets a list of file types (extensions) that the user can choose. */
  var allowedFileTypes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Fires when the user closes the file picker. */
  @JSName("onclosing")
  var onclosing_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs] = js.native
  /** Fires when the user removes a file from the list of files that the user has chosen if that file was added by the app that is providing files. */
  @JSName("onfileremoved")
  var onfileremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs] = js.native
  /** Gets an enumeration value that indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
  var selectionMode: FileSelectionMode = js.native
  /** Gets an identifier for the current context of the file picker. */
  var settingsIdentifier: java.lang.String = js.native
  /** Gets or sets a title to display in the file picker UI that identifies the location that the file picker is displaying to the user. */
  var title: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closing(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closing,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fileremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.fileremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs]
  ): scala.Unit = js.native
  /**
                       * Adds the specified file to the list of files that the user has chosen.
                       * @param id A unique identifier of the file to add.
                       * @param file The file to add to the list of files that the user has chosen.
                       * @return The enumeration value that indicates the result of this addFile method.
                       */
  def addFile(id: java.lang.String, file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): AddFileResult = js.native
  /**
                       * Indicates whether the specified file can be added to the list of files the user has chosen.
                       * @param file The file to test.
                       * @return True if the file can be added to the file picker UI; otherwise false.
                       */
  def canAddFile(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): scala.Boolean = js.native
  /**
                       * Determines whether the specified file is in the list of files that the user has chosen.
                       * @param id The identifier of the file.
                       * @return True if the file is in the basket; otherwise false.
                       */
  def containsFile(id: java.lang.String): scala.Boolean = js.native
  /** Fires when the user closes the file picker. */
  def onclosing(ev: PickerClosingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[FileOpenPickerUI]): scala.Unit = js.native
  /** Fires when the user removes a file from the list of files that the user has chosen if that file was added by the app that is providing files. */
  def onfileremoved(ev: FileRemovedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[FileOpenPickerUI]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closing(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closing,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileOpenPickerUI, PickerClosingEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fileremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.fileremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FileOpenPickerUI, FileRemovedEventArgs]
  ): scala.Unit = js.native
  /**
                       * Removes the specified file from the list of files the user has chosen.
                       * @param id The identifier of the file to remove.
                       */
  def removeFile(id: java.lang.String): scala.Unit = js.native
}

