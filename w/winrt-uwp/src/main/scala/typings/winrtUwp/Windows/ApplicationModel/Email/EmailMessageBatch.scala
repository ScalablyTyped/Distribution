package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of email messages. */
trait EmailMessageBatch extends js.Object {
  /** Gets a batch of email messages. */
  var messages: IVectorView[EmailMessage]
  /** Gets the status of the email batch read. */
  var status: EmailBatchStatus
}

object EmailMessageBatch {
  @scala.inline
  def apply(messages: IVectorView[EmailMessage], status: EmailBatchStatus): EmailMessageBatch = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessageBatch]
  }
}

