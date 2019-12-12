package typings.winrtDashUwp.Windows.Media.Casting

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Casting.CastingConnectionState.connected
import typings.winrtDashUwp.Windows.Media.Casting.CastingConnectionState.connecting
import typings.winrtDashUwp.Windows.Media.Casting.CastingConnectionState.disconnected
import typings.winrtDashUwp.Windows.Media.Casting.CastingConnectionState.disconnecting
import typings.winrtDashUwp.Windows.Media.Casting.CastingConnectionState.rendering
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CastingConnectionState with Double] = js.native
  /* 1 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 4 */ @js.native
  object connecting extends TopLevel[connecting with Double]
  
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 3 */ @js.native
  object disconnecting extends TopLevel[disconnecting with Double]
  
  /* 2 */ @js.native
  object rendering extends TopLevel[rendering with Double]
  
}

