package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileListData extends js.Object {
  /**
  		 * 接口调用结果
  		 */
  var errMsg: String
  /**
  		 * 文件列表
  		 */
  var fileList: js.Array[File]
}

object GetSavedFileListData {
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[File]): GetSavedFileListData = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileListData]
  }
}

