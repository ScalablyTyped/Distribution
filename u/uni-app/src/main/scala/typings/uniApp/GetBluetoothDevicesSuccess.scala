package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBluetoothDevicesSuccess extends js.Object {
  /**
    * uuid 对应的的已连接设备列表
    */
  var devices: js.UndefOr[js.Array[BluetoothDeviceInfo]] = js.native
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}

object GetBluetoothDevicesSuccess {
  @scala.inline
  def apply(): GetBluetoothDevicesSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBluetoothDevicesSuccess]
  }
  @scala.inline
  implicit class GetBluetoothDevicesSuccessOps[Self <: GetBluetoothDevicesSuccess] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: BluetoothDeviceInfo*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: js.Array[BluetoothDeviceInfo]): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
  }
  
}

