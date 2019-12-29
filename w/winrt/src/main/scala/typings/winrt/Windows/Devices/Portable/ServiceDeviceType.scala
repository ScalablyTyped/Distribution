package typings.winrt.Windows.Devices.Portable

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceDeviceType with Double] = js.native
  /* 0 */ @js.native
  object calendarService extends TopLevel[calendarService with Double]
  
  /* 1 */ @js.native
  object contactsService extends TopLevel[contactsService with Double]
  
  /* 2 */ @js.native
  object deviceStatusService extends TopLevel[deviceStatusService with Double]
  
  /* 3 */ @js.native
  object notesService extends TopLevel[notesService with Double]
  
  /* 4 */ @js.native
  object ringtonesService extends TopLevel[ringtonesService with Double]
  
  /* 5 */ @js.native
  object smsService extends TopLevel[smsService with Double]
  
  /* 6 */ @js.native
  object tasksService extends TopLevel[tasksService with Double]
  
}

