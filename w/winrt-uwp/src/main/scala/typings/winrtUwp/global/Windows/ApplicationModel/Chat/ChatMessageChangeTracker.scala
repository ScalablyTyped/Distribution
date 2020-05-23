package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods to enable and retrieve message change revisions. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChangeTracker")
@js.native
abstract class ChatMessageChangeTracker ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChangeTracker {
  /** Enables change tracking for the messages in the message store. */
  /* CompleteClass */
  override def enable(): Unit = js.native
  /**
    * Returns a ChatMessageChangeReader class object which provides a collection of message revisions from the message store.
    * @return The change reader associated with the change tracker.
    */
  /* CompleteClass */
  override def getChangeReader(): typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChangeReader = js.native
  /** Resets change tracking for the messages in the message store. The first revision begins with the next message change. */
  /* CompleteClass */
  override def reset(): Unit = js.native
}

