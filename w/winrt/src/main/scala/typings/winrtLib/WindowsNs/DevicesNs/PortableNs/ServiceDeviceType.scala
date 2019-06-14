package typings
package winrtLib.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceDeviceType extends js.Object

@JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
@js.native
object ServiceDeviceType extends js.Object {
  @js.native
  sealed trait calendarService
    extends winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  @js.native
  sealed trait contactsService
    extends winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  @js.native
  sealed trait deviceStatusService
    extends winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  @js.native
  sealed trait notesService
    extends winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  @js.native
  sealed trait ringtonesService
    extends winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  @js.native
  sealed trait smsService
    extends winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  @js.native
  sealed trait tasksService
    extends winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType
  
  /* 0 */ val calendarService: calendarService with scala.Double = js.native
  /* 1 */ val contactsService: contactsService with scala.Double = js.native
  /* 2 */ val deviceStatusService: deviceStatusService with scala.Double = js.native
  /* 3 */ val notesService: notesService with scala.Double = js.native
  /* 4 */ val ringtonesService: ringtonesService with scala.Double = js.native
  /* 5 */ val smsService: smsService with scala.Double = js.native
  /* 6 */ val tasksService: tasksService with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType with scala.Double] = js.native
}

