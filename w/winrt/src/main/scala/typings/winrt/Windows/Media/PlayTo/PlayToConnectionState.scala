package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayToConnectionState extends js.Object

@JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
@js.native
object PlayToConnectionState extends js.Object {
  @js.native
  sealed trait connected extends PlayToConnectionState
  
  @js.native
  sealed trait disconnected extends PlayToConnectionState
  
  @js.native
  sealed trait rendering extends PlayToConnectionState
  
  /* 1 */ val connected: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.connected with Double = js.native
  /* 0 */ val disconnected: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.disconnected with Double = js.native
  /* 2 */ val rendering: typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.rendering with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayToConnectionState with Double] = js.native
}

