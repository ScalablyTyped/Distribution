package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides threading info for a ChatConversation . */
@js.native
trait ChatConversationThreadingInfo extends js.Object {
  
  /** Gets or sets the Contact.Id for the remote participant. */
  var contactId: String = js.native
  
  /** Gets or sets the ID of the ChatConversation . */
  var conversationId: String = js.native
  
  /** Gets or sets a string where you can store your own custom threading info. */
  var custom: String = js.native
  
  /** Gets or sets a value that indicates the type of threading info, such as participant, contact ID, conversation ID, and so on. */
  var kind: ChatConversationThreadingKind = js.native
  
  /** Gets the list of participants in the ChatConversation . */
  var participants: IVector[String] = js.native
}
object ChatConversationThreadingInfo {
  
  @scala.inline
  def apply(
    contactId: String,
    conversationId: String,
    custom: String,
    kind: ChatConversationThreadingKind,
    participants: IVector[String]
  ): ChatConversationThreadingInfo = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any], conversationId = conversationId.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatConversationThreadingInfo]
  }
  
  @scala.inline
  implicit class ChatConversationThreadingInfoOps[Self <: ChatConversationThreadingInfo] (val x: Self) extends AnyVal {
    
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
    def setContactId(value: String): Self = this.set("contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationId(value: String): Self = this.set("conversationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: String): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ChatConversationThreadingKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipants(value: IVector[String]): Self = this.set("participants", value.asInstanceOf[js.Any])
  }
}
