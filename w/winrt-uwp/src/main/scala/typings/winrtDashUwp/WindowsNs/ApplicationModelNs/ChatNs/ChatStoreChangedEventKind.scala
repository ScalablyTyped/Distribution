package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

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
  
  /* 6 */ val conversationDeleted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind.conversationDeleted with Double = js.native
  /* 5 */ val conversationModified: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind.conversationModified with Double = js.native
  /* 7 */ val conversationTransportDeleted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind.conversationTransportDeleted with Double = js.native
  /* 2 */ val messageCreated: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind.messageCreated with Double = js.native
  /* 4 */ val messageDeleted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind.messageDeleted with Double = js.native
  /* 3 */ val messageModified: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind.messageModified with Double = js.native
  /* 0 */ val notificationsMissed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind.notificationsMissed with Double = js.native
  /* 1 */ val storeModified: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind.storeModified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatStoreChangedEventKind with Double] = js.native
}

