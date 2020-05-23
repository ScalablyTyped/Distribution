package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides threading info for a ChatConversation . */
trait ChatConversationThreadingInfo extends js.Object {
  /** Gets or sets the Contact.Id for the remote participant. */
  var contactId: String
  /** Gets or sets the ID of the ChatConversation . */
  var conversationId: String
  /** Gets or sets a string where you can store your own custom threading info. */
  var custom: String
  /** Gets or sets a value that indicates the type of threading info, such as participant, contact ID, conversation ID, and so on. */
  var kind: ChatConversationThreadingKind
  /** Gets the list of participants in the ChatConversation . */
  var participants: IVector[String]
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
}

