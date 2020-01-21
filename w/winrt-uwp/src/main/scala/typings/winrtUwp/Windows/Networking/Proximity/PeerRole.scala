package typings.winrtUwp.Windows.Networking.Proximity

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PeerRole with Double] = js.native
  /* 2 */ @js.native
  object client extends TopLevel[client with Double]
  
  /* 1 */ @js.native
  object host extends TopLevel[host with Double]
  
  /* 0 */ @js.native
  object peer extends TopLevel[peer with Double]
  
}

