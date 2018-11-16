package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "EndpointDescriptor")
@js.native
class EndpointDescriptor () extends js.Object {
  var bDescriptorType: scala.Double = js.native
  var bEndpointAddress: scala.Double = js.native
  var bInterval: scala.Double = js.native
  var bLength: scala.Double = js.native
  var bRefresh: scala.Double = js.native
  var bSynchAddress: scala.Double = js.native
  var bmAttributes: scala.Double = js.native
  var extra: nodeLib.Buffer = js.native
  var wMaxPacketSize: scala.Double = js.native
}

