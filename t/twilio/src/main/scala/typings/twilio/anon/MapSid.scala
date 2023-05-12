package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapSid extends StObject {
  
  var accountSid: String
  
  var createdBy: String
  
  var data: Any
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var key: String
  
  var mapSid: String
  
  var revision: String
  
  var serviceSid: String
  
  var url: String
}
object MapSid {
  
  inline def apply(
    accountSid: String,
    createdBy: String,
    data: Any,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    key: String,
    mapSid: String,
    revision: String,
    serviceSid: String,
    url: String
  ): MapSid = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], mapSid = mapSid.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapSid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapSid] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMapSid(value: String): Self = StObject.set(x, "mapSid", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
