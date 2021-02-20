package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateBackMiniProgramOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NavigateBackMiniProgramCompleteCallback] = js.native
  
  /** 需要返回给上一个小程序的数据，上一个小程序可在 `App.onShow` 中获取到这份数据。 [详情](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html)。 */
  var extraData: js.UndefOr[IAnyObject] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NavigateBackMiniProgramFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NavigateBackMiniProgramSuccessCallback] = js.native
}
object NavigateBackMiniProgramOption {
  
  @scala.inline
  def apply(): NavigateBackMiniProgramOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateBackMiniProgramOption]
  }
  
  @scala.inline
  implicit class NavigateBackMiniProgramOptionMutableBuilder[Self <: NavigateBackMiniProgramOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setExtraData(value: IAnyObject): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
