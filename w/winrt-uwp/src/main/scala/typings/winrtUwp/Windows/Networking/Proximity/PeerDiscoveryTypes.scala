package typings.winrtUwp.Windows.Networking.Proximity

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeerDiscoveryTypes with Double] = js.native
  /* 1 */ @js.native
  object browse extends TopLevel[browse with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object triggered extends TopLevel[triggered with Double]
  
}

