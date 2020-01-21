package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatItemKind extends js.Object

/** Specifies the type of a chat item. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatItemKind")
@js.native
object ChatItemKind extends js.Object {
  /** A conversation */
  @js.native
  sealed trait conversation extends ChatItemKind
  
  /** A message */
  @js.native
  sealed trait message extends ChatItemKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatItemKind with Double] = js.native
  /* 1 */ @js.native
  object conversation extends TopLevel[conversation with Double]
  
  /* 0 */ @js.native
  object message extends TopLevel[message with Double]
  
}

