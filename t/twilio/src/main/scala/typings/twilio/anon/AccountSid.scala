package typings.twilio.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSid extends StObject {
  
  var accountSid: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var defaultDeploymentSid: String
  
  var friendlyName: String
  
  var links: Record[String, String]
  
  var sid: String
  
  var uniqueName: String
  
  var url: String
}
object AccountSid {
  
  inline def apply(
    accountSid: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    defaultDeploymentSid: String,
    friendlyName: String,
    links: Record[String, String],
    sid: String,
    uniqueName: String,
    url: String
  ): AccountSid = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], defaultDeploymentSid = defaultDeploymentSid.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountSid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSid] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDefaultDeploymentSid(value: String): Self = StObject.set(x, "defaultDeploymentSid", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
