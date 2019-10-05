package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.connectSocket")
@js.native
object connectSocket extends js.Object {
  /**
  	 * 创建一个 WebSocket 连接；
  	 * 一个微信小程序同时只能有一个 WebSocket 连接，
  	 * 如果当前已存在一个 WebSocket 连接，
  	 * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
  	 */
  def apply(options: ConnectSocketOptions): Unit = js.native
}

