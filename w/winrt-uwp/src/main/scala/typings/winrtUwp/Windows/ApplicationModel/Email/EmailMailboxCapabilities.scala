package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities associated with an email mailbox. */
trait EmailMailboxCapabilities extends js.Object {
  /** Gets a Boolean value indicating if folders can be created in the mailbox. */
  var canCreateFolder: Boolean
  /** Gets a Boolean value indicating if folders can be deleted from the mailbox. */
  var canDeleteFolder: Boolean
  /** Gets a Boolean value indicating if folders in the mailbox can be emptied. */
  var canEmptyFolder: Boolean
  var canForwardMeetings: js.Any
   /* unmapped type */ var canGetAndSetExternalAutoReplies: js.Any
   /* unmapped type */ var canGetAndSetInternalAutoReplies: js.Any
   /* unmapped type */ /** Gets a Boolean value indicating if folders in the mailbox can be moved. */
  var canMoveFolder: Boolean
  var canProposeNewTimeForMeetings: js.Any
   /* unmapped type */ /** Gets a Boolean value that indicates whether the email mailbox is capable of resolving recipients. */
  var canResolveRecipients: Boolean
  var canServerSearchFolders: js.Any
   /* unmapped type */ var canServerSearchMailbox: js.Any
   /* unmapped type */ var canSmartSend: js.Any
   /* unmapped type */ var canUpdateMeetingResponses: js.Any
   /* unmapped type */ /** Gets a Boolean value that indicates whether the email mailbox is capable of validating certificates. */
  var canValidateCertificates: Boolean
}

object EmailMailboxCapabilities {
  @scala.inline
  def apply(
    canCreateFolder: Boolean,
    canDeleteFolder: Boolean,
    canEmptyFolder: Boolean,
    canForwardMeetings: js.Any,
    canGetAndSetExternalAutoReplies: js.Any,
    canGetAndSetInternalAutoReplies: js.Any,
    canMoveFolder: Boolean,
    canProposeNewTimeForMeetings: js.Any,
    canResolveRecipients: Boolean,
    canServerSearchFolders: js.Any,
    canServerSearchMailbox: js.Any,
    canSmartSend: js.Any,
    canUpdateMeetingResponses: js.Any,
    canValidateCertificates: Boolean
  ): EmailMailboxCapabilities = {
    val __obj = js.Dynamic.literal(canCreateFolder = canCreateFolder.asInstanceOf[js.Any], canDeleteFolder = canDeleteFolder.asInstanceOf[js.Any], canEmptyFolder = canEmptyFolder.asInstanceOf[js.Any], canForwardMeetings = canForwardMeetings.asInstanceOf[js.Any], canGetAndSetExternalAutoReplies = canGetAndSetExternalAutoReplies.asInstanceOf[js.Any], canGetAndSetInternalAutoReplies = canGetAndSetInternalAutoReplies.asInstanceOf[js.Any], canMoveFolder = canMoveFolder.asInstanceOf[js.Any], canProposeNewTimeForMeetings = canProposeNewTimeForMeetings.asInstanceOf[js.Any], canResolveRecipients = canResolveRecipients.asInstanceOf[js.Any], canServerSearchFolders = canServerSearchFolders.asInstanceOf[js.Any], canServerSearchMailbox = canServerSearchMailbox.asInstanceOf[js.Any], canSmartSend = canSmartSend.asInstanceOf[js.Any], canUpdateMeetingResponses = canUpdateMeetingResponses.asInstanceOf[js.Any], canValidateCertificates = canValidateCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxCapabilities]
  }
}

