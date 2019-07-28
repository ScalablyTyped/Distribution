package typings.usb.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "DeviceDescriptor")
@js.native
class DeviceDescriptor () extends js.Object {
  /** Descriptor type. */
  var bDescriptorType: Double = js.native
  /** USB-IF class code for the device. */
  var bDeviceClass: Double = js.native
  /** USB-IF protocol code for the device, qualified by the bDeviceClass and bDeviceSubClass values. */
  var bDeviceProtocol: Double = js.native
  /** USB-IF subclass code for the device, qualified by the bDeviceClass value. */
  var bDeviceSubClass: Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: Double = js.native
  /** Maximum packet size for endpoint 0. */
  var bMaxPacketSize0: Double = js.native
  /** Number of possible configurations. */
  var bNumConfigurations: Double = js.native
  /** Device release number in binary-coded decimal. */
  var bcdDevice: Double = js.native
  /** USB specification release number in binary-coded decimal. */
  var bcdUSB: Double = js.native
  /** Index of string descriptor describing manufacturer. */
  var iManufacturer: Double = js.native
  /** Index of string descriptor describing product. */
  var iProduct: Double = js.native
  /** Index of string descriptor containing device serial number. */
  var iSerialNumber: Double = js.native
  /** USB-IF product ID. */
  var idProduct: Double = js.native
  /** USB-IF vendor ID. */
  var idVendor: Double = js.native
}

