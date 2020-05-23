package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities associated with an email mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCapabilities")
@js.native
abstract class EmailMailboxCapabilities ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCapabilities {
  /** Gets a Boolean value indicating if folders can be created in the mailbox. */
  /* CompleteClass */
  override var canCreateFolder: Boolean = js.native
  /** Gets a Boolean value indicating if folders can be deleted from the mailbox. */
  /* CompleteClass */
  override var canDeleteFolder: Boolean = js.native
  /** Gets a Boolean value indicating if folders in the mailbox can be emptied. */
  /* CompleteClass */
  override var canEmptyFolder: Boolean = js.native
  /* CompleteClass */
  override var canForwardMeetings: js.Any = js.native
   /* unmapped type */ /* CompleteClass */
  override var canGetAndSetExternalAutoReplies: js.Any = js.native
   /* unmapped type */ /* CompleteClass */
  override var canGetAndSetInternalAutoReplies: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value indicating if folders in the mailbox can be moved. */
  /* CompleteClass */
  override var canMoveFolder: Boolean = js.native
  /* CompleteClass */
  override var canProposeNewTimeForMeetings: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value that indicates whether the email mailbox is capable of resolving recipients. */
  /* CompleteClass */
  override var canResolveRecipients: Boolean = js.native
  /* CompleteClass */
  override var canServerSearchFolders: js.Any = js.native
   /* unmapped type */ /* CompleteClass */
  override var canServerSearchMailbox: js.Any = js.native
   /* unmapped type */ /* CompleteClass */
  override var canSmartSend: js.Any = js.native
   /* unmapped type */ /* CompleteClass */
  override var canUpdateMeetingResponses: js.Any = js.native
   /* unmapped type */ /** Gets a Boolean value that indicates whether the email mailbox is capable of validating certificates. */
  /* CompleteClass */
  override var canValidateCertificates: Boolean = js.native
}

