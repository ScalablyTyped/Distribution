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
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val enumerationCompleted: enumerationCompleted with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  val stopping: stopping with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus with java.lang.String
  ] = js.native
}

