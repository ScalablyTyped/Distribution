package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities associated with an email mailbox. */
@js.native
trait EmailMailboxCapabilities extends js.Object {
  
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
  implicit class EmailMailboxCapabilitiesOps[Self <: EmailMailboxCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanCreateFolder(value: Boolean): Self = this.set("canCreateFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDeleteFolder(value: Boolean): Self = this.set("canDeleteFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEmptyFolder(value: Boolean): Self = this.set("canEmptyFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanForwardMeetings(value: js.Any): Self = this.set("canForwardMeetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanGetAndSetExternalAutoReplies(value: js.Any): Self = this.set("canGetAndSetExternalAutoReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanGetAndSetInternalAutoReplies(value: js.Any): Self = this.set("canGetAndSetInternalAutoReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveFolder(value: Boolean): Self = this.set("canMoveFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanProposeNewTimeForMeetings(value: js.Any): Self = this.set("canProposeNewTimeForMeetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanResolveRecipients(value: Boolean): Self = this.set("canResolveRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanServerSearchFolders(value: js.Any): Self = this.set("canServerSearchFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanServerSearchMailbox(value: js.Any): Self = this.set("canServerSearchMailbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSmartSend(value: js.Any): Self = this.set("canSmartSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUpdateMeetingResponses(value: js.Any): Self = this.set("canUpdateMeetingResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanValidateCertificates(value: Boolean): Self = this.set("canValidateCertificates", value.asInstanceOf[js.Any])
  }
}
