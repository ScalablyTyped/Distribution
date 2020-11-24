package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginRes extends js.Object {
  
  /**
    * 头条小程序当前设备标识
    */
  var anonymousCode: js.UndefOr[String] = js.native
  
  /**
    * 支付宝小程序授权码
    */
  var authCode: js.UndefOr[String] = js.native
  
  /**
    * 支付宝小程序登录失败的授权类型，key是授权失败的 scope，value 是对应的错误码
    */
  var authErrorScope: js.UndefOr[js.Any] = js.native
  
  /**
    * 登录服务商提供的登录信息，服务商不同返回的结果不完全相同
    */
  var authResult: js.UndefOr[String] = js.native
  
  /**
    * 支付宝小程序登录成功的授权 scope
    */
  var authSucessScope: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 小程序用户临时登录凭证
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[String] = js.native
}
object LoginRes {
  
  @scala.inline
  def apply(): LoginRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginRes]
  }
  
  @scala.inline
  implicit class LoginResOps[Self <: LoginRes] (val x: Self) extends AnyVal {
    
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
    def setAnonymousCode(value: String): Self = this.set("anonymousCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymousCode: Self = this.set("anonymousCode", js.undefined)
    
    @scala.inline
    def setAuthCode(value: String): Self = this.set("authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthCode: Self = this.set("authCode", js.undefined)
    
    @scala.inline
    def setAuthErrorScope(value: js.Any): Self = this.set("authErrorScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthErrorScope: Self = this.set("authErrorScope", js.undefined)
    
    @scala.inline
    def setAuthResult(value: String): Self = this.set("authResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthResult: Self = this.set("authResult", js.undefined)
    
    @scala.inline
    def setAuthSucessScopeVarargs(value: String*): Self = this.set("authSucessScope", js.Array(value :_*))
    
    @scala.inline
    def setAuthSucessScope(value: js.Array[String]): Self = this.set("authSucessScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthSucessScope: Self = this.set("authSucessScope", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
  }
}
