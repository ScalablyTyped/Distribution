package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeerDiscoveryTypes extends js.Object

@JSGlobal("Windows.Networking.Proximity.PeerDiscoveryTypes")
@js.native
object PeerDiscoveryTypes extends js.Object {
  @js.native
  sealed trait browse extends PeerDiscoveryTypes
  
  @js.native
  sealed trait none extends PeerDiscoveryTypes
  
  @js.native
  sealed trait triggered extends PeerDiscoveryTypes
  
  /* 1 */ val browse: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.browse with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.none with Double = js.native
  /* 2 */ val triggered: typings.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.triggered with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeerDiscoveryTypes with Double] = js.native
}

