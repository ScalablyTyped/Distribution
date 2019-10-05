package typings.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceWatcherStatus extends js.Object

@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherStatus")
@js.native
object DeviceWatcherStatus extends js.Object {
  @js.native
  sealed trait aborted extends DeviceWatcherStatus
  
  @js.native
  sealed trait created extends DeviceWatcherStatus
  
  @js.native
  sealed trait enumerationCompleted extends DeviceWatcherStatus
  
  @js.native
  sealed trait started extends DeviceWatcherStatus
  
  @js.native
  sealed trait stopped extends DeviceWatcherStatus
  
  @js.native
  sealed trait stopping extends DeviceWatcherStatus
  
  /* 5 */ val aborted: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.created with Double = js.native
  /* 2 */ val enumerationCompleted: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.enumerationCompleted with Double = js.native
  /* 1 */ val started: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.started with Double = js.native
  /* 4 */ val stopped: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopped with Double = js.native
  /* 3 */ val stopping: typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopping with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceWatcherStatus with Double] = js.native
}

