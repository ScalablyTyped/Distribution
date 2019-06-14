package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

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
  sealed trait browse
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes
  
  /** No supported discovery types are available. You can't use the PeerFinder class. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes
  
  /** You can tap to connect to peers by using the PeerFinder class. */
  @js.native
  sealed trait triggered
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes
  
  /* 1 */ val browse: browse with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val triggered: triggered with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes with scala.Double
  ] = js.native
}

