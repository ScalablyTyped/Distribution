package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceWatcherStatus extends js.Object

/** Describes the state of a DeviceWatcher object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherStatus")
@js.native
object DeviceWatcherStatus extends js.Object {
  /** The watcher has aborted operation. No subsequent events will be raised. */
  @js.native
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  /** This is the initial state of a Watcher object. During this state clients can register event handlers. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  /** The watcher has completed enumerating the initial collection. Items can still be added, updated or removed from the collection. */
  @js.native
  sealed trait enumerationCompleted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  /** The watcher transitions to the Started state once Start is called. The watcher is enumerating the initial collection. Note that during this enumeration phase it is possible to receive Updated and Removed notifications but only to items that have already been Added . */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  /** The client has called Stop and the watcher has completed all outstanding events. No further events will be raised. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  /** The client has called Stop and the watcher is still in the process of stopping. Events may still be raised. */
  @js.native
  sealed trait stopping
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val enumerationCompleted: enumerationCompleted with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  val stopping: stopping with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcherStatus with java.lang.String
  ] = js.native
}

