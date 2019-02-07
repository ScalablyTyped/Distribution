package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "BosDescriptor")
@js.native
class BosDescriptor () extends js.Object {
  /** Descriptor type. */
  var bDescriptorType: scala.Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: scala.Double = js.native
  /** The number of separate device capability descriptors in the BOS. */
  var bNumDeviceCaps: scala.Double = js.native
  /** Device Capability Descriptors */
  var capabilities: js.Array[CapabilityDescriptor] = js.native
  /** Length of this descriptor and all of its sub descriptors. */
  var wTotalLength: scala.Double = js.native
}

