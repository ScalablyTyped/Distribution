package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides threading info for a ChatConversation . */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversationThreadingInfo")
@js.native
/** Initializes a new instance of the ChatConversationThreadingInfo class. */
class ChatConversationThreadingInfo () extends js.Object {
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

