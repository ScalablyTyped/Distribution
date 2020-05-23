package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents email information rights management (IRM) info. */
trait EmailIrmInfo extends js.Object {
  /** Gets or sets a Boolean value that indicates if an email message is allowed to be edited. */
  var canEdit: Boolean
  /** Gets or sets a Boolean value that indicates if the user can copy the contents of an email message to the clipboard. */
  var canExtractData: Boolean
  /** Gets or sets a Boolean value that indicates if the email message is allowed to be forwarded. */
  var canForward: Boolean
  /** Gets or sets a Boolean value that indicates if the user is allowed to change any of the email recipients when responding. */
  var canModifyRecipientsOnResponse: Boolean
  /** Gets or sets a Boolean value that indicates if the user is allowed to print the contents of the email message or any attachments. */
  var canPrintData: Boolean
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to remove information rights management (IRM) when responding. */
  var canRemoveIrmOnResponse: Boolean
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply to the email message. */
  var canReply: Boolean
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply all to the email message. */
  var canReplyAll: Boolean
  /** Gets or sets the expiration date for the information rights management (IRM) permissions. */
  var expirationDate: Date
  /** Gets or sets a Boolean value that indicates if the sender is the information rights management (IRM) originator. */
  var isIrmOriginator: Boolean
  /** Gets or sets a Boolean value that indicates if programmatic access to the message is allowed. */
  var isProgramaticAccessAllowed: Boolean
  /** Gets or sets the EmailIrmTemplate used to create the information rights management (IRM) info. */
  var template: EmailIrmTemplate
}

object EmailIrmInfo {
  @scala.inline
  def apply(
    canEdit: Boolean,
    canExtractData: Boolean,
    canForward: Boolean,
    canModifyRecipientsOnResponse: Boolean,
    canPrintData: Boolean,
    canRemoveIrmOnResponse: Boolean,
    canReply: Boolean,
    canReplyAll: Boolean,
    expirationDate: Date,
    isIrmOriginator: Boolean,
    isProgramaticAccessAllowed: Boolean,
    template: EmailIrmTemplate
  ): EmailIrmInfo = {
    val __obj = js.Dynamic.literal(canEdit = canEdit.asInstanceOf[js.Any], canExtractData = canExtractData.asInstanceOf[js.Any], canForward = canForward.asInstanceOf[js.Any], canModifyRecipientsOnResponse = canModifyRecipientsOnResponse.asInstanceOf[js.Any], canPrintData = canPrintData.asInstanceOf[js.Any], canRemoveIrmOnResponse = canRemoveIrmOnResponse.asInstanceOf[js.Any], canReply = canReply.asInstanceOf[js.Any], canReplyAll = canReplyAll.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], isIrmOriginator = isIrmOriginator.asInstanceOf[js.Any], isProgramaticAccessAllowed = isProgramaticAccessAllowed.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIrmInfo]
  }
}

