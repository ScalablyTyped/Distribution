package typings.wegameDashApi.wx

import typings.wegameDashApi.wx.types.SocketMessageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onSocketMessage")
@js.native
object onSocketMessage extends js.Object {
  /**
    * 监听WebSocket 接受到服务器的消息事件
    */
  def apply(callback: SocketMessageCallback): Unit = js.native
}

