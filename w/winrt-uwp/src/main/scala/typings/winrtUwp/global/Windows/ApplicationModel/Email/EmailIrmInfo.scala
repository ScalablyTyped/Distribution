package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents email information rights management (IRM) info. */
@JSGlobal("Windows.ApplicationModel.Email.EmailIrmInfo")
@js.native
/** Initializes a new instance of the EmailIrmInfo class. */
class EmailIrmInfo ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmInfo {
  /**
    * Initializes a new instance of the EmailIrmInfo class using the specified IRM expiration time and template.
    * @param expiration The time when the information rights management (IRM) permissions expire.
    * @param irmTemplate The IRM template to apply to the message.
    */
  def this(expiration: Date, irmTemplate: typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmTemplate) = this()
  /** Gets or sets a Boolean value that indicates if an email message is allowed to be edited. */
  /* CompleteClass */
  override var canEdit: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user can copy the contents of an email message to the clipboard. */
  /* CompleteClass */
  override var canExtractData: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the email message is allowed to be forwarded. */
  /* CompleteClass */
  override var canForward: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user is allowed to change any of the email recipients when responding. */
  /* CompleteClass */
  override var canModifyRecipientsOnResponse: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user is allowed to print the contents of the email message or any attachments. */
  /* CompleteClass */
  override var canPrintData: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to remove information rights management (IRM) when responding. */
  /* CompleteClass */
  override var canRemoveIrmOnResponse: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply to the email message. */
  /* CompleteClass */
  override var canReply: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply all to the email message. */
  /* CompleteClass */
  override var canReplyAll: Boolean = js.native
  /** Gets or sets the expiration date for the information rights management (IRM) permissions. */
  /* CompleteClass */
  override var expirationDate: Date = js.native
  /** Gets or sets a Boolean value that indicates if the sender is the information rights management (IRM) originator. */
  /* CompleteClass */
  override var isIrmOriginator: Boolean = js.native
  /** Gets or sets a Boolean value that indicates if programmatic access to the message is allowed. */
  /* CompleteClass */
  override var isProgramaticAccessAllowed: Boolean = js.native
  /** Gets or sets the EmailIrmTemplate used to create the information rights management (IRM) info. */
  /* CompleteClass */
  override var template: typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmTemplate = js.native
}

