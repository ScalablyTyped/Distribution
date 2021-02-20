package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatMessageTransportKind extends StObject
/** Specifies the type of the message transport. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransportKind")
@js.native
object ChatMessageTransportKind extends StObject {
  
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
