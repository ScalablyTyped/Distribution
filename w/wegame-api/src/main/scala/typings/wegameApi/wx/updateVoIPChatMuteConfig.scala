package typings.wegameApi.wx

import typings.wegameApi.AnonMuteConfig
import typings.wegameApi.wx.types.Callbacks
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
  def apply(param: Callbacks with AnonMuteConfig): Unit = js.native
}

