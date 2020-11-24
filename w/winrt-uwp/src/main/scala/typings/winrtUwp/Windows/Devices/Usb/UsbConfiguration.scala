package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a USB configuration, its descriptors and the interfaces defined within that configuration. For an explanation of a USB configuration, see Section 9.6.3 in the Universal Serial Bus (USB) specification. */
@js.native
trait UsbConfiguration extends js.Object {
  
  /** Gets the object that contains the first 9 bytes of the descriptor associated with the USB configuration. */
  var configurationDescriptor: UsbConfigurationDescriptor = js.native
  
  /** Gets an array of objects that represent the full set of descriptors associated with a USB configuration. */
  var descriptors: IVectorView[UsbDescriptor] = js.native
  
  /** Gets an array of USB interfaces available in the USB configuration. */
  var usbInterfaces: IVectorView[UsbInterface] = js.native
}
object UsbConfiguration {
  
  @scala.inline
  def apply(
    configurationDescriptor: UsbConfigurationDescriptor,
    descriptors: IVectorView[UsbDescriptor],
    usbInterfaces: IVectorView[UsbInterface]
  ): UsbConfiguration = {
    val __obj = js.Dynamic.literal(configurationDescriptor = configurationDescriptor.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], usbInterfaces = usbInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbConfiguration]
  }
  
  @scala.inline
  implicit class UsbConfigurationOps[Self <: UsbConfiguration] (val x: Self) extends AnyVal {
    
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
    def setConfigurationDescriptor(value: UsbConfigurationDescriptor): Self = this.set("configurationDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptors(value: IVectorView[UsbDescriptor]): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbInterfaces(value: IVectorView[UsbInterface]): Self = this.set("usbInterfaces", value.asInstanceOf[js.Any])
  }
}
