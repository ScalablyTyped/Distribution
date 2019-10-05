package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.connectWifi")
@js.native
object connectWifi extends js.Object {
  /**
  	 * 连接 Wi-Fi。
  	 * 若已知 Wi-Fi 信息，可以直接利用该接口连接。
  	 * 仅 Android 与 iOS 11 以上版本支持。
  	 * @version 1.6.0
  	 */
  def apply(): Unit = js.native
  def apply(options: ConnectWiFiOptions): Unit = js.native
}

