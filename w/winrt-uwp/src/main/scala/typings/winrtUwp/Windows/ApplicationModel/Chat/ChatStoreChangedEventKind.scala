package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatStoreChangedEventKind extends js.Object

/** Specifies the type of change that occurred for a ChatMessageStoreChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatStoreChangedEventKind")
@js.native
object ChatStoreChangedEventKind extends js.Object {
  /** A chat conversation has been deleted */
  @js.native
  sealed trait conversationDeleted extends ChatStoreChangedEventKind
  
  /** A chat conversation has been modified */
  @js.native
  sealed trait conversationModified extends ChatStoreChangedEventKind
  
  /** A chat conversation has been deleted of all messages from a transport. */
  @js.native
  sealed trait conversationTransportDeleted extends ChatStoreChangedEventKind
  
  /** A chat message has been created */
  @js.native
  sealed trait messageCreated extends ChatStoreChangedEventKind
  
  /** A chat message has been deleted */
  @js.native
  sealed trait messageDeleted extends ChatStoreChangedEventKind
  
  /** A chat message has been changed */
  @js.native
  sealed trait messageModified extends ChatStoreChangedEventKind
  
  /** Notifications have been missed */
  @js.native
  sealed trait notificationsMissed extends ChatStoreChangedEventKind
  
  /** The chat store has been modified */
  @js.native
  sealed trait storeModified extends ChatStoreChangedEventKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatStoreChangedEventKind with Double] = js.native
  /* 6 */ @js.native
  object conversationDeleted extends TopLevel[conversationDeleted with Double]
  
  /* 5 */ @js.native
  object conversationModified extends TopLevel[conversationModified with Double]
  
  /* 7 */ @js.native
  object conversationTransportDeleted extends TopLevel[conversationTransportDeleted with Double]
  
  /* 2 */ @js.native
  object messageCreated extends TopLevel[messageCreated with Double]
  
  /* 4 */ @js.native
  object messageDeleted extends TopLevel[messageDeleted with Double]
  
  /* 3 */ @js.native
  object messageModified extends TopLevel[messageModified with Double]
  
  /* 0 */ @js.native
  object notificationsMissed extends TopLevel[notificationsMissed with Double]
  
  /* 1 */ @js.native
  object storeModified extends TopLevel[storeModified with Double]
  
}

