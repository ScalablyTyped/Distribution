package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

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
  sealed trait conversationDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat conversation has been modified */
  @js.native
  sealed trait conversationModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat conversation has been deleted of all messages from a transport. */
  @js.native
  sealed trait conversationTransportDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat message has been created */
  @js.native
  sealed trait messageCreated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat message has been deleted */
  @js.native
  sealed trait messageDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat message has been changed */
  @js.native
  sealed trait messageModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** Notifications have been missed */
  @js.native
  sealed trait notificationsMissed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** The chat store has been modified */
  @js.native
  sealed trait storeModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /* 6 */ val conversationDeleted: conversationDeleted with scala.Double = js.native
  /* 5 */ val conversationModified: conversationModified with scala.Double = js.native
  /* 7 */ val conversationTransportDeleted: conversationTransportDeleted with scala.Double = js.native
  /* 2 */ val messageCreated: messageCreated with scala.Double = js.native
  /* 4 */ val messageDeleted: messageDeleted with scala.Double = js.native
  /* 3 */ val messageModified: messageModified with scala.Double = js.native
  /* 0 */ val notificationsMissed: notificationsMissed with scala.Double = js.native
  /* 1 */ val storeModified: storeModified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind with scala.Double
  ] = js.native
}

