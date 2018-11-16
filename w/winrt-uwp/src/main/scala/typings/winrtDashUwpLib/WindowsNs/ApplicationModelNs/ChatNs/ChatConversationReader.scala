package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for reading batches of conversations from the ChatMessageStore . */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversationReader")
@js.native
abstract class ChatConversationReader () extends js.Object {
  /**
                   * Asynchronously reads batches of conversations from the ChatMessageStore .
                   * @return The list of conversations.
                   */
  def readBatchAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Asynchronously reads batches of conversations from the ChatMessageStore .
                   * @param count Specifies the size of the batch to read.
                   * @return The list of conversations.
                   */
  def readBatchAsync(count: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

