package typings.winrtDashUwp.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeerWatcherStatus extends js.Object

/** Describes the status of a PeerWatcher object. */
@JSGlobal("Windows.Networking.Proximity.PeerWatcherStatus")
@js.native
object PeerWatcherStatus extends js.Object {
  /** Watching for peers has stopped due to a failure. */
  @js.native
  sealed trait aborted extends PeerWatcherStatus
  
  /** The peer watcher has been created and can start watching for peer apps within wireless range. */
  @js.native
  sealed trait created extends PeerWatcherStatus
  
  /** A scan operation is complete and all peer apps within wireless range have been found. */
  @js.native
  sealed trait enumerationCompleted extends PeerWatcherStatus
  
  /** The peer watcher has started watching for peer apps within wireless range. */
  @js.native
  sealed trait started extends PeerWatcherStatus
  
  /** The peer watcher has stopped watching for peer apps within wireless range. */
  @js.native
  sealed trait stopped extends PeerWatcherStatus
  
  /** The peer watcher is stopping. */
  @js.native
  sealed trait stopping extends PeerWatcherStatus
  
  /* 5 */ val aborted: typings.winrtDashUwp.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrtDashUwp.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus.created with Double = js.native
  /* 2 */ val enumerationCompleted: typings.winrtDashUwp.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus.enumerationCompleted with Double = js.native
  /* 1 */ val started: typings.winrtDashUwp.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus.started with Double = js.native
  /* 4 */ val stopped: typings.winrtDashUwp.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus.stopped with Double = js.native
  /* 3 */ val stopping: typings.winrtDashUwp.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus.stopping with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeerWatcherStatus with Double] = js.native
}

