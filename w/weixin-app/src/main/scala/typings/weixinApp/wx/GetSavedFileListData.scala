package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavedFileListData extends js.Object {
  /**
    * 接口调用结果
    */
  var errMsg: String = js.native
  /**
    * 文件列表
    */
  var fileList: js.Array[File] = js.native
}

object GetSavedFileListData {
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[File]): GetSavedFileListData = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileListData]
  }
  @scala.inline
  implicit class GetSavedFileListDataOps[Self <: GetSavedFileListData] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileListVarargs(value: File*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[File]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
  
}

