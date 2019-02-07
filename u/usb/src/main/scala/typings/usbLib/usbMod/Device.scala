package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "Device")
@js.native
class Device () extends js.Object {
  /** Contains all config descriptors of the device (same structure as .configDescriptor above) */
  var allConfigDescriptors: js.Array[ConfigDescriptor] = js.native
  /** Integer USB device number */
  var busNumber: scala.Double = js.native
  /** Object with properties for the fields of the configuration descriptor. */
  var configDescriptor: ConfigDescriptor = js.native
  /** Integer USB device address */
  var deviceAddress: scala.Double = js.native
  /** Object with properties for the fields of the device descriptor. */
  var deviceDescriptor: DeviceDescriptor = js.native
  /** List of Interface objects for the interfaces of the default configuration of the device. */
  var interfaces: js.Array[Interface] = js.native
  /** Contains the parent of the device, such as a hub. If there is no parent this property is set to `null`. */
  var parent: Device = js.native
  /** Array containing the USB device port numbers, or `undefined` if not supported on this platform. */
  var portNumbers: js.Array[scala.Double] = js.native
  /** Timeout in milliseconds to use for control transfers. */
  var timeout: scala.Double = js.native
  def __claimInterface(addr: scala.Double): scala.Unit = js.native
  def __open(): scala.Unit = js.native
  /**
    * Close the device.
    *
    * The device must be open to use this method.
    */
  def close(): scala.Unit = js.native
  /**
    * Perform a control transfer with `libusb_control_transfer`.
    *
    * Parameter `data_or_length` can be a integer length for an IN transfer, or a Buffer for an out transfer. The type must match the direction specified in the MSB of bmRequestType.
    *
    * The `data` parameter of the callback is always undefined for OUT transfers, or will be passed a Buffer for IN transfers.
    *
    * The device must be open to use this method.
    * @param bmRequestType
    * @param bRequest
    * @param wValue
    * @param wIndex
    * @param data_or_length
    * @param callback
    */
  def controlTransfer(
    bmRequestType: scala.Double,
    bRequest: scala.Double,
    wValue: scala.Double,
    wIndex: scala.Double,
    data_or_length: js.Any,
    callback: js.Function2[
      /* error */ js.UndefOr[LibUSBException], 
      /* buf */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): Device = js.native
  /**
    * Perform a control transfer to retrieve an object with properties for the fields of the Binary Object Store descriptor.
    *
    * The device must be open to use this method.
    * @param callback
    */
  def getBosDescriptor(
    callback: js.Function2[
      /* error */ js.UndefOr[java.lang.String], 
      /* descriptor */ js.UndefOr[BosDescriptor], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieve a list of Capability objects for the Binary Object Store capabilities of the device.
    *
    * The device must be open to use this method.
    * @param callback
    */
  def getCapabilities(
    callback: js.Function2[
      /* error */ js.UndefOr[java.lang.String], 
      /* capabilities */ js.UndefOr[js.Array[Capability]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Perform a control transfer to retrieve a string descriptor
    *
    * The device must be open to use this method.
    * @param desc_index
    * @param callback
    */
  def getStringDescriptor(
    desc_index: scala.Double,
    callback: js.Function2[
      /* error */ js.UndefOr[java.lang.String], 
      /* buf */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Return the interface with the specified interface number.
    *
    * The device must be open to use this method.
    * @param addr
    */
  def interface(addr: scala.Double): Interface = js.native
  /**
    * Open the device.
    * @param defaultConfig
    */
  def open(): scala.Unit = js.native
  def open(defaultConfig: scala.Boolean): scala.Unit = js.native
  /**
    * Performs a reset of the device. Callback is called when complete.
    *
    * The device must be open to use this method.
    * @param callback
    */
  def reset(callback: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
    * Set the device configuration to something other than the default (0). To use this, first call `.open(false)` (which tells it not to auto configure),
    * then before claiming an interface, call this method.
    *
    * The device must be open to use this method.
    * @param desired
    * @param cb
    */
  def setConfiguration(desired: scala.Double, cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
}

