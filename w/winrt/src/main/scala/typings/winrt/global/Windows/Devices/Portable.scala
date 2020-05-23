package typings.winrt.global.Windows.Devices

import typings.winrt.Windows.Devices.Portable.ServiceDeviceType
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Portable")
@js.native
object Portable extends js.Object {
  @js.native
  class ServiceDevice ()
    extends typings.winrt.Windows.Devices.Portable.ServiceDevice
  
  @js.native
  class StorageDevice ()
    extends typings.winrt.Windows.Devices.Portable.StorageDevice
  
  /* static members */
  @js.native
  object ServiceDevice extends js.Object {
    def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
    def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
  }
  
  @js.native
  object ServiceDeviceType extends js.Object {
    /* 0 */ val calendarService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.calendarService with Double = js.native
    /* 1 */ val contactsService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.contactsService with Double = js.native
    /* 2 */ val deviceStatusService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.deviceStatusService with Double = js.native
    /* 3 */ val notesService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.notesService with Double = js.native
    /* 4 */ val ringtonesService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.ringtonesService with Double = js.native
    /* 5 */ val smsService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.smsService with Double = js.native
    /* 6 */ val tasksService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.tasksService with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Devices.Portable.ServiceDeviceType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object StorageDevice extends js.Object {
    def fromId(interfaceId: String): StorageFolder = js.native
    def getDeviceSelector(): String = js.native
  }
  
}

