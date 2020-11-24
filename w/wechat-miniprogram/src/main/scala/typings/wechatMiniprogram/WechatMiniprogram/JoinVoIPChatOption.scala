package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.video
import typings.wechatMiniprogram.wechatMiniprogramStrings.voice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinVoIPChatOption extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[JoinVoIPChatCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[JoinVoIPChatFailCallback] = js.native
  
  /** 小游戏内此房间/群聊的 ID。同一时刻传入相同 groupId 的用户会进入到同个实时语音房间。 */
  var groupId: String = js.native
  
  /** 静音设置 */
  var muteConfig: js.UndefOr[MuteConfig] = js.native
  
  /** 验证所需的随机字符串 */
  var nonceStr: String = js.native
  
  /** 房间类型
    *
    * 可选值：
    * - 'voice': 音频房间，用于语音通话;
    * - 'video': 视频房间，结合 [voip-room](https://developers.weixin.qq.com/miniprogram/dev/component/voip-room.html) 组件可显示成员画面; */
  var roomType: js.UndefOr[voice | video] = js.native
  
  /** 签名，用于验证小游戏的身份 */
  var signature: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[JoinVoIPChatSuccessCallback] = js.native
  
  /** 验证所需的时间戳 */
  var timeStamp: Double = js.native
}
object JoinVoIPChatOption {
  
  @scala.inline
  def apply(groupId: String, nonceStr: String, signature: String, timeStamp: Double): JoinVoIPChatOption = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinVoIPChatOption]
  }
  
  @scala.inline
  implicit class JoinVoIPChatOptionOps[Self <: JoinVoIPChatOption] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceStr(value: String): Self = this.set("nonceStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ JoinVoIPChatError => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ JoinVoIPChatError => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setMuteConfig(value: MuteConfig): Self = this.set("muteConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuteConfig: Self = this.set("muteConfig", js.undefined)
    
    @scala.inline
    def setRoomType(value: voice | video): Self = this.set("roomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomType: Self = this.set("roomType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ JoinVoIPChatSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
