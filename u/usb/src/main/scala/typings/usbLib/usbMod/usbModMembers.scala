package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", JSImport.Namespace)
@js.native
object usbModMembers extends js.Object {
  val LIBUSB_CLASS_APPLICATION: scala.Double = js.native
  val LIBUSB_CLASS_AUDIO: scala.Double = js.native
  val LIBUSB_CLASS_COMM: scala.Double = js.native
  val LIBUSB_CLASS_DATA: scala.Double = js.native
  val LIBUSB_CLASS_HID: scala.Double = js.native
  val LIBUSB_CLASS_HUB: scala.Double = js.native
  val LIBUSB_CLASS_MASS_STORAGE: scala.Double = js.native
  val LIBUSB_CLASS_PER_INTERFACE: scala.Double = js.native
  val LIBUSB_CLASS_PRINTER: scala.Double = js.native
  val LIBUSB_CLASS_PTP: scala.Double = js.native
  val LIBUSB_CLASS_VENDOR_SPEC: scala.Double = js.native
  val LIBUSB_CLASS_WIRELESS: scala.Double = js.native
  val LIBUSB_CONTROL_SETUP_SIZE: scala.Double = js.native
  val LIBUSB_DT_CONFIG: scala.Double = js.native
  val LIBUSB_DT_DEVICE: scala.Double = js.native
  val LIBUSB_DT_ENDPOINT: scala.Double = js.native
  val LIBUSB_DT_HID: scala.Double = js.native
  val LIBUSB_DT_HUB: scala.Double = js.native
  val LIBUSB_DT_INTERFACE: scala.Double = js.native
  val LIBUSB_DT_PHYSICAL: scala.Double = js.native
  val LIBUSB_DT_REPORT: scala.Double = js.native
  val LIBUSB_DT_STRING: scala.Double = js.native
  val LIBUSB_ENDPOINT_IN: scala.Double = js.native
  val LIBUSB_ENDPOINT_OUT: scala.Double = js.native
  val LIBUSB_ERROR_ACCESS: scala.Double = js.native
  val LIBUSB_ERROR_BUSY: scala.Double = js.native
  val LIBUSB_ERROR_INTERRUPTED: scala.Double = js.native
  val LIBUSB_ERROR_INVALID_PARAM: scala.Double = js.native
  val LIBUSB_ERROR_IO: scala.Double = js.native
  val LIBUSB_ERROR_NOT_FOUND: scala.Double = js.native
  val LIBUSB_ERROR_NOT_SUPPORTED: scala.Double = js.native
  val LIBUSB_ERROR_NO_DEVICE: scala.Double = js.native
  val LIBUSB_ERROR_NO_MEM: scala.Double = js.native
  val LIBUSB_ERROR_OTHER: scala.Double = js.native
  val LIBUSB_ERROR_OVERFLOW: scala.Double = js.native
  val LIBUSB_ERROR_PIPE: scala.Double = js.native
  val LIBUSB_ERROR_TIMEOUT: scala.Double = js.native
  val LIBUSB_ISO_SYNC_TYPE_ADAPTIVE: scala.Double = js.native
  val LIBUSB_ISO_SYNC_TYPE_ASYNC: scala.Double = js.native
  val LIBUSB_ISO_SYNC_TYPE_NONE: scala.Double = js.native
  val LIBUSB_ISO_SYNC_TYPE_SYNC: scala.Double = js.native
  val LIBUSB_ISO_USAGE_TYPE_DATA: scala.Double = js.native
  val LIBUSB_ISO_USAGE_TYPE_FEEDBACK: scala.Double = js.native
  val LIBUSB_ISO_USAGE_TYPE_IMPLICIT: scala.Double = js.native
  val LIBUSB_RECIPIENT_DEVICE: scala.Double = js.native
  val LIBUSB_RECIPIENT_ENDPOINT: scala.Double = js.native
  val LIBUSB_RECIPIENT_INTERFACE: scala.Double = js.native
  val LIBUSB_RECIPIENT_OTHER: scala.Double = js.native
  val LIBUSB_REQUEST_CLEAR_FEATURE: scala.Double = js.native
  val LIBUSB_REQUEST_GET_CONFIGURATION: scala.Double = js.native
  val LIBUSB_REQUEST_GET_DESCRIPTOR: scala.Double = js.native
  val LIBUSB_REQUEST_GET_INTERFACE: scala.Double = js.native
  val LIBUSB_REQUEST_GET_STATUS: scala.Double = js.native
  val LIBUSB_REQUEST_SET_ADDRESS: scala.Double = js.native
  val LIBUSB_REQUEST_SET_CONFIGURATION: scala.Double = js.native
  val LIBUSB_REQUEST_SET_DESCRIPTOR: scala.Double = js.native
  val LIBUSB_REQUEST_SET_FEATURE: scala.Double = js.native
  val LIBUSB_REQUEST_SET_INTERFACE: scala.Double = js.native
  val LIBUSB_REQUEST_SYNCH_FRAME: scala.Double = js.native
  val LIBUSB_REQUEST_TYPE_CLASS: scala.Double = js.native
  val LIBUSB_REQUEST_TYPE_RESERVED: scala.Double = js.native
  val LIBUSB_REQUEST_TYPE_STANDARD: scala.Double = js.native
  val LIBUSB_REQUEST_TYPE_VENDOR: scala.Double = js.native
  val LIBUSB_TRANSFER_CANCELLED: scala.Double = js.native
  val LIBUSB_TRANSFER_COMPLETED: scala.Double = js.native
  val LIBUSB_TRANSFER_ERROR: scala.Double = js.native
  val LIBUSB_TRANSFER_FREE_BUFFER: scala.Double = js.native
  val LIBUSB_TRANSFER_FREE_TRANSFER: scala.Double = js.native
  val LIBUSB_TRANSFER_NO_DEVICE: scala.Double = js.native
  val LIBUSB_TRANSFER_OVERFLOW: scala.Double = js.native
  val LIBUSB_TRANSFER_SHORT_NOT_OK: scala.Double = js.native
  val LIBUSB_TRANSFER_STALL: scala.Double = js.native
  val LIBUSB_TRANSFER_TIMED_OUT: scala.Double = js.native
  val LIBUSB_TRANSFER_TYPE_BULK: scala.Double = js.native
  val LIBUSB_TRANSFER_TYPE_CONTROL: scala.Double = js.native
  val LIBUSB_TRANSFER_TYPE_INTERRUPT: scala.Double = js.native
  val LIBUSB_TRANSFER_TYPE_ISOCHRONOUS: scala.Double = js.native
  def findByIds(vid: scala.Double, pid: scala.Double): Device = js.native
  def getDeviceList(): js.Array[Device] = js.native
  def on(event: java.lang.String, callback: js.Function1[/* device */ Device, scala.Unit]): scala.Unit = js.native
  def setDebugLevel(level: scala.Double): scala.Unit = js.native
}

