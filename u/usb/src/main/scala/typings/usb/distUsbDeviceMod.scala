package typings.usb

import typings.node.bufferMod.global.Buffer
import typings.usb.distUsbBindingsMod.Device
import typings.usb.distUsbBindingsMod.LibUSBException
import typings.usb.distUsbCapabilityMod.Capability
import typings.usb.distUsbDescriptorsMod.BosDescriptor
import typings.usb.distUsbDescriptorsMod.ConfigDescriptor
import typings.usb.distUsbInterfaceMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUsbDeviceMod {
  
  @JSImport("usb/dist/usb/device", "ExtendedDevice")
  @js.native
  open class ExtendedDevice () extends StObject {
    
    /* private */ var _timeout: Any = js.native
    
    /**
      * Contains all config descriptors of the device (same structure as .configDescriptor above)
      */
    def allConfigDescriptors: js.Array[ConfigDescriptor] = js.native
    
    /**
      * Close the device.
      *
      * The device must be open to use this method.
      */
    def close(): Unit = js.native
    
    /**
      * Object with properties for the fields of the active configuration descriptor.
      */
    def configDescriptor: js.UndefOr[ConfigDescriptor] = js.native
    
    /**
      * Perform a control transfer with `libusb_control_transfer`.
      *
      * Parameter `data_or_length` can be an integer length for an IN transfer, or a `Buffer` for an OUT transfer. The type must match the direction specified in the MSB of bmRequestType.
      *
      * The `data` parameter of the callback is actual transferred for OUT transfers, or will be passed a Buffer for IN transfers.
      *
      * The device must be open to use this method.
      * @param bmRequestType
      * @param bRequest
      * @param wValue
      * @param wIndex
      * @param data_or_length
      * @param callback
      */
    def controlTransfer(bmRequestType: Double, bRequest: Double, wValue: Double, wIndex: Double, data_or_length: Double): Device = js.native
    def controlTransfer(
      bmRequestType: Double,
      bRequest: Double,
      wValue: Double,
      wIndex: Double,
      data_or_length: Double,
      callback: js.Function2[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ js.UndefOr[Buffer | Double], 
          Unit
        ]
    ): Device = js.native
    def controlTransfer(bmRequestType: Double, bRequest: Double, wValue: Double, wIndex: Double, data_or_length: Buffer): Device = js.native
    def controlTransfer(
      bmRequestType: Double,
      bRequest: Double,
      wValue: Double,
      wIndex: Double,
      data_or_length: Buffer,
      callback: js.Function2[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ js.UndefOr[Buffer | Double], 
          Unit
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
          /* error */ js.UndefOr[LibUSBException], 
          /* descriptor */ js.UndefOr[BosDescriptor], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a list of Capability objects for the Binary Object Store capabilities of the device.
      *
      * The device must be open to use this method.
      * @param callback
      */
    def getCapabilities(
      callback: js.Function2[
          /* error */ js.UndefOr[LibUSBException], 
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
      callback: js.Function2[/* error */ js.UndefOr[LibUSBException], /* value */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    /**
      * Return the interface with the specified interface number.
      *
      * The device must be open to use this method.
      * @param addr
      */
    def interface(addr: Double): Interface = js.native
    
    /**
      * List of Interface objects for the interfaces of the default configuration of the device.
      */
    var interfaces: js.UndefOr[js.Array[Interface]] = js.native
    
    /**
      * Open the device.
      * @param defaultConfig
      */
    def open(): Unit = js.native
    def open(defaultConfig: Boolean): Unit = js.native
    
    /**
      * Contains the parent of the device, such as a hub. If there is no parent this property is set to `null`.
      */
    def parent: Device = js.native
    
    /**
      * Set the device configuration to something other than the default (0). To use this, first call `.open(false)` (which tells it not to auto configure),
      * then before claiming an interface, call this method.
      *
      * The device must be open to use this method.
      * @param desired
      * @param callback
      */
    def setConfiguration(desired: Double): Unit = js.native
    def setConfiguration(desired: Double, callback: js.Function1[/* error */ js.UndefOr[LibUSBException], Unit]): Unit = js.native
    
    /**
      * Timeout in milliseconds to use for control transfers.
      */
    def timeout: Double = js.native
    def timeout_=(value: Double): Unit = js.native
  }
}
