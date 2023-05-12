package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateCreated extends StObject {
  
  var accountSid: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var deviceSid: String
  
  var fleetSid: String
  
  var friendlyName: String
  
  var sid: String
  
  var thumbprint: String
  
  var url: String
}
object DateCreated {
  
  inline def apply(
    accountSid: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    deviceSid: String,
    fleetSid: String,
    friendlyName: String,
    sid: String,
    thumbprint: String,
    url: String
  ): DateCreated = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], deviceSid = deviceSid.asInstanceOf[js.Any], fleetSid = fleetSid.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateCreated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateCreated] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
    
    inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
