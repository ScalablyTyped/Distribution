package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RcsServiceKind extends js.Object

/** Specifies the type of the Rich Communication Services (RCS) service. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsServiceKind")
@js.native
object RcsServiceKind extends js.Object {
  /** Capability service */
  @js.native
  sealed trait capability
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.RcsServiceKind
  
  /** Chat service */
  @js.native
  sealed trait chat
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.RcsServiceKind
  
  /** File transfer service */
  @js.native
  sealed trait fileTransfer
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.RcsServiceKind
  
  /** Group chat service */
  @js.native
  sealed trait groupChat
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.RcsServiceKind
  
  val capability: capability with java.lang.String = js.native
  val chat: chat with java.lang.String = js.native
  val fileTransfer: fileTransfer with java.lang.String = js.native
  val groupChat: groupChat with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.RcsServiceKind with java.lang.String
  ] = js.native
}

