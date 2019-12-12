package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.connected
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.disconnected
import typings.winrt.Windows.Media.PlayTo.PlayToConnectionState.rendering
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayToConnectionState with Double] = js.native
  /* 1 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 2 */ @js.native
  object rendering extends TopLevel[rendering with Double]
  
}

