package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The endpoint descriptor for a USB bulk OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. */
trait UsbBulkOutEndpointDescriptor extends StObject {
  
  /** Gets the USB endpoint number of the bulk OUT endpoint. */
  var endpointNumber: Double
  
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  var maxPacketSize: Double
  
  /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
  var pipe: UsbBulkOutPipe
}
object UsbBulkOutEndpointDescriptor {
  
  inline def apply(endpointNumber: Double, maxPacketSize: Double, pipe: UsbBulkOutPipe): UsbBulkOutEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkOutEndpointDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsbBulkOutEndpointDescriptor] (val x: Self) extends AnyVal {
    
    inline def setEndpointNumber(value: Double): Self = StObject.set(x, "endpointNumber", value.asInstanceOf[js.Any])
    
    inline def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
    
    inline def setPipe(value: UsbBulkOutPipe): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
  }
}
