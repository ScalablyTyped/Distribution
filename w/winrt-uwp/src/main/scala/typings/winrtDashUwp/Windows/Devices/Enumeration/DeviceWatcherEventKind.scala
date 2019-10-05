package typings.winrtDashUwp.Windows.Devices.Enumeration

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
  
  /* 0 */ val add: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherEventKind.add with Double = js.native
  /* 2 */ val remove: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherEventKind.remove with Double = js.native
  /* 1 */ val update: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherEventKind.update with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceWatcherEventKind with Double] = js.native
}

