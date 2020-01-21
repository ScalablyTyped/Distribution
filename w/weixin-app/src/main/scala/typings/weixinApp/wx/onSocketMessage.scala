package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onSocketMessage")
@js.native
object onSocketMessage extends js.Object {
  /**
  	 * 监听WebSocket接受到服务器的消息事件。
  	 */
  def apply(callback: js.Function1[/* res */ DataResponse, Unit]): Unit = js.native
}

