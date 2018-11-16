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
  
  val calendarService: calendarService with java.lang.String = js.native
  val contactsService: contactsService with java.lang.String = js.native
  val deviceStatusService: deviceStatusService with java.lang.String = js.native
  val notesService: notesService with java.lang.String = js.native
  val ringtonesService: ringtonesService with java.lang.String = js.native
  val smsService: smsService with java.lang.String = js.native
  val tasksService: tasksService with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType with java.lang.String
  ] = js.native
}

