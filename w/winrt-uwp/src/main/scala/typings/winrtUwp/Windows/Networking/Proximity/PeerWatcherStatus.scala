package typings.winrtUwp.Windows.Networking.Proximity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PeerWatcherStatus extends StObject
/** Describes the status of a PeerWatcher object. */
@JSGlobal("Windows.Networking.Proximity.PeerWatcherStatus")
@js.native
object PeerWatcherStatus extends StObject {
  
  /** Watching for peers has stopped due to a failure. */
  @js.native
  sealed trait aborted
    extends StObject
       with PeerWatcherStatus
  
  /** The peer watcher has been created and can start watching for peer apps within wireless range. */
  @js.native
  sealed trait created
    extends StObject
       with PeerWatcherStatus
  
  /** A scan operation is complete and all peer apps within wireless range have been found. */
  @js.native
  sealed trait enumerationCompleted
    extends StObject
       with PeerWatcherStatus
  
  /** The peer watcher has started watching for peer apps within wireless range. */
  @js.native
  sealed trait started
    extends StObject
       with PeerWatcherStatus
  
  /** The peer watcher has stopped watching for peer apps within wireless range. */
  @js.native
  sealed trait stopped
    extends StObject
       with PeerWatcherStatus
  
  /** The peer watcher is stopping. */
  @js.native
  sealed trait stopping
    extends StObject
       with PeerWatcherStatus
}
