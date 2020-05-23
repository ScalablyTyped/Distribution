package typings.w3cWebUsb

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
    classCode: js.UndefOr[Double] = js.undefined,
    productId: js.UndefOr[Double] = js.undefined,
    protocolCode: js.UndefOr[Double] = js.undefined,
    serialNumber: String = null,
    subclassCode: js.UndefOr[Double] = js.undefined,
    vendorId: js.UndefOr[Double] = js.undefined
  ): USBDeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(classCode)) __obj.updateDynamic("classCode")(classCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(productId)) __obj.updateDynamic("productId")(productId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(protocolCode)) __obj.updateDynamic("protocolCode")(protocolCode.get.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(subclassCode)) __obj.updateDynamic("subclassCode")(subclassCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vendorId)) __obj.updateDynamic("vendorId")(vendorId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDeviceFilter]
  }
}

