package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateAuthenticated extends StObject {
  
  var accountSid: String
  
  var dateAuthenticated: js.Date
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var deploymentSid: String
  
  var enabled: Boolean
  
  var fleetSid: String
  
  var friendlyName: String
  
  var identity: String
  
  var sid: String
  
  var uniqueName: String
  
  var url: String
}
object DateAuthenticated {
  
  inline def apply(
    accountSid: String,
    dateAuthenticated: js.Date,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    deploymentSid: String,
    enabled: Boolean,
    fleetSid: String,
    friendlyName: String,
    identity: String,
    sid: String,
    uniqueName: String,
    url: String
  ): DateAuthenticated = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], dateAuthenticated = dateAuthenticated.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], deploymentSid = deploymentSid.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fleetSid = fleetSid.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateAuthenticated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateAuthenticated] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setDateAuthenticated(value: js.Date): Self = StObject.set(x, "dateAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDeploymentSid(value: String): Self = StObject.set(x, "deploymentSid", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFleetSid(value: String): Self = StObject.set(x, "fleetSid", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
