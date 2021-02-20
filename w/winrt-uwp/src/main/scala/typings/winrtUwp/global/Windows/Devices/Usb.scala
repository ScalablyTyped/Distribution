package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.anon.Parsed
import typings.winrtUwp.anon.ParsedReturnValue
import typings.winrtUwp.anon.ParsedUsbInterfaceDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Devices.Usb defines Windows Runtime classes that a Windows store app can use to communicate with a USB device that does not belong to a device class, or for which Microsoft does not provide an in-box driver. */
object Usb {
  
  /** The endpoint descriptor for a USB bulk IN endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be read from the endpoint, in a single transfer. */
  @JSGlobal("Windows.Devices.Usb.UsbBulkInEndpointDescriptor")
  @js.native
  abstract class UsbBulkInEndpointDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbBulkInEndpointDescriptor
  
  /** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk IN endpoint of the device. The app can get an input stream from the pipe and access data is being read from the endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbBulkInPipe")
  @js.native
  abstract class UsbBulkInPipe ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbBulkInPipe
  
  /** The endpoint descriptor for a USB bulk OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. */
  @JSGlobal("Windows.Devices.Usb.UsbBulkOutEndpointDescriptor")
  @js.native
  abstract class UsbBulkOutEndpointDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor
  
  /** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbBulkOutPipe")
  @js.native
  abstract class UsbBulkOutPipe ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutPipe
  
  /** Provides information about a USB configuration, its descriptors and the interfaces defined within that configuration. For an explanation of a USB configuration, see Section 9.6.3 in the Universal Serial Bus (USB) specification. */
  @JSGlobal("Windows.Devices.Usb.UsbConfiguration")
  @js.native
  abstract class UsbConfiguration ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbConfiguration
  
  /** Derives information from the first 9 bytes of a USB configuration descriptor. The information includes the power capabilities of the device when the configuration is active and the number of interfaces included in that configuration. For an explanation of a configuration descriptor, Section 9.6.3 Universal Serial Bus Specification. For information about descriptor fields, see: */
  @JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor")
  @js.native
  abstract class UsbConfigurationDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor
  object UsbConfigurationDescriptor {
    
    /**
      * Parses the specified USB descriptor and returns fields of a USB configuration descriptor.
      * @param descriptor A UsbDescriptor object that contains first 9 bytes of the USB configuration descriptor.
      * @return A UsbConfigurationDescriptor object that contains fields of a USB configuration descriptor.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor.parse")
    @js.native
    def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor = js.native
    
    /**
      * Retrieves the first 9 bytes of a USB configuration descriptor in a UsbConfigurationDescriptor object that is contained in a UsbDescriptor object.
      * @param descriptor The UsbDescriptor object to parse.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor.tryParse")
    @js.native
    def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): Parsed = js.native
  }
  
  /** Defines constants that indicate the recipient of a USB control transfer. The recipient is defined in the setup packet of the control request. See Table 9.2 of section 9.3 of the Universal Serial Bus (USB) specification (www.usb.org). */
  @JSGlobal("Windows.Devices.Usb.UsbControlRecipient")
  @js.native
  object UsbControlRecipient extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient with Double] = js.native
    
    /* 4 */ val defaultInterface: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.defaultInterface with Double = js.native
    
    /* 0 */ val device: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.device with Double = js.native
    
    /* 2 */ val endpoint: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.endpoint with Double = js.native
    
    /* 3 */ val other: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.other with Double = js.native
    
    /* 1 */ val specifiedInterface: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.specifiedInterface with Double = js.native
  }
  
  /** Provides information about the USB control transfer, the type of control request, whether the data is sent from or to the host, and the recipient of the request in the device. */
  @JSGlobal("Windows.Devices.Usb.UsbControlRequestType")
  @js.native
  /** Creates a UsbControlRequestType object. */
  class UsbControlRequestType ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbControlRequestType
  
  /** Defines constants that indicate the type of USB control transfer: standard, class, or vendor. */
  @JSGlobal("Windows.Devices.Usb.UsbControlTransferType")
  @js.native
  object UsbControlTransferType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType with Double] = js.native
    
    /* 1 */ val `class`: typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType.`class` with Double = js.native
    
    /* 0 */ val standard: typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType.standard with Double = js.native
    
    /* 2 */ val vendor: typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType.vendor with Double = js.native
  }
  
  /** Provides information about the type of descriptor, its size (in bytes), and gets the descriptor data. */
  @JSGlobal("Windows.Devices.Usb.UsbDescriptor")
  @js.native
  abstract class UsbDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor
  
  /** Represents a USB device. The object provides methods and properties that an app can use to find the device (in the system) with which the app wants to communicate, and sends IN and OUT control transfers to the device. */
  @JSGlobal("Windows.Devices.Usb.UsbDevice")
  @js.native
  abstract class UsbDevice ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbDevice
  object UsbDevice {
    
    /**
      * Starts an asynchronous operation that creates a UsbDevice object.
      * @param deviceId The device instance path of the device. To obtain that value, get the DeviceInformation.Id property value.
      * @return Returns an IAsyncOperation(UsbDevice) object that returns the results of the operation.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDevice.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Usb.UsbDevice] = js.native
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
      * @param usbClass A UsbDeviceClass object for the device class specified by the app.
      * @return String formatted as an AQS query.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDevice.getDeviceClassSelector")
    @js.native
    def getDeviceClassSelector(usbClass: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): String = js.native
    
    /**
      * Gets an Advanced Query Syntax (AQS) string, based on vendor and product identifiers, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
      * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
      * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
      * @return String formatted as an AQS query.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(vendorId: Double, productId: Double): String = js.native
    /**
      * Gets an Advanced Query Syntax (AQS) string, based on vendor, product, and device interface GUID identifiers, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
      * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
      * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
      * @param winUsbInterfaceClass The device interface GUID exposed by the Winusb.sys driver. See the remarks section.
      * @return String formatted as an AQS query.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(vendorId: Double, productId: Double, winUsbInterfaceClass: String): String = js.native
    /**
      * Gets an Advanced Query Syntax (AQS) string, based on the device interface GUID identifier, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
      * @param winUsbInterfaceClass The device interface GUID exposed by the Winusb.sys driver. See the remarks section.
      * @return String formatted as an AQS query.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(winUsbInterfaceClass: String): String = js.native
  }
  
  /** Provides a way for the app to get an Advanced Query Syntax (AQS) string by specifying the class code, subclass code, and the protocol code defined by the device. The properties in this class are passed in the call to GetDeviceClassSelector . */
  @JSGlobal("Windows.Devices.Usb.UsbDeviceClass")
  @js.native
  /** Creates a UsbDeviceClass object. */
  class UsbDeviceClass ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass
  
  /** Provides a way for the app to create a UsbDeviceClass object by specifying the USB device class of the device. The properties defined in this class represent the supported USB device classes and are passed in the constructor call to instantiate UsbDeviceClass. For information about USB device classes, see the official USB Website for Approved Class Specification Documents. */
  @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses")
  @js.native
  abstract class UsbDeviceClasses ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClasses
  object UsbDeviceClasses {
    
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the device class object for the device that conforms to the Active Sync device class. */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.activeSync")
    @js.native
    def activeSync: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def activeSync_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeSync")(x.asInstanceOf[js.Any])
    
    /** Gets the device class object for the device that conforms to the Communication Device Class (CDC). */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.cdcControl")
    @js.native
    def cdcControl: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def cdcControl_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cdcControl")(x.asInstanceOf[js.Any])
    
    /** Gets the device class object for the device that conforms to the Device Firmware Update device class. */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.deviceFirmwareUpdate")
    @js.native
    def deviceFirmwareUpdate: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def deviceFirmwareUpdate_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceFirmwareUpdate")(x.asInstanceOf[js.Any])
    
    /** Gets the device class object for an infrared transceiver that conforms to the IrDA class defined as per the IrDA Bridge Device Definition 1.0 specification. */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.irda")
    @js.native
    def irda: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def irda_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("irda")(x.asInstanceOf[js.Any])
    
    /** Gets the device class object for a device that conforms to the USB test and measurement class (USBTMC). */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.measurement")
    @js.native
    def measurement: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def measurement_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("measurement")(x.asInstanceOf[js.Any])
    
    /** Gets the device class object for the device that conforms to the Palm Sync device class. */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.palmSync")
    @js.native
    def palmSync: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def palmSync_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("palmSync")(x.asInstanceOf[js.Any])
    
    /** Gets the device class object for a device that conforms to the USB Personal Healthcare Device Class (PHDC). */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.personalHealthcare")
    @js.native
    def personalHealthcare: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def personalHealthcare_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("personalHealthcare")(x.asInstanceOf[js.Any])
    
    /** Gets the device class object for a device that conforms to the Physical Interface Devices (PID) specification. */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.physical")
    @js.native
    def physical: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def physical_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("physical")(x.asInstanceOf[js.Any])
    
    /** Gets the device class object for a custom device that has 0xFF class code. This indicates that the device does not belong to a class approved by USB-IF. */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses.vendorSpecific")
    @js.native
    def vendorSpecific: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass = js.native
    @scala.inline
    def vendorSpecific_=(x: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vendorSpecific")(x.asInstanceOf[js.Any])
  }
  
  /** Derives information from the USB device descriptor of the device. For an explanation of the device descriptor, see Table 9.8 in the Universal Serial Bus Specification. */
  @JSGlobal("Windows.Devices.Usb.UsbDeviceDescriptor")
  @js.native
  abstract class UsbDeviceDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbDeviceDescriptor
  
  /** Derives information from the USB endpoint descriptor of the endpoint, such as type, direction, and endpoint number. This object also gets the specific endpoint descriptors based on the type of endpoint. For an explanation of an endpoint descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
  @JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor")
  @js.native
  abstract class UsbEndpointDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor
  object UsbEndpointDescriptor {
    
    /**
      * Parses the specified USB descriptor and returns the USB endpoint descriptor in a UsbEndpointDescriptor object.
      * @param descriptor A UsbDescriptor object that contains the USB endpoint descriptor.
      * @return A UsbEndpointDescriptor object that contains the USB endpoint descriptor.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor.parse")
    @js.native
    def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor = js.native
    
    /**
      * Retrieves the USB endpoint descriptor in a UsbEndpointDescriptor object that is contained in a UsbDescriptor object.
      * @param descriptor The UsbDescriptor object to parse.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor.tryParse")
    @js.native
    def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): ParsedReturnValue = js.native
  }
  
  /** Defines constants that indicate the type of USB endpoint: control, bulk, isochronous, or interrupt. */
  @JSGlobal("Windows.Devices.Usb.UsbEndpointType")
  @js.native
  object UsbEndpointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType with Double] = js.native
    
    /* 2 */ val bulk: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.bulk with Double = js.native
    
    /* 0 */ val control: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.control with Double = js.native
    
    /* 3 */ val interrupt: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.interrupt with Double = js.native
    
    /* 1 */ val isochronous: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.isochronous with Double = js.native
  }
  
  /** Provides information about the USB interface including its endpoints, the number of alternate settings the interface supports, and gets the entire descriptor set for those settings. It also obtains pipes associated with the endpoints that the interface supports. */
  @JSGlobal("Windows.Devices.Usb.UsbInterface")
  @js.native
  abstract class UsbInterface ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbInterface
  
  /** Describes a USB alternate setting (of an interface) in an interface descriptor. For an explanation of an interface descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
  @JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor")
  @js.native
  abstract class UsbInterfaceDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor
  object UsbInterfaceDescriptor {
    
    /**
      * Parses the specified USB descriptor and returns alternate setting information in a UsbInterfaceDescriptor object.
      * @param descriptor A UsbDescriptor object that contains the USB interface descriptor.
      * @return A UsbInterfaceDescriptor object describes the alternate setting.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor.parse")
    @js.native
    def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor = js.native
    
    /**
      * Retrieves information about the alternate setting in a UsbInterfaceDescriptor object that is contained in a UsbDescriptor object.
      * @param descriptor The UsbDescriptor object to parse.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor.tryParse")
    @js.native
    def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): ParsedUsbInterfaceDescriptor = js.native
  }
  
  /** Provides information about an alternate setting and select that setting. The app can get the USB interface descriptors for the setting and its endpoints, and determine whether this setting is currently selected. */
  @JSGlobal("Windows.Devices.Usb.UsbInterfaceSetting")
  @js.native
  abstract class UsbInterfaceSetting ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceSetting
  
  /** The endpoint descriptor for a USB interrupt IN endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be read from the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint for data. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptInEndpointDescriptor")
  @js.native
  abstract class UsbInterruptInEndpointDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEndpointDescriptor
  
  /** Represents the object that is passed as a parameter to the event handler for the DataReceived event. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptInEventArgs")
  @js.native
  abstract class UsbInterruptInEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEventArgs
  
  /** Represents the pipe that the underlying USB driver opens to communicate with a USB interrupt IN endpoint of the device. The object also enables the app to specify an event handler. That handler that gets invoked when data is read from the endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptInPipe")
  @js.native
  abstract class UsbInterruptInPipe ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInPipe
  
  /** The endpoint descriptor for a USB interrupt OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint to send data. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor")
  @js.native
  abstract class UsbInterruptOutEndpointDescriptor ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor
  
  /** Represents the pipe that the underlying USB driver opens to communicate with a USB interrupt OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptOutPipe")
  @js.native
  abstract class UsbInterruptOutPipe ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutPipe
  
  /** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB bulk IN endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbReadOptions")
  @js.native
  object UsbReadOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions with Double] = js.native
    
    /* 4 */ val allowPartialReads: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.allowPartialReads with Double = js.native
    
    /* 1 */ val autoClearStall: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.autoClearStall with Double = js.native
    
    /* 3 */ val ignoreShortPacket: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.ignoreShortPacket with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.none with Double = js.native
    
    /* 2 */ val overrideAutomaticBufferManagement: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.overrideAutomaticBufferManagement with Double = js.native
  }
  
  /** Describes the setup packet for a USB control transfer. For an explanation of the setup packet, see Table 9.2 in the Universal Serial Bus (USB) specification. */
  @JSGlobal("Windows.Devices.Usb.UsbSetupPacket")
  @js.native
  /** Creates a UsbSetupPacket object. */
  class UsbSetupPacket ()
    extends typings.winrtUwp.Windows.Devices.Usb.UsbSetupPacket {
    /**
      * Creates a UsbSetupPacket object from a formatted buffer (eight bytes) that contains the setup packet.
      * @param eightByteBuffer A caller-supplied buffer that contains the setup packet formatted as per the standard USB specification. The length of the buffer must be eight bytes because that is the size of a setup packet on the bus.
      */
    def this(eightByteBuffer: IBuffer) = this()
  }
  
  /** Defines constants that indicate the direction of USB transfer: IN or OUT transfers. */
  @JSGlobal("Windows.Devices.Usb.UsbTransferDirection")
  @js.native
  object UsbTransferDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection with Double] = js.native
    
    /* 1 */ val in: typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection.in with Double = js.native
    
    /* 0 */ val out: typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection.out with Double = js.native
  }
  
  /** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB OUT endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbWriteOptions")
  @js.native
  object UsbWriteOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions with Double] = js.native
    
    /* 1 */ val autoClearStall: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.autoClearStall with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.none with Double = js.native
    
    /* 2 */ val shortPacketTerminate: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.shortPacketTerminate with Double = js.native
  }
}
