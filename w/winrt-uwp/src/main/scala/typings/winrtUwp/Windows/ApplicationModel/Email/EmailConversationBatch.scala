package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of EmailConversation objects for batch processing. */
@js.native
trait EmailConversationBatch extends js.Object {
  
  /** Gets a list of EmailConversation objects to use for batch processing. */
  var conversations: IVectorView[EmailConversation] = js.native
  
  /** Gets the status of the last batch processing operation. */
  var status: EmailBatchStatus = js.native
}
object EmailConversationBatch {
  
  @scala.inline
  def apply(conversations: IVectorView[EmailConversation], status: EmailBatchStatus): EmailConversationBatch = {
    val __obj = js.Dynamic.literal(conversations = conversations.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailConversationBatch]
  }
  
  @scala.inline
  implicit class EmailConversationBatchOps[Self <: EmailConversationBatch] (val x: Self) extends AnyVal {
    
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
    def setConversations(value: IVectorView[EmailConversation]): Self = this.set("conversations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EmailBatchStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
