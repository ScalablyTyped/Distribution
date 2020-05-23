package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads a batch of email conversations. */
trait EmailConversationReader extends js.Object {
  /**
    * Asynchronously reads a batch of email conversations.
    * @return Returns a batch of email conversations.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailConversationBatch]
}

object EmailConversationReader {
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[EmailConversationBatch]): EmailConversationReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailConversationReader]
  }
}

