package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a USB configuration, its descriptors and the interfaces defined within that configuration. For an explanation of a USB configuration, see Section 9.6.3 in the Universal Serial Bus (USB) specification. */
trait UsbConfiguration extends StObject {
  
  /** Gets the object that contains the first 9 bytes of the descriptor associated with the USB configuration. */
  var configurationDescriptor: UsbConfigurationDescriptor
  
  /** Gets an array of objects that represent the full set of descriptors associated with a USB configuration. */
  var descriptors: IVectorView[UsbDescriptor]
  
  /** Gets an array of USB interfaces available in the USB configuration. */
  var usbInterfaces: IVectorView[UsbInterface]
}
object UsbConfiguration {
  
  inline def apply(
    configurationDescriptor: UsbConfigurationDescriptor,
    descriptors: IVectorView[UsbDescriptor],
    usbInterfaces: IVectorView[UsbInterface]
  ): UsbConfiguration = {
    val __obj = js.Dynamic.literal(configurationDescriptor = configurationDescriptor.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], usbInterfaces = usbInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbConfiguration]
  }
  
  extension [Self <: UsbConfiguration](x: Self) {
    
    inline def setConfigurationDescriptor(value: UsbConfigurationDescriptor): Self = StObject.set(x, "configurationDescriptor", value.asInstanceOf[js.Any])
    
    inline def setDescriptors(value: IVectorView[UsbDescriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setUsbInterfaces(value: IVectorView[UsbInterface]): Self = StObject.set(x, "usbInterfaces", value.asInstanceOf[js.Any])
  }
}
