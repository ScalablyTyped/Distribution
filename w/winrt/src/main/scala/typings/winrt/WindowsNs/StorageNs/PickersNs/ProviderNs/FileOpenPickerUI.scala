package typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.Provider.FileOpenPickerUI")
@js.native
class FileOpenPickerUI () extends IFileOpenPickerUI {
  /* CompleteClass */
  override var allowedFileTypes: IVectorView[String] = js.native
  /* CompleteClass */
  override var onclosing: js.Any = js.native
  /* CompleteClass */
  override var onfileremoved: js.Any = js.native
  /* CompleteClass */
  override var selectionMode: FileSelectionMode = js.native
  /* CompleteClass */
  override var settingsIdentifier: String = js.native
  /* CompleteClass */
  override var title: String = js.native
  /* CompleteClass */
  override def addFile(id: String, file: IStorageFile): AddFileResult = js.native
  /* CompleteClass */
  override def canAddFile(file: IStorageFile): Boolean = js.native
  /* CompleteClass */
  override def containsFile(id: String): Boolean = js.native
  /* CompleteClass */
  override def removeFile(id: String): Unit = js.native
}

