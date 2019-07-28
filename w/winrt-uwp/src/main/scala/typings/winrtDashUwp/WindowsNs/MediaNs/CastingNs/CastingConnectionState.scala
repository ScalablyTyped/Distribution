package typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastingConnectionState extends js.Object

/** Indicates the current state of a casting connection. Rendering is used when actively playing content. */
@JSGlobal("Windows.Media.Casting.CastingConnectionState")
@js.native
object CastingConnectionState extends js.Object {
  /** The casting connection is active. */
  @js.native
  sealed trait connected extends CastingConnectionState
  
  /** The connection is connecting. */
  @js.native
  sealed trait connecting extends CastingConnectionState
  
  /** The casting connection has been disconnected. */
  @js.native
  sealed trait disconnected extends CastingConnectionState
  
  /** The connection is being disconnected. */
  @js.native
  sealed trait disconnecting extends CastingConnectionState
  
  /** The casting connection is actively playing content. */
  @js.native
  sealed trait rendering extends CastingConnectionState
  
  /* 1 */ val connected: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingConnectionState.connected with Double = js.native
  /* 4 */ val connecting: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingConnectionState.connecting with Double = js.native
  /* 0 */ val disconnected: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingConnectionState.disconnected with Double = js.native
  /* 3 */ val disconnecting: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingConnectionState.disconnecting with Double = js.native
  /* 2 */ val rendering: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingConnectionState.rendering with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CastingConnectionState with Double] = js.native
}

