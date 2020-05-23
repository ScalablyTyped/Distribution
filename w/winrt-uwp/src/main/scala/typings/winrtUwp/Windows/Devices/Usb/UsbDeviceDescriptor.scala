package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Derives information from the USB device descriptor of the device. For an explanation of the device descriptor, see Table 9.8 in the Universal Serial Bus Specification. */
trait UsbDeviceDescriptor extends js.Object {
  /** Gets the bcdDeviceRevision field of the USB device descriptor. The value indicates the revision number defined by the device and is a binary-coded decimal number. */
  var bcdDeviceRevision: Double
  /** Gets the bcdUSB field of the USB device descriptor. The value indicates the version of the USB specification to which the device conforms. */
  var bcdUsb: Double
  /** Gets the bMaxPacketSize0 field of the USB device descriptor. The value indicates the maximum packet size, in bytes, for endpoint zero of the device. This value can be 8, 16, 32, or 64. */
  var maxPacketSize0: Double
  /** Gets the bNumConfigurations field of the USB device descriptor. The value indicates the total count of USB configurations supported by the device. */
  var numberOfConfigurations: Double
  /** Gets the idProduct field of the USB device descriptor. This value indicates the device-specific product identifier and is assigned by the manufacturer. */
  var productId: Double
  /** Gets the idVendor field of the USB device descriptor. The value indicates the vendor identifier for the device as assigned by the USB specification committee. */
  var vendorId: Double
}

object UsbDeviceDescriptor {
  @scala.inline
  def apply(
    bcdDeviceRevision: Double,
    bcdUsb: Double,
    maxPacketSize0: Double,
    numberOfConfigurations: Double,
    productId: Double,
    vendorId: Double
  ): UsbDeviceDescriptor = {
    val __obj = js.Dynamic.literal(bcdDeviceRevision = bcdDeviceRevision.asInstanceOf[js.Any], bcdUsb = bcdUsb.asInstanceOf[js.Any], maxPacketSize0 = maxPacketSize0.asInstanceOf[js.Any], numberOfConfigurations = numberOfConfigurations.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbDeviceDescriptor]
  }
}

