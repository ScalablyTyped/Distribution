package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods to enable and retrieve message change revisions. */
@js.native
trait ChatMessageChangeTracker extends js.Object {
  
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
  implicit class ChatMessageChangeTrackerOps[Self <: ChatMessageChangeTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChangeReader(value: () => ChatMessageChangeReader): Self = this.set("getChangeReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
}
