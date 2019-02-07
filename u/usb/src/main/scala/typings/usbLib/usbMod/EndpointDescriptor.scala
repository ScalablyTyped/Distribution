package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "EndpointDescriptor")
@js.native
class EndpointDescriptor () extends js.Object {
  /** Descriptor type. */
  var bDescriptorType: scala.Double = js.native
  /** The address of the endpoint described by this descriptor. */
  var bEndpointAddress: scala.Double = js.native
  /** Interval for polling endpoint for data transfers. */
  var bInterval: scala.Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: scala.Double = js.native
  /** For audio devices only: the rate at which synchronization feedback is provided. */
  var bRefresh: scala.Double = js.native
  /** For audio devices only: the address if the synch endpoint. */
  var bSynchAddress: scala.Double = js.native
  /** Attributes which apply to the endpoint when it is configured using the bConfigurationValue. */
  var bmAttributes: scala.Double = js.native
  /**
    * Extra descriptors.
    *
    * If libusb encounters unknown endpoint descriptors, it will store them here, should you wish to parse them.
    */
  var extra: nodeLib.Buffer = js.native
  /** Maximum packet size this endpoint is capable of sending/receiving. */
  var wMaxPacketSize: scala.Double = js.native
}

