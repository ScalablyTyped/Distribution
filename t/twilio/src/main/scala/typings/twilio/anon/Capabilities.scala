package typings.twilio.anon

import typings.twilio.libInterfacesMod.PhoneNumberCapabilities
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderStatus
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderVerificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities extends StObject {
  
  var accountSid: String
  
  var addressSid: String
  
  var callDelay: Double
  
  var capabilities: PhoneNumberCapabilities
  
  var ccEmails: js.Array[String]
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var email: String
  
  var `extension`: String
  
  var failureReason: String
  
  var friendlyName: String
  
  var incomingPhoneNumberSid: String
  
  var phoneNumber: String
  
  var sid: String
  
  var signingDocumentSid: String
  
  var status: HostedNumberOrderStatus
  
  var uniqueName: String
  
  var url: String
  
  var verificationAttempts: Double
  
  var verificationCallSids: js.Array[String]
  
  var verificationCode: String
  
  var verificationDocumentSid: String
  
  var verificationType: HostedNumberOrderVerificationType
}
object Capabilities {
  
  inline def apply(
    accountSid: String,
    addressSid: String,
    callDelay: Double,
    capabilities: PhoneNumberCapabilities,
    ccEmails: js.Array[String],
    dateCreated: js.Date,
    dateUpdated: js.Date,
    email: String,
    `extension`: String,
    failureReason: String,
    friendlyName: String,
    incomingPhoneNumberSid: String,
    phoneNumber: String,
    sid: String,
    signingDocumentSid: String,
    status: HostedNumberOrderStatus,
    uniqueName: String,
    url: String,
    verificationAttempts: Double,
    verificationCallSids: js.Array[String],
    verificationCode: String,
    verificationDocumentSid: String,
    verificationType: HostedNumberOrderVerificationType
  ): Capabilities = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], addressSid = addressSid.asInstanceOf[js.Any], callDelay = callDelay.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], ccEmails = ccEmails.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], incomingPhoneNumberSid = incomingPhoneNumberSid.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], signingDocumentSid = signingDocumentSid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verificationAttempts = verificationAttempts.asInstanceOf[js.Any], verificationCallSids = verificationCallSids.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any], verificationDocumentSid = verificationDocumentSid.asInstanceOf[js.Any], verificationType = verificationType.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
    
    inline def setCallDelay(value: Double): Self = StObject.set(x, "callDelay", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCcEmails(value: js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
    
    inline def setCcEmailsVarargs(value: String*): Self = StObject.set(x, "ccEmails", js.Array(value*))
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSigningDocumentSid(value: String): Self = StObject.set(x, "signingDocumentSid", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: HostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerificationAttempts(value: Double): Self = StObject.set(x, "verificationAttempts", value.asInstanceOf[js.Any])
    
    inline def setVerificationCallSids(value: js.Array[String]): Self = StObject.set(x, "verificationCallSids", value.asInstanceOf[js.Any])
    
    inline def setVerificationCallSidsVarargs(value: String*): Self = StObject.set(x, "verificationCallSids", js.Array(value*))
    
    inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    
    inline def setVerificationDocumentSid(value: String): Self = StObject.set(x, "verificationDocumentSid", value.asInstanceOf[js.Any])
    
    inline def setVerificationType(value: HostedNumberOrderVerificationType): Self = StObject.set(x, "verificationType", value.asInstanceOf[js.Any])
  }
}
