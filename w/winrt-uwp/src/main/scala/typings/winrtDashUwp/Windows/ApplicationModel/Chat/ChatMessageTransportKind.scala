package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageTransportKind with Double] = js.native
  /* 2 */ @js.native
  object blocked extends TopLevel[blocked with Double]
  
  /* 3 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 0 */ @js.native
  object text extends TopLevel[text with Double]
  
  /* 1 */ @js.native
  object untriaged extends TopLevel[untriaged with Double]
  
}

