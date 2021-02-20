package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities associated with an email mailbox. */
@js.native
trait EmailMailboxCapabilities extends StObject {
  
  /** Gets a Boolean value indicating if folders can be created in the mailbox. */
  var canCreateFolder: Boolean = js.native
  
  /** Gets a Boolean value indicating if folders can be deleted from the mailbox. */
  var canDeleteFolder: Boolean = js.native
  
  /** Gets a Boolean value indicating if folders in the mailbox can be emptied. */
  var canEmptyFolder: Boolean = js.native
  
  var canForwardMeetings: js.Any = js.native
  
  /* unmapped type */
  var canGetAndSetExternalAutoReplies: js.Any = js.native
  
  /* unmapped type */
  var canGetAndSetInternalAutoReplies: js.Any = js.native
  
  /* unmapped type */
  /** Gets a Boolean value indicating if folders in the mailbox can be moved. */
  var canMoveFolder: Boolean = js.native
  
  var canProposeNewTimeForMeetings: js.Any = js.native
  
  /* unmapped type */
  /** Gets a Boolean value that indicates whether the email mailbox is capable of resolving recipients. */
  var canResolveRecipients: Boolean = js.native
  
  var canServerSearchFolders: js.Any = js.native
  
  /* unmapped type */
  var canServerSearchMailbox: js.Any = js.native
  
  /* unmapped type */
  var canSmartSend: js.Any = js.native
  
  /* unmapped type */
  var canUpdateMeetingResponses: js.Any = js.native
  
  /* unmapped type */
  /** Gets a Boolean value that indicates whether the email mailbox is capable of validating certificates. */
  var canValidateCertificates: Boolean = js.native
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
  
  @scala.inline
  implicit class EmailMailboxCapabilitiesMutableBuilder[Self <: EmailMailboxCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanCreateFolder(value: Boolean): Self = StObject.set(x, "canCreateFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDeleteFolder(value: Boolean): Self = StObject.set(x, "canDeleteFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEmptyFolder(value: Boolean): Self = StObject.set(x, "canEmptyFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanForwardMeetings(value: js.Any): Self = StObject.set(x, "canForwardMeetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanGetAndSetExternalAutoReplies(value: js.Any): Self = StObject.set(x, "canGetAndSetExternalAutoReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanGetAndSetInternalAutoReplies(value: js.Any): Self = StObject.set(x, "canGetAndSetInternalAutoReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveFolder(value: Boolean): Self = StObject.set(x, "canMoveFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanProposeNewTimeForMeetings(value: js.Any): Self = StObject.set(x, "canProposeNewTimeForMeetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanResolveRecipients(value: Boolean): Self = StObject.set(x, "canResolveRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanServerSearchFolders(value: js.Any): Self = StObject.set(x, "canServerSearchFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanServerSearchMailbox(value: js.Any): Self = StObject.set(x, "canServerSearchMailbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSmartSend(value: js.Any): Self = StObject.set(x, "canSmartSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUpdateMeetingResponses(value: js.Any): Self = StObject.set(x, "canUpdateMeetingResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanValidateCertificates(value: Boolean): Self = StObject.set(x, "canValidateCertificates", value.asInstanceOf[js.Any])
  }
}
