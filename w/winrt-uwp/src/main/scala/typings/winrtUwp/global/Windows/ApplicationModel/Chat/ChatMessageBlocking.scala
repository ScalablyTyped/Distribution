package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for blocking messages. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageBlocking")
@js.native
abstract class ChatMessageBlocking ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageBlocking
object ChatMessageBlocking {
  
  /**
    * Asynchronously marks a message as blocked or unblocked.
    * @param localChatMessageId The ID of the message to block.
    * @param blocked TRUE if the message should be blocked, FALSE if it should be unblocked.
    * @return An async action indicating that the operation has completed.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageBlocking.markMessageAsBlockedAsync")
  @js.native
  def markMessageAsBlockedAsync(localChatMessageId: String, blocked: Boolean): IPromiseWithIAsyncAction = js.native
}
