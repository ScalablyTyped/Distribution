package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RcsServiceKind with Double] = js.native
  /* 3 */ @js.native
  object capability extends TopLevel[capability with Double]
  
  /* 0 */ @js.native
  object chat extends TopLevel[chat with Double]
  
  /* 2 */ @js.native
  object fileTransfer extends TopLevel[fileTransfer with Double]
  
  /* 1 */ @js.native
  object groupChat extends TopLevel[groupChat with Double]
  
}

