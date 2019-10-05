package typings.winrtDashUwp.Windows.Devices.Enumeration

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
  sealed trait aborted extends DeviceWatcherStatus
  
  /** This is the initial state of a Watcher object. During this state clients can register event handlers. */
  @js.native
  sealed trait created extends DeviceWatcherStatus
  
  /** The watcher has completed enumerating the initial collection. Items can still be added, updated or removed from the collection. */
  @js.native
  sealed trait enumerationCompleted extends DeviceWatcherStatus
  
  /** The watcher transitions to the Started state once Start is called. The watcher is enumerating the initial collection. Note that during this enumeration phase it is possible to receive Updated and Removed notifications but only to items that have already been Added . */
  @js.native
  sealed trait started extends DeviceWatcherStatus
  
  /** The client has called Stop and the watcher has completed all outstanding events. No further events will be raised. */
  @js.native
  sealed trait stopped extends DeviceWatcherStatus
  
  /** The client has called Stop and the watcher is still in the process of stopping. Events may still be raised. */
  @js.native
  sealed trait stopping extends DeviceWatcherStatus
  
  /* 5 */ val aborted: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherStatus.created with Double = js.native
  /* 2 */ val enumerationCompleted: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherStatus.enumerationCompleted with Double = js.native
  /* 1 */ val started: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherStatus.started with Double = js.native
  /* 4 */ val stopped: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherStatus.stopped with Double = js.native
  /* 3 */ val stopping: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceWatcherStatus.stopping with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceWatcherStatus with Double] = js.native
}

