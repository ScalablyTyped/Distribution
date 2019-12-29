package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageChangeType with Double] = js.native
  /* 3 */ @js.native
  object changeTrackingLost extends TopLevel[changeTrackingLost with Double]
  
  /* 0 */ @js.native
  object messageCreated extends TopLevel[messageCreated with Double]
  
  /* 2 */ @js.native
  object messageDeleted extends TopLevel[messageDeleted with Double]
  
  /* 1 */ @js.native
  object messageModified extends TopLevel[messageModified with Double]
  
}

