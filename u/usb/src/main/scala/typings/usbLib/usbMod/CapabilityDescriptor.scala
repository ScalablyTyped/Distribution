package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "CapabilityDescriptor")
@js.native
class CapabilityDescriptor () extends js.Object {
  /** Descriptor type. */
  var bDescriptorType: scala.Double = js.native
  /** Device Capability type. */
  var bDevCapabilityType: scala.Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: scala.Double = js.native
  /** Device Capability data (bLength - 3 bytes) */
  var dev_capability_data: nodeLib.Buffer = js.native
}

