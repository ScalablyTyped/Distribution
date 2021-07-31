package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient
import typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType
import typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType
import typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions
import typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection
import typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.anon.Parsed
import typings.winrtUwp.anon.ParsedReturnValue
import typings.winrtUwp.anon.ParsedUsbInterfaceDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Devices.Usb defines Windows Runtime classes that a Windows store app can use to communicate with a USB device that does not belong to a device class, or for which Microsoft does not provide an in-box driver. */
object Usb {
  
  /** The endpoint descriptor for a USB bulk IN endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be read from the endpoint, in a single transfer. */
  @JSGlobal("Windows.Devices.Usb.UsbBulkInEndpointDescriptor")
  @js.native
  abstract class UsbBulkInEndpointDescriptor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbBulkInEndpointDescriptor {
    
    /** Gets the USB endpoint number of the bulk IN endpoint. */
    /* CompleteClass */
    var endpointNumber: Double = js.native
    
    /** Gets the maximum number of bytes that can be sent to or received from this endpoint, in a single packet. */
    /* CompleteClass */
    var maxPacketSize: Double = js.native
    
    /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
    /* CompleteClass */
    var pipe: typings.winrtUwp.Windows.Devices.Usb.UsbBulkInPipe = js.native
  }
  
  /** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk IN endpoint of the device. The app can get an input stream from the pipe and access data is being read from the endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbBulkInPipe")
  @js.native
  abstract class UsbBulkInPipe ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbBulkInPipe {
    
    /**
      * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk IN endpoint that is associated with the pipe.
      * @return An IAsyncAction object that is used to control the asynchronous operation.
      */
    /* CompleteClass */
    override def clearStallAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets the object that represents endpoint descriptor associated with the USB bulk IN endpoint. */
    /* CompleteClass */
    var endpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbBulkInEndpointDescriptor = js.native
    
    /** Discards any data that is cached in the bulk IN pipe. */
    /* CompleteClass */
    override def flushBuffer(): Unit = js.native
    
    /** Input stream that stores the data that the bulk IN pipe received from the endpoint. */
    /* CompleteClass */
    var inputStream: IInputStream = js.native
    
    /** Gets the maximum number of bytes that can be read from the bulk IN pipe in a single transfer. */
    /* CompleteClass */
    var maxTransferSizeBytes: Double = js.native
    
    /** Gets or sets configuration flags that controls the behavior of the pipe that reads data from a USB bulk IN endpoint. */
    /* CompleteClass */
    var readOptions: UsbReadOptions = js.native
  }
  
  /** The endpoint descriptor for a USB bulk OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. */
  @JSGlobal("Windows.Devices.Usb.UsbBulkOutEndpointDescriptor")
  @js.native
  abstract class UsbBulkOutEndpointDescriptor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor {
    
    /** Gets the USB endpoint number of the bulk OUT endpoint. */
    /* CompleteClass */
    var endpointNumber: Double = js.native
    
    /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
    /* CompleteClass */
    var maxPacketSize: Double = js.native
    
    /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
    /* CompleteClass */
    var pipe: typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutPipe = js.native
  }
  
  /** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbBulkOutPipe")
  @js.native
  abstract class UsbBulkOutPipe ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutPipe {
    
    /**
      * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk OUT endpoint that is associated with the pipe.
      * @return An IAsyncAction object that is used to control the asynchronous operation.
      */
    /* CompleteClass */
    override def clearStallAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets the object that represents the endpoint descriptor associated with the USB bulk OUT endpoint. */
    /* CompleteClass */
    var endpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor = js.native
    
    /** Gets an output stream to which the app can write data to send to the endpoint. */
    /* CompleteClass */
    var outputStream: IOutputStream = js.native
    
    /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB bulk IN endpoint. */
    /* CompleteClass */
    var writeOptions: UsbWriteOptions = js.native
  }
  
  /** Provides information about a USB configuration, its descriptors and the interfaces defined within that configuration. For an explanation of a USB configuration, see Section 9.6.3 in the Universal Serial Bus (USB) specification. */
  @JSGlobal("Windows.Devices.Usb.UsbConfiguration")
  @js.native
  abstract class UsbConfiguration ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbConfiguration {
    
    /** Gets the object that contains the first 9 bytes of the descriptor associated with the USB configuration. */
    /* CompleteClass */
    var configurationDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor = js.native
    
    /** Gets an array of objects that represent the full set of descriptors associated with a USB configuration. */
    /* CompleteClass */
    var descriptors: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor] = js.native
    
    /** Gets an array of USB interfaces available in the USB configuration. */
    /* CompleteClass */
    var usbInterfaces: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterface] = js.native
  }
  
  /** Derives information from the first 9 bytes of a USB configuration descriptor. The information includes the power capabilities of the device when the configuration is active and the number of interfaces included in that configuration. For an explanation of a configuration descriptor, Section 9.6.3 Universal Serial Bus Specification. For information about descriptor fields, see: */
  @JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor")
  @js.native
  abstract class UsbConfigurationDescriptor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor {
    
    /** Gets the bConfigurationValue field of a USB configuration descriptor. The value is the number that identifies the configuration. */
    /* CompleteClass */
    var configurationValue: Double = js.native
    
    /** Gets the bMaxPower field of a USB configuration descriptor. The value indicates the maximum power (in milliamp units) that the device can draw from the bus, when the device is bus-powered. */
    /* CompleteClass */
    var maxPowerMilliamps: Double = js.native
    
    /** Gets the D5 bit value of the bmAttributes field in the USB configuration descriptor. The value indicates whether the device can send a resume signal to wake up itself or the host system from a low power state. */
    /* CompleteClass */
    var remoteWakeup: Boolean = js.native
    
    /** Gets the D6 bit of the bmAttributes field in the USB configuration. This value indicates whether the device is drawing power from a local source or the bus. */
    /* CompleteClass */
    var selfPowered: Boolean = js.native
  }
  object UsbConfigurationDescriptor {
    
    @JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the specified USB descriptor and returns fields of a USB configuration descriptor.
      * @param descriptor A UsbDescriptor object that contains first 9 bytes of the USB configuration descriptor.
      * @return A UsbConfigurationDescriptor object that contains fields of a USB configuration descriptor.
      */
    /* static member */
    @scala.inline
    def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(descriptor.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor]
    
    /**
      * Retrieves the first 9 bytes of a USB configuration descriptor in a UsbConfigurationDescriptor object that is contained in a UsbDescriptor object.
      * @param descriptor The UsbDescriptor object to parse.
      */
    /* static member */
    @scala.inline
    def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): Parsed = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(descriptor.asInstanceOf[js.Any]).asInstanceOf[Parsed]
  }
  
  /** Defines constants that indicate the recipient of a USB control transfer. The recipient is defined in the setup packet of the control request. See Table 9.2 of section 9.3 of the Universal Serial Bus (USB) specification (www.usb.org). */
  @JSGlobal("Windows.Devices.Usb.UsbControlRecipient")
  @js.native
  object UsbControlRecipient extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient & Double] = js.native
    
    /* 4 */ val defaultInterface: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.defaultInterface & Double = js.native
    
    /* 0 */ val device: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.device & Double = js.native
    
    /* 2 */ val endpoint: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.endpoint & Double = js.native
    
    /* 3 */ val other: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.other & Double = js.native
    
    /* 1 */ val specifiedInterface: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.specifiedInterface & Double = js.native
  }
  
  /** Provides information about the USB control transfer, the type of control request, whether the data is sent from or to the host, and the recipient of the request in the device. */
  @JSGlobal("Windows.Devices.Usb.UsbControlRequestType")
  @js.native
  /** Creates a UsbControlRequestType object. */
  class UsbControlRequestType ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbControlRequestType {
    
    /** Gets or sets the bmRequestType value as a byte. */
    /* CompleteClass */
    var asByte: Double = js.native
    
    /** Gets or sets the type of USB control transfer: standard, class, or vendor. */
    /* CompleteClass */
    var controlTransferType: UsbControlTransferType = js.native
    
    /** Gets or sets the direction of the USB control transfer. */
    /* CompleteClass */
    var direction: UsbTransferDirection = js.native
    
    /** Gets or sets the recipient of the USB control transfer. */
    /* CompleteClass */
    var recipient: UsbControlRecipient = js.native
  }
  
  /** Defines constants that indicate the type of USB control transfer: standard, class, or vendor. */
  @JSGlobal("Windows.Devices.Usb.UsbControlTransferType")
  @js.native
  object UsbControlTransferType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType & Double] = js.native
    
    /* 1 */ val `class`: typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType.`class` & Double = js.native
    
    /* 0 */ val standard: typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType.standard & Double = js.native
    
    /* 2 */ val vendor: typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType.vendor & Double = js.native
  }
  
  /** Provides information about the type of descriptor, its size (in bytes), and gets the descriptor data. */
  @JSGlobal("Windows.Devices.Usb.UsbDescriptor")
  @js.native
  abstract class UsbDescriptor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor {
    
    /** Gets the type of descriptor. */
    /* CompleteClass */
    var descriptorType: Double = js.native
    
    /** Gets the length of the descriptor. */
    /* CompleteClass */
    var length: Double = js.native
    
    /**
      * Reads descriptor data in the caller-supplied buffer.
      * @param buffer A caller-supplied buffer that receives descriptor data.
      */
    /* CompleteClass */
    override def readDescriptorBuffer(buffer: IBuffer): Unit = js.native
  }
  
  /** Represents a USB device. The object provides methods and properties that an app can use to find the device (in the system) with which the app wants to communicate, and sends IN and OUT control transfers to the device. */
  @JSGlobal("Windows.Devices.Usb.UsbDevice")
  @js.native
  abstract class UsbDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbDevice
  object UsbDevice {
    
    @JSGlobal("Windows.Devices.Usb.UsbDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Starts an asynchronous operation that creates a UsbDevice object.
      * @param deviceId The device instance path of the device. To obtain that value, get the DeviceInformation.Id property value.
      * @return Returns an IAsyncOperation(UsbDevice) object that returns the results of the operation.
      */
    /* static member */
    @scala.inline
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Usb.UsbDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Usb.UsbDevice]]
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
      * @param usbClass A UsbDeviceClass object for the device class specified by the app.
      * @return String formatted as an AQS query.
      */
    /* static member */
    @scala.inline
    def getDeviceClassSelector(usbClass: typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceClassSelector")(usbClass.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets an Advanced Query Syntax (AQS) string, based on vendor and product identifiers, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
      * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
      * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
      * @return String formatted as an AQS query.
      */
    /* static member */
    @scala.inline
    def getDeviceSelector(vendorId: Double, productId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(vendorId.asInstanceOf[js.Any], productId.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Gets an Advanced Query Syntax (AQS) string, based on vendor, product, and device interface GUID identifiers, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
      * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
      * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
      * @param winUsbInterfaceClass The device interface GUID exposed by the Winusb.sys driver. See the remarks section.
      * @return String formatted as an AQS query.
      */
    /* static member */
    @scala.inline
    def getDeviceSelector(vendorId: Double, productId: Double, winUsbInterfaceClass: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(vendorId.asInstanceOf[js.Any], productId.asInstanceOf[js.Any], winUsbInterfaceClass.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Gets an Advanced Query Syntax (AQS) string, based on the device interface GUID identifier, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
      * @param winUsbInterfaceClass The device interface GUID exposed by the Winusb.sys driver. See the remarks section.
      * @return String formatted as an AQS query.
      */
    /* static member */
    @scala.inline
    def getDeviceSelector(winUsbInterfaceClass: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(winUsbInterfaceClass.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Provides a way for the app to get an Advanced Query Syntax (AQS) string by specifying the class code, subclass code, and the protocol code defined by the device. The properties in this class are passed in the call to GetDeviceClassSelector . */
  @JSGlobal("Windows.Devices.Usb.UsbDeviceClass")
  @js.native
  /** Creates a UsbDeviceClass object. */
  class UsbDeviceClass ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClass {
    
    /** Gets or sets the class code of the device. */
    /* CompleteClass */
    var classCode: Double = js.native
    
    /** Gets or sets the protocol code of the device. */
    /* CompleteClass */
    var protocolCode: Double = js.native
    
    /** Gets or sets the subclass code of the device. */
    /* CompleteClass */
    var subclassCode: Double = js.native
  }
  
  /** Provides a way for the app to create a UsbDeviceClass object by specifying the USB device class of the device. The properties defined in this class represent the supported USB device classes and are passed in the constructor call to instantiate UsbDeviceClass. For information about USB device classes, see the official USB Website for Approved Class Specification Documents. */
  @JSGlobal("Windows.Devices.Usb.UsbDeviceClasses")
  @js.native
  abstract class UsbDeviceClasses ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbDeviceClasses
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
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbDeviceDescriptor {
    
    /** Gets the bcdDeviceRevision field of the USB device descriptor. The value indicates the revision number defined by the device and is a binary-coded decimal number. */
    /* CompleteClass */
    var bcdDeviceRevision: Double = js.native
    
    /** Gets the bcdUSB field of the USB device descriptor. The value indicates the version of the USB specification to which the device conforms. */
    /* CompleteClass */
    var bcdUsb: Double = js.native
    
    /** Gets the bMaxPacketSize0 field of the USB device descriptor. The value indicates the maximum packet size, in bytes, for endpoint zero of the device. This value can be 8, 16, 32, or 64. */
    /* CompleteClass */
    var maxPacketSize0: Double = js.native
    
    /** Gets the bNumConfigurations field of the USB device descriptor. The value indicates the total count of USB configurations supported by the device. */
    /* CompleteClass */
    var numberOfConfigurations: Double = js.native
    
    /** Gets the idProduct field of the USB device descriptor. This value indicates the device-specific product identifier and is assigned by the manufacturer. */
    /* CompleteClass */
    var productId: Double = js.native
    
    /** Gets the idVendor field of the USB device descriptor. The value indicates the vendor identifier for the device as assigned by the USB specification committee. */
    /* CompleteClass */
    var vendorId: Double = js.native
  }
  
  /** Derives information from the USB endpoint descriptor of the endpoint, such as type, direction, and endpoint number. This object also gets the specific endpoint descriptors based on the type of endpoint. For an explanation of an endpoint descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
  @JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor")
  @js.native
  abstract class UsbEndpointDescriptor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor {
    
    /** Gets an object that represents the endpoint descriptor for the USB bulk IN endpoint. */
    /* CompleteClass */
    var asBulkInEndpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbBulkInEndpointDescriptor = js.native
    
    /** Gets an object that represents the endpoint descriptor for the USB bulk OUT endpoint. */
    /* CompleteClass */
    var asBulkOutEndpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor = js.native
    
    /** Gets an object that represents the endpoint descriptor for the USB interrupt IN endpoint. */
    /* CompleteClass */
    var asInterruptInEndpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEndpointDescriptor = js.native
    
    /** Gets an object that represents the endpoint descriptor for the USB interrupt OUT endpoint. */
    /* CompleteClass */
    var asInterruptOutEndpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor = js.native
    
    /** Gets the direction of the USB endpoint. */
    /* CompleteClass */
    var direction: UsbTransferDirection = js.native
    
    /** Gets the USB endpoint number. */
    /* CompleteClass */
    var endpointNumber: Double = js.native
    
    /** Gets the type of USB endpoint. */
    /* CompleteClass */
    var endpointType: UsbEndpointType = js.native
  }
  object UsbEndpointDescriptor {
    
    @JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the specified USB descriptor and returns the USB endpoint descriptor in a UsbEndpointDescriptor object.
      * @param descriptor A UsbDescriptor object that contains the USB endpoint descriptor.
      * @return A UsbEndpointDescriptor object that contains the USB endpoint descriptor.
      */
    /* static member */
    @scala.inline
    def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(descriptor.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor]
    
    /**
      * Retrieves the USB endpoint descriptor in a UsbEndpointDescriptor object that is contained in a UsbDescriptor object.
      * @param descriptor The UsbDescriptor object to parse.
      */
    /* static member */
    @scala.inline
    def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): ParsedReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(descriptor.asInstanceOf[js.Any]).asInstanceOf[ParsedReturnValue]
  }
  
  /** Defines constants that indicate the type of USB endpoint: control, bulk, isochronous, or interrupt. */
  @JSGlobal("Windows.Devices.Usb.UsbEndpointType")
  @js.native
  object UsbEndpointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType & Double] = js.native
    
    /* 2 */ val bulk: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.bulk & Double = js.native
    
    /* 0 */ val control: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.control & Double = js.native
    
    /* 3 */ val interrupt: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.interrupt & Double = js.native
    
    /* 1 */ val isochronous: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType.isochronous & Double = js.native
  }
  
  /** Provides information about the USB interface including its endpoints, the number of alternate settings the interface supports, and gets the entire descriptor set for those settings. It also obtains pipes associated with the endpoints that the interface supports. */
  @JSGlobal("Windows.Devices.Usb.UsbInterface")
  @js.native
  abstract class UsbInterface ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbInterface {
    
    /** Gets an array of objects that represent pipes that the host opened to communicate with bulk IN endpoints defined in the current setting of the USB interface setting. */
    /* CompleteClass */
    var bulkInPipes: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbBulkInPipe] = js.native
    
    /** Gets an array of objects that represent pipes that the host opened to communicate with bulk OUT endpoints defined in the current setting of the USB interface. */
    /* CompleteClass */
    var bulkOutPipes: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutPipe] = js.native
    
    /** Gets an array of objects that represent descriptors for all alternate settings that are part of this USB interface. */
    /* CompleteClass */
    var descriptors: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor] = js.native
    
    /** Gets the interface number that identifies the USB interface. This value is the bInterfaceNumber field of a standard USB interface descriptor. */
    /* CompleteClass */
    var interfaceNumber: Double = js.native
    
    /** Gets an array of objects that represent alternate settings defined for the USB interface. */
    /* CompleteClass */
    var interfaceSettings: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceSetting] = js.native
    
    /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt IN endpoints defined in the current setting of the USB interface. */
    /* CompleteClass */
    var interruptInPipes: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInPipe] = js.native
    
    /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt OUT endpoints defined in the current setting of the USB interface. */
    /* CompleteClass */
    var interruptOutPipes: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutPipe] = js.native
  }
  
  /** Describes a USB alternate setting (of an interface) in an interface descriptor. For an explanation of an interface descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
  @JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor")
  @js.native
  abstract class UsbInterfaceDescriptor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor {
    
    /** Gets the bAlternateSetting field of the USB interface descriptor. The value is a number that identifies the alternate setting defined by the interface. */
    /* CompleteClass */
    var alternateSettingNumber: Double = js.native
    
    /** Gets the bInterfaceClass field of the USB interface descriptor. The value indicates the USB-defined class to which the interface conforms. */
    /* CompleteClass */
    var classCode: Double = js.native
    
    /** Gets the bInterfaceNumber field of the USB interface descriptor. The value is the index that identifies the interface. */
    /* CompleteClass */
    var interfaceNumber: Double = js.native
    
    /** Gets the bInterfaceProtocol field of the interface descriptor. The value is a USB-assigned identifier that specifies a USB-defined protocol to which the interface conforms. */
    /* CompleteClass */
    var protocolCode: Double = js.native
    
    /** Gets the bInterfaceSubClass field of the USB interface descriptor. The value is a USB-assigned identifier that specifies a USB-defined subclass to which the interface. */
    /* CompleteClass */
    var subclassCode: Double = js.native
  }
  object UsbInterfaceDescriptor {
    
    @JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the specified USB descriptor and returns alternate setting information in a UsbInterfaceDescriptor object.
      * @param descriptor A UsbDescriptor object that contains the USB interface descriptor.
      * @return A UsbInterfaceDescriptor object describes the alternate setting.
      */
    /* static member */
    @scala.inline
    def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(descriptor.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor]
    
    /**
      * Retrieves information about the alternate setting in a UsbInterfaceDescriptor object that is contained in a UsbDescriptor object.
      * @param descriptor The UsbDescriptor object to parse.
      */
    /* static member */
    @scala.inline
    def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): ParsedUsbInterfaceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(descriptor.asInstanceOf[js.Any]).asInstanceOf[ParsedUsbInterfaceDescriptor]
  }
  
  /** Provides information about an alternate setting and select that setting. The app can get the USB interface descriptors for the setting and its endpoints, and determine whether this setting is currently selected. */
  @JSGlobal("Windows.Devices.Usb.UsbInterfaceSetting")
  @js.native
  abstract class UsbInterfaceSetting ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceSetting {
    
    /** Gets an array of objects that represent descriptors associated with USB bulk IN endpoints that are defined in the alternate setting. */
    /* CompleteClass */
    var bulkInEndpoints: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbBulkInEndpointDescriptor] = js.native
    
    /** Gets an array of objects that represent descriptors associated with USB bulk OUT endpoints that are defined in the alternate setting. */
    /* CompleteClass */
    var bulkOutEndpoints: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor] = js.native
    
    /** Gets an array of objects that represent descriptors associated with the alternate setting. */
    /* CompleteClass */
    var descriptors: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor] = js.native
    
    /** Gets an object that represents the descriptor that describes the alternate setting. */
    /* CompleteClass */
    var interfaceDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor = js.native
    
    /** Gets an array of objects that represent descriptors associated with USB interrupt IN endpoints that are defined in the alternate setting. */
    /* CompleteClass */
    var interruptInEndpoints: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEndpointDescriptor] = js.native
    
    /** Gets an array of objects that represent descriptors associated with USB interrupt OUT endpoints that are defined in the alternate setting. */
    /* CompleteClass */
    var interruptOutEndpoints: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor] = js.native
    
    /**
      * Selects the alternate setting as the current setting in the USB interface.
      * @return An IAsyncAction object that is used to control the asynchronous operation.
      */
    /* CompleteClass */
    override def selectSettingAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Determines whether the alternate setting is currently selected. */
    /* CompleteClass */
    var selected: Boolean = js.native
  }
  
  /** The endpoint descriptor for a USB interrupt IN endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be read from the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint for data. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptInEndpointDescriptor")
  @js.native
  abstract class UsbInterruptInEndpointDescriptor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEndpointDescriptor {
    
    /** Gets the USB endpoint number of the interrupt IN endpoint. */
    /* CompleteClass */
    var endpointNumber: Double = js.native
    
    /** Gets the poling interval of the USB interrupt endpoint. */
    /* CompleteClass */
    var interval: Double = js.native
    
    /** Gets the maximum number of bytes that can be sent to or received (in a packet) from this endpoint. */
    /* CompleteClass */
    var maxPacketSize: Double = js.native
    
    /** Gets the object that represents the pipe that the host opens to communicate with the interrupt IN endpoint. */
    /* CompleteClass */
    var pipe: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInPipe = js.native
  }
  
  /** Represents the object that is passed as a parameter to the event handler for the DataReceived event. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptInEventArgs")
  @js.native
  abstract class UsbInterruptInEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEventArgs {
    
    /** Gets data from the interrupt IN endpoint. */
    /* CompleteClass */
    var interruptData: IBuffer = js.native
  }
  
  /** Represents the pipe that the underlying USB driver opens to communicate with a USB interrupt IN endpoint of the device. The object also enables the app to specify an event handler. That handler that gets invoked when data is read from the endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptInPipe")
  @js.native
  abstract class UsbInterruptInPipe ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInPipe
  
  /** The endpoint descriptor for a USB interrupt OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint to send data. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor")
  @js.native
  abstract class UsbInterruptOutEndpointDescriptor ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor {
    
    /** Gets the USB endpoint number of the interrupt OUT endpoint. */
    /* CompleteClass */
    var endpointNumber: Double = js.native
    
    /** Gets the poling interval of the USB interrupt endpoint. */
    /* CompleteClass */
    var interval: Double = js.native
    
    /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
    /* CompleteClass */
    var maxPacketSize: Double = js.native
    
    /** Gets the object that represents the pipe that the host opens to communicate with the interrupt OUT endpoint. */
    /* CompleteClass */
    var pipe: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutPipe = js.native
  }
  
  /** Represents the pipe that the underlying USB driver opens to communicate with a USB interrupt OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbInterruptOutPipe")
  @js.native
  abstract class UsbInterruptOutPipe ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutPipe {
    
    /**
      * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB interrupt OUT endpoint that is associated with the pipe.
      * @return An IAsyncAction object that is used to control the asynchronous operation.
      */
    /* CompleteClass */
    override def clearStallAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets the object that represents the endpoint descriptor associated with the USB interrupt OUT endpoint. */
    /* CompleteClass */
    var endpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor = js.native
    
    /** Gets an output stream to which the app can write data to send to the endpoint. */
    /* CompleteClass */
    var outputStream: IOutputStream = js.native
    
    /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB interrupt OUT endpoint. */
    /* CompleteClass */
    var writeOptions: UsbWriteOptions = js.native
  }
  
  /** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB bulk IN endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbReadOptions")
  @js.native
  object UsbReadOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions & Double] = js.native
    
    /* 4 */ val allowPartialReads: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.allowPartialReads & Double = js.native
    
    /* 1 */ val autoClearStall: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.autoClearStall & Double = js.native
    
    /* 3 */ val ignoreShortPacket: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.ignoreShortPacket & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.none & Double = js.native
    
    /* 2 */ val overrideAutomaticBufferManagement: typings.winrtUwp.Windows.Devices.Usb.UsbReadOptions.overrideAutomaticBufferManagement & Double = js.native
  }
  
  /** Describes the setup packet for a USB control transfer. For an explanation of the setup packet, see Table 9.2 in the Universal Serial Bus (USB) specification. */
  @JSGlobal("Windows.Devices.Usb.UsbSetupPacket")
  @js.native
  /** Creates a UsbSetupPacket object. */
  class UsbSetupPacket ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Usb.UsbSetupPacket {
    /**
      * Creates a UsbSetupPacket object from a formatted buffer (eight bytes) that contains the setup packet.
      * @param eightByteBuffer A caller-supplied buffer that contains the setup packet formatted as per the standard USB specification. The length of the buffer must be eight bytes because that is the size of a setup packet on the bus.
      */
    def this(eightByteBuffer: IBuffer) = this()
    
    /** Gets or sets the wIndex field in the setup packet of the USB control transfer. */
    /* CompleteClass */
    var index: Double = js.native
    
    /** Gets the length, in bytes, of the setup packet. */
    /* CompleteClass */
    var length: Double = js.native
    
    /** Gets or sets the bRequest field in the setup packet of the USB control transfer. */
    /* CompleteClass */
    var request: Double = js.native
    
    /** Gets or sets the bmRequestType field in the setup packet of the USB control transfer. That field is represented by a UsbControlRequestType object. */
    /* CompleteClass */
    var requestType: typings.winrtUwp.Windows.Devices.Usb.UsbControlRequestType = js.native
    
    /** Gets or sets the wValue field in the setup packet of the USB control transfer. */
    /* CompleteClass */
    var value: Double = js.native
  }
  
  /** Defines constants that indicate the direction of USB transfer: IN or OUT transfers. */
  @JSGlobal("Windows.Devices.Usb.UsbTransferDirection")
  @js.native
  object UsbTransferDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection & Double] = js.native
    
    /* 1 */ val in: typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection.in & Double = js.native
    
    /* 0 */ val out: typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection.out & Double = js.native
  }
  
  /** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB OUT endpoint. */
  @JSGlobal("Windows.Devices.Usb.UsbWriteOptions")
  @js.native
  object UsbWriteOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions & Double] = js.native
    
    /* 1 */ val autoClearStall: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.autoClearStall & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.none & Double = js.native
    
    /* 2 */ val shortPacketTerminate: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.shortPacketTerminate & Double = js.native
  }
}
