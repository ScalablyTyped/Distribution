package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

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
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus
  
  /** The peer watcher has been created and can start watching for peer apps within wireless range. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus
  
  /** A scan operation is complete and all peer apps within wireless range have been found. */
  @js.native
  sealed trait enumerationCompleted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus
  
  /** The peer watcher has started watching for peer apps within wireless range. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus
  
  /** The peer watcher has stopped watching for peer apps within wireless range. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus
  
  /** The peer watcher is stopping. */
  @js.native
  sealed trait stopping
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus
  
  /* 5 */ val aborted: aborted with scala.Double = js.native
  /* 0 */ val created: created with scala.Double = js.native
  /* 2 */ val enumerationCompleted: enumerationCompleted with scala.Double = js.native
  /* 1 */ val started: started with scala.Double = js.native
  /* 4 */ val stopped: stopped with scala.Double = js.native
  /* 3 */ val stopping: stopping with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerWatcherStatus with scala.Double
  ] = js.native
}

