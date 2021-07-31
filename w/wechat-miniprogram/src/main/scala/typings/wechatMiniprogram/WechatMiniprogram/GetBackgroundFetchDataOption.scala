package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackgroundFetchDataOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetBackgroundFetchDataCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetBackgroundFetchDataFailCallback] = js.undefined
  
  /** 取值为 periodic */
  var fetchType: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBackgroundFetchDataSuccessCallback] = js.undefined
}
object GetBackgroundFetchDataOption {
  
  @scala.inline
  def apply(fetchType: String): GetBackgroundFetchDataOption = {
    val __obj = js.Dynamic.literal(fetchType = fetchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundFetchDataOption]
  }
  
  @scala.inline
  implicit class GetBackgroundFetchDataOptionMutableBuilder[Self <: GetBackgroundFetchDataOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFetchType(value: String): Self = StObject.set(x, "fetchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
