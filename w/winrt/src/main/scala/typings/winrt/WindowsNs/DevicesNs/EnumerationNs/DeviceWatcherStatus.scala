package typings.winrt.WindowsNs.DevicesNs.EnumerationNs

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
  
  /* 5 */ val aborted: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus.created with Double = js.native
  /* 2 */ val enumerationCompleted: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus.enumerationCompleted with Double = js.native
  /* 1 */ val started: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus.started with Double = js.native
  /* 4 */ val stopped: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus.stopped with Double = js.native
  /* 3 */ val stopping: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus.stopping with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceWatcherStatus with Double] = js.native
}

