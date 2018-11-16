package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for reading messages from the message store. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageReader")
@js.native
abstract class ChatMessageReader () extends js.Object {
  /**
                   * Returns a batch list of chat messages from the message store.
                   * @return An asynchronous operation that returns a list of chat messages upon successful completion.
                   */
  def readBatchAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Returns a batch list of chat messages from the message store limited to the specified size.
                   * @param count The size of the batch to read.
                   * @return An asynchronous operation that returns a list of chat messages upon successful completion.
                   */
  def readBatchAsync(count: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

