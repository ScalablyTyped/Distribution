package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
