package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSettingOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenSettingCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenSettingFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenSettingSuccessCallback] = js.native
  
  /** 是否同时获取用户订阅消息的订阅状态，默认不获取。注意：withSubscriptions 只返回用户勾选过订阅面板中的“总是保持以上选择，不再询问”的订阅消息。
    *
    * 最低基础库： `2.10.3` */
  var withSubscriptions: js.UndefOr[Boolean] = js.native
}
object OpenSettingOption {
  
  @scala.inline
  def apply(): OpenSettingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenSettingOption]
  }
  
  @scala.inline
  implicit class OpenSettingOptionMutableBuilder[Self <: OpenSettingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ OpenSettingSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWithSubscriptions(value: Boolean): Self = StObject.set(x, "withSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithSubscriptionsUndefined: Self = StObject.set(x, "withSubscriptions", js.undefined)
  }
}
