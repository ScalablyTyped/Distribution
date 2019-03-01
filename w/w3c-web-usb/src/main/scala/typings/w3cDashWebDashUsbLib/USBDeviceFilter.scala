package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBDeviceFilter extends js.Object {
  var classCode: js.UndefOr[scala.Double] = js.undefined
  var productId: js.UndefOr[scala.Double] = js.undefined
  var protocolCode: js.UndefOr[scala.Double] = js.undefined
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
  var subclassCode: js.UndefOr[scala.Double] = js.undefined
  var vendorId: js.UndefOr[scala.Double] = js.undefined
}

object USBDeviceFilter {
  @scala.inline
  def apply(
    classCode: scala.Int | scala.Double = null,
    productId: scala.Int | scala.Double = null,
    protocolCode: scala.Int | scala.Double = null,
    serialNumber: java.lang.String = null,
    subclassCode: scala.Int | scala.Double = null,
    vendorId: scala.Int | scala.Double = null
  ): USBDeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (classCode != null) __obj.updateDynamic("classCode")(classCode.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (protocolCode != null) __obj.updateDynamic("protocolCode")(protocolCode.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    if (subclassCode != null) __obj.updateDynamic("subclassCode")(subclassCode.asInstanceOf[js.Any])
    if (vendorId != null) __obj.updateDynamic("vendorId")(vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDeviceFilter]
  }
}

