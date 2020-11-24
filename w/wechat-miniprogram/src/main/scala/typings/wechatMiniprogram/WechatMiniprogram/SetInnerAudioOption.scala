package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetInnerAudioOption extends js.Object {
  
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
  implicit class SetInnerAudioOptionOps[Self <: SetInnerAudioOption] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setMixWithOther(value: Boolean): Self = this.set("mixWithOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixWithOther: Self = this.set("mixWithOther", js.undefined)
    
    @scala.inline
    def setObeyMuteSwitch(value: Boolean): Self = this.set("obeyMuteSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObeyMuteSwitch: Self = this.set("obeyMuteSwitch", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
