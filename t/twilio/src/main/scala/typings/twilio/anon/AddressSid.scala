package typings.twilio.anon

import typings.std.Record
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressSid extends StObject {
  
  var addressSid: String
  
  var ccEmails: js.Array[String]
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var email: String
  
  var links: Record[String, String]
  
  var sid: String
  
  var status: AuthorizationDocumentStatus
  
  var url: String
}
object AddressSid {
  
  inline def apply(
    addressSid: String,
    ccEmails: js.Array[String],
    dateCreated: js.Date,
    dateUpdated: js.Date,
    email: String,
    links: Record[String, String],
    sid: String,
    status: AuthorizationDocumentStatus,
    url: String
  ): AddressSid = {
    val __obj = js.Dynamic.literal(addressSid = addressSid.asInstanceOf[js.Any], ccEmails = ccEmails.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressSid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressSid] (val x: Self) extends AnyVal {
    
    inline def setAddressSid(value: String): Self = StObject.set(x, "addressSid", value.asInstanceOf[js.Any])
    
    inline def setCcEmails(value: js.Array[String]): Self = StObject.set(x, "ccEmails", value.asInstanceOf[js.Any])
    
    inline def setCcEmailsVarargs(value: String*): Self = StObject.set(x, "ccEmails", js.Array(value*))
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AuthorizationDocumentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
