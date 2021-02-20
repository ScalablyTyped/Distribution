package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods to enable and retrieve message change revisions. */
@js.native
trait ChatMessageChangeTracker extends StObject {
  
  /** Enables change tracking for the messages in the message store. */
  def enable(): Unit = js.native
  
  /**
    * Returns a ChatMessageChangeReader class object which provides a collection of message revisions from the message store.
    * @return The change reader associated with the change tracker.
    */
  def getChangeReader(): ChatMessageChangeReader = js.native
  
  /** Resets change tracking for the messages in the message store. The first revision begins with the next message change. */
  def reset(): Unit = js.native
}
object ChatMessageChangeTracker {
  
  @scala.inline
  def apply(enable: () => Unit, getChangeReader: () => ChatMessageChangeReader, reset: () => Unit): ChatMessageChangeTracker = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), getChangeReader = js.Any.fromFunction0(getChangeReader), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ChatMessageChangeTracker]
  }
  
  @scala.inline
  implicit class ChatMessageChangeTrackerMutableBuilder[Self <: ChatMessageChangeTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChangeReader(value: () => ChatMessageChangeReader): Self = StObject.set(x, "getChangeReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
