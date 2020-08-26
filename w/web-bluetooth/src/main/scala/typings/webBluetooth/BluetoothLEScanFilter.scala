package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothLEScanFilter extends js.Object {
  val manufacturerData: js.UndefOr[BluetoothManufacturerDataFilter] = js.native
  val name: js.UndefOr[String] = js.native
  val namePrefix: js.UndefOr[String] = js.native
  val serviceData: js.UndefOr[BluetoothServiceDataFilter] = js.native
  val services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}

object BluetoothLEScanFilter {
  @scala.inline
  def apply(): BluetoothLEScanFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothLEScanFilter]
  }
  @scala.inline
  implicit class BluetoothLEScanFilterOps[Self <: BluetoothLEScanFilter] (val x: Self) extends AnyVal {
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
    def setManufacturerData(value: BluetoothManufacturerDataFilter): Self = this.set("manufacturerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturerData: Self = this.set("manufacturerData", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setServiceData(value: BluetoothServiceDataFilter): Self = this.set("serviceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceData: Self = this.set("serviceData", js.undefined)
    @scala.inline
    def setServicesVarargs(value: BluetoothServiceUUID*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[BluetoothServiceUUID]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}

