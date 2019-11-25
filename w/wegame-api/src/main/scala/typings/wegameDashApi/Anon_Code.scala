package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /**
    * 用户登录凭证（有效期五分钟）。开发者需要在开发者服务器后台调用 code2accessToken，使用 code 换取 openid 和 session_key 等信息
    */
  var code: String
}

object Anon_Code {
  @scala.inline
  def apply(code: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Code]
  }
}

