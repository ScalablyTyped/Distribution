package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginRes extends StObject {
  
  /**
    * 头条小程序当前设备标识
    */
  var anonymousCode: js.UndefOr[String] = js.undefined
  
  /**
    * 支付宝小程序授权码
    */
  var authCode: js.UndefOr[String] = js.undefined
  
  /**
    * 支付宝小程序登录失败的授权类型，key是授权失败的 scope，value 是对应的错误码
    */
  var authErrorScope: js.UndefOr[js.Any] = js.undefined
  
  /**
    * 登录服务商提供的登录信息，服务商不同返回的结果不完全相同
    */
  var authResult: js.UndefOr[String] = js.undefined
  
  /**
    * 支付宝小程序登录成功的授权 scope
    */
  var authSucessScope: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 小程序用户临时登录凭证
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}
object LoginRes {
  
  @scala.inline
  def apply(): LoginRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginRes]
  }
  
  @scala.inline
  implicit class LoginResMutableBuilder[Self <: LoginRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymousCode(value: String): Self = StObject.set(x, "anonymousCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousCodeUndefined: Self = StObject.set(x, "anonymousCode", js.undefined)
    
    @scala.inline
    def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
    
    @scala.inline
    def setAuthErrorScope(value: js.Any): Self = StObject.set(x, "authErrorScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthErrorScopeUndefined: Self = StObject.set(x, "authErrorScope", js.undefined)
    
    @scala.inline
    def setAuthResult(value: String): Self = StObject.set(x, "authResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthResultUndefined: Self = StObject.set(x, "authResult", js.undefined)
    
    @scala.inline
    def setAuthSucessScope(value: js.Array[String]): Self = StObject.set(x, "authSucessScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSucessScopeUndefined: Self = StObject.set(x, "authSucessScope", js.undefined)
    
    @scala.inline
    def setAuthSucessScopeVarargs(value: String*): Self = StObject.set(x, "authSucessScope", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
