package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatStoreChangedEventKind extends StObject
/** Specifies the type of change that occurred for a ChatMessageStoreChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatStoreChangedEventKind")
@js.native
object ChatStoreChangedEventKind extends StObject {
  
  /** A chat conversation has been deleted */
  @js.native
  sealed trait conversationDeleted
    extends StObject
       with ChatStoreChangedEventKind
  
  /** A chat conversation has been modified */
  @js.native
  sealed trait conversationModified
    extends StObject
       with ChatStoreChangedEventKind
  
  /** A chat conversation has been deleted of all messages from a transport. */
  @js.native
  sealed trait conversationTransportDeleted
    extends StObject
       with ChatStoreChangedEventKind
  
  /** A chat message has been created */
  @js.native
  sealed trait messageCreated
    extends StObject
       with ChatStoreChangedEventKind
  
  /** A chat message has been deleted */
  @js.native
  sealed trait messageDeleted
    extends StObject
       with ChatStoreChangedEventKind
  
  /** A chat message has been changed */
  @js.native
  sealed trait messageModified
    extends StObject
       with ChatStoreChangedEventKind
  
  /** Notifications have been missed */
  @js.native
  sealed trait notificationsMissed
    extends StObject
       with ChatStoreChangedEventKind
  
  /** The chat store has been modified */
  @js.native
  sealed trait storeModified
    extends StObject
       with ChatStoreChangedEventKind
}
