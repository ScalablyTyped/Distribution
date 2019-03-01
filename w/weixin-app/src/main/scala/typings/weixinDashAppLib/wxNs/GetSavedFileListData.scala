package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileListData extends js.Object {
  /**
  		 * 接口调用结果
  		 */
  var errMsg: java.lang.String
  /**
  		 * 文件列表
  		 */
  var fileList: js.Array[File]
}

object GetSavedFileListData {
  @scala.inline
  def apply(errMsg: java.lang.String, fileList: js.Array[File]): GetSavedFileListData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("fileList")(fileList)
    __obj.asInstanceOf[GetSavedFileListData]
  }
}

