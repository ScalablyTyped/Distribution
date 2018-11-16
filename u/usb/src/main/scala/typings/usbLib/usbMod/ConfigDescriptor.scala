package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "ConfigDescriptor")
@js.native
class ConfigDescriptor () extends js.Object {
  var bConfigurationValue: scala.Double = js.native
  var bDescriptorType: scala.Double = js.native
  var bLength: scala.Double = js.native
  var bMaxPower: scala.Double = js.native
  var bNumInterfaces: scala.Double = js.native
  var bmAttributes: scala.Double = js.native
  var extra: nodeLib.Buffer = js.native
  var iConfiguration: scala.Double = js.native
  var interfaces: js.Array[js.Array[InterfaceDescriptor]] = js.native
  var wTotalLength: scala.Double = js.native
}

