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
  
  val connected: connected with java.lang.String = js.native
  val disconnected: disconnected with java.lang.String = js.native
  val rendering: rendering with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.PlayToNs.PlayToConnectionState with java.lang.String] = js.native
}

