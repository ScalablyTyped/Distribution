package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a USB configuration, its descriptors and the interfaces defined within that configuration. For an explanation of a USB configuration, see Section 9.6.3 in the Universal Serial Bus (USB) specification. */
@JSGlobal("Windows.Devices.Usb.UsbConfiguration")
@js.native
abstract class UsbConfiguration () extends js.Object {
  /** Gets the object that contains the first 9 bytes of the descriptor associated with the USB configuration. */
  var configurationDescriptor: UsbConfigurationDescriptor = js.native
  /** Gets an array of objects that represent the full set of descriptors associated with a USB configuration. */
  var descriptors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[UsbDescriptor] = js.native
  /** Gets an array of USB interfaces available in the USB configuration. */
  var usbInterfaces: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[UsbInterface] = js.native
}

