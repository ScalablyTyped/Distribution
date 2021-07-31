package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents email information rights management (IRM) info. */
@JSGlobal("Windows.ApplicationModel.Email.EmailIrmInfo")
@js.native
/** Initializes a new instance of the EmailIrmInfo class. */
class EmailIrmInfo ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmInfo {
  /**
    * Initializes a new instance of the EmailIrmInfo class using the specified IRM expiration time and template.
    * @param expiration The time when the information rights management (IRM) permissions expire.
    * @param irmTemplate The IRM template to apply to the message.
    */
  def this(expiration: Date, irmTemplate: typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmTemplate) = this()
  
  /** Gets or sets a Boolean value that indicates if an email message is allowed to be edited. */
  /* CompleteClass */
  var canEdit: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the user can copy the contents of an email message to the clipboard. */
  /* CompleteClass */
  var canExtractData: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the email message is allowed to be forwarded. */
  /* CompleteClass */
  var canForward: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the user is allowed to change any of the email recipients when responding. */
  /* CompleteClass */
  var canModifyRecipientsOnResponse: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the user is allowed to print the contents of the email message or any attachments. */
  /* CompleteClass */
  var canPrintData: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to remove information rights management (IRM) when responding. */
  /* CompleteClass */
  var canRemoveIrmOnResponse: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply to the email message. */
  /* CompleteClass */
  var canReply: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply all to the email message. */
  /* CompleteClass */
  var canReplyAll: Boolean = js.native
  
  /** Gets or sets the expiration date for the information rights management (IRM) permissions. */
  /* CompleteClass */
  var expirationDate: Date = js.native
  
  /** Gets or sets a Boolean value that indicates if the sender is the information rights management (IRM) originator. */
  /* CompleteClass */
  var isIrmOriginator: Boolean = js.native
  
  /** Gets or sets a Boolean value that indicates if programmatic access to the message is allowed. */
  /* CompleteClass */
  var isProgramaticAccessAllowed: Boolean = js.native
  
  /** Gets or sets the EmailIrmTemplate used to create the information rights management (IRM) info. */
  /* CompleteClass */
  var template: typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmTemplate = js.native
}
