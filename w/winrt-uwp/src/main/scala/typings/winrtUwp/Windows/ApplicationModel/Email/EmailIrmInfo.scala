package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents email information rights management (IRM) info. */
trait EmailIrmInfo extends StObject {
  
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
  var expirationDate: js.Date
  
  /** Gets or sets a Boolean value that indicates if the sender is the information rights management (IRM) originator. */
  var isIrmOriginator: Boolean
  
  /** Gets or sets a Boolean value that indicates if programmatic access to the message is allowed. */
  var isProgramaticAccessAllowed: Boolean
  
  /** Gets or sets the EmailIrmTemplate used to create the information rights management (IRM) info. */
  var template: EmailIrmTemplate
}
object EmailIrmInfo {
  
  inline def apply(
    canEdit: Boolean,
    canExtractData: Boolean,
    canForward: Boolean,
    canModifyRecipientsOnResponse: Boolean,
    canPrintData: Boolean,
    canRemoveIrmOnResponse: Boolean,
    canReply: Boolean,
    canReplyAll: Boolean,
    expirationDate: js.Date,
    isIrmOriginator: Boolean,
    isProgramaticAccessAllowed: Boolean,
    template: EmailIrmTemplate
  ): EmailIrmInfo = {
    val __obj = js.Dynamic.literal(canEdit = canEdit.asInstanceOf[js.Any], canExtractData = canExtractData.asInstanceOf[js.Any], canForward = canForward.asInstanceOf[js.Any], canModifyRecipientsOnResponse = canModifyRecipientsOnResponse.asInstanceOf[js.Any], canPrintData = canPrintData.asInstanceOf[js.Any], canRemoveIrmOnResponse = canRemoveIrmOnResponse.asInstanceOf[js.Any], canReply = canReply.asInstanceOf[js.Any], canReplyAll = canReplyAll.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], isIrmOriginator = isIrmOriginator.asInstanceOf[js.Any], isProgramaticAccessAllowed = isProgramaticAccessAllowed.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIrmInfo]
  }
  
  extension [Self <: EmailIrmInfo](x: Self) {
    
    inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    inline def setCanExtractData(value: Boolean): Self = StObject.set(x, "canExtractData", value.asInstanceOf[js.Any])
    
    inline def setCanForward(value: Boolean): Self = StObject.set(x, "canForward", value.asInstanceOf[js.Any])
    
    inline def setCanModifyRecipientsOnResponse(value: Boolean): Self = StObject.set(x, "canModifyRecipientsOnResponse", value.asInstanceOf[js.Any])
    
    inline def setCanPrintData(value: Boolean): Self = StObject.set(x, "canPrintData", value.asInstanceOf[js.Any])
    
    inline def setCanRemoveIrmOnResponse(value: Boolean): Self = StObject.set(x, "canRemoveIrmOnResponse", value.asInstanceOf[js.Any])
    
    inline def setCanReply(value: Boolean): Self = StObject.set(x, "canReply", value.asInstanceOf[js.Any])
    
    inline def setCanReplyAll(value: Boolean): Self = StObject.set(x, "canReplyAll", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setIsIrmOriginator(value: Boolean): Self = StObject.set(x, "isIrmOriginator", value.asInstanceOf[js.Any])
    
    inline def setIsProgramaticAccessAllowed(value: Boolean): Self = StObject.set(x, "isProgramaticAccessAllowed", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: EmailIrmTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
