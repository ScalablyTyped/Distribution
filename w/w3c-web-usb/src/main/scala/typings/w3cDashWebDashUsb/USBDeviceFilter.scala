package typings.w3cDashWebDashUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBDeviceFilter extends js.Object {
  var classCode: js.UndefOr[Double] = js.undefined
  var productId: js.UndefOr[Double] = js.undefined
  var protocolCode: js.UndefOr[Double] = js.undefined
  var serialNumber: js.UndefOr[String] = js.undefined
  var subclassCode: js.UndefOr[Double] = js.undefined
  var vendorId: js.UndefOr[Double] = js.undefined
}

object USBDeviceFilter {
  @scala.inline
  def apply(
    classCode: Int | Double = null,
    productId: Int | Double = null,
    protocolCode: Int | Double = null,
    serialNumber: String = null,
    subclassCode: Int | Double = null,
    vendorId: Int | Double = null
  ): USBDeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (classCode != null) __obj.updateDynamic("classCode")(classCode.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (protocolCode != null) __obj.updateDynamic("protocolCode")(protocolCode.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (subclassCode != null) __obj.updateDynamic("subclassCode")(subclassCode.asInstanceOf[js.Any])
    if (vendorId != null) __obj.updateDynamic("vendorId")(vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDeviceFilter]
  }
}

