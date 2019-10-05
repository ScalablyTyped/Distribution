package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatMessageChangeType extends js.Object

/** Specifies the type of change made to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChangeType")
@js.native
object ChatMessageChangeType extends js.Object {
  /** Change tracking lost. */
  @js.native
  sealed trait changeTrackingLost extends ChatMessageChangeType
  
  /** Message created. */
  @js.native
  sealed trait messageCreated extends ChatMessageChangeType
  
  /** Message deleted. */
  @js.native
  sealed trait messageDeleted extends ChatMessageChangeType
  
  /** Message modified. */
  @js.native
  sealed trait messageModified extends ChatMessageChangeType
  
  /* 3 */ val changeTrackingLost: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageChangeType.changeTrackingLost with Double = js.native
  /* 0 */ val messageCreated: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageChangeType.messageCreated with Double = js.native
  /* 2 */ val messageDeleted: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageChangeType.messageDeleted with Double = js.native
  /* 1 */ val messageModified: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageChangeType.messageModified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageChangeType with Double] = js.native
}

