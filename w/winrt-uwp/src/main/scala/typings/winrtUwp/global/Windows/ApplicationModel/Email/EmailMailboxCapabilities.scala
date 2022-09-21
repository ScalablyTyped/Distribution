package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities associated with an email mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCapabilities")
@js.native
abstract class EmailMailboxCapabilities ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCapabilities {
  
  /** Gets a Boolean value indicating if folders can be created in the mailbox. */
  /* CompleteClass */
  var canCreateFolder: Boolean = js.native
  
  /** Gets a Boolean value indicating if folders can be deleted from the mailbox. */
  /* CompleteClass */
  var canDeleteFolder: Boolean = js.native
  
  /** Gets a Boolean value indicating if folders in the mailbox can be emptied. */
  /* CompleteClass */
  var canEmptyFolder: Boolean = js.native
  
  /* CompleteClass */
  var canForwardMeetings: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var canGetAndSetExternalAutoReplies: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var canGetAndSetInternalAutoReplies: Any = js.native
  
  /* unmapped type */
  /** Gets a Boolean value indicating if folders in the mailbox can be moved. */
  /* CompleteClass */
  var canMoveFolder: Boolean = js.native
  
  /* CompleteClass */
  var canProposeNewTimeForMeetings: Any = js.native
  
  /* unmapped type */
  /** Gets a Boolean value that indicates whether the email mailbox is capable of resolving recipients. */
  /* CompleteClass */
  var canResolveRecipients: Boolean = js.native
  
  /* CompleteClass */
  var canServerSearchFolders: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var canServerSearchMailbox: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var canSmartSend: Any = js.native
  
  /* unmapped type */
  /* CompleteClass */
  var canUpdateMeetingResponses: Any = js.native
  
  /* unmapped type */
  /** Gets a Boolean value that indicates whether the email mailbox is capable of validating certificates. */
  /* CompleteClass */
  var canValidateCertificates: Boolean = js.native
}
