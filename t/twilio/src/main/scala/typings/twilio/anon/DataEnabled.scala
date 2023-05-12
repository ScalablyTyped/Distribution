package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEnabled extends StObject {
  
  var accountSid: String
  
  var dataEnabled: Boolean
  
  var dataLimit: Double
  
  var dataMetering: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var friendlyName: String
  
  var internationalRoaming: js.Array[String]
  
  var messagingEnabled: Boolean
  
  var nationalRoamingEnabled: Boolean
  
  var sid: String
  
  var uniqueName: String
  
  var url: String
  
  var voiceEnabled: Boolean
}
object DataEnabled {
  
  inline def apply(
    accountSid: String,
    dataEnabled: Boolean,
    dataLimit: Double,
    dataMetering: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    friendlyName: String,
    internationalRoaming: js.Array[String],
    messagingEnabled: Boolean,
    nationalRoamingEnabled: Boolean,
    sid: String,
    uniqueName: String,
    url: String,
    voiceEnabled: Boolean
  ): DataEnabled = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], dataEnabled = dataEnabled.asInstanceOf[js.Any], dataLimit = dataLimit.asInstanceOf[js.Any], dataMetering = dataMetering.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], internationalRoaming = internationalRoaming.asInstanceOf[js.Any], messagingEnabled = messagingEnabled.asInstanceOf[js.Any], nationalRoamingEnabled = nationalRoamingEnabled.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voiceEnabled = voiceEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataEnabled] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setDataEnabled(value: Boolean): Self = StObject.set(x, "dataEnabled", value.asInstanceOf[js.Any])
    
    inline def setDataLimit(value: Double): Self = StObject.set(x, "dataLimit", value.asInstanceOf[js.Any])
    
    inline def setDataMetering(value: String): Self = StObject.set(x, "dataMetering", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setInternationalRoaming(value: js.Array[String]): Self = StObject.set(x, "internationalRoaming", value.asInstanceOf[js.Any])
    
    inline def setInternationalRoamingVarargs(value: String*): Self = StObject.set(x, "internationalRoaming", js.Array(value*))
    
    inline def setMessagingEnabled(value: Boolean): Self = StObject.set(x, "messagingEnabled", value.asInstanceOf[js.Any])
    
    inline def setNationalRoamingEnabled(value: Boolean): Self = StObject.set(x, "nationalRoamingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVoiceEnabled(value: Boolean): Self = StObject.set(x, "voiceEnabled", value.asInstanceOf[js.Any])
  }
}
