package typings.winrtDashUwp.Windows.ApplicationModel.Chat

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
  sealed trait capability extends RcsServiceKind
  
  /** Chat service */
  @js.native
  sealed trait chat extends RcsServiceKind
  
  /** File transfer service */
  @js.native
  sealed trait fileTransfer extends RcsServiceKind
  
  /** Group chat service */
  @js.native
  sealed trait groupChat extends RcsServiceKind
  
  /* 3 */ val capability: typings.winrtDashUwp.Windows.ApplicationModel.Chat.RcsServiceKind.capability with Double = js.native
  /* 0 */ val chat: typings.winrtDashUwp.Windows.ApplicationModel.Chat.RcsServiceKind.chat with Double = js.native
  /* 2 */ val fileTransfer: typings.winrtDashUwp.Windows.ApplicationModel.Chat.RcsServiceKind.fileTransfer with Double = js.native
  /* 1 */ val groupChat: typings.winrtDashUwp.Windows.ApplicationModel.Chat.RcsServiceKind.groupChat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RcsServiceKind with Double] = js.native
}

