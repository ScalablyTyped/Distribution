package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs

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
  sealed trait calendarService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  /** A service that tracks contacts. */
  @js.native
  sealed trait contactsService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  /** A device status service. */
  @js.native
  sealed trait deviceStatusService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  /** A note-taking service. */
  @js.native
  sealed trait notesService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  /** A service that provides ringtones for a phone. */
  @js.native
  sealed trait ringtonesService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  /** An SMS messaging service. */
  @js.native
  sealed trait smsService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  /** A service for tracking tasks. */
  @js.native
  sealed trait tasksService
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  /* 0 */ val calendarService: calendarService with scala.Double = js.native
  /* 1 */ val contactsService: contactsService with scala.Double = js.native
  /* 2 */ val deviceStatusService: deviceStatusService with scala.Double = js.native
  /* 3 */ val notesService: notesService with scala.Double = js.native
  /* 4 */ val ringtonesService: ringtonesService with scala.Double = js.native
  /* 5 */ val smsService: smsService with scala.Double = js.native
  /* 6 */ val tasksService: tasksService with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType with scala.Double
  ] = js.native
}

