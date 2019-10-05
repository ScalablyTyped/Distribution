package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxActionKind extends js.Object

/** Defines the kind of action to be taken. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxActionKind")
@js.native
object EmailMailboxActionKind extends js.Object {
  /** Change the flag state on the email message. */
  @js.native
  sealed trait changeMessageFlagState extends EmailMailboxActionKind
  
  /** Create an email message to be forwarded containing the content of this email message. */
  @js.native
  sealed trait createResponseForwardMessage extends EmailMailboxActionKind
  
  /** Create a reply email message addressed to the sender and all recipients in response to this email message. */
  @js.native
  sealed trait createResponseReplyAllMessage extends EmailMailboxActionKind
  
  /** Create a reply email message addressed to the sender in response to this email message. */
  @js.native
  sealed trait createResponseReplyMessage extends EmailMailboxActionKind
  
  /** Enable sync for this folder. */
  @js.native
  sealed trait markFolderForSyncEnabled extends EmailMailboxActionKind
  
  /** Mark the email message as seen. */
  @js.native
  sealed trait markMessageAsSeen extends EmailMailboxActionKind
  
  /** Mark the email message as having been read. */
  @js.native
  sealed trait markMessageRead extends EmailMailboxActionKind
  
  /** Move this folder. */
  @js.native
  sealed trait moveFolder extends EmailMailboxActionKind
  
  /** Move the email message. */
  @js.native
  sealed trait moveMessage extends EmailMailboxActionKind
  
  /** Save a draft of the email message. */
  @js.native
  sealed trait saveDraft extends EmailMailboxActionKind
  
  /** Send the email message. */
  @js.native
  sealed trait sendMessage extends EmailMailboxActionKind
  
  /* 2 */ val changeMessageFlagState: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.changeMessageFlagState with Double = js.native
  /* 8 */ val createResponseForwardMessage: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.createResponseForwardMessage with Double = js.native
  /* 7 */ val createResponseReplyAllMessage: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.createResponseReplyAllMessage with Double = js.native
  /* 6 */ val createResponseReplyMessage: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.createResponseReplyMessage with Double = js.native
  /* 10 */ val markFolderForSyncEnabled: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.markFolderForSyncEnabled with Double = js.native
  /* 0 */ val markMessageAsSeen: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.markMessageAsSeen with Double = js.native
  /* 1 */ val markMessageRead: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.markMessageRead with Double = js.native
  /* 9 */ val moveFolder: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.moveFolder with Double = js.native
  /* 3 */ val moveMessage: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.moveMessage with Double = js.native
  /* 4 */ val saveDraft: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.saveDraft with Double = js.native
  /* 5 */ val sendMessage: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.sendMessage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxActionKind with Double] = js.native
}

