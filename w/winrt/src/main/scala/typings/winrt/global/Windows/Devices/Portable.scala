package typings.winrt.global.Windows.Devices

import typings.winrt.Windows.Devices.Portable.ServiceDeviceType
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portable {
  
  @JSGlobal("Windows.Devices.Portable.ServiceDevice")
  @js.native
  class ServiceDevice ()
    extends StObject
       with typings.winrt.Windows.Devices.Portable.ServiceDevice
  /* static members */
  object ServiceDevice {
    
    @JSGlobal("Windows.Devices.Portable.ServiceDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDeviceSelector(serviceType: ServiceDeviceType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(serviceType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getDeviceSelectorFromServiceId(serviceId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelectorFromServiceId")(serviceId.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
  @js.native
  object ServiceDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Portable.ServiceDeviceType & Double] = js.native
    
    /* 0 */ val calendarService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.calendarService & Double = js.native
    
    /* 1 */ val contactsService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.contactsService & Double = js.native
    
    /* 2 */ val deviceStatusService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.deviceStatusService & Double = js.native
    
    /* 3 */ val notesService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.notesService & Double = js.native
    
    /* 4 */ val ringtonesService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.ringtonesService & Double = js.native
    
    /* 5 */ val smsService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.smsService & Double = js.native
    
    /* 6 */ val tasksService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.tasksService & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Portable.StorageDevice")
  @js.native
  class StorageDevice ()
    extends StObject
       with typings.winrt.Windows.Devices.Portable.StorageDevice
  /* static members */
  object StorageDevice {
    
    @JSGlobal("Windows.Devices.Portable.StorageDevice")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromId(interfaceId: String): StorageFolder = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(interfaceId.asInstanceOf[js.Any]).asInstanceOf[StorageFolder]
    
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
}
