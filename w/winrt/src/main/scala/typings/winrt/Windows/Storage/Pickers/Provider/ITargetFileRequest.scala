package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITargetFileRequest extends js.Object {
  var targetFile: IStorageFile = js.native
  def getDeferral(): TargetFileRequestDeferral = js.native
}

object ITargetFileRequest {
  @scala.inline
  def apply(getDeferral: () => TargetFileRequestDeferral, targetFile: IStorageFile): ITargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITargetFileRequest]
  }
  @scala.inline
  implicit class ITargetFileRequestOps[Self <: ITargetFileRequest] (val x: Self) extends AnyVal {
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
    def setGetDeferral(value: () => TargetFileRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setTargetFile(value: IStorageFile): Self = this.set("targetFile", value.asInstanceOf[js.Any])
  }
  
}

