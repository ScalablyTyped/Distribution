package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBDeviceFilter extends js.Object {
  var classCode: js.UndefOr[Double] = js.native
  var productId: js.UndefOr[Double] = js.native
  var protocolCode: js.UndefOr[Double] = js.native
  var serialNumber: js.UndefOr[String] = js.native
  var subclassCode: js.UndefOr[Double] = js.native
  var vendorId: js.UndefOr[Double] = js.native
}

object USBDeviceFilter {
  @scala.inline
  def apply(): USBDeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBDeviceFilter]
  }
  @scala.inline
  implicit class USBDeviceFilterOps[Self <: USBDeviceFilter] (val x: Self) extends AnyVal {
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
    def setClassCode(value: Double): Self = this.set("classCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassCode: Self = this.set("classCode", js.undefined)
    @scala.inline
    def setProductId(value: Double): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setProtocolCode(value: Double): Self = this.set("protocolCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocolCode: Self = this.set("protocolCode", js.undefined)
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    @scala.inline
    def setSubclassCode(value: Double): Self = this.set("subclassCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubclassCode: Self = this.set("subclassCode", js.undefined)
    @scala.inline
    def setVendorId(value: Double): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendorId: Self = this.set("vendorId", js.undefined)
  }
  
}

