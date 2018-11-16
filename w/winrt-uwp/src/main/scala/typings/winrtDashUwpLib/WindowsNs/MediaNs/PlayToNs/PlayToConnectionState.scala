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
  
  val connected: connected with java.lang.String = js.native
  val disconnected: disconnected with java.lang.String = js.native
  val rendering: rendering with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState with java.lang.String
  ] = js.native
}

