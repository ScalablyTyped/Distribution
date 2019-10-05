package typings.winrtDashUwp.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeerRole extends js.Object

/** Describes the role of the peer app when connected to multiple peers. */
@JSGlobal("Windows.Networking.Proximity.PeerRole")
@js.native
object PeerRole extends js.Object {
  /** The app is a client peer app in a multi-peer connection. */
  @js.native
  sealed trait client extends PeerRole
  
  /** The app is the host peer app in a multi-peer connection. */
  @js.native
  sealed trait host extends PeerRole
  
  /** The app is part of a two-peer connection. */
  @js.native
  sealed trait peer extends PeerRole
  
  /* 2 */ val client: typings.winrtDashUwp.Windows.Networking.Proximity.PeerRole.client with Double = js.native
  /* 1 */ val host: typings.winrtDashUwp.Windows.Networking.Proximity.PeerRole.host with Double = js.native
  /* 0 */ val peer: typings.winrtDashUwp.Windows.Networking.Proximity.PeerRole.peer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeerRole with Double] = js.native
}

