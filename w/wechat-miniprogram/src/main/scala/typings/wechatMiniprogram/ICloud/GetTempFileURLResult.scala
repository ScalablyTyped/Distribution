package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// === end ===
// === API: getTempFileURL ===
@js.native
trait GetTempFileURLResult extends IAPISuccessParam {
  var fileList: js.Array[GetTempFileURLResultItem] = js.native
}

object GetTempFileURLResult {
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[GetTempFileURLResultItem]): GetTempFileURLResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileURLResult]
  }
  @scala.inline
  implicit class GetTempFileURLResultOps[Self <: GetTempFileURLResult] (val x: Self) extends AnyVal {
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
    def setFileListVarargs(value: GetTempFileURLResultItem*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[GetTempFileURLResultItem]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
  
}

