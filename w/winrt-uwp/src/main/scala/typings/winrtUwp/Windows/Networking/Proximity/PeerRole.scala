package typings.winrtUwp.Windows.Networking.Proximity

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
  
}

