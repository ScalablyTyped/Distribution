package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

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
  sealed trait blocked
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind
  
  /** Custom message */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind
  
  /** Text message */
  @js.native
  sealed trait text
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind
  
  /** Untriaged message */
  @js.native
  sealed trait untriaged
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind
  
  val blocked: blocked with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val untriaged: untriaged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageTransportKind with java.lang.String
  ] = js.native
}

