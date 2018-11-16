package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "InterfaceDescriptor")
@js.native
class InterfaceDescriptor () extends js.Object {
  var bAlternateSetting: scala.Double = js.native
  var bDescriptorType: scala.Double = js.native
  var bInterfaceClass: scala.Double = js.native
  var bInterfaceNumber: scala.Double = js.native
  var bInterfaceProtocol: scala.Double = js.native
  var bInterfaceSubClass: scala.Double = js.native
  var bLength: scala.Double = js.native
  var bNumEndpoints: scala.Double = js.native
  var endpoints: js.Array[EndpointDescriptor] = js.native
  var extra: nodeLib.Buffer = js.native
  var iInterface: scala.Double = js.native
}

