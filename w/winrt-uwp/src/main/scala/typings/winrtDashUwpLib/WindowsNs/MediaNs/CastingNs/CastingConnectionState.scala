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
  
  val connected: connected with java.lang.String = js.native
  val connecting: connecting with java.lang.String = js.native
  val disconnected: disconnected with java.lang.String = js.native
  val disconnecting: disconnecting with java.lang.String = js.native
  val rendering: rendering with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingConnectionState with java.lang.String
  ] = js.native
}

