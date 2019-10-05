package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onGetWifiList")
@js.native
object onGetWifiList extends js.Object {
  /**
  	 * 监听在获取到 Wi-Fi 列表数据时的事件，在回调中将返回 wifiList。
  	 * @version 1.6.0
  	 */
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* res */ GetWifiListOptions, Unit]): Unit = js.native
}

