package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs

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
  sealed trait connected
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState
  
  /** The connection is disconnected. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState
  
  /** The connection is rendering media on the Play To target device. */
  @js.native
  sealed trait rendering
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState
  
  /* 1 */ val connected: connected with scala.Double = js.native
  /* 0 */ val disconnected: disconnected with scala.Double = js.native
  /* 2 */ val rendering: rendering with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState with scala.Double
  ] = js.native
}

