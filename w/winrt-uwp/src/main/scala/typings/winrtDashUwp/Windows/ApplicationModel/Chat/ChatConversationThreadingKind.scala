package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatConversationThreadingKind.contactId
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatConversationThreadingKind.conversationId
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatConversationThreadingKind.custom
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatConversationThreadingKind.participants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatConversationThreadingKind extends js.Object

/** Specifies how a conversation is threaded. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversationThreadingKind")
@js.native
object ChatConversationThreadingKind extends js.Object {
  /** By contact ID */
  @js.native
  sealed trait contactId extends ChatConversationThreadingKind
  
  /** By conversation ID */
  @js.native
  sealed trait conversationId extends ChatConversationThreadingKind
  
  /** Custom threading defined by the app */
  @js.native
  sealed trait custom extends ChatConversationThreadingKind
  
  /** By participants */
  @js.native
  sealed trait participants extends ChatConversationThreadingKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatConversationThreadingKind with Double] = js.native
  /* 1 */ @js.native
  object contactId extends TopLevel[contactId with Double]
  
  /* 2 */ @js.native
  object conversationId extends TopLevel[conversationId with Double]
  
  /* 3 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 0 */ @js.native
  object participants extends TopLevel[participants with Double]
  
}

