package typings.usb

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BosDescriptor () extends js.Object {
    /** Descriptor type. */
    var bDescriptorType: Double = js.native
    /** Size of this descriptor (in bytes) */
    var bLength: Double = js.native
    /** The number of separate device capability descriptors in the BOS. */
    var bNumDeviceCaps: Double = js.native
    /** Device Capability Descriptors */
    var capabilities: js.Array[CapabilityDescriptor] = js.native
    /** Length of this descriptor and all of its sub descriptors. */
    var wTotalLength: Double = js.native
  }
  
  @js.native
  class Capability () extends js.Object {
    /** Buffer capability data. */
    var data: Buffer = js.native
    /** Object with fields from the capability descriptor -- see libusb documentation or USB spec. */
    var descriptor: CapabilityDescriptor = js.native
    /** Integer capability type. */
    var `type`: Double = js.native
  }
  
  @js.native
  class CapabilityDescriptor () extends js.Object {
    /** Descriptor type. */
    var bDescriptorType: Double = js.native
    /** Device Capability type. */
    var bDevCapabilityType: Double = js.native
    /** Size of this descriptor (in bytes) */
    var bLength: Double = js.native
    /** Device Capability data (bLength - 3 bytes) */
    var dev_capability_data: Buffer = js.native
  }
  
  @js.native
  class ConfigDescriptor () extends js.Object {
    /** Identifier value for this configuration. */
    var bConfigurationValue: Double = js.native
    /** Descriptor type. */
    var bDescriptorType: Double = js.native
    /** Size of this descriptor (in bytes) */
    var bLength: Double = js.native
    /** Maximum power consumption of the USB device from this bus in this configuration when the device is fully operation. */
    var bMaxPower: Double = js.native
    /** Number of interfaces supported by this configuration. */
    var bNumInterfaces: Double = js.native
    /** Configuration characteristics. */
    var bmAttributes: Double = js.native
    /** Extra descriptors. */
    var extra: Buffer = js.native
    /** Index of string descriptor describing this configuration. */
    var iConfiguration: Double = js.native
    /** Array of interfaces supported by this configuration. */
    var interfaces: js.Array[js.Array[InterfaceDescriptor]] = js.native
    /** Total length of data returned for this configuration. */
    var wTotalLength: Double = js.native
  }
  
  @js.native
  class Device () extends js.Object {
    /** Contains all config descriptors of the device (same structure as .configDescriptor above) */
    var allConfigDescriptors: js.Array[ConfigDescriptor] = js.native
    /** Integer USB device number */
    var busNumber: Double = js.native
    /** Object with properties for the fields of the configuration descriptor. */
    var configDescriptor: ConfigDescriptor = js.native
    /** Integer USB device address */
    var deviceAddress: Double = js.native
    /** Object with properties for the fields of the device descriptor. */
    var deviceDescriptor: DeviceDescriptor = js.native
    /** List of Interface objects for the interfaces of the default configuration of the device. */
    var interfaces: js.Array[Interface] = js.native
    /** Contains the parent of the device, such as a hub. If there is no parent this property is set to `null`. */
    var parent: Device = js.native
    /** Array containing the USB device port numbers, or `undefined` if not supported on this platform. */
    var portNumbers: js.Array[Double] = js.native
    /** Timeout in milliseconds to use for control transfers. */
    var timeout: Double = js.native
    def __claimInterface(addr: Double): Unit = js.native
    def __open(): Unit = js.native
    /**
      * Close the device.
      *
      * The device must be open to use this method.
      */
    def close(): Unit = js.native
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
      bmRequestType: Double,
      bRequest: Double,
      wValue: Double,
      wIndex: Double,
      data_or_length: js.Any,
      callback: js.Function2[/* error */ js.UndefOr[LibUSBException], /* buf */ js.UndefOr[Buffer], Unit]
    ): Device = js.native
    /**
      * Perform a control transfer to retrieve an object with properties for the fields of the Binary Object Store descriptor.
      *
      * The device must be open to use this method.
      * @param callback
      */
    def getBosDescriptor(
      callback: js.Function2[/* error */ js.UndefOr[String], /* descriptor */ js.UndefOr[BosDescriptor], Unit]
    ): Unit = js.native
    /**
      * Retrieve a list of Capability objects for the Binary Object Store capabilities of the device.
      *
      * The device must be open to use this method.
      * @param callback
      */
    def getCapabilities(
      callback: js.Function2[
          /* error */ js.UndefOr[String], 
          /* capabilities */ js.UndefOr[js.Array[Capability]], 
          Unit
        ]
    ): Unit = js.native
    /**
      * Perform a control transfer to retrieve a string descriptor
      *
      * The device must be open to use this method.
      * @param desc_index
      * @param callback
      */
    def getStringDescriptor(
      desc_index: Double,
      callback: js.Function2[/* error */ js.UndefOr[String], /* buf */ js.UndefOr[Buffer], Unit]
    ): Unit = js.native
    /**
      * Return the interface with the specified interface number.
      *
      * The device must be open to use this method.
      * @param addr
      */
    def interface(addr: Double): Interface = js.native
    /**
      * Open the device.
      * @param defaultConfig
      */
    def open(): Unit = js.native
    def open(defaultConfig: Boolean): Unit = js.native
    /**
      * Performs a reset of the device. Callback is called when complete.
      *
      * The device must be open to use this method.
      * @param callback
      */
    def reset(callback: js.Function1[/* err */ js.UndefOr[String], Unit]): Unit = js.native
    /**
      * Set the device configuration to something other than the default (0). To use this, first call `.open(false)` (which tells it not to auto configure),
      * then before claiming an interface, call this method.
      *
      * The device must be open to use this method.
      * @param desired
      * @param cb
      */
    def setConfiguration(desired: Double, cb: js.Function1[/* err */ js.UndefOr[String], Unit]): Unit = js.native
  }
  
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
  
  @js.native
  class EndpointDescriptor () extends js.Object {
    /** Descriptor type. */
    var bDescriptorType: Double = js.native
    /** The address of the endpoint described by this descriptor. */
    var bEndpointAddress: Double = js.native
    /** Interval for polling endpoint for data transfers. */
    var bInterval: Double = js.native
    /** Size of this descriptor (in bytes) */
    var bLength: Double = js.native
    /** For audio devices only: the rate at which synchronization feedback is provided. */
    var bRefresh: Double = js.native
    /** For audio devices only: the address if the synch endpoint. */
    var bSynchAddress: Double = js.native
    /** Attributes which apply to the endpoint when it is configured using the bConfigurationValue. */
    var bmAttributes: Double = js.native
    /**
      * Extra descriptors.
      *
      * If libusb encounters unknown endpoint descriptors, it will store them here, should you wish to parse them.
      */
    var extra: Buffer = js.native
    /** Maximum packet size this endpoint is capable of sending/receiving. */
    var wMaxPacketSize: Double = js.native
  }
  
  @js.native
  class InEndpoint protected () extends Endpoint {
    def this(device: Device, descriptor: EndpointDescriptor) = this()
    /**
      * Start polling the endpoint.
      *
      * The library will keep `nTransfers` transfers of size `transferSize` pending in the kernel at all times to ensure continuous data flow.
      * This is handled by the libusb event thread, so it continues even if the Node v8 thread is busy. The `data` and `error` events are emitted as transfers complete.
      *
      * The device must be open to use this method.
      * @param nTransfers
      * @param transferSize
      */
    def startPoll(): Unit = js.native
    def startPoll(nTransfers: Double): Unit = js.native
    def startPoll(nTransfers: Double, transferSize: Double): Unit = js.native
    /**
      * Stop polling.
      *
      * Further data may still be received. The `end` event is emitted and the callback is called once all transfers have completed or canceled.
      *
      * The device must be open to use this method.
      * @param cb
      */
    def stopPoll(): Unit = js.native
    def stopPoll(cb: js.Function0[Unit]): Unit = js.native
    /**
      * Perform a transfer to read data from the endpoint.
      *
      * If length is greater than maxPacketSize, libusb will automatically split the transfer in multiple packets, and you will receive one callback with all data once all packets are complete.
      *
      * `this` in the callback is the InEndpoint object.
      *
      * The device must be open to use this method.
      * @param length
      * @param callback
      */
    def transfer(length: Double, callback: js.Function2[/* error */ LibUSBException, /* data */ Buffer, Unit]): InEndpoint = js.native
  }
  
  @js.native
  class Interface protected () extends js.Object {
    def this(device: Device, id: Double) = this()
    /** Integer alternate setting number. */
    var altSetting: Double = js.native
    /** Object with fields from the interface descriptor -- see libusb documentation or USB spec. */
    var descriptor: InterfaceDescriptor = js.native
    /** List of endpoints on this interface: InEndpoint and OutEndpoint objects. */
    var endpoints: js.Array[Endpoint] = js.native
    /** Integer interface number. */
    var interfaceNumber: Double = js.native
    /**
      * Re-attaches the kernel driver for the interface.
      *
      * The device must be open to use this method.
      */
    def attachKernelDriver(): Double = js.native
    /**
      * Claims the interface. This method must be called before using any endpoints of this interface.
      *
      * The device must be open to use this method.
      */
    def claim(): Unit = js.native
    /**
      * Detaches the kernel driver from the interface.
      *
      * The device must be open to use this method.
      */
    def detachKernelDriver(): Double = js.native
    /**
      * Return the InEndpoint or OutEndpoint with the specified address.
      *
      * The device must be open to use this method.
      * @param addr
      */
    def endpoint(addr: Double): Endpoint = js.native
    /**
      * Returns `false` if a kernel driver is not active; `true` if active.
      *
      * The device must be open to use this method.
      */
    def isKernelDriverActive(): Boolean = js.native
    /**
      * Releases the interface and resets the alternate setting. Calls callback when complete.
      *
      * It is an error to release an interface with pending transfers.
      *
      * The device must be open to use this method.
      * @param cb
      */
    def release(): Unit = js.native
    def release(cb: js.Function1[/* err */ js.UndefOr[String], Unit]): Unit = js.native
    def release(closeEndpoints: Boolean): Unit = js.native
    def release(closeEndpoints: Boolean, cb: js.Function1[/* err */ js.UndefOr[String], Unit]): Unit = js.native
    /**
      * Sets the alternate setting. It updates the `interface.endpoints` array to reflect the endpoints found in the alternate setting.
      *
      * The device must be open to use this method.
      * @param altSetting
      * @param cb
      */
    def setAltSetting(altSetting: Double, cb: js.Function1[/* err */ js.UndefOr[String], Unit]): Unit = js.native
  }
  
  @js.native
  class InterfaceDescriptor () extends js.Object {
    /** Value used to select this alternate setting for this interface. */
    var bAlternateSetting: Double = js.native
    /** Descriptor type. */
    var bDescriptorType: Double = js.native
    /** USB-IF class code for this interface. */
    var bInterfaceClass: Double = js.native
    /** Number of this interface. */
    var bInterfaceNumber: Double = js.native
    /** USB-IF protocol code for this interface, qualified by the bInterfaceClass and bInterfaceSubClass values. */
    var bInterfaceProtocol: Double = js.native
    /** USB-IF subclass code for this interface, qualified by the bInterfaceClass value. */
    var bInterfaceSubClass: Double = js.native
    /** Size of this descriptor (in bytes) */
    var bLength: Double = js.native
    /** Number of endpoints used by this interface (excluding the control endpoint). */
    var bNumEndpoints: Double = js.native
    /** Array of endpoint descriptors. */
    var endpoints: js.Array[EndpointDescriptor] = js.native
    /** Extra descriptors. */
    var extra: Buffer = js.native
    /** Index of string descriptor describing this interface. */
    var iInterface: Double = js.native
  }
  
  @js.native
  class LibUSBException () extends Error {
    var errno: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class OutEndpoint protected () extends Endpoint {
    def this(device: Device, descriptor: EndpointDescriptor) = this()
    /**
      * Perform a transfer to write `data` to the endpoint.
      *
      * If length is greater than maxPacketSize, libusb will automatically split the transfer in multiple packets, and you will receive one callback once all packets are complete.
      *
      * `this` in the callback is the OutEndpoint object.
      *
      * The device must be open to use this method.
      * @param buffer
      * @param cb
      */
    def transfer(buffer: Buffer, cb: js.Function1[/* err */ js.UndefOr[LibUSBException], Unit]): OutEndpoint = js.native
    def transferWithZLP(buf: Buffer, cb: js.Function1[/* err */ js.UndefOr[LibUSBException], Unit]): Unit = js.native
  }
  
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

