package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Derives information from the USB endpoint descriptor of the endpoint, such as type, direction, and endpoint number. This object also gets the specific endpoint descriptors based on the type of endpoint. For an explanation of an endpoint descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
trait UsbEndpointDescriptor extends StObject {
  
  /** Gets an object that represents the endpoint descriptor for the USB bulk IN endpoint. */
  var asBulkInEndpointDescriptor: UsbBulkInEndpointDescriptor
  
  /** Gets an object that represents the endpoint descriptor for the USB bulk OUT endpoint. */
  var asBulkOutEndpointDescriptor: UsbBulkOutEndpointDescriptor
  
  /** Gets an object that represents the endpoint descriptor for the USB interrupt IN endpoint. */
  var asInterruptInEndpointDescriptor: UsbInterruptInEndpointDescriptor
  
  /** Gets an object that represents the endpoint descriptor for the USB interrupt OUT endpoint. */
  var asInterruptOutEndpointDescriptor: UsbInterruptOutEndpointDescriptor
  
  /** Gets the direction of the USB endpoint. */
  var direction: UsbTransferDirection
  
  /** Gets the USB endpoint number. */
  var endpointNumber: Double
  
  /** Gets the type of USB endpoint. */
  var endpointType: UsbEndpointType
}
object UsbEndpointDescriptor {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: UsbEndpointDescriptor] (val x: Self) extends AnyVal {
    
    inline def setAsBulkInEndpointDescriptor(value: UsbBulkInEndpointDescriptor): Self = StObject.set(x, "asBulkInEndpointDescriptor", value.asInstanceOf[js.Any])
    
    inline def setAsBulkOutEndpointDescriptor(value: UsbBulkOutEndpointDescriptor): Self = StObject.set(x, "asBulkOutEndpointDescriptor", value.asInstanceOf[js.Any])
    
    inline def setAsInterruptInEndpointDescriptor(value: UsbInterruptInEndpointDescriptor): Self = StObject.set(x, "asInterruptInEndpointDescriptor", value.asInstanceOf[js.Any])
    
    inline def setAsInterruptOutEndpointDescriptor(value: UsbInterruptOutEndpointDescriptor): Self = StObject.set(x, "asInterruptOutEndpointDescriptor", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: UsbTransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setEndpointNumber(value: Double): Self = StObject.set(x, "endpointNumber", value.asInstanceOf[js.Any])
    
    inline def setEndpointType(value: UsbEndpointType): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
  }
}
