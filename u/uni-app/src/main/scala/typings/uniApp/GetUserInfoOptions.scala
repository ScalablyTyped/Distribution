package typings.uniApp

import typings.uniApp.uniAppStrings.qq
import typings.uniApp.uniAppStrings.sinaweibo
import typings.uniApp.uniAppStrings.weixin
import typings.uniApp.uniAppStrings.xiaomi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserInfoOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 指定返回用户信息的语言，zh_CN 简体中文，zh_TW 繁体中文，en 英文。默认为en，仅微信小程序生效。
    */
  var lang: js.UndefOr[String] = js.undefined
  
  /**
    * 授权登录服务提供商，通过uni.getProvider获取
    * - weixin: 微信登录
    * - qq: QQ登录
    * - sinaweibo: 新浪微博登录
    * - xiaomi: 小米登录
    */
  var provider: js.UndefOr[weixin | qq | sinaweibo | xiaomi] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetUserInfoRes, Unit]] = js.undefined
  
  /**
    * 超时时间，单位 ms
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * 是否带上登录态信息，仅微信小程序生效。
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object GetUserInfoOptions {
  
  inline def apply(): GetUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserInfoOptions]
  }
  
  extension [Self <: GetUserInfoOptions](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setProvider(value: weixin | qq | sinaweibo | xiaomi): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setSuccess(value: /* result */ GetUserInfoRes => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
