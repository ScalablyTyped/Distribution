package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxActionKind extends StObject
/** Defines the kind of action to be taken. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxActionKind")
@js.native
object EmailMailboxActionKind extends StObject {
  
  /** Change the flag state on the email message. */
  @js.native
  sealed trait changeMessageFlagState
    extends StObject
       with EmailMailboxActionKind
  
  /** Create an email message to be forwarded containing the content of this email message. */
  @js.native
  sealed trait createResponseForwardMessage
    extends StObject
       with EmailMailboxActionKind
  
  /** Create a reply email message addressed to the sender and all recipients in response to this email message. */
  @js.native
  sealed trait createResponseReplyAllMessage
    extends StObject
       with EmailMailboxActionKind
  
  /** Create a reply email message addressed to the sender in response to this email message. */
  @js.native
  sealed trait createResponseReplyMessage
    extends StObject
       with EmailMailboxActionKind
  
  /** Enable sync for this folder. */
  @js.native
  sealed trait markFolderForSyncEnabled
    extends StObject
       with EmailMailboxActionKind
  
  /** Mark the email message as seen. */
  @js.native
  sealed trait markMessageAsSeen
    extends StObject
       with EmailMailboxActionKind
  
  /** Mark the email message as having been read. */
  @js.native
  sealed trait markMessageRead
    extends StObject
       with EmailMailboxActionKind
  
  /** Move this folder. */
  @js.native
  sealed trait moveFolder
    extends StObject
       with EmailMailboxActionKind
  
  /** Move the email message. */
  @js.native
  sealed trait moveMessage
    extends StObject
       with EmailMailboxActionKind
  
  /** Save a draft of the email message. */
  @js.native
  sealed trait saveDraft
    extends StObject
       with EmailMailboxActionKind
  
  /** Send the email message. */
  @js.native
  sealed trait sendMessage
    extends StObject
       with EmailMailboxActionKind
}
