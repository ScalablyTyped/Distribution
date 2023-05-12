package typings.twilio.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackEvents extends StObject {
  
  var accountSid: String
  
  var callbackEvents: String
  
  var callbackUrl: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var friendlyName: String
  
  var latestModelBuildSid: String
  
  var links: Record[String, String]
  
  var logQueries: Boolean
  
  var sid: String
  
  var uniqueName: String
  
  var url: String
}
object CallbackEvents {
  
  inline def apply(
    accountSid: String,
    callbackEvents: String,
    callbackUrl: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    friendlyName: String,
    latestModelBuildSid: String,
    links: Record[String, String],
    logQueries: Boolean,
    sid: String,
    uniqueName: String,
    url: String
  ): CallbackEvents = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], callbackEvents = callbackEvents.asInstanceOf[js.Any], callbackUrl = callbackUrl.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], latestModelBuildSid = latestModelBuildSid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], logQueries = logQueries.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallbackEvents] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setCallbackEvents(value: String): Self = StObject.set(x, "callbackEvents", value.asInstanceOf[js.Any])
    
    inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setLatestModelBuildSid(value: String): Self = StObject.set(x, "latestModelBuildSid", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLogQueries(value: Boolean): Self = StObject.set(x, "logQueries", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
