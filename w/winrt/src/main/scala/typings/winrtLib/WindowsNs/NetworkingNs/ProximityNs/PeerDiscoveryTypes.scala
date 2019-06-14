package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeerDiscoveryTypes extends js.Object

@JSGlobal("Windows.Networking.Proximity.PeerDiscoveryTypes")
@js.native
object PeerDiscoveryTypes extends js.Object {
  @js.native
  sealed trait browse
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes
  
  @js.native
  sealed trait triggered
    extends winrtLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes
  
  /* 1 */ val browse: browse with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val triggered: triggered with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes with scala.Double] = js.native
}

