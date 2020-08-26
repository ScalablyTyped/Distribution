package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// === end ===
// === API: deleteFile ===
@js.native
trait DeleteFileResult extends IAPISuccessParam {
  var fileList: js.Array[DeleteFileResultItem] = js.native
}

object DeleteFileResult {
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[DeleteFileResultItem]): DeleteFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResult]
  }
  @scala.inline
  implicit class DeleteFileResultOps[Self <: DeleteFileResult] (val x: Self) extends AnyVal {
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
    def setFileListVarargs(value: DeleteFileResultItem*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[DeleteFileResultItem]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
  
}

