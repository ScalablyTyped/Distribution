package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_IsConnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onNetworkStatusChange")
@js.native
object onNetworkStatusChange extends js.Object {
  /**
  	 * 监听网络状态变化。
  	 * 微信客户端 6.5.6 版本开始支持
  	 * @version 1.1.0
  	 */
  def apply(callback: js.Function1[/* res */ Anon_IsConnected, Unit]): Unit = js.native
}

