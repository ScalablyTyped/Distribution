package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets a batch of email messages. */
trait EmailMessageReader extends js.Object {
  /**
    * Reads a collection of email messages.
    * @return A batch of email messages.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailMessageBatch]
}

object EmailMessageReader {
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[EmailMessageBatch]): EmailMessageReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailMessageReader]
  }
}

