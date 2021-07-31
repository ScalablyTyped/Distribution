package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.game
import typings.wechatMiniprogram.wechatMiniprogramStrings.normal
import typings.wechatMiniprogram.wechatMiniprogramStrings.ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDeviceMotionListeningOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartDeviceMotionListeningCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartDeviceMotionListeningFailCallback] = js.undefined
  
  /** 监听设备方向的变化回调函数的执行频率
    *
    * 可选值：
    * - 'game': 适用于更新游戏的回调频率，在 20ms/次 左右;
    * - 'ui': 适用于更新 UI 的回调频率，在 60ms/次 左右;
    * - 'normal': 普通的回调频率，在 200ms/次 左右; */
  var interval: js.UndefOr[game | ui | normal] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartDeviceMotionListeningSuccessCallback] = js.undefined
}
object StartDeviceMotionListeningOption {
  
  @scala.inline
  def apply(): StartDeviceMotionListeningOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDeviceMotionListeningOption]
  }
  
  @scala.inline
  implicit class StartDeviceMotionListeningOptionMutableBuilder[Self <: StartDeviceMotionListeningOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setInterval(value: game | ui | normal): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
