package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a USB configuration, its descriptors and the interfaces defined within that configuration. For an explanation of a USB configuration, see Section 9.6.3 in the Universal Serial Bus (USB) specification. */
trait UsbConfiguration extends js.Object {
  /** Gets the object that contains the first 9 bytes of the descriptor associated with the USB configuration. */
  var configurationDescriptor: UsbConfigurationDescriptor
  /** Gets an array of objects that represent the full set of descriptors associated with a USB configuration. */
  var descriptors: IVectorView[UsbDescriptor]
  /** Gets an array of USB interfaces available in the USB configuration. */
  var usbInterfaces: IVectorView[UsbInterface]
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
}

