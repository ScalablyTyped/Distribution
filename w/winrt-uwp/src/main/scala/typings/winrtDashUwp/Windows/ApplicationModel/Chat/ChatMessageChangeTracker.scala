package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods to enable and retrieve message change revisions. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChangeTracker")
@js.native
abstract class ChatMessageChangeTracker () extends js.Object {
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

