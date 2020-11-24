package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
