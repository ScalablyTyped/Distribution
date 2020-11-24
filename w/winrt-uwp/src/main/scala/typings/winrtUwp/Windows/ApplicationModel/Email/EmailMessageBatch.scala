package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of email messages. */
@js.native
trait EmailMessageBatch extends js.Object {
  
  /** Gets a batch of email messages. */
  var messages: IVectorView[EmailMessage] = js.native
  
  /** Gets the status of the email batch read. */
  var status: EmailBatchStatus = js.native
}
object EmailMessageBatch {
  
  @scala.inline
  def apply(messages: IVectorView[EmailMessage], status: EmailBatchStatus): EmailMessageBatch = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessageBatch]
  }
  
  @scala.inline
  implicit class EmailMessageBatchOps[Self <: EmailMessageBatch] (val x: Self) extends AnyVal {
    
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
    def setMessages(value: IVectorView[EmailMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EmailBatchStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
