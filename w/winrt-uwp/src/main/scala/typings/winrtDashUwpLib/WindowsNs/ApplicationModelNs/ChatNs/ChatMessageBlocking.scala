package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for blocking messages. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageBlocking")
@js.native
abstract class ChatMessageBlocking () extends js.Object

/** Provides functionality for blocking messages. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageBlocking")
@js.native
object ChatMessageBlocking extends js.Object {
  /**
                   * Asynchronously marks a message as blocked or unblocked.
                   * @param localChatMessageId The ID of the message to block.
                   * @param blocked TRUE if the message should be blocked, FALSE if it should be unblocked.
                   * @return An async action indicating that the operation has completed.
                   */
  def markMessageAsBlockedAsync(localChatMessageId: java.lang.String, blocked: scala.Boolean): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

