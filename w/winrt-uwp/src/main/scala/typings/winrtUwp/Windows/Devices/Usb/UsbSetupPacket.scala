package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the setup packet for a USB control transfer. For an explanation of the setup packet, see Table 9.2 in the Universal Serial Bus (USB) specification. */
trait UsbSetupPacket extends StObject {
  
  /** Gets or sets the wIndex field in the setup packet of the USB control transfer. */
  var index: Double
  
  /** Gets the length, in bytes, of the setup packet. */
  var length: Double
  
  /** Gets or sets the bRequest field in the setup packet of the USB control transfer. */
  var request: Double
  
  /** Gets or sets the bmRequestType field in the setup packet of the USB control transfer. That field is represented by a UsbControlRequestType object. */
  var requestType: UsbControlRequestType
  
  /** Gets or sets the wValue field in the setup packet of the USB control transfer. */
  var value: Double
}
object UsbSetupPacket {
  
  inline def apply(index: Double, length: Double, request: Double, requestType: UsbControlRequestType, value: Double): UsbSetupPacket = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbSetupPacket]
  }
  
  extension [Self <: UsbSetupPacket](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Double): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestType(value: UsbControlRequestType): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
