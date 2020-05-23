package typings.winrtUwp.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeerDiscoveryTypes extends js.Object

/** Indicates which discovery options are available to use with the PeerFinder class. */
@JSGlobal("Windows.Networking.Proximity.PeerDiscoveryTypes")
@js.native
object PeerDiscoveryTypes extends js.Object {
  /** You can use Wifi-Direct to find peers by using the FindAllPeersAsync and ConnectAsync methods of the PeerFinder class. */
  @js.native
  sealed trait browse extends PeerDiscoveryTypes
  
  /** No supported discovery types are available. You can't use the PeerFinder class. */
  @js.native
  sealed trait none extends PeerDiscoveryTypes
  
  /** You can tap to connect to peers by using the PeerFinder class. */
  @js.native
  sealed trait triggered extends PeerDiscoveryTypes
  
}

