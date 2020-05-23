package typings.winrtUwp.Windows.Devices.Portable

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
  
}

