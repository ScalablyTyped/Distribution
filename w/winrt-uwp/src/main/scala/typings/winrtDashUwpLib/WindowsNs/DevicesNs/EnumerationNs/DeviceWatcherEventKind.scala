package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

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
  sealed trait add
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherEventKind
  
  /** The event is a remove action. */
  @js.native
  sealed trait remove
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherEventKind
  
  /** The event is an update action. */
  @js.native
  sealed trait update
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherEventKind
  
  val add: add with java.lang.String = js.native
  val remove: remove with java.lang.String = js.native
  val update: update with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherEventKind with java.lang.String
  ] = js.native
}

