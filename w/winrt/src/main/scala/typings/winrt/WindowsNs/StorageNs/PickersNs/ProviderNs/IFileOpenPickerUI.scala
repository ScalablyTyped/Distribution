package typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPickerUI extends js.Object {
  var allowedFileTypes: IVectorView[String]
  var onclosing: js.Any
  var onfileremoved: js.Any
  var selectionMode: FileSelectionMode
  var settingsIdentifier: String
  var title: String
  def addFile(id: String, file: IStorageFile): AddFileResult
  def canAddFile(file: IStorageFile): Boolean
  def containsFile(id: String): Boolean
  def removeFile(id: String): Unit
}

object IFileOpenPickerUI {
  @scala.inline
  def apply(
    addFile: (String, IStorageFile) => AddFileResult,
    allowedFileTypes: IVectorView[String],
    canAddFile: IStorageFile => Boolean,
    containsFile: String => Boolean,
    onclosing: js.Any,
    onfileremoved: js.Any,
    removeFile: String => Unit,
    selectionMode: FileSelectionMode,
    settingsIdentifier: String,
    title: String
  ): IFileOpenPickerUI = {
    val __obj = js.Dynamic.literal(addFile = js.Any.fromFunction2(addFile), allowedFileTypes = allowedFileTypes, canAddFile = js.Any.fromFunction1(canAddFile), containsFile = js.Any.fromFunction1(containsFile), onclosing = onclosing, onfileremoved = onfileremoved, removeFile = js.Any.fromFunction1(removeFile), selectionMode = selectionMode, settingsIdentifier = settingsIdentifier, title = title)
  
    __obj.asInstanceOf[IFileOpenPickerUI]
  }
}

