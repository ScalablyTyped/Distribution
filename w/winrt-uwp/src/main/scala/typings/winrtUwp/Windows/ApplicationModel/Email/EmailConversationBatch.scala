package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of EmailConversation objects for batch processing. */
@js.native
trait EmailConversationBatch extends StObject {
  
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
  implicit class EmailConversationBatchMutableBuilder[Self <: EmailConversationBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversations(value: IVectorView[EmailConversation]): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EmailBatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
