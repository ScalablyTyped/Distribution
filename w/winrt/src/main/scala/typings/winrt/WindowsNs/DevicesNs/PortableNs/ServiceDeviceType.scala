package typings.winrt.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceDeviceType extends js.Object

@JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
@js.native
object ServiceDeviceType extends js.Object {
  @js.native
  sealed trait calendarService extends ServiceDeviceType
  
  @js.native
  sealed trait contactsService extends ServiceDeviceType
  
  @js.native
  sealed trait deviceStatusService extends ServiceDeviceType
  
  @js.native
  sealed trait notesService extends ServiceDeviceType
  
  @js.native
  sealed trait ringtonesService extends ServiceDeviceType
  
  @js.native
  sealed trait smsService extends ServiceDeviceType
  
  @js.native
  sealed trait tasksService extends ServiceDeviceType
  
  /* 0 */ val calendarService: typings.winrt.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.calendarService with Double = js.native
  /* 1 */ val contactsService: typings.winrt.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.contactsService with Double = js.native
  /* 2 */ val deviceStatusService: typings.winrt.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.deviceStatusService with Double = js.native
  /* 3 */ val notesService: typings.winrt.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.notesService with Double = js.native
  /* 4 */ val ringtonesService: typings.winrt.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.ringtonesService with Double = js.native
  /* 5 */ val smsService: typings.winrt.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.smsService with Double = js.native
  /* 6 */ val tasksService: typings.winrt.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.tasksService with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceDeviceType with Double] = js.native
}

