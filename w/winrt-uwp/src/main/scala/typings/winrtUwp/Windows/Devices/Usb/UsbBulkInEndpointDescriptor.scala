package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The endpoint descriptor for a USB bulk IN endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be read from the endpoint, in a single transfer. */
@js.native
trait UsbBulkInEndpointDescriptor extends StObject {
  
  /** Gets the USB endpoint number of the bulk IN endpoint. */
  var endpointNumber: Double = js.native
  
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint, in a single packet. */
  var maxPacketSize: Double = js.native
  
  /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
  var pipe: UsbBulkInPipe = js.native
}
object UsbBulkInEndpointDescriptor {
  
  @scala.inline
  def apply(endpointNumber: Double, maxPacketSize: Double, pipe: UsbBulkInPipe): UsbBulkInEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkInEndpointDescriptor]
  }
  
  @scala.inline
  implicit class UsbBulkInEndpointDescriptorMutableBuilder[Self <: UsbBulkInEndpointDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointNumber(value: Double): Self = StObject.set(x, "endpointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipe(value: UsbBulkInPipe): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
  }
}
