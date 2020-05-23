package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileListSuccess extends js.Object {
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[Double] = js.undefined
  /**
    * 文件列表
    */
  var fileList: js.UndefOr[String] = js.undefined
}

object GetSavedFileListSuccess {
  @scala.inline
  def apply(errMsg: js.UndefOr[Double] = js.undefined, fileList: String = null): GetSavedFileListSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errMsg)) __obj.updateDynamic("errMsg")(errMsg.get.asInstanceOf[js.Any])
    if (fileList != null) __obj.updateDynamic("fileList")(fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileListSuccess]
  }
}

