package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLEScanOptions extends js.Object {
  val acceptAllAdvertisements: js.UndefOr[Boolean] = js.native
  val filters: js.UndefOr[js.Array[BluetoothLEScanFilter]] = js.native
  val keepRepeatedDevices: js.UndefOr[Boolean] = js.native
}

object RequestLEScanOptions {
  @scala.inline
  def apply(): RequestLEScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLEScanOptions]
  }
  @scala.inline
  implicit class RequestLEScanOptionsOps[Self <: RequestLEScanOptions] (val x: Self) extends AnyVal {
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
    def setAcceptAllAdvertisements(value: Boolean): Self = this.set("acceptAllAdvertisements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptAllAdvertisements: Self = this.set("acceptAllAdvertisements", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: BluetoothLEScanFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[BluetoothLEScanFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setKeepRepeatedDevices(value: Boolean): Self = this.set("keepRepeatedDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepRepeatedDevices: Self = this.set("keepRepeatedDevices", js.undefined)
  }
  
}

