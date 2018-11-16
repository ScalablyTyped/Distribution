package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.Array[java.lang.String]
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: weixinDashAppLib.Anon_Devices with ErrMsgResponse): scala.Unit
}

