package typings.winrt.WindowsNs.StorageNs.ProviderNs

import typings.winrt.WindowsNs.StorageNs.IStorageFile
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdateRequest extends js.Object {
  var contentId: String
  var file: StorageFile
  var status: FileUpdateStatus
  def getDeferral(): FileUpdateRequestDeferral
  def updateLocalFile(value: IStorageFile): Unit
}

object IFileUpdateRequest {
  @scala.inline
  def apply(
    contentId: String,
    file: StorageFile,
    getDeferral: () => FileUpdateRequestDeferral,
    status: FileUpdateStatus,
    updateLocalFile: IStorageFile => Unit
  ): IFileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId, file = file, getDeferral = js.Any.fromFunction0(getDeferral), status = status, updateLocalFile = js.Any.fromFunction1(updateLocalFile))
  
    __obj.asInstanceOf[IFileUpdateRequest]
  }
}

