package typings.winrt.WindowsNs.StorageNs.ProviderNs

import typings.winrt.WindowsNs.StorageNs.IStorageFile
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Provider.FileUpdateRequest")
@js.native
class FileUpdateRequest () extends IFileUpdateRequest {
  /* CompleteClass */
  override var contentId: String = js.native
  /* CompleteClass */
  override var file: StorageFile = js.native
  /* CompleteClass */
  override var status: FileUpdateStatus = js.native
  /* CompleteClass */
  override def getDeferral(): FileUpdateRequestDeferral = js.native
  /* CompleteClass */
  override def updateLocalFile(value: IStorageFile): Unit = js.native
}

