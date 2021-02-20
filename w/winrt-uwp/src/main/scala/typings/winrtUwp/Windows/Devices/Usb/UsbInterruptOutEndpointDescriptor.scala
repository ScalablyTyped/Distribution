package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The endpoint descriptor for a USB interrupt OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint to send data. */
@js.native
trait UsbInterruptOutEndpointDescriptor extends StObject {
  
  /** Gets the USB endpoint number of the interrupt OUT endpoint. */
  var endpointNumber: Double = js.native
  
  /** Gets the poling interval of the USB interrupt endpoint. */
  var interval: Double = js.native
  
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  var maxPacketSize: Double = js.native
  
  /** Gets the object that represents the pipe that the host opens to communicate with the interrupt OUT endpoint. */
  var pipe: UsbInterruptOutPipe = js.native
}
object UsbInterruptOutEndpointDescriptor {
  
  @scala.inline
  def apply(endpointNumber: Double, interval: Double, maxPacketSize: Double, pipe: UsbInterruptOutPipe): UsbInterruptOutEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptOutEndpointDescriptor]
  }
  
  @scala.inline
  implicit class UsbInterruptOutEndpointDescriptorMutableBuilder[Self <: UsbInterruptOutEndpointDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointNumber(value: Double): Self = StObject.set(x, "endpointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipe(value: UsbInterruptOutPipe): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
  }
}
