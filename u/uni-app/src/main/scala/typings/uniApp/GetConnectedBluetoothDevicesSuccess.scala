package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectedBluetoothDevicesSuccess extends js.Object {
  /**
    * 搜索到的设备列表
    */
  var devices: js.UndefOr[js.Array[GetConnectedBluetoothDevicesSuccessData]] = js.native
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}

object GetConnectedBluetoothDevicesSuccess {
  @scala.inline
  def apply(): GetConnectedBluetoothDevicesSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedBluetoothDevicesSuccess]
  }
  @scala.inline
  implicit class GetConnectedBluetoothDevicesSuccessOps[Self <: GetConnectedBluetoothDevicesSuccess] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: GetConnectedBluetoothDevicesSuccessData*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: js.Array[GetConnectedBluetoothDevicesSuccessData]): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
  }
  
}

