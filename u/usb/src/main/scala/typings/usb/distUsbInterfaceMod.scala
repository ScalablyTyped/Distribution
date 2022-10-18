package typings.usb

import typings.usb.distUsbBindingsMod.Device
import typings.usb.distUsbBindingsMod.LibUSBException
import typings.usb.distUsbDescriptorsMod.InterfaceDescriptor
import typings.usb.distUsbEndpointMod.Endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUsbInterfaceMod {
  
  @JSImport("usb/dist/usb/interface", "Interface")
  @js.native
  open class Interface protected () extends StObject {
    def this(device: Device, id: Double) = this()
    
    /** Integer alternate setting number. */
    var altSetting: Double = js.native
    
    /**
      * Re-attaches the kernel driver for the interface.
      *
      * The device must be open to use this method.
      */
    def attachKernelDriver(): Unit = js.native
    
    /**
      * Claims the interface. This method must be called before using any endpoints of this interface.
      *
      * The device must be open to use this method.
      */
    def claim(): Unit = js.native
    
    /** Object with fields from the interface descriptor -- see libusb documentation or USB spec. */
    var descriptor: InterfaceDescriptor = js.native
    
    /**
      * Detaches the kernel driver from the interface.
      *
      * The device must be open to use this method.
      */
    def detachKernelDriver(): Unit = js.native
    
    /* protected */ var device: Device = js.native
    
    /**
      * Return the InEndpoint or OutEndpoint with the specified address.
      *
      * The device must be open to use this method.
      * @param addr
      */
    def endpoint(addr: Double): js.UndefOr[Endpoint] = js.native
    
    /** List of endpoints on this interface: InEndpoint and OutEndpoint objects. */
    var endpoints: js.Array[Endpoint] = js.native
    
    /* protected */ var id: Double = js.native
    
    /** Integer interface number. */
    var interfaceNumber: Double = js.native
    
    /**
      * Returns `false` if a kernel driver is not active; `true` if active.
      *
      * The device must be open to use this method.
      */
    def isKernelDriverActive(): Boolean = js.native
    
    /* protected */ def refresh(): Unit = js.native
    
    /**
      * Releases the interface and resets the alternate setting. Calls callback when complete.
      *
      * It is an error to release an interface with pending transfers.
      *
      * The device must be open to use this method.
      * @param callback
      */
    def release(): Unit = js.native
    def release(callback: js.Function1[/* error */ js.UndefOr[LibUSBException], Unit]): Unit = js.native
    def release(closeEndpoints: Boolean): Unit = js.native
    def release(closeEndpoints: Boolean, callback: js.Function1[/* error */ js.UndefOr[LibUSBException], Unit]): Unit = js.native
    def release(closeEndpoints: Unit, callback: js.Function1[/* error */ js.UndefOr[LibUSBException], Unit]): Unit = js.native
    
    /**
      * Sets the alternate setting. It updates the `interface.endpoints` array to reflect the endpoints found in the alternate setting.
      *
      * The device must be open to use this method.
      * @param altSetting
      * @param callback
      */
    def setAltSetting(altSetting: Double): Unit = js.native
    def setAltSetting(altSetting: Double, callback: js.Function1[/* error */ js.UndefOr[LibUSBException], Unit]): Unit = js.native
  }
}
