package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelsLiveInfoOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetChannelsLiveInfoCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetChannelsLiveInfoFailCallback] = js.undefined
  
  /** 视频号 id */
  var finderUserName: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetChannelsLiveInfoSuccessCallback] = js.undefined
}
object GetChannelsLiveInfoOption {
  
  inline def apply(finderUserName: String): GetChannelsLiveInfoOption = {
    val __obj = js.Dynamic.literal(finderUserName = finderUserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelsLiveInfoOption]
  }
  
  extension [Self <: GetChannelsLiveInfoOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFinderUserName(value: String): Self = StObject.set(x, "finderUserName", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ GetChannelsLiveInfoSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
