package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads a batch of email conversations. */
@JSGlobal("Windows.ApplicationModel.Email.EmailConversationReader")
@js.native
abstract class EmailConversationReader () extends js.Object {
  /**
    * Asynchronously reads a batch of email conversations.
    * @return Returns a batch of email conversations.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailConversationBatch] = js.native
}

