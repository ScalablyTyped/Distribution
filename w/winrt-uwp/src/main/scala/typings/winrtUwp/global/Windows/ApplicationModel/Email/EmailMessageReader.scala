package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets a batch of email messages. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageReader")
@js.native
abstract class EmailMessageReader ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageReader {
  /**
    * Reads a collection of email messages.
    * @return A batch of email messages.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageBatch] = js.native
}

