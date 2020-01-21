package typings.wegameApi.wx

import typings.wegameApi.wx.types.SocketOpenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onSocketOpen")
@js.native
object onSocketOpen extends js.Object {
  /**
    * 监听WebSocket 连接打开事件
    */
  def apply(callback: SocketOpenCallback): Unit = js.native
}

