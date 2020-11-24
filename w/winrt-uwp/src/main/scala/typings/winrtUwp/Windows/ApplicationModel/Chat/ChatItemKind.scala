package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
