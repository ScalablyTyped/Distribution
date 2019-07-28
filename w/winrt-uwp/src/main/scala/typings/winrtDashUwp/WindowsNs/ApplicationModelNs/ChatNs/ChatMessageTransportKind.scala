package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val blocked: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind.blocked with Double = js.native
  /* 3 */ val custom: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind.custom with Double = js.native
  /* 0 */ val text: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind.text with Double = js.native
  /* 1 */ val untriaged: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind.untriaged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageTransportKind with Double] = js.native
}

