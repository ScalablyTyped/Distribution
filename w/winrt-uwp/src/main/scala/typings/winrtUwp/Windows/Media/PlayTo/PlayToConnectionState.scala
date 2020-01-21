package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayToConnectionState with Double] = js.native
  /* 1 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 0 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 2 */ @js.native
  object rendering extends TopLevel[rendering with Double]
  
}

