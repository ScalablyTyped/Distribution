package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_ErrCodeErrMsgNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onVoIPChatInterrupted")
@js.native
object onVoIPChatInterrupted extends js.Object {
  /**
    * 监听被动断开实时语音通话事件。包括小游戏切入后端时断开
    * @param callback 被动断开实时语音通话事件的回调函数
    */
  def apply(callback: js.Function1[/* res */ Anon_ErrCodeErrMsgNumber, Unit]): Unit = js.native
}

