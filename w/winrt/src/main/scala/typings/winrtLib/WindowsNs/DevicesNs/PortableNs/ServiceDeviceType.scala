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
  
  val calendarService: calendarService with java.lang.String = js.native
  val contactsService: contactsService with java.lang.String = js.native
  val deviceStatusService: deviceStatusService with java.lang.String = js.native
  val notesService: notesService with java.lang.String = js.native
  val ringtonesService: ringtonesService with java.lang.String = js.native
  val smsService: smsService with java.lang.String = js.native
  val tasksService: tasksService with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.PortableNs.ServiceDeviceType with java.lang.String] = js.native
}

