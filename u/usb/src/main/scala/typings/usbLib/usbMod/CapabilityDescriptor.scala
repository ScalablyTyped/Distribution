package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "CapabilityDescriptor")
@js.native
class CapabilityDescriptor () extends js.Object {
  var bDescriptorType: scala.Double = js.native
  var bDevCapabilityType: scala.Double = js.native
  var bLength: scala.Double = js.native
  var dev_capability_data: nodeLib.Buffer = js.native
}

