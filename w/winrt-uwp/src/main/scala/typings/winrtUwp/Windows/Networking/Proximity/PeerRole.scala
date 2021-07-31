package typings.winrtUwp.Windows.Networking.Proximity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PeerRole extends StObject
/** Describes the role of the peer app when connected to multiple peers. */
@JSGlobal("Windows.Networking.Proximity.PeerRole")
@js.native
object PeerRole extends StObject {
  
  /** The app is a client peer app in a multi-peer connection. */
  @js.native
  sealed trait client
    extends StObject
       with PeerRole
  
  /** The app is the host peer app in a multi-peer connection. */
  @js.native
  sealed trait host
    extends StObject
       with PeerRole
  
  /** The app is part of a two-peer connection. */
  @js.native
  sealed trait peer
    extends StObject
       with PeerRole
}
