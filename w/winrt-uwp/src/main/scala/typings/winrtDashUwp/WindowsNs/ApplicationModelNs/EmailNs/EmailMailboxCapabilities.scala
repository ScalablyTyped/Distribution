package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities associated with an email mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCapabilities")
@js.native
abstract class EmailMailboxCapabilities () extends js.Object {
  /** Gets a Boolean value indicating if folders can be created in the mailbox. */
  var canCreateFolder: Boolean = js.native
  /** Gets a Boolean value indicating if folders can be deleted from the mailbox. */
  var canDeleteFolder: Boolean = js.native
  /** Gets a Boolean value indicating if folders in the mailbox can be emptied. */
  var canEmptyFolder: Boolean = js.native
  var canForwardMeetings: js.Any = js.native
   /* unmapped type */ var canGetAndSetExternalAutoReplies: js.Any = js.native
   /* unmapped type */ var canGetAndSetInternalAutoReplies: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value indicating if folders in the mailbox can be moved. */
  var canMoveFolder: Boolean = js.native
  var canProposeNewTimeForMeetings: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value that indicates whether the email mailbox is capable of resolving recipients. */
  var canResolveRecipients: Boolean = js.native
  var canServerSearchFolders: js.Any = js.native
   /* unmapped type */ var canServerSearchMailbox: js.Any = js.native
   /* unmapped type */ var canSmartSend: js.Any = js.native
   /* unmapped type */ var canUpdateMeetingResponses: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value that indicates whether the email mailbox is capable of validating certificates. */
  var canValidateCertificates: Boolean = js.native
}

