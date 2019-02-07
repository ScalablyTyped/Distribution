package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "InterfaceDescriptor")
@js.native
class InterfaceDescriptor () extends js.Object {
  /** Value used to select this alternate setting for this interface. */
  var bAlternateSetting: scala.Double = js.native
  /** Descriptor type. */
  var bDescriptorType: scala.Double = js.native
  /** USB-IF class code for this interface. */
  var bInterfaceClass: scala.Double = js.native
  /** Number of this interface. */
  var bInterfaceNumber: scala.Double = js.native
  /** USB-IF protocol code for this interface, qualified by the bInterfaceClass and bInterfaceSubClass values. */
  var bInterfaceProtocol: scala.Double = js.native
  /** USB-IF subclass code for this interface, qualified by the bInterfaceClass value. */
  var bInterfaceSubClass: scala.Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: scala.Double = js.native
  /** Number of endpoints used by this interface (excluding the control endpoint). */
  var bNumEndpoints: scala.Double = js.native
  /** Array of endpoint descriptors. */
  var endpoints: js.Array[EndpointDescriptor] = js.native
  /** Extra descriptors. */
  var extra: nodeLib.Buffer = js.native
  /** Index of string descriptor describing this interface. */
  var iInterface: scala.Double = js.native
}

