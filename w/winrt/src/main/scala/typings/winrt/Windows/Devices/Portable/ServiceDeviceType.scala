package typings.winrt.Windows.Devices.Portable

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
  
  /* 0 */ val calendarService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.calendarService with Double = js.native
  /* 1 */ val contactsService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.contactsService with Double = js.native
  /* 2 */ val deviceStatusService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.deviceStatusService with Double = js.native
  /* 3 */ val notesService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.notesService with Double = js.native
  /* 4 */ val ringtonesService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.ringtonesService with Double = js.native
  /* 5 */ val smsService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.smsService with Double = js.native
  /* 6 */ val tasksService: typings.winrt.Windows.Devices.Portable.ServiceDeviceType.tasksService with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceDeviceType with Double] = js.native
}

