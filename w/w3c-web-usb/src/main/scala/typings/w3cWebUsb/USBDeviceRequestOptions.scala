package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBDeviceRequestOptions extends js.Object {
  var filters: js.Array[USBDeviceFilter] = js.native
}

object USBDeviceRequestOptions {
  @scala.inline
  def apply(filters: js.Array[USBDeviceFilter]): USBDeviceRequestOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDeviceRequestOptions]
  }
  @scala.inline
  implicit class USBDeviceRequestOptionsOps[Self <: USBDeviceRequestOptions] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: USBDeviceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[USBDeviceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
  }
  
}

