package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CastingNs

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
  sealed trait connected
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionState
  
  /** The connection is connecting. */
  @js.native
  sealed trait connecting
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionState
  
  /** The casting connection has been disconnected. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionState
  
  /** The connection is being disconnected. */
  @js.native
  sealed trait disconnecting
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionState
  
  /** The casting connection is actively playing content. */
  @js.native
  sealed trait rendering
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionState
  
  /* 1 */ val connected: connected with scala.Double = js.native
  /* 4 */ val connecting: connecting with scala.Double = js.native
  /* 0 */ val disconnected: disconnected with scala.Double = js.native
  /* 3 */ val disconnecting: disconnecting with scala.Double = js.native
  /* 2 */ val rendering: rendering with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionState with scala.Double
  ] = js.native
}

