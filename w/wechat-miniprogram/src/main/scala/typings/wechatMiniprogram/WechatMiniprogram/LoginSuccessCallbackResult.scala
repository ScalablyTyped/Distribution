package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginSuccessCallbackResult extends StObject {
  
  /** 用户登录凭证（有效期五分钟）。开发者需要在开发者服务器后台调用 [auth.code2Session](https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/login/auth.code2Session.html)，使用 code 换取 openid 和 session_key 等信息 */
  var code: String
  
  var errMsg: String
}
object LoginSuccessCallbackResult {
  
  @scala.inline
  def apply(code: String, errMsg: String): LoginSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class LoginSuccessCallbackResultMutableBuilder[Self <: LoginSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
