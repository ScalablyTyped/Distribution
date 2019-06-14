package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceWatcherStatus extends js.Object

@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherStatus")
@js.native
object DeviceWatcherStatus extends js.Object {
  @js.native
  sealed trait aborted
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  @js.native
  sealed trait created
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  @js.native
  sealed trait enumerationCompleted
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  @js.native
  sealed trait started
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  @js.native
  sealed trait stopped
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  @js.native
  sealed trait stopping
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  /* 5 */ val aborted: aborted with scala.Double = js.native
  /* 0 */ val created: created with scala.Double = js.native
  /* 2 */ val enumerationCompleted: enumerationCompleted with scala.Double = js.native
  /* 1 */ val started: started with scala.Double = js.native
  /* 4 */ val stopped: stopped with scala.Double = js.native
  /* 3 */ val stopping: stopping with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus with scala.Double] = js.native
}

