package typings.winrtUwp.Windows.Networking.Proximity

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
  
}

