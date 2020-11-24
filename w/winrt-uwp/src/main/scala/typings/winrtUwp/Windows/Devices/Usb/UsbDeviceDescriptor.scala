package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Derives information from the USB device descriptor of the device. For an explanation of the device descriptor, see Table 9.8 in the Universal Serial Bus Specification. */
@js.native
trait UsbDeviceDescriptor extends js.Object {
  
  /** Gets the bcdDeviceRevision field of the USB device descriptor. The value indicates the revision number defined by the device and is a binary-coded decimal number. */
  var bcdDeviceRevision: Double = js.native
  
  /** Gets the bcdUSB field of the USB device descriptor. The value indicates the version of the USB specification to which the device conforms. */
  var bcdUsb: Double = js.native
  
  /** Gets the bMaxPacketSize0 field of the USB device descriptor. The value indicates the maximum packet size, in bytes, for endpoint zero of the device. This value can be 8, 16, 32, or 64. */
  var maxPacketSize0: Double = js.native
  
  /** Gets the bNumConfigurations field of the USB device descriptor. The value indicates the total count of USB configurations supported by the device. */
  var numberOfConfigurations: Double = js.native
  
  /** Gets the idProduct field of the USB device descriptor. This value indicates the device-specific product identifier and is assigned by the manufacturer. */
  var productId: Double = js.native
  
  /** Gets the idVendor field of the USB device descriptor. The value indicates the vendor identifier for the device as assigned by the USB specification committee. */
  var vendorId: Double = js.native
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
  
  @scala.inline
  implicit class UsbDeviceDescriptorOps[Self <: UsbDeviceDescriptor] (val x: Self) extends AnyVal {
    
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
    def setBcdDeviceRevision(value: Double): Self = this.set("bcdDeviceRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBcdUsb(value: Double): Self = this.set("bcdUsb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketSize0(value: Double): Self = this.set("maxPacketSize0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfConfigurations(value: Double): Self = this.set("numberOfConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: Double): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: Double): Self = this.set("vendorId", value.asInstanceOf[js.Any])
  }
}
