package typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceDeviceType extends js.Object

/** Indicates the type of a portable device service. */
@JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
@js.native
object ServiceDeviceType extends js.Object {
  /** A service that provides calendar information. */
  @js.native
  sealed trait calendarService extends ServiceDeviceType
  
  /** A service that tracks contacts. */
  @js.native
  sealed trait contactsService extends ServiceDeviceType
  
  /** A device status service. */
  @js.native
  sealed trait deviceStatusService extends ServiceDeviceType
  
  /** A note-taking service. */
  @js.native
  sealed trait notesService extends ServiceDeviceType
  
  /** A service that provides ringtones for a phone. */
  @js.native
  sealed trait ringtonesService extends ServiceDeviceType
  
  /** An SMS messaging service. */
  @js.native
  sealed trait smsService extends ServiceDeviceType
  
  /** A service for tracking tasks. */
  @js.native
  sealed trait tasksService extends ServiceDeviceType
  
  /* 0 */ val calendarService: typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.calendarService with Double = js.native
  /* 1 */ val contactsService: typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.contactsService with Double = js.native
  /* 2 */ val deviceStatusService: typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.deviceStatusService with Double = js.native
  /* 3 */ val notesService: typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.notesService with Double = js.native
  /* 4 */ val ringtonesService: typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.ringtonesService with Double = js.native
  /* 5 */ val smsService: typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.smsService with Double = js.native
  /* 6 */ val tasksService: typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType.tasksService with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceDeviceType with Double] = js.native
}

