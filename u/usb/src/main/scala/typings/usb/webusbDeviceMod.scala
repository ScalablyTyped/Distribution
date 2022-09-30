package typings.usb

import typings.usb.usbMod.Device
import typings.w3cWebUsb.USBConfiguration
import typings.w3cWebUsb.USBControlTransferParameters
import typings.w3cWebUsb.USBDevice
import typings.w3cWebUsb.USBOutTransferResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webusbDeviceMod {
  
  @JSImport("usb/dist/webusb/webusb-device", "WebUSBDevice")
  @js.native
  /* private */ open class WebUSBDevice ()
    extends StObject
       with USBDevice {
    
    /* private */ var _releaseInterface: Any = js.native
    
    @JSName("configuration")
    def configuration_MWebUSBDevice: js.UndefOr[USBConfiguration] = js.native
    
    def controlTransferOut(setup: USBControlTransferParameters, data: js.typedarray.ArrayBuffer): js.Promise[USBOutTransferResult] = js.native
    
    /* private */ var controlTransferParamsToType: Any = js.native
    
    /* private */ var decodeVersion: Any = js.native
    
    /* private */ var device: Any = js.native
    
    /* private */ var getConfigurations: Any = js.native
    
    /* private */ var getEndpoint: Any = js.native
    
    /* private */ var getStringDescriptor: Any = js.native
    
    /* private */ var initialize: Any = js.native
    
    @JSName("opened")
    def opened_MWebUSBDevice: Boolean = js.native
    
    def transferOut(endpointNumber: Double, data: js.typedarray.ArrayBuffer): js.Promise[USBOutTransferResult] = js.native
  }
  /* static members */
  object WebUSBDevice {
    
    @JSImport("usb/dist/webusb/webusb-device", "WebUSBDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createInstance(device: Device): js.Promise[WebUSBDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(device.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebUSBDevice]]
  }
}
