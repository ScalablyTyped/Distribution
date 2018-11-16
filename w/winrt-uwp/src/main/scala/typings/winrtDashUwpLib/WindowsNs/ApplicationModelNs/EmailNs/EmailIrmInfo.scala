package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents email information rights management (IRM) info. */
@JSGlobal("Windows.ApplicationModel.Email.EmailIrmInfo")
@js.native
class EmailIrmInfo () extends js.Object {
  /**
                   * Initializes a new instance of the EmailIrmInfo class using the specified IRM expiration time and template.
                   * @param expiration The time when the information rights management (IRM) permissions expire.
                   * @param irmTemplate The IRM template to apply to the message.
                   */
  def this(expiration: stdLib.Date, irmTemplate: EmailIrmTemplate) = this()
  /** Gets or sets a Boolean value that indicates if an email message is allowed to be edited. */
  var canEdit: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user can copy the contents of an email message to the clipboard. */
  var canExtractData: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the email message is allowed to be forwarded. */
  var canForward: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user is allowed to change any of the email recipients when responding. */
  var canModifyRecipientsOnResponse: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the user is allowed to print the contents of the email message or any attachments. */
  var canPrintData: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to remove information rights management (IRM) when responding. */
  var canRemoveIrmOnResponse: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply to the email message. */
  var canReply: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates if the recipient is allowed to reply all to the email message. */
  var canReplyAll: scala.Boolean = js.native
  /** Gets or sets the expiration date for the information rights management (IRM) permissions. */
  var expirationDate: stdLib.Date = js.native
  /** Gets or sets a Boolean value that indicates if the sender is the information rights management (IRM) originator. */
  var isIrmOriginator: scala.Boolean = js.native
  /** Gets or sets a Boolean value that indicates if programmatic access to the message is allowed. */
  var isProgramaticAccessAllowed: scala.Boolean = js.native
  /** Gets or sets the EmailIrmTemplate used to create the information rights management (IRM) info. */
  var template: EmailIrmTemplate = js.native
}

