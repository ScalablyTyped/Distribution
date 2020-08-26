package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets a batch of email messages. */
@js.native
trait EmailMessageReader extends js.Object {
  /**
    * Reads a collection of email messages.
    * @return A batch of email messages.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailMessageBatch] = js.native
}

object EmailMessageReader {
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[EmailMessageBatch]): EmailMessageReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailMessageReader]
  }
  @scala.inline
  implicit class EmailMessageReaderOps[Self <: EmailMessageReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[EmailMessageBatch]): Self = this.set("readBatchAsync", js.Any.fromFunction0(value))
  }
  
}

