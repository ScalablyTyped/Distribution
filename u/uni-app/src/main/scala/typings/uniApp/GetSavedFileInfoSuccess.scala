package typings.uniApp

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
  def apply(
    createTime: js.UndefOr[Double] = js.undefined,
    errMsg: String = null,
    size: js.UndefOr[Double] = js.undefined
  ): GetSavedFileInfoSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(createTime)) __obj.updateDynamic("createTime")(createTime.get.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoSuccess]
  }
}

