package typings.winrt.Windows.Networking.Proximity

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeerDiscoveryTypes with Double] = js.native
  /* 1 */ @js.native
  object browse extends TopLevel[browse with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object triggered extends TopLevel[triggered with Double]
  
}

