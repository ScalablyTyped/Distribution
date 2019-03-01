package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Devices extends js.Object {
  var devices: js.Array[weixinDashAppLib.wxNs.BluetoothDevice]
}

object Anon_Devices {
  @scala.inline
  def apply(devices: js.Array[weixinDashAppLib.wxNs.BluetoothDevice]): Anon_Devices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("devices")(devices)
    __obj.asInstanceOf[Anon_Devices]
  }
}

