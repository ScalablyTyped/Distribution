package typings.usb.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LIBUSB_CLASS_APPLICATION: Double = js.native
  val LIBUSB_CLASS_AUDIO: Double = js.native
  val LIBUSB_CLASS_COMM: Double = js.native
  val LIBUSB_CLASS_DATA: Double = js.native
  val LIBUSB_CLASS_HID: Double = js.native
  val LIBUSB_CLASS_HUB: Double = js.native
  val LIBUSB_CLASS_MASS_STORAGE: Double = js.native
  val LIBUSB_CLASS_PER_INTERFACE: Double = js.native
  val LIBUSB_CLASS_PRINTER: Double = js.native
  val LIBUSB_CLASS_PTP: Double = js.native
  val LIBUSB_CLASS_VENDOR_SPEC: Double = js.native
  val LIBUSB_CLASS_WIRELESS: Double = js.native
  val LIBUSB_CONTROL_SETUP_SIZE: Double = js.native
  val LIBUSB_DT_CONFIG: Double = js.native
  val LIBUSB_DT_DEVICE: Double = js.native
  val LIBUSB_DT_ENDPOINT: Double = js.native
  val LIBUSB_DT_HID: Double = js.native
  val LIBUSB_DT_HUB: Double = js.native
  val LIBUSB_DT_INTERFACE: Double = js.native
  val LIBUSB_DT_PHYSICAL: Double = js.native
  val LIBUSB_DT_REPORT: Double = js.native
  val LIBUSB_DT_STRING: Double = js.native
  val LIBUSB_ENDPOINT_IN: Double = js.native
  val LIBUSB_ENDPOINT_OUT: Double = js.native
  val LIBUSB_ERROR_ACCESS: Double = js.native
  val LIBUSB_ERROR_BUSY: Double = js.native
  val LIBUSB_ERROR_INTERRUPTED: Double = js.native
  val LIBUSB_ERROR_INVALID_PARAM: Double = js.native
  val LIBUSB_ERROR_IO: Double = js.native
  val LIBUSB_ERROR_NOT_FOUND: Double = js.native
  val LIBUSB_ERROR_NOT_SUPPORTED: Double = js.native
  val LIBUSB_ERROR_NO_DEVICE: Double = js.native
  val LIBUSB_ERROR_NO_MEM: Double = js.native
  val LIBUSB_ERROR_OTHER: Double = js.native
  val LIBUSB_ERROR_OVERFLOW: Double = js.native
  val LIBUSB_ERROR_PIPE: Double = js.native
  val LIBUSB_ERROR_TIMEOUT: Double = js.native
  val LIBUSB_ISO_SYNC_TYPE_ADAPTIVE: Double = js.native
  val LIBUSB_ISO_SYNC_TYPE_ASYNC: Double = js.native
  val LIBUSB_ISO_SYNC_TYPE_NONE: Double = js.native
  val LIBUSB_ISO_SYNC_TYPE_SYNC: Double = js.native
  val LIBUSB_ISO_USAGE_TYPE_DATA: Double = js.native
  val LIBUSB_ISO_USAGE_TYPE_FEEDBACK: Double = js.native
  val LIBUSB_ISO_USAGE_TYPE_IMPLICIT: Double = js.native
  val LIBUSB_RECIPIENT_DEVICE: Double = js.native
  val LIBUSB_RECIPIENT_ENDPOINT: Double = js.native
  val LIBUSB_RECIPIENT_INTERFACE: Double = js.native
  val LIBUSB_RECIPIENT_OTHER: Double = js.native
  val LIBUSB_REQUEST_CLEAR_FEATURE: Double = js.native
  val LIBUSB_REQUEST_GET_CONFIGURATION: Double = js.native
  val LIBUSB_REQUEST_GET_DESCRIPTOR: Double = js.native
  val LIBUSB_REQUEST_GET_INTERFACE: Double = js.native
  val LIBUSB_REQUEST_GET_STATUS: Double = js.native
  val LIBUSB_REQUEST_SET_ADDRESS: Double = js.native
  val LIBUSB_REQUEST_SET_CONFIGURATION: Double = js.native
  val LIBUSB_REQUEST_SET_DESCRIPTOR: Double = js.native
  val LIBUSB_REQUEST_SET_FEATURE: Double = js.native
  val LIBUSB_REQUEST_SET_INTERFACE: Double = js.native
  val LIBUSB_REQUEST_SYNCH_FRAME: Double = js.native
  val LIBUSB_REQUEST_TYPE_CLASS: Double = js.native
  val LIBUSB_REQUEST_TYPE_RESERVED: Double = js.native
  val LIBUSB_REQUEST_TYPE_STANDARD: Double = js.native
  val LIBUSB_REQUEST_TYPE_VENDOR: Double = js.native
  val LIBUSB_TRANSFER_CANCELLED: Double = js.native
  val LIBUSB_TRANSFER_COMPLETED: Double = js.native
  val LIBUSB_TRANSFER_ERROR: Double = js.native
  val LIBUSB_TRANSFER_FREE_BUFFER: Double = js.native
  val LIBUSB_TRANSFER_FREE_TRANSFER: Double = js.native
  val LIBUSB_TRANSFER_NO_DEVICE: Double = js.native
  val LIBUSB_TRANSFER_OVERFLOW: Double = js.native
  val LIBUSB_TRANSFER_SHORT_NOT_OK: Double = js.native
  val LIBUSB_TRANSFER_STALL: Double = js.native
  val LIBUSB_TRANSFER_TIMED_OUT: Double = js.native
  val LIBUSB_TRANSFER_TYPE_BULK: Double = js.native
  val LIBUSB_TRANSFER_TYPE_CONTROL: Double = js.native
  val LIBUSB_TRANSFER_TYPE_INTERRUPT: Double = js.native
  val LIBUSB_TRANSFER_TYPE_ISOCHRONOUS: Double = js.native
  def findByIds(vid: Double, pid: Double): Device = js.native
  def getDeviceList(): js.Array[Device] = js.native
  def on(event: String, callback: js.Function1[/* device */ Device, Unit]): Unit = js.native
  def removeListener(event: String, callback: js.Function1[/* device */ Device, Unit]): Unit = js.native
  def setDebugLevel(level: Double): Unit = js.native
}

