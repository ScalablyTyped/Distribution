package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_MuteConfig
import typings.wegameDashApi.wx.types.Callbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.updateVoIPChatMuteConfig")
@js.native
object updateVoIPChatMuteConfig extends js.Object {
  // -- VoIP
  /**
    * 更新实时语音静音设置
    * @param param 静音设置
    */
  def apply(param: Callbacks with Anon_MuteConfig): Unit = js.native
}

