package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

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
  sealed trait client
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerRole
  
  /** The app is the host peer app in a multi-peer connection. */
  @js.native
  sealed trait host
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerRole
  
  /** The app is part of a two-peer connection. */
  @js.native
  sealed trait peer
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerRole
  
  val client: client with java.lang.String = js.native
  val host: host with java.lang.String = js.native
  val peer: peer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.PeerRole with java.lang.String
  ] = js.native
}

