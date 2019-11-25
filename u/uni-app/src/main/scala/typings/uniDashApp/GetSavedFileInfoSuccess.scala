package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSavedFileInfoSuccess extends js.Object {
  /**
    * 文件保存时的时间戳，从1970/01/01 08:00:00 到该时刻的秒数
    */
  var createTime: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 文件大小，单位B
    */
  var size: js.UndefOr[Double] = js.undefined
}

object GetSavedFileInfoSuccess {
  @scala.inline
  def apply(createTime: Int | Double = null, errMsg: String = null, size: Int | Double = null): GetSavedFileInfoSuccess = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoSuccess]
  }
}

