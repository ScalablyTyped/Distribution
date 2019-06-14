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
  
  /* 3 */ val capability: capability with scala.Double = js.native
  /* 0 */ val chat: chat with scala.Double = js.native
  /* 2 */ val fileTransfer: fileTransfer with scala.Double = js.native
  /* 1 */ val groupChat: groupChat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.RcsServiceKind with scala.Double
  ] = js.native
}

