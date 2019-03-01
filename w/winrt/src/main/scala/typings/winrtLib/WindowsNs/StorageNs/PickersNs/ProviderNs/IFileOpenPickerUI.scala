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
    addFile: js.Function2[java.lang.String, winrtLib.WindowsNs.StorageNs.IStorageFile, AddFileResult],
    allowedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    canAddFile: js.Function1[winrtLib.WindowsNs.StorageNs.IStorageFile, scala.Boolean],
    containsFile: js.Function1[java.lang.String, scala.Boolean],
    onclosing: js.Any,
    onfileremoved: js.Any,
    removeFile: js.Function1[java.lang.String, scala.Unit],
    selectionMode: FileSelectionMode,
    settingsIdentifier: java.lang.String,
    title: java.lang.String
  ): IFileOpenPickerUI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFile")(addFile)
    __obj.updateDynamic("allowedFileTypes")(allowedFileTypes)
    __obj.updateDynamic("canAddFile")(canAddFile)
    __obj.updateDynamic("containsFile")(containsFile)
    __obj.updateDynamic("onclosing")(onclosing)
    __obj.updateDynamic("onfileremoved")(onfileremoved)
    __obj.updateDynamic("removeFile")(removeFile)
    __obj.updateDynamic("selectionMode")(selectionMode)
    __obj.updateDynamic("settingsIdentifier")(settingsIdentifier)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IFileOpenPickerUI]
  }
}

