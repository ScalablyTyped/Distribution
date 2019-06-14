package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait changeMessageFlagState
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Create an email message to be forwarded containing the content of this email message. */
  @js.native
  sealed trait createResponseForwardMessage
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Create a reply email message addressed to the sender and all recipients in response to this email message. */
  @js.native
  sealed trait createResponseReplyAllMessage
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Create a reply email message addressed to the sender in response to this email message. */
  @js.native
  sealed trait createResponseReplyMessage
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Enable sync for this folder. */
  @js.native
  sealed trait markFolderForSyncEnabled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Mark the email message as seen. */
  @js.native
  sealed trait markMessageAsSeen
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Mark the email message as having been read. */
  @js.native
  sealed trait markMessageRead
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Move this folder. */
  @js.native
  sealed trait moveFolder
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Move the email message. */
  @js.native
  sealed trait moveMessage
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Save a draft of the email message. */
  @js.native
  sealed trait saveDraft
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /** Send the email message. */
  @js.native
  sealed trait sendMessage
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind
  
  /* 2 */ val changeMessageFlagState: changeMessageFlagState with scala.Double = js.native
  /* 8 */ val createResponseForwardMessage: createResponseForwardMessage with scala.Double = js.native
  /* 7 */ val createResponseReplyAllMessage: createResponseReplyAllMessage with scala.Double = js.native
  /* 6 */ val createResponseReplyMessage: createResponseReplyMessage with scala.Double = js.native
  /* 10 */ val markFolderForSyncEnabled: markFolderForSyncEnabled with scala.Double = js.native
  /* 0 */ val markMessageAsSeen: markMessageAsSeen with scala.Double = js.native
  /* 1 */ val markMessageRead: markMessageRead with scala.Double = js.native
  /* 9 */ val moveFolder: moveFolder with scala.Double = js.native
  /* 3 */ val moveMessage: moveMessage with scala.Double = js.native
  /* 4 */ val saveDraft: saveDraft with scala.Double = js.native
  /* 5 */ val sendMessage: sendMessage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxActionKind with scala.Double
  ] = js.native
}

