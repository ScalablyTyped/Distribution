package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "DeviceDescriptor")
@js.native
class DeviceDescriptor () extends js.Object {
  /** Descriptor type. */
  var bDescriptorType: scala.Double = js.native
  /** USB-IF class code for the device. */
  var bDeviceClass: scala.Double = js.native
  /** USB-IF protocol code for the device, qualified by the bDeviceClass and bDeviceSubClass values. */
  var bDeviceProtocol: scala.Double = js.native
  /** USB-IF subclass code for the device, qualified by the bDeviceClass value. */
  var bDeviceSubClass: scala.Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: scala.Double = js.native
  /** Maximum packet size for endpoint 0. */
  var bMaxPacketSize0: scala.Double = js.native
  /** Number of possible configurations. */
  var bNumConfigurations: scala.Double = js.native
  /** Device release number in binary-coded decimal. */
  var bcdDevice: scala.Double = js.native
  /** USB specification release number in binary-coded decimal. */
  var bcdUSB: scala.Double = js.native
  /** Index of string descriptor describing manufacturer. */
  var iManufacturer: scala.Double = js.native
  /** Index of string descriptor describing product. */
  var iProduct: scala.Double = js.native
  /** Index of string descriptor containing device serial number. */
  var iSerialNumber: scala.Double = js.native
  /** USB-IF product ID. */
  var idProduct: scala.Double = js.native
  /** USB-IF vendor ID. */
  var idVendor: scala.Double = js.native
}

