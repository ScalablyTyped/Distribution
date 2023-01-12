package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.en
import typings.wechatMiniprogram.wechatMiniprogramStrings.zh_CN
import typings.wechatMiniprogram.wechatMiniprogramStrings.zh_TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserProfileOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetUserProfileCompleteCallback] = js.undefined
  
  /** 声明获取用户个人信息后的用途，不超过30个字符 */
  var desc: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetUserProfileFailCallback] = js.undefined
  
  /** 显示用户信息的语言
    *
    * 可选值：
    * - 'en': 英文;
    * - 'zh_CN': 简体中文;
    * - 'zh_TW': 繁体中文; */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetUserProfileSuccessCallback] = js.undefined
}
object GetUserProfileOption {
  
  inline def apply(desc: String): GetUserProfileOption = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserProfileOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserProfileOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setLang(value: en | zh_CN | zh_TW): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setSuccess(value: /* result */ GetUserProfileSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
