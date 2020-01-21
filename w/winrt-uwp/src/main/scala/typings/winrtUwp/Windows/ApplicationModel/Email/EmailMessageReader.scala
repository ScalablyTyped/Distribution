package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets a batch of email messages. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageReader")
@js.native
abstract class EmailMessageReader () extends js.Object {
  /**
    * Reads a collection of email messages.
    * @return A batch of email messages.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailMessageBatch] = js.native
}

