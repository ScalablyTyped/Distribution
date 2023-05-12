package typings.twilio.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AclEnabled extends StObject {
  
  var accountSid: String
  
  var aclEnabled: Boolean
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var friendlyName: String
  
  var links: Record[String, String]
  
  var reachabilityWebhooksEnabled: Boolean
  
  var sid: String
  
  var url: String
  
  var webhookUrl: String
}
object AclEnabled {
  
  inline def apply(
    accountSid: String,
    aclEnabled: Boolean,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    friendlyName: String,
    links: Record[String, String],
    reachabilityWebhooksEnabled: Boolean,
    sid: String,
    url: String,
    webhookUrl: String
  ): AclEnabled = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], aclEnabled = aclEnabled.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], reachabilityWebhooksEnabled = reachabilityWebhooksEnabled.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webhookUrl = webhookUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AclEnabled] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setAclEnabled(value: Boolean): Self = StObject.set(x, "aclEnabled", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setReachabilityWebhooksEnabled(value: Boolean): Self = StObject.set(x, "reachabilityWebhooksEnabled", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
  }
}
