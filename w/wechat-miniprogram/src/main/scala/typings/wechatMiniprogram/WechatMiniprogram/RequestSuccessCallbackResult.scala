package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSuccessCallbackResult extends js.Object {
  /** 开发者服务器返回的 cookies，格式为字符串数组
    *
    * 最低基础库： `2.10.0` */
  var cookies: js.Array[String] = js.native
  /** 开发者服务器返回的数据 */
  var data: String | IAnyObject | ArrayBuffer = js.native
  var errMsg: String = js.native
  /** 开发者服务器返回的 HTTP Response Header
    *
    * 最低基础库： `1.2.0` */
  var header: IAnyObject = js.native
  /** 网络请求过程中一些调试信息
    *
    * 最低基础库： `2.10.4` */
  var profile: RequestProfile = js.native
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
}

object RequestSuccessCallbackResult {
  @scala.inline
  def apply(
    cookies: js.Array[String],
    data: String | IAnyObject | ArrayBuffer,
    errMsg: String,
    header: IAnyObject,
    profile: RequestProfile,
    statusCode: Double
  ): RequestSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSuccessCallbackResult]
  }
  @scala.inline
  implicit class RequestSuccessCallbackResultOps[Self <: RequestSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setCookiesVarargs(value: String*): Self = this.set("cookies", js.Array(value :_*))
    @scala.inline
    def setCookies(value: js.Array[String]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String | IAnyObject | ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: IAnyObject): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile(value: RequestProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

