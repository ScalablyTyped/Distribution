package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wegame-api.wx.types.CallbacksWithType<{  openIdList :std.ReadonlyArray<string>,   errCode :number,   errMsg :string}> & {  signature :string,   nonceStr :string,   timeStamp :number,   groupId :string,   muteConfig :{  muteMicrophone :boolean | undefined,   muteEarphone :boolean | undefined} | undefined} */
@js.native
trait CallbacksWithTypeopenIdLi extends js.Object {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 小游戏内此房间/群聊的 ID。同一时刻传入相同 groupId 的用户会进入到同个实时语音房间。
    */
  var groupId: String = js.native
  
  /**
    * 静音设置
    */
  var muteConfig: js.UndefOr[MuteEarphone] = js.native
  
  /**
    * 验证所需的随机字符串
    */
  var nonceStr: String = js.native
  
  /**
    * 签名，用于验证小游戏的身份
    */
  var signature: String = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ OpenIdList, Unit]] = js.native
  
  /**
    * 验证所需的时间戳
    */
  var timeStamp: Double = js.native
}
object CallbacksWithTypeopenIdLi {
  
  @scala.inline
  def apply(groupId: String, nonceStr: String, signature: String, timeStamp: Double): CallbacksWithTypeopenIdLi = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbacksWithTypeopenIdLi]
  }
  
  @scala.inline
  implicit class CallbacksWithTypeopenIdLiOps[Self <: CallbacksWithTypeopenIdLi] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setMuteConfig(value: MuteEarphone): Self = this.set("muteConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuteConfig: Self = this.set("muteConfig", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ OpenIdList => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
