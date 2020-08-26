package typings.weixinApp.wx

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 基本参数
@js.native
trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: js.Object | String | ArrayBuffer = js.native
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object = js.native
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
}

object DataResponse {
  @scala.inline
  def apply(data: js.Object | String | ArrayBuffer, header: js.Object, statusCode: Double): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResponse]
  }
  @scala.inline
  implicit class DataResponseOps[Self <: DataResponse] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object | String | ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

