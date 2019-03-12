package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPickerUI extends js.Object {
  var allowedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var onclosing: js.Any
  var onfileremoved: js.Any
  var selectionMode: FileSelectionMode
  var settingsIdentifier: java.lang.String
  var title: java.lang.String
  def addFile(id: java.lang.String, file: winrtLib.WindowsNs.StorageNs.IStorageFile): AddFileResult
  def canAddFile(file: winrtLib.WindowsNs.StorageNs.IStorageFile): scala.Boolean
  def containsFile(id: java.lang.String): scala.Boolean
  def removeFile(id: java.lang.String): scala.Unit
}

object IFileOpenPickerUI {
  @scala.inline
  def apply(
    addFile: (java.lang.String, winrtLib.WindowsNs.StorageNs.IStorageFile) => AddFileResult,
    allowedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    canAddFile: winrtLib.WindowsNs.StorageNs.IStorageFile => scala.Boolean,
    containsFile: java.lang.String => scala.Boolean,
    onclosing: js.Any,
    onfileremoved: js.Any,
    removeFile: java.lang.String => scala.Unit,
    selectionMode: FileSelectionMode,
    settingsIdentifier: java.lang.String,
    title: java.lang.String
  ): IFileOpenPickerUI = {
    val __obj = js.Dynamic.literal(addFile = js.Any.fromFunction2(addFile), allowedFileTypes = allowedFileTypes, canAddFile = js.Any.fromFunction1(canAddFile), containsFile = js.Any.fromFunction1(containsFile), onclosing = onclosing, onfileremoved = onfileremoved, removeFile = js.Any.fromFunction1(removeFile), selectionMode = selectionMode, settingsIdentifier = settingsIdentifier, title = title)
  
    __obj.asInstanceOf[IFileOpenPickerUI]
  }
}

