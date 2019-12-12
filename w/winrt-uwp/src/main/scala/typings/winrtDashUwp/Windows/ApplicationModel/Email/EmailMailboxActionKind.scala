package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.changeMessageFlagState
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.createResponseForwardMessage
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.createResponseReplyAllMessage
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.createResponseReplyMessage
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.markFolderForSyncEnabled
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.markMessageAsSeen
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.markMessageRead
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.moveFolder
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.moveMessage
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.saveDraft
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind.sendMessage
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxActionKind with Double] = js.native
  /* 2 */ @js.native
  object changeMessageFlagState extends TopLevel[changeMessageFlagState with Double]
  
  /* 8 */ @js.native
  object createResponseForwardMessage extends TopLevel[createResponseForwardMessage with Double]
  
  /* 7 */ @js.native
  object createResponseReplyAllMessage extends TopLevel[createResponseReplyAllMessage with Double]
  
  /* 6 */ @js.native
  object createResponseReplyMessage extends TopLevel[createResponseReplyMessage with Double]
  
  /* 10 */ @js.native
  object markFolderForSyncEnabled extends TopLevel[markFolderForSyncEnabled with Double]
  
  /* 0 */ @js.native
  object markMessageAsSeen extends TopLevel[markMessageAsSeen with Double]
  
  /* 1 */ @js.native
  object markMessageRead extends TopLevel[markMessageRead with Double]
  
  /* 9 */ @js.native
  object moveFolder extends TopLevel[moveFolder with Double]
  
  /* 3 */ @js.native
  object moveMessage extends TopLevel[moveMessage with Double]
  
  /* 4 */ @js.native
  object saveDraft extends TopLevel[saveDraft with Double]
  
  /* 5 */ @js.native
  object sendMessage extends TopLevel[sendMessage with Double]
  
}

