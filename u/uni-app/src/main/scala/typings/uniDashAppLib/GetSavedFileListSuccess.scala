package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileListSuccess extends js.Object {
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[scala.Double] = js.undefined
  /**
    * 文件列表
    */
  var fileList: js.UndefOr[java.lang.String] = js.undefined
}

object GetSavedFileListSuccess {
  @scala.inline
  def apply(errMsg: scala.Int | scala.Double = null, fileList: java.lang.String = null): GetSavedFileListSuccess = {
    val __obj = js.Dynamic.literal()
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (fileList != null) __obj.updateDynamic("fileList")(fileList)
    __obj.asInstanceOf[GetSavedFileListSuccess]
  }
}

