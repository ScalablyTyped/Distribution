package typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionState extends js.Object

/** Describes the status of a Play To connection. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
@js.native
object PlayToConnectionState extends js.Object {
  /** The connection is connected. */
  @js.native
  sealed trait connected extends PlayToConnectionState
  
  /** The connection is disconnected. */
  @js.native
  sealed trait disconnected extends PlayToConnectionState
  
  /** The connection is rendering media on the Play To target device. */
  @js.native
  sealed trait rendering extends PlayToConnectionState
  
  /* 1 */ val connected: typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState.connected with Double = js.native
  /* 0 */ val disconnected: typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState.disconnected with Double = js.native
  /* 2 */ val rendering: typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState.rendering with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayToConnectionState with Double] = js.native
}

