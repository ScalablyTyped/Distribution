package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Derives information from the USB endpoint descriptor of the endpoint, such as type, direction, and endpoint number. This object also gets the specific endpoint descriptors based on the type of endpoint. For an explanation of an endpoint descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
@js.native
trait UsbEndpointDescriptor extends js.Object {
  
  /** Gets an object that represents the endpoint descriptor for the USB bulk IN endpoint. */
  var asBulkInEndpointDescriptor: UsbBulkInEndpointDescriptor = js.native
  
  /** Gets an object that represents the endpoint descriptor for the USB bulk OUT endpoint. */
  var asBulkOutEndpointDescriptor: UsbBulkOutEndpointDescriptor = js.native
  
  /** Gets an object that represents the endpoint descriptor for the USB interrupt IN endpoint. */
  var asInterruptInEndpointDescriptor: UsbInterruptInEndpointDescriptor = js.native
  
  /** Gets an object that represents the endpoint descriptor for the USB interrupt OUT endpoint. */
  var asInterruptOutEndpointDescriptor: UsbInterruptOutEndpointDescriptor = js.native
  
  /** Gets the direction of the USB endpoint. */
  var direction: UsbTransferDirection = js.native
  
  /** Gets the USB endpoint number. */
  var endpointNumber: Double = js.native
  
  /** Gets the type of USB endpoint. */
  var endpointType: UsbEndpointType = js.native
}
object UsbEndpointDescriptor {
  
  @scala.inline
  def apply(
    asBulkInEndpointDescriptor: UsbBulkInEndpointDescriptor,
    asBulkOutEndpointDescriptor: UsbBulkOutEndpointDescriptor,
    asInterruptInEndpointDescriptor: UsbInterruptInEndpointDescriptor,
    asInterruptOutEndpointDescriptor: UsbInterruptOutEndpointDescriptor,
    direction: UsbTransferDirection,
    endpointNumber: Double,
    endpointType: UsbEndpointType
  ): UsbEndpointDescriptor = {
    val __obj = js.Dynamic.literal(asBulkInEndpointDescriptor = asBulkInEndpointDescriptor.asInstanceOf[js.Any], asBulkOutEndpointDescriptor = asBulkOutEndpointDescriptor.asInstanceOf[js.Any], asInterruptInEndpointDescriptor = asInterruptInEndpointDescriptor.asInstanceOf[js.Any], asInterruptOutEndpointDescriptor = asInterruptOutEndpointDescriptor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], endpointNumber = endpointNumber.asInstanceOf[js.Any], endpointType = endpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbEndpointDescriptor]
  }
  
  @scala.inline
  implicit class UsbEndpointDescriptorOps[Self <: UsbEndpointDescriptor] (val x: Self) extends AnyVal {
    
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
    def setAsBulkInEndpointDescriptor(value: UsbBulkInEndpointDescriptor): Self = this.set("asBulkInEndpointDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsBulkOutEndpointDescriptor(value: UsbBulkOutEndpointDescriptor): Self = this.set("asBulkOutEndpointDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsInterruptInEndpointDescriptor(value: UsbInterruptInEndpointDescriptor): Self = this.set("asInterruptInEndpointDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsInterruptOutEndpointDescriptor(value: UsbInterruptOutEndpointDescriptor): Self = this.set("asInterruptOutEndpointDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: UsbTransferDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNumber(value: Double): Self = this.set("endpointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointType(value: UsbEndpointType): Self = this.set("endpointType", value.asInstanceOf[js.Any])
  }
}
