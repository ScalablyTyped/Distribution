package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBluetoothDevicesSuccessCallbackResult extends js.Object {
  /** uuid 对应的的已连接设备列表 */
  var devices: js.Array[BlueToothDevice] = js.native
  var errMsg: String = js.native
}

object GetBluetoothDevicesSuccessCallbackResult {
  @scala.inline
  def apply(devices: js.Array[BlueToothDevice], errMsg: String): GetBluetoothDevicesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothDevicesSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetBluetoothDevicesSuccessCallbackResultOps[Self <: GetBluetoothDevicesSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDevicesVarargs(value: BlueToothDevice*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: js.Array[BlueToothDevice]): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

