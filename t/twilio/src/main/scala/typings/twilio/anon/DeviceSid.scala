package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSid extends StObject {
  
  var accountSid: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var deviceSid: String
  
  var fleetSid: String
  
  var friendlyName: String
  
  var secret: String
  
  var sid: String
  
  var url: String
}
object DeviceSid {
  
  inline def apply(
    accountSid: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    deviceSid: String,
    fleetSid: String,
    friendlyName: String,
    secret: String,
    sid: String,
    url: String
  ): DeviceSid = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], deviceSid = deviceSid.asInstanceOf[js.Any], fleetSid = fleetSid.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceSid] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDeviceSid(value: String): Self = StObject.set(x, "deviceSid", value.asInstanceOf[js.Any])
    
    inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
