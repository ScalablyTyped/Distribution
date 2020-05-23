package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of EmailConversation objects for batch processing. */
trait EmailConversationBatch extends js.Object {
  /** Gets a list of EmailConversation objects to use for batch processing. */
  var conversations: IVectorView[EmailConversation]
  /** Gets the status of the last batch processing operation. */
  var status: EmailBatchStatus
}

object EmailConversationBatch {
  @scala.inline
  def apply(conversations: IVectorView[EmailConversation], status: EmailBatchStatus): EmailConversationBatch = {
    val __obj = js.Dynamic.literal(conversations = conversations.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailConversationBatch]
  }
}

