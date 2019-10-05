package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_Connected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onBLEConnectionStateChanged")
@js.native
object onBLEConnectionStateChanged extends js.Object {
  /**
  	 * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等等。
  	 */
  def apply(callback: js.Function1[/* res */ Anon_Connected, Unit]): Unit = js.native
}

