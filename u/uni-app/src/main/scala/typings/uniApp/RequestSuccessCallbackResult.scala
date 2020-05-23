package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSuccessCallbackResult extends js.Object {
  /**
    * 开发者服务器返回的数据
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * 开发者服务器返回的 HTTP Response Header
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
    * 开发者服务器返回的 HTTP 状态码
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}

object RequestSuccessCallbackResult {
  @scala.inline
  def apply(data: String = null, header: js.Any = null, statusCode: js.UndefOr[Double] = js.undefined): RequestSuccessCallbackResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSuccessCallbackResult]
  }
}

