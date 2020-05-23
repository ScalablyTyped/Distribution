package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for the automatic reply functionality of an email account. */
trait EmailMailboxAutoReplySettings extends js.Object {
  /** Represents the end time for the automated reply period. */
  var endTime: Date
  /** Gets the automatic reply message intended for an email message from an internal sender. */
  var internalReply: EmailMailboxAutoReply
  /** Gets a Boolean value indicating whether automatic replies are enabled. */
  var isEnabled: Boolean
  /** Gets the automatic reply message intended for an email message from a known external sender. */
  var knownExternalReply: EmailMailboxAutoReply
  /** Gets or sets whether the automated response email message is encoded as HTML or plain text. */
  var responseKind: EmailMailboxAutoReplyMessageResponseKind
  /** Represents the start time for the automated reply period. */
  var startTime: Date
  /** Gets the automatic reply message intended for an email message from an unknown external sender. */
  var unknownExternalReply: EmailMailboxAutoReply
}

object EmailMailboxAutoReplySettings {
  @scala.inline
  def apply(
    endTime: Date,
    internalReply: EmailMailboxAutoReply,
    isEnabled: Boolean,
    knownExternalReply: EmailMailboxAutoReply,
    responseKind: EmailMailboxAutoReplyMessageResponseKind,
    startTime: Date,
    unknownExternalReply: EmailMailboxAutoReply
  ): EmailMailboxAutoReplySettings = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], internalReply = internalReply.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], knownExternalReply = knownExternalReply.asInstanceOf[js.Any], responseKind = responseKind.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], unknownExternalReply = unknownExternalReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAutoReplySettings]
  }
}

