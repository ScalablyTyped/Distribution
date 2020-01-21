package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to search for chat messages in the ChatMessageStore . */
@JSGlobal("Windows.ApplicationModel.Chat.ChatSearchReader")
@js.native
abstract class ChatSearchReader () extends js.Object {
  /**
    * Returns a batch of found items matching the search criteria.
    * @return A list of items matching the search criteria.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns a batch of found items matching the search criteria.
    * @param count The maximum number of items to return.
    * @return A list of items matching the search criteria.
    */
  def readBatchAsync(count: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

