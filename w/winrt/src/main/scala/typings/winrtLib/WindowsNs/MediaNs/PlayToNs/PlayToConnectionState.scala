package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionState extends js.Object

@JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
@js.native
object PlayToConnectionState extends js.Object {
  @js.native
  sealed trait connected
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState
  
  @js.native
  sealed trait disconnected
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState
  
  @js.native
  sealed trait rendering
    extends winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState
  
  /* 1 */ val connected: connected with scala.Double = js.native
  /* 0 */ val disconnected: disconnected with scala.Double = js.native
  /* 2 */ val rendering: rendering with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState with scala.Double] = js.native
}

