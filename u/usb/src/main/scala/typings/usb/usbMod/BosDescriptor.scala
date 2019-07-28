package typings.usb.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "BosDescriptor")
@js.native
class BosDescriptor () extends js.Object {
  /** Descriptor type. */
  var bDescriptorType: Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: Double = js.native
  /** The number of separate device capability descriptors in the BOS. */
  var bNumDeviceCaps: Double = js.native
  /** Device Capability Descriptors */
  var capabilities: js.Array[CapabilityDescriptor] = js.native
  /** Length of this descriptor and all of its sub descriptors. */
  var wTotalLength: Double = js.native
}

