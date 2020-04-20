package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//  开放接口
//  登录
trait LoginResponse extends js.Object {
  /** 用户允许登录后，回调内容会带上 code（有效期五分钟），
    * 开发者需要将 code 发送到开发者服务器后台，
    * 使用code 换取 session_key api，
    * 将 code 换成 openid 和 session_key */
  var code: String
  /** 调用结果 */
  var errMsg: String
}

object LoginResponse {
  @scala.inline
  def apply(code: String, errMsg: String): LoginResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
}

