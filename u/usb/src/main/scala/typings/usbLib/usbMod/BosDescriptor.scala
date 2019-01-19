package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "BosDescriptor")
@js.native
class BosDescriptor () extends js.Object {
  var bDescriptorType: scala.Double = js.native
  var bLength: scala.Double = js.native
  var bNumDeviceCaps: scala.Double = js.native
  var capabilities: js.Array[CapabilityDescriptor] = js.native
  var wTotalLength: scala.Double = js.native
}

