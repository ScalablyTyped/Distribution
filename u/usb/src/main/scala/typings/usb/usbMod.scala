package typings.usb

import typings.node.bufferMod.global.Buffer
import typings.usb.deviceMod.ExtendedDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usbMod {
  
  @JSImport("usb/dist/usb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("usb/dist/usb", "Device")
  @js.native
  open class Device ()
    extends typings.usb.bindingsMod.Device
  
  @JSImport("usb/dist/usb", "INIT_ERROR")
  @js.native
  val INIT_ERROR: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CAP_HAS_CAPABILITY")
  @js.native
  val LIBUSB_CAP_HAS_CAPABILITY: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CAP_HAS_HID_ACCESS")
  @js.native
  val LIBUSB_CAP_HAS_HID_ACCESS: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CAP_HAS_HOTPLUG")
  @js.native
  val LIBUSB_CAP_HAS_HOTPLUG: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CAP_SUPPORTS_DETACH_KERNEL_DRIVER")
  @js.native
  val LIBUSB_CAP_SUPPORTS_DETACH_KERNEL_DRIVER: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_APPLICATION")
  @js.native
  val LIBUSB_CLASS_APPLICATION: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_AUDIO")
  @js.native
  val LIBUSB_CLASS_AUDIO: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_COMM")
  @js.native
  val LIBUSB_CLASS_COMM: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_DATA")
  @js.native
  val LIBUSB_CLASS_DATA: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_HID")
  @js.native
  val LIBUSB_CLASS_HID: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_HUB")
  @js.native
  val LIBUSB_CLASS_HUB: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_MASS_STORAGE")
  @js.native
  val LIBUSB_CLASS_MASS_STORAGE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_PER_INTERFACE")
  @js.native
  val LIBUSB_CLASS_PER_INTERFACE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_PRINTER")
  @js.native
  val LIBUSB_CLASS_PRINTER: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_PTP")
  @js.native
  val LIBUSB_CLASS_PTP: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_VENDOR_SPEC")
  @js.native
  val LIBUSB_CLASS_VENDOR_SPEC: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CLASS_WIRELESS")
  @js.native
  val LIBUSB_CLASS_WIRELESS: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_CONTROL_SETUP_SIZE")
  @js.native
  val LIBUSB_CONTROL_SETUP_SIZE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_BOS")
  @js.native
  val LIBUSB_DT_BOS: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_BOS_SIZE")
  @js.native
  val LIBUSB_DT_BOS_SIZE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_CONFIG")
  @js.native
  val LIBUSB_DT_CONFIG: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_DEVICE")
  @js.native
  val LIBUSB_DT_DEVICE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_ENDPOINT")
  @js.native
  val LIBUSB_DT_ENDPOINT: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_HID")
  @js.native
  val LIBUSB_DT_HID: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_HUB")
  @js.native
  val LIBUSB_DT_HUB: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_INTERFACE")
  @js.native
  val LIBUSB_DT_INTERFACE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_PHYSICAL")
  @js.native
  val LIBUSB_DT_PHYSICAL: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_REPORT")
  @js.native
  val LIBUSB_DT_REPORT: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_DT_STRING")
  @js.native
  val LIBUSB_DT_STRING: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ENDPOINT_IN")
  @js.native
  val LIBUSB_ENDPOINT_IN: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ENDPOINT_OUT")
  @js.native
  val LIBUSB_ENDPOINT_OUT: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_ACCESS")
  @js.native
  val LIBUSB_ERROR_ACCESS: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_BUSY")
  @js.native
  val LIBUSB_ERROR_BUSY: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_INTERRUPTED")
  @js.native
  val LIBUSB_ERROR_INTERRUPTED: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_INVALID_PARAM")
  @js.native
  val LIBUSB_ERROR_INVALID_PARAM: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_IO")
  @js.native
  val LIBUSB_ERROR_IO: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_NOT_FOUND")
  @js.native
  val LIBUSB_ERROR_NOT_FOUND: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_NOT_SUPPORTED")
  @js.native
  val LIBUSB_ERROR_NOT_SUPPORTED: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_NO_DEVICE")
  @js.native
  val LIBUSB_ERROR_NO_DEVICE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_NO_MEM")
  @js.native
  val LIBUSB_ERROR_NO_MEM: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_OTHER")
  @js.native
  val LIBUSB_ERROR_OTHER: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_OVERFLOW")
  @js.native
  val LIBUSB_ERROR_OVERFLOW: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_PIPE")
  @js.native
  val LIBUSB_ERROR_PIPE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ERROR_TIMEOUT")
  @js.native
  val LIBUSB_ERROR_TIMEOUT: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ISO_SYNC_TYPE_ADAPTIVE")
  @js.native
  val LIBUSB_ISO_SYNC_TYPE_ADAPTIVE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ISO_SYNC_TYPE_ASYNC")
  @js.native
  val LIBUSB_ISO_SYNC_TYPE_ASYNC: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ISO_SYNC_TYPE_NONE")
  @js.native
  val LIBUSB_ISO_SYNC_TYPE_NONE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ISO_SYNC_TYPE_SYNC")
  @js.native
  val LIBUSB_ISO_SYNC_TYPE_SYNC: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ISO_USAGE_TYPE_DATA")
  @js.native
  val LIBUSB_ISO_USAGE_TYPE_DATA: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ISO_USAGE_TYPE_FEEDBACK")
  @js.native
  val LIBUSB_ISO_USAGE_TYPE_FEEDBACK: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_ISO_USAGE_TYPE_IMPLICIT")
  @js.native
  val LIBUSB_ISO_USAGE_TYPE_IMPLICIT: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_RECIPIENT_DEVICE")
  @js.native
  val LIBUSB_RECIPIENT_DEVICE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_RECIPIENT_ENDPOINT")
  @js.native
  val LIBUSB_RECIPIENT_ENDPOINT: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_RECIPIENT_INTERFACE")
  @js.native
  val LIBUSB_RECIPIENT_INTERFACE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_RECIPIENT_OTHER")
  @js.native
  val LIBUSB_RECIPIENT_OTHER: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_CLEAR_FEATURE")
  @js.native
  val LIBUSB_REQUEST_CLEAR_FEATURE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_GET_CONFIGURATION")
  @js.native
  val LIBUSB_REQUEST_GET_CONFIGURATION: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_GET_DESCRIPTOR")
  @js.native
  val LIBUSB_REQUEST_GET_DESCRIPTOR: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_GET_INTERFACE")
  @js.native
  val LIBUSB_REQUEST_GET_INTERFACE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_GET_STATUS")
  @js.native
  val LIBUSB_REQUEST_GET_STATUS: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_SET_ADDRESS")
  @js.native
  val LIBUSB_REQUEST_SET_ADDRESS: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_SET_CONFIGURATION")
  @js.native
  val LIBUSB_REQUEST_SET_CONFIGURATION: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_SET_DESCRIPTOR")
  @js.native
  val LIBUSB_REQUEST_SET_DESCRIPTOR: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_SET_FEATURE")
  @js.native
  val LIBUSB_REQUEST_SET_FEATURE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_SET_INTERFACE")
  @js.native
  val LIBUSB_REQUEST_SET_INTERFACE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_SYNCH_FRAME")
  @js.native
  val LIBUSB_REQUEST_SYNCH_FRAME: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_TYPE_CLASS")
  @js.native
  val LIBUSB_REQUEST_TYPE_CLASS: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_TYPE_RESERVED")
  @js.native
  val LIBUSB_REQUEST_TYPE_RESERVED: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_TYPE_STANDARD")
  @js.native
  val LIBUSB_REQUEST_TYPE_STANDARD: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_REQUEST_TYPE_VENDOR")
  @js.native
  val LIBUSB_REQUEST_TYPE_VENDOR: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_CANCELLED")
  @js.native
  val LIBUSB_TRANSFER_CANCELLED: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_COMPLETED")
  @js.native
  val LIBUSB_TRANSFER_COMPLETED: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_ERROR")
  @js.native
  val LIBUSB_TRANSFER_ERROR: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_FREE_BUFFER")
  @js.native
  val LIBUSB_TRANSFER_FREE_BUFFER: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_FREE_TRANSFER")
  @js.native
  val LIBUSB_TRANSFER_FREE_TRANSFER: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_NO_DEVICE")
  @js.native
  val LIBUSB_TRANSFER_NO_DEVICE: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_OVERFLOW")
  @js.native
  val LIBUSB_TRANSFER_OVERFLOW: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_SHORT_NOT_OK")
  @js.native
  val LIBUSB_TRANSFER_SHORT_NOT_OK: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_STALL")
  @js.native
  val LIBUSB_TRANSFER_STALL: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_TIMED_OUT")
  @js.native
  val LIBUSB_TRANSFER_TIMED_OUT: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_TYPE_BULK")
  @js.native
  val LIBUSB_TRANSFER_TYPE_BULK: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_TYPE_CONTROL")
  @js.native
  val LIBUSB_TRANSFER_TYPE_CONTROL: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_TYPE_INTERRUPT")
  @js.native
  val LIBUSB_TRANSFER_TYPE_INTERRUPT: Double = js.native
  
  @JSImport("usb/dist/usb", "LIBUSB_TRANSFER_TYPE_ISOCHRONOUS")
  @js.native
  val LIBUSB_TRANSFER_TYPE_ISOCHRONOUS: Double = js.native
  
  @JSImport("usb/dist/usb", "LibUSBException")
  @js.native
  open class LibUSBException ()
    extends typings.usb.bindingsMod.LibUSBException
  
  @JSImport("usb/dist/usb", "Transfer")
  @js.native
  open class Transfer protected ()
    extends typings.usb.bindingsMod.Transfer {
    def this(
      device: typings.usb.bindingsMod.Device,
      endpointAddr: Double,
      `type`: Double,
      timeout: Double,
      callback: js.Function3[
            /* error */ typings.usb.bindingsMod.LibUSBException, 
            /* buf */ Buffer, 
            /* actual */ Double, 
            Unit
          ]
    ) = this()
  }
  
  inline def disableHotplugEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_disableHotplugEvents")().asInstanceOf[Unit]
  
  inline def enableHotplugEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_enableHotplugEvents")().asInstanceOf[Unit]
  
  inline def getDeviceList(): js.Array[typings.usb.bindingsMod.Device] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceList")().asInstanceOf[js.Array[typings.usb.bindingsMod.Device]]
  
  inline def getLibusbCapability(capability: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_getLibusbCapability")(capability.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def refHotplugEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refHotplugEvents")().asInstanceOf[Unit]
  
  inline def setDebugLevel(level: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDebugLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def supportedHotplugEvents(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_supportedHotplugEvents")().asInstanceOf[Double]
  
  inline def unrefHotplugEvents(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unrefHotplugEvents")().asInstanceOf[Unit]
  
  inline def useUsbDkBackend(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUsbDkBackend")().asInstanceOf[Unit]
  
  trait DeviceIds extends StObject {
    
    var idProduct: Double
    
    var idVendor: Double
  }
  object DeviceIds {
    
    inline def apply(idProduct: Double, idVendor: Double): DeviceIds = {
      val __obj = js.Dynamic.literal(idProduct = idProduct.asInstanceOf[js.Any], idVendor = idVendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceIds]
    }
    
    extension [Self <: DeviceIds](x: Self) {
      
      inline def setIdProduct(value: Double): Self = StObject.set(x, "idProduct", value.asInstanceOf[js.Any])
      
      inline def setIdVendor(value: Double): Self = StObject.set(x, "idVendor", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventListeners[T] extends StObject {
    
    var newListener: /* keyof T */ String
    
    var removeListener: /* keyof T */ String
  }
  object EventListeners {
    
    inline def apply[T](newListener: /* keyof T */ String, removeListener: /* keyof T */ String): EventListeners[T] = {
      val __obj = js.Dynamic.literal(newListener = newListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListeners[T]]
    }
    
    extension [Self <: EventListeners[?], T](x: Self & EventListeners[T]) {
      
      inline def setNewListener(value: /* keyof T */ String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: /* keyof T */ String): Self = StObject.set(x, "removeListener", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object usbDistUsbBindingsAugmentingMod {
    
    type Device = ExtendedDevice
    
    trait DeviceEvents
      extends StObject
         with EventListeners[DeviceEvents] {
      
      var attach: typings.usb.usbMod.usbDistUsbBindingsAugmentingMod.Device
      
      var attachIds: DeviceIds
      
      var detach: typings.usb.usbMod.usbDistUsbBindingsAugmentingMod.Device
      
      var detachIds: DeviceIds
    }
    object DeviceEvents {
      
      inline def apply(
        attach: typings.usb.usbMod.usbDistUsbBindingsAugmentingMod.Device,
        attachIds: DeviceIds,
        detach: typings.usb.usbMod.usbDistUsbBindingsAugmentingMod.Device,
        detachIds: DeviceIds,
        newListener: /* keyof T */ String,
        removeListener: /* keyof T */ String
      ): DeviceEvents = {
        val __obj = js.Dynamic.literal(attach = attach.asInstanceOf[js.Any], attachIds = attachIds.asInstanceOf[js.Any], detach = detach.asInstanceOf[js.Any], detachIds = detachIds.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], removeListener = removeListener.asInstanceOf[js.Any])
        __obj.asInstanceOf[DeviceEvents]
      }
      
      extension [Self <: DeviceEvents](x: Self) {
        
        inline def setAttach(value: typings.usb.usbMod.usbDistUsbBindingsAugmentingMod.Device): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
        
        inline def setAttachIds(value: DeviceIds): Self = StObject.set(x, "attachIds", value.asInstanceOf[js.Any])
        
        inline def setDetach(value: typings.usb.usbMod.usbDistUsbBindingsAugmentingMod.Device): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
        
        inline def setDetachIds(value: DeviceIds): Self = StObject.set(x, "detachIds", value.asInstanceOf[js.Any])
      }
    }
  }
}
