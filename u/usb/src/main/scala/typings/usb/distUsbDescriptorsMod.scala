package typings.usb

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUsbDescriptorsMod {
  
  trait BosDescriptor extends StObject {
    
    /** Descriptor type. */
    var bDescriptorType: Double
    
    /** Size of this descriptor (in bytes) */
    var bLength: Double
    
    /** The number of separate device capability descriptors in the BOS. */
    var bNumDeviceCaps: Double
    
    /** Device Capability Descriptors */
    var capabilities: js.Array[CapabilityDescriptor]
    
    /** Length of this descriptor and all of its sub descriptors. */
    var wTotalLength: Double
  }
  object BosDescriptor {
    
    inline def apply(
      bDescriptorType: Double,
      bLength: Double,
      bNumDeviceCaps: Double,
      capabilities: js.Array[CapabilityDescriptor],
      wTotalLength: Double
    ): BosDescriptor = {
      val __obj = js.Dynamic.literal(bDescriptorType = bDescriptorType.asInstanceOf[js.Any], bLength = bLength.asInstanceOf[js.Any], bNumDeviceCaps = bNumDeviceCaps.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], wTotalLength = wTotalLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[BosDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BosDescriptor] (val x: Self) extends AnyVal {
      
      inline def setBDescriptorType(value: Double): Self = StObject.set(x, "bDescriptorType", value.asInstanceOf[js.Any])
      
      inline def setBLength(value: Double): Self = StObject.set(x, "bLength", value.asInstanceOf[js.Any])
      
      inline def setBNumDeviceCaps(value: Double): Self = StObject.set(x, "bNumDeviceCaps", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: js.Array[CapabilityDescriptor]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesVarargs(value: CapabilityDescriptor*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setWTotalLength(value: Double): Self = StObject.set(x, "wTotalLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait CapabilityDescriptor extends StObject {
    
    /** Descriptor type. */
    var bDescriptorType: Double
    
    /** Device Capability type. */
    var bDevCapabilityType: Double
    
    /** Size of this descriptor (in bytes) */
    var bLength: Double
    
    /** Device Capability data (bLength - 3 bytes) */
    var dev_capability_data: Buffer
  }
  object CapabilityDescriptor {
    
    inline def apply(bDescriptorType: Double, bDevCapabilityType: Double, bLength: Double, dev_capability_data: Buffer): CapabilityDescriptor = {
      val __obj = js.Dynamic.literal(bDescriptorType = bDescriptorType.asInstanceOf[js.Any], bDevCapabilityType = bDevCapabilityType.asInstanceOf[js.Any], bLength = bLength.asInstanceOf[js.Any], dev_capability_data = dev_capability_data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapabilityDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CapabilityDescriptor] (val x: Self) extends AnyVal {
      
      inline def setBDescriptorType(value: Double): Self = StObject.set(x, "bDescriptorType", value.asInstanceOf[js.Any])
      
      inline def setBDevCapabilityType(value: Double): Self = StObject.set(x, "bDevCapabilityType", value.asInstanceOf[js.Any])
      
      inline def setBLength(value: Double): Self = StObject.set(x, "bLength", value.asInstanceOf[js.Any])
      
      inline def setDev_capability_data(value: Buffer): Self = StObject.set(x, "dev_capability_data", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigDescriptor extends StObject {
    
    /** Identifier value for this configuration. */
    var bConfigurationValue: Double
    
    /** Descriptor type. */
    var bDescriptorType: Double
    
    /** Size of this descriptor (in bytes) */
    var bLength: Double
    
    /** Maximum power consumption of the USB device from this bus in this configuration when the device is fully operation. */
    var bMaxPower: Double
    
    /** Number of interfaces supported by this configuration. */
    var bNumInterfaces: Double
    
    /** Configuration characteristics. */
    var bmAttributes: Double
    
    /** Extra descriptors. */
    var extra: Buffer
    
    /** Index of string descriptor describing this configuration. */
    var iConfiguration: Double
    
    /** Array of interfaces supported by this configuration. */
    var interfaces: js.Array[js.Array[InterfaceDescriptor]]
    
    /** Total length of data returned for this configuration. */
    var wTotalLength: Double
  }
  object ConfigDescriptor {
    
    inline def apply(
      bConfigurationValue: Double,
      bDescriptorType: Double,
      bLength: Double,
      bMaxPower: Double,
      bNumInterfaces: Double,
      bmAttributes: Double,
      extra: Buffer,
      iConfiguration: Double,
      interfaces: js.Array[js.Array[InterfaceDescriptor]],
      wTotalLength: Double
    ): ConfigDescriptor = {
      val __obj = js.Dynamic.literal(bConfigurationValue = bConfigurationValue.asInstanceOf[js.Any], bDescriptorType = bDescriptorType.asInstanceOf[js.Any], bLength = bLength.asInstanceOf[js.Any], bMaxPower = bMaxPower.asInstanceOf[js.Any], bNumInterfaces = bNumInterfaces.asInstanceOf[js.Any], bmAttributes = bmAttributes.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], iConfiguration = iConfiguration.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], wTotalLength = wTotalLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigDescriptor] (val x: Self) extends AnyVal {
      
      inline def setBConfigurationValue(value: Double): Self = StObject.set(x, "bConfigurationValue", value.asInstanceOf[js.Any])
      
      inline def setBDescriptorType(value: Double): Self = StObject.set(x, "bDescriptorType", value.asInstanceOf[js.Any])
      
      inline def setBLength(value: Double): Self = StObject.set(x, "bLength", value.asInstanceOf[js.Any])
      
      inline def setBMaxPower(value: Double): Self = StObject.set(x, "bMaxPower", value.asInstanceOf[js.Any])
      
      inline def setBNumInterfaces(value: Double): Self = StObject.set(x, "bNumInterfaces", value.asInstanceOf[js.Any])
      
      inline def setBmAttributes(value: Double): Self = StObject.set(x, "bmAttributes", value.asInstanceOf[js.Any])
      
      inline def setExtra(value: Buffer): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setIConfiguration(value: Double): Self = StObject.set(x, "iConfiguration", value.asInstanceOf[js.Any])
      
      inline def setInterfaces(value: js.Array[js.Array[InterfaceDescriptor]]): Self = StObject.set(x, "interfaces", value.asInstanceOf[js.Any])
      
      inline def setInterfacesVarargs(value: js.Array[InterfaceDescriptor]*): Self = StObject.set(x, "interfaces", js.Array(value*))
      
      inline def setWTotalLength(value: Double): Self = StObject.set(x, "wTotalLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceDescriptor extends StObject {
    
    /** Descriptor type. */
    var bDescriptorType: Double
    
    /** USB-IF class code for the device. */
    var bDeviceClass: Double
    
    /** USB-IF protocol code for the device, qualified by the bDeviceClass and bDeviceSubClass values. */
    var bDeviceProtocol: Double
    
    /** USB-IF subclass code for the device, qualified by the bDeviceClass value. */
    var bDeviceSubClass: Double
    
    /** Size of this descriptor (in bytes) */
    var bLength: Double
    
    /** Maximum packet size for endpoint 0. */
    var bMaxPacketSize0: Double
    
    /** Number of possible configurations. */
    var bNumConfigurations: Double
    
    /** Device release number in binary-coded decimal. */
    var bcdDevice: Double
    
    /** USB specification release number in binary-coded decimal. */
    var bcdUSB: Double
    
    /** Index of string descriptor describing manufacturer. */
    var iManufacturer: Double
    
    /** Index of string descriptor describing product. */
    var iProduct: Double
    
    /** Index of string descriptor containing device serial number. */
    var iSerialNumber: Double
    
    /** USB-IF product ID. */
    var idProduct: Double
    
    /** USB-IF vendor ID. */
    var idVendor: Double
  }
  object DeviceDescriptor {
    
    inline def apply(
      bDescriptorType: Double,
      bDeviceClass: Double,
      bDeviceProtocol: Double,
      bDeviceSubClass: Double,
      bLength: Double,
      bMaxPacketSize0: Double,
      bNumConfigurations: Double,
      bcdDevice: Double,
      bcdUSB: Double,
      iManufacturer: Double,
      iProduct: Double,
      iSerialNumber: Double,
      idProduct: Double,
      idVendor: Double
    ): DeviceDescriptor = {
      val __obj = js.Dynamic.literal(bDescriptorType = bDescriptorType.asInstanceOf[js.Any], bDeviceClass = bDeviceClass.asInstanceOf[js.Any], bDeviceProtocol = bDeviceProtocol.asInstanceOf[js.Any], bDeviceSubClass = bDeviceSubClass.asInstanceOf[js.Any], bLength = bLength.asInstanceOf[js.Any], bMaxPacketSize0 = bMaxPacketSize0.asInstanceOf[js.Any], bNumConfigurations = bNumConfigurations.asInstanceOf[js.Any], bcdDevice = bcdDevice.asInstanceOf[js.Any], bcdUSB = bcdUSB.asInstanceOf[js.Any], iManufacturer = iManufacturer.asInstanceOf[js.Any], iProduct = iProduct.asInstanceOf[js.Any], iSerialNumber = iSerialNumber.asInstanceOf[js.Any], idProduct = idProduct.asInstanceOf[js.Any], idVendor = idVendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceDescriptor] (val x: Self) extends AnyVal {
      
      inline def setBDescriptorType(value: Double): Self = StObject.set(x, "bDescriptorType", value.asInstanceOf[js.Any])
      
      inline def setBDeviceClass(value: Double): Self = StObject.set(x, "bDeviceClass", value.asInstanceOf[js.Any])
      
      inline def setBDeviceProtocol(value: Double): Self = StObject.set(x, "bDeviceProtocol", value.asInstanceOf[js.Any])
      
      inline def setBDeviceSubClass(value: Double): Self = StObject.set(x, "bDeviceSubClass", value.asInstanceOf[js.Any])
      
      inline def setBLength(value: Double): Self = StObject.set(x, "bLength", value.asInstanceOf[js.Any])
      
      inline def setBMaxPacketSize0(value: Double): Self = StObject.set(x, "bMaxPacketSize0", value.asInstanceOf[js.Any])
      
      inline def setBNumConfigurations(value: Double): Self = StObject.set(x, "bNumConfigurations", value.asInstanceOf[js.Any])
      
      inline def setBcdDevice(value: Double): Self = StObject.set(x, "bcdDevice", value.asInstanceOf[js.Any])
      
      inline def setBcdUSB(value: Double): Self = StObject.set(x, "bcdUSB", value.asInstanceOf[js.Any])
      
      inline def setIManufacturer(value: Double): Self = StObject.set(x, "iManufacturer", value.asInstanceOf[js.Any])
      
      inline def setIProduct(value: Double): Self = StObject.set(x, "iProduct", value.asInstanceOf[js.Any])
      
      inline def setISerialNumber(value: Double): Self = StObject.set(x, "iSerialNumber", value.asInstanceOf[js.Any])
      
      inline def setIdProduct(value: Double): Self = StObject.set(x, "idProduct", value.asInstanceOf[js.Any])
      
      inline def setIdVendor(value: Double): Self = StObject.set(x, "idVendor", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointDescriptor extends StObject {
    
    /** Descriptor type. */
    var bDescriptorType: Double
    
    /** The address of the endpoint described by this descriptor. */
    var bEndpointAddress: Double
    
    /** Interval for polling endpoint for data transfers. */
    var bInterval: Double
    
    /** Size of this descriptor (in bytes) */
    var bLength: Double
    
    /** For audio devices only: the rate at which synchronization feedback is provided. */
    var bRefresh: Double
    
    /** For audio devices only: the address if the synch endpoint. */
    var bSynchAddress: Double
    
    /** Attributes which apply to the endpoint when it is configured using the bConfigurationValue. */
    var bmAttributes: Double
    
    /**
      * Extra descriptors.
      *
      * If libusb encounters unknown endpoint descriptors, it will store them here, should you wish to parse them.
      */
    var extra: Buffer
    
    /** Maximum packet size this endpoint is capable of sending/receiving. */
    var wMaxPacketSize: Double
  }
  object EndpointDescriptor {
    
    inline def apply(
      bDescriptorType: Double,
      bEndpointAddress: Double,
      bInterval: Double,
      bLength: Double,
      bRefresh: Double,
      bSynchAddress: Double,
      bmAttributes: Double,
      extra: Buffer,
      wMaxPacketSize: Double
    ): EndpointDescriptor = {
      val __obj = js.Dynamic.literal(bDescriptorType = bDescriptorType.asInstanceOf[js.Any], bEndpointAddress = bEndpointAddress.asInstanceOf[js.Any], bInterval = bInterval.asInstanceOf[js.Any], bLength = bLength.asInstanceOf[js.Any], bRefresh = bRefresh.asInstanceOf[js.Any], bSynchAddress = bSynchAddress.asInstanceOf[js.Any], bmAttributes = bmAttributes.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], wMaxPacketSize = wMaxPacketSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointDescriptor] (val x: Self) extends AnyVal {
      
      inline def setBDescriptorType(value: Double): Self = StObject.set(x, "bDescriptorType", value.asInstanceOf[js.Any])
      
      inline def setBEndpointAddress(value: Double): Self = StObject.set(x, "bEndpointAddress", value.asInstanceOf[js.Any])
      
      inline def setBInterval(value: Double): Self = StObject.set(x, "bInterval", value.asInstanceOf[js.Any])
      
      inline def setBLength(value: Double): Self = StObject.set(x, "bLength", value.asInstanceOf[js.Any])
      
      inline def setBRefresh(value: Double): Self = StObject.set(x, "bRefresh", value.asInstanceOf[js.Any])
      
      inline def setBSynchAddress(value: Double): Self = StObject.set(x, "bSynchAddress", value.asInstanceOf[js.Any])
      
      inline def setBmAttributes(value: Double): Self = StObject.set(x, "bmAttributes", value.asInstanceOf[js.Any])
      
      inline def setExtra(value: Buffer): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setWMaxPacketSize(value: Double): Self = StObject.set(x, "wMaxPacketSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait InterfaceDescriptor extends StObject {
    
    /** Value used to select this alternate setting for this interface. */
    var bAlternateSetting: Double
    
    /** Descriptor type. */
    var bDescriptorType: Double
    
    /** USB-IF class code for this interface. */
    var bInterfaceClass: Double
    
    /** Number of this interface. */
    var bInterfaceNumber: Double
    
    /** USB-IF protocol code for this interface, qualified by the bInterfaceClass and bInterfaceSubClass values. */
    var bInterfaceProtocol: Double
    
    /** USB-IF subclass code for this interface, qualified by the bInterfaceClass value. */
    var bInterfaceSubClass: Double
    
    /** Size of this descriptor (in bytes) */
    var bLength: Double
    
    /** Number of endpoints used by this interface (excluding the control endpoint). */
    var bNumEndpoints: Double
    
    /** Array of endpoint descriptors. */
    var endpoints: js.Array[EndpointDescriptor]
    
    /** Extra descriptors. */
    var extra: Buffer
    
    /** Index of string descriptor describing this interface. */
    var iInterface: Double
  }
  object InterfaceDescriptor {
    
    inline def apply(
      bAlternateSetting: Double,
      bDescriptorType: Double,
      bInterfaceClass: Double,
      bInterfaceNumber: Double,
      bInterfaceProtocol: Double,
      bInterfaceSubClass: Double,
      bLength: Double,
      bNumEndpoints: Double,
      endpoints: js.Array[EndpointDescriptor],
      extra: Buffer,
      iInterface: Double
    ): InterfaceDescriptor = {
      val __obj = js.Dynamic.literal(bAlternateSetting = bAlternateSetting.asInstanceOf[js.Any], bDescriptorType = bDescriptorType.asInstanceOf[js.Any], bInterfaceClass = bInterfaceClass.asInstanceOf[js.Any], bInterfaceNumber = bInterfaceNumber.asInstanceOf[js.Any], bInterfaceProtocol = bInterfaceProtocol.asInstanceOf[js.Any], bInterfaceSubClass = bInterfaceSubClass.asInstanceOf[js.Any], bLength = bLength.asInstanceOf[js.Any], bNumEndpoints = bNumEndpoints.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], iInterface = iInterface.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterfaceDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterfaceDescriptor] (val x: Self) extends AnyVal {
      
      inline def setBAlternateSetting(value: Double): Self = StObject.set(x, "bAlternateSetting", value.asInstanceOf[js.Any])
      
      inline def setBDescriptorType(value: Double): Self = StObject.set(x, "bDescriptorType", value.asInstanceOf[js.Any])
      
      inline def setBInterfaceClass(value: Double): Self = StObject.set(x, "bInterfaceClass", value.asInstanceOf[js.Any])
      
      inline def setBInterfaceNumber(value: Double): Self = StObject.set(x, "bInterfaceNumber", value.asInstanceOf[js.Any])
      
      inline def setBInterfaceProtocol(value: Double): Self = StObject.set(x, "bInterfaceProtocol", value.asInstanceOf[js.Any])
      
      inline def setBInterfaceSubClass(value: Double): Self = StObject.set(x, "bInterfaceSubClass", value.asInstanceOf[js.Any])
      
      inline def setBLength(value: Double): Self = StObject.set(x, "bLength", value.asInstanceOf[js.Any])
      
      inline def setBNumEndpoints(value: Double): Self = StObject.set(x, "bNumEndpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpoints(value: js.Array[EndpointDescriptor]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: EndpointDescriptor*): Self = StObject.set(x, "endpoints", js.Array(value*))
      
      inline def setExtra(value: Buffer): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setIInterface(value: Double): Self = StObject.set(x, "iInterface", value.asInstanceOf[js.Any])
    }
  }
}
