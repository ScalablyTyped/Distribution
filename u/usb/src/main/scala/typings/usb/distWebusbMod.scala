package typings.usb

import typings.node.eventsMod.EventEmitter
import typings.std.EventListener
import typings.std.Map
import typings.std.Set
import typings.usb.distUsbMod.Device
import typings.usb.distWebusbWebusbDeviceMod.WebUSBDevice
import typings.usb.usbStrings.connect
import typings.usb.usbStrings.disconnect
import typings.w3cWebUsb.USB
import typings.w3cWebUsb.USBDevice
import typings.w3cWebUsb.USBDeviceFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebusbMod {
  
  @JSImport("usb/dist/webusb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("usb/dist/webusb", "WebUSB")
  @js.native
  open class WebUSB ()
    extends StObject
       with USB {
    def this(options: USBOptions) = this()
    
    /* private */ var _onconnect: Any = js.native
    
    /* private */ var _ondisconnect: Any = js.native
    
    def addEventListener(`type`: connect | disconnect, listener: EventListener): Unit = js.native
    
    /* protected */ var authorisedDevices: Set[USBDeviceFilter] = js.native
    
    /* protected */ var emitter: EventEmitter = js.native
    
    /* private */ var filterDevice: Any = js.native
    
    /* private */ var getWebDevice: Any = js.native
    
    /* private */ var isAuthorisedDevice: Any = js.native
    
    /* protected */ var knownDevices: Map[Device, WebUSBDevice] = js.native
    
    /* private */ var loadDevices: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var quickFilter: Any = js.native
    
    def removeEventListener(`type`: connect | disconnect, callback: EventListener): Unit = js.native
  }
  
  inline def getWebUsb(): USB = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebUsb")().asInstanceOf[USB]
  
  trait USBOptions extends StObject {
    
    /**
      * Optional flag to automatically allow all devices
      */
    var allowAllDevices: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional array of preconfigured allowed devices
      */
    var allowedDevices: js.UndefOr[js.Array[USBDeviceFilter]] = js.undefined
    
    /**
      * Optional timeout (in milliseconds) to use for the device control transfers
      */
    var deviceTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional `device found` callback function to allow the user to select a device
      */
    var devicesFound: js.UndefOr[js.Function1[/* devices */ js.Array[USBDevice], js.Promise[USBDevice | Unit]]] = js.undefined
  }
  object USBOptions {
    
    inline def apply(): USBOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[USBOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: USBOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowAllDevices(value: Boolean): Self = StObject.set(x, "allowAllDevices", value.asInstanceOf[js.Any])
      
      inline def setAllowAllDevicesUndefined: Self = StObject.set(x, "allowAllDevices", js.undefined)
      
      inline def setAllowedDevices(value: js.Array[USBDeviceFilter]): Self = StObject.set(x, "allowedDevices", value.asInstanceOf[js.Any])
      
      inline def setAllowedDevicesUndefined: Self = StObject.set(x, "allowedDevices", js.undefined)
      
      inline def setAllowedDevicesVarargs(value: USBDeviceFilter*): Self = StObject.set(x, "allowedDevices", js.Array(value*))
      
      inline def setDeviceTimeout(value: Double): Self = StObject.set(x, "deviceTimeout", value.asInstanceOf[js.Any])
      
      inline def setDeviceTimeoutUndefined: Self = StObject.set(x, "deviceTimeout", js.undefined)
      
      inline def setDevicesFound(value: /* devices */ js.Array[USBDevice] => js.Promise[USBDevice | Unit]): Self = StObject.set(x, "devicesFound", js.Any.fromFunction1(value))
      
      inline def setDevicesFoundUndefined: Self = StObject.set(x, "devicesFound", js.undefined)
    }
  }
}
