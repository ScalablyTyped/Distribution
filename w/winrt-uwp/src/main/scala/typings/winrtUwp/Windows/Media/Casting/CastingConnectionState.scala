package typings.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
