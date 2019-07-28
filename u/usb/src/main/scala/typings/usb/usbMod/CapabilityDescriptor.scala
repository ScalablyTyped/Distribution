package typings.usb.usbMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "CapabilityDescriptor")
@js.native
class CapabilityDescriptor () extends js.Object {
  /** Descriptor type. */
  var bDescriptorType: Double = js.native
  /** Device Capability type. */
  var bDevCapabilityType: Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: Double = js.native
  /** Device Capability data (bLength - 3 bytes) */
  var dev_capability_data: Buffer = js.native
}

