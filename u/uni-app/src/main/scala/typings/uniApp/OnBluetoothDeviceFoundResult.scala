package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBluetoothDeviceFoundResult extends js.Object {
  /**
    * 设备列表信息
    */
  var devices: js.UndefOr[js.Array[BluetoothDeviceInfo]] = js.native
}

object OnBluetoothDeviceFoundResult {
  @scala.inline
  def apply(): OnBluetoothDeviceFoundResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothDeviceFoundResult]
  }
  @scala.inline
  implicit class OnBluetoothDeviceFoundResultOps[Self <: OnBluetoothDeviceFoundResult] (val x: Self) extends AnyVal {
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
  }
  
}

