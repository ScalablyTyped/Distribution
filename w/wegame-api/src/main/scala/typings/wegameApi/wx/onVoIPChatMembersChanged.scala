package typings.wegameApi.wx

import typings.wegameApi.AnonOpenIdList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onVoIPChatMembersChanged")
@js.native
object onVoIPChatMembersChanged extends js.Object {
  /**
    * 监听实时语音通话成员在线状态变化事件。有成员加入/退出通话时触发回调
    * @param callback 实时语音通话成员在线状态变化事件的回调函数
    */
  def apply(callback: js.Function1[/* res */ AnonOpenIdList, Unit]): Unit = js.native
}

