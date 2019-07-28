package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileSuccessCallbackResult extends js.Object {
  /**
    * 开发者服务器返回的数据
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * 开发者服务器返回的 HTTP 状态码
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}

object UploadFileSuccessCallbackResult {
  @scala.inline
  def apply(data: String = null, statusCode: Int | Double = null): UploadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileSuccessCallbackResult]
  }
}

