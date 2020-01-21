package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.startBluetoothDevicesDiscovery")
@js.native
object startBluetoothDevicesDiscovery extends js.Object {
  /**
  	 * 开始搜寻附近的蓝牙外围设备。
  	 * 注意，该操作比较耗费系统资源，请在搜索并连接到设备后调用 stop 方法停止搜索。
  	 * @example
  	 * // 以微信硬件平台的蓝牙智能灯为例，主服务的 UUID 是 FEE7。传入这个参数，只搜索主服务 UUID 为 FEE7 的设备
  	 * wx.startBluetoothDevicesDiscovery({
  	 *   services: ['FEE7'],
  	 *   success: function (res) {
  	 *     console.log(res)
  	 *   }
  	 * });
  	 */
  def apply(options: StartBluetoothDevicesDiscoveryOptions): Unit = js.native
}

