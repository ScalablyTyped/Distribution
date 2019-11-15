package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_ErrCodeErrMsg
import typings.wegameDashApi.Anon_GroupId
import typings.wegameDashApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.joinVoIPChat")
@js.native
object joinVoIPChat extends js.Object {
  /**
    * 加入 (创建) 实时语音通话，更多信息可见：实时语音指南（https://developers.weixin.qq.com/minigame/dev/guide/open-ability/voip-chat.html）
    * 错误码
    *    -1    当前已在房间内
    *    -2    录音设备被占用，可能是当前正在使用微信内语音通话或系统通话
    *    -3    加入会话期间退出（可能是用户主动退出，或者退后台、来电等原因），因此加入失败
    *    -1000 系统错误
    * @param param 加入语音聊天时的初始化参数
    */
  def apply(param: CallbacksWithType[Anon_ErrCodeErrMsg] with Anon_GroupId): Unit = js.native
}

