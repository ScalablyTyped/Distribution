package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatMessageTransportKind extends js.Object
/** Specifies the type of the message transport. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransportKind")
@js.native
object ChatMessageTransportKind extends js.Object {
  
  /** Intercepted by the filtering app and marked as blocked */
  @js.native
  sealed trait blocked extends ChatMessageTransportKind
  
  /** Custom message */
  @js.native
  sealed trait custom extends ChatMessageTransportKind
  
  /** Text message */
  @js.native
  sealed trait text extends ChatMessageTransportKind
  
  /** Untriaged message */
  @js.native
  sealed trait untriaged extends ChatMessageTransportKind
}
