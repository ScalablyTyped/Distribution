package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
@js.native
class FileOpenPickerUI () extends IFileOpenPickerUI {
  /* CompleteClass */
  override var allowedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /* CompleteClass */
  override var onclosing: js.Any = js.native
  /* CompleteClass */
  override var onfileremoved: js.Any = js.native
  /* CompleteClass */
  override var selectionMode: FileSelectionMode = js.native
  /* CompleteClass */
  override var settingsIdentifier: java.lang.String = js.native
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /* CompleteClass */
  override def addFile(id: java.lang.String, file: winrtLib.WindowsNs.StorageNs.IStorageFile): AddFileResult = js.native
  /* CompleteClass */
  override def canAddFile(file: winrtLib.WindowsNs.StorageNs.IStorageFile): scala.Boolean = js.native
  /* CompleteClass */
  override def containsFile(id: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def removeFile(id: java.lang.String): scala.Unit = js.native
}

