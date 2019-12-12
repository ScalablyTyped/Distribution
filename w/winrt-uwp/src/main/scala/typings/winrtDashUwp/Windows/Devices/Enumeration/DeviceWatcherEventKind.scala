package typings.winrtDashUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherEventKind.add
import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherEventKind.remove
import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherEventKind.update
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceWatcherEventKind with Double] = js.native
  /* 0 */ @js.native
  object add extends TopLevel[add with Double]
  
  /* 2 */ @js.native
  object remove extends TopLevel[remove with Double]
  
  /* 1 */ @js.native
  object update extends TopLevel[update with Double]
  
}

