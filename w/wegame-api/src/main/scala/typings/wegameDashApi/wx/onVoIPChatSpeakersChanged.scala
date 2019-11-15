package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_ErrCodeErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onVoIPChatSpeakersChanged")
@js.native
object onVoIPChatSpeakersChanged extends js.Object {
  /**
    * 监听实时语音通话成员通话状态变化事件。有成员开始/停止说话时触发回调
    * @param callback 实时语音通话成员通话状态变化事件的回调函数
    */
  def apply(callback: js.Function1[/* res */ Anon_ErrCodeErrMsg, Unit]): Unit = js.native
}

