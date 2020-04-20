package typings.weixinApp

import typings.weixinApp.weixinAppStrings.ok
import typings.weixinApp.wx.BluetoothDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  devices  :std.Array<weixin-app.wx.BluetoothDevice>} & weixin-app.wx.ErrMsgResponse */
trait devicesArrayBluetoothDevi extends js.Object {
  var devices: js.Array[BluetoothDevice]
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}

object devicesArrayBluetoothDevi {
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice], errMsg: ok | String): devicesArrayBluetoothDevi = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[devicesArrayBluetoothDevi]
  }
}

