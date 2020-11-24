package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  开放接口
//  登录
@js.native
trait LoginResponse extends js.Object {
  
  /** 用户允许登录后，回调内容会带上 code（有效期五分钟），
    * 开发者需要将 code 发送到开发者服务器后台，
    * 使用code 换取 session_key api，
    * 将 code 换成 openid 和 session_key */
  var code: String = js.native
  
  /** 调用结果 */
  var errMsg: String = js.native
}
object LoginResponse {
  
  @scala.inline
  def apply(code: String, errMsg: String): LoginResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResponse]
  }
  
  @scala.inline
  implicit class LoginResponseOps[Self <: LoginResponse] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}
