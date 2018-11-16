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
  
  val browse: browse with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val triggered: triggered with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ProximityNs.PeerDiscoveryTypes with java.lang.String
  ] = js.native
}

