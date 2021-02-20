package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetInnerAudioOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetInnerAudioOptionCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetInnerAudioOptionFailCallback] = js.native
  
  /** 是否与其他音频混播，设置为 true 之后，不会终止其他应用或微信内的音乐 */
  var mixWithOther: js.UndefOr[Boolean] = js.native
  
  /** （仅在 iOS 生效）是否遵循静音开关，设置为 false 之后，即使是在静音模式下，也能播放声音 */
  var obeyMuteSwitch: js.UndefOr[Boolean] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetInnerAudioOptionSuccessCallback] = js.native
}
object SetInnerAudioOption {
  
  @scala.inline
  def apply(): SetInnerAudioOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetInnerAudioOption]
  }
  
  @scala.inline
  implicit class SetInnerAudioOptionMutableBuilder[Self <: SetInnerAudioOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMixWithOther(value: Boolean): Self = StObject.set(x, "mixWithOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixWithOtherUndefined: Self = StObject.set(x, "mixWithOther", js.undefined)
    
    @scala.inline
    def setObeyMuteSwitch(value: Boolean): Self = StObject.set(x, "obeyMuteSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObeyMuteSwitchUndefined: Self = StObject.set(x, "obeyMuteSwitch", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
