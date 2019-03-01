package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileResponse extends js.Object {
  var data: java.lang.String
   // 开发者服务器返回的数据
  var statusCode: scala.Double
}

object UploadFileResponse {
  @scala.inline
  def apply(data: java.lang.String, statusCode: scala.Double): UploadFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[UploadFileResponse]
  }
}

