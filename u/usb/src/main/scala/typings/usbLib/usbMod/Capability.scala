package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "Capability")
@js.native
class Capability () extends js.Object {
  /** Buffer capability data. */
  var data: nodeLib.Buffer = js.native
  /** Object with fields from the capability descriptor -- see libusb documentation or USB spec. */
  var descriptor: CapabilityDescriptor = js.native
  /** Integer capability type. */
  var `type`: scala.Double = js.native
}

