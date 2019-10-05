package typings.wegameDashApi.wx

import typings.wegameDashApi.wx.types.SocketErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onSocketError")
@js.native
object onSocketError extends js.Object {
  /**
    * 监听WebSocket 错误事件
    */
  def apply(callback: SocketErrorCallback): Unit = js.native
}

