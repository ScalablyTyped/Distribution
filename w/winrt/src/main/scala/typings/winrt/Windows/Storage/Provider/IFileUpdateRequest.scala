package typings.winrt.Windows.Storage.Provider

import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileUpdateRequest extends js.Object {
  var contentId: String = js.native
  var file: StorageFile = js.native
  var status: FileUpdateStatus = js.native
  def getDeferral(): FileUpdateRequestDeferral = js.native
  def updateLocalFile(value: IStorageFile): Unit = js.native
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
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), status = status.asInstanceOf[js.Any], updateLocalFile = js.Any.fromFunction1(updateLocalFile))
    __obj.asInstanceOf[IFileUpdateRequest]
  }
  @scala.inline
  implicit class IFileUpdateRequestOps[Self <: IFileUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: StorageFile): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => FileUpdateRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: FileUpdateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateLocalFile(value: IStorageFile => Unit): Self = this.set("updateLocalFile", js.Any.fromFunction1(value))
  }
  
}

