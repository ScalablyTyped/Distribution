package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceWatcherEventKind extends js.Object

/** The type of event. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherEventKind")
@js.native
object DeviceWatcherEventKind extends js.Object {
  /** The event is an add action. */
  @js.native
  sealed trait add extends DeviceWatcherEventKind
  
  /** The event is a remove action. */
  @js.native
  sealed trait remove extends DeviceWatcherEventKind
  
  /** The event is an update action. */
  @js.native
  sealed trait update extends DeviceWatcherEventKind
  
}

