package typings.webBluetooth.anon

import typings.webBluetooth.BluetoothServiceUUID
import typings.webBluetooth.RequestDeviceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptAllDevices extends RequestDeviceOptions {
  var acceptAllDevices: Boolean = js.native
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}

object AcceptAllDevices {
  @scala.inline
  def apply(acceptAllDevices: Boolean): AcceptAllDevices = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptAllDevices]
  }
  @scala.inline
  implicit class AcceptAllDevicesOps[Self <: AcceptAllDevices] (val x: Self) extends AnyVal {
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
    def setAcceptAllDevices(value: Boolean): Self = this.set("acceptAllDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalServicesVarargs(value: BluetoothServiceUUID*): Self = this.set("optionalServices", js.Array(value :_*))
    @scala.inline
    def setOptionalServices(value: js.Array[BluetoothServiceUUID]): Self = this.set("optionalServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalServices: Self = this.set("optionalServices", js.undefined)
  }
  
}

