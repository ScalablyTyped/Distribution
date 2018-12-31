package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides threading info for a ChatConversation . */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversationThreadingInfo")
@js.native
/** Initializes a new instance of the ChatConversationThreadingInfo class. */
class ChatConversationThreadingInfo () extends js.Object {
  /** Gets or sets the Contact.Id for the remote participant. */
  var contactId: java.lang.String = js.native
  /** Gets or sets the ID of the ChatConversation . */
  var conversationId: java.lang.String = js.native
  /** Gets or sets a string where you can store your own custom threading info. */
  var custom: java.lang.String = js.native
  /** Gets or sets a value that indicates the type of threading info, such as participant, contact ID, conversation ID, and so on. */
  var kind: ChatConversationThreadingKind = js.native
  /** Gets the list of participants in the ChatConversation . */
  var participants: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
}

