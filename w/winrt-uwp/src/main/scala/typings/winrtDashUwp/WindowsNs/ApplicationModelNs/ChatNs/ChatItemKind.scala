package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

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
  
  /* 1 */ val conversation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatItemKind.conversation with Double = js.native
  /* 0 */ val message: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatItemKind.message with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatItemKind with Double] = js.native
}

