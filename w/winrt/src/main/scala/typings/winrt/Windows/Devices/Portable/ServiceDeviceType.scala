package typings.winrt.Windows.Devices.Portable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
