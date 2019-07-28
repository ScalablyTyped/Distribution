package typings.usb.usbMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends EventEmitter {
  /** Object with fields from the endpoint descriptor -- see libusb documentation or USB spec. */
  var descriptor: EndpointDescriptor = js.native
  /** Endpoint direction: `"in"` or `"out"`. */
  var direction: String = js.native
  /** Sets the timeout in milliseconds for transfers on this endpoint. The default, `0`, is infinite timeout. */
  var timeout: Double = js.native
  /** Endpoint type: `usb.LIBUSB_TRANSFER_TYPE_BULK`, `usb.LIBUSB_TRANSFER_TYPE_INTERRUPT`, or `usb.LIBUSB_TRANSFER_TYPE_ISOCHRONOUS`. */
  var transferType: Double = js.native
}

