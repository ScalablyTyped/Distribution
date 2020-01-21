package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onBeaconUpdate")
@js.native
object onBeaconUpdate extends js.Object {
  /**
  	 * 监听 iBeacon 设备的更新事件
  	 * @version 1.2.0
  	 */
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* beacons */ js.Array[Beacon], Unit]): Unit = js.native
}

