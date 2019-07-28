package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
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
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns a batch list of chat messages from the message store limited to the specified size.
    * @param count The size of the batch to read.
    * @return An asynchronous operation that returns a list of chat messages upon successful completion.
    */
  def readBatchAsync(count: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

