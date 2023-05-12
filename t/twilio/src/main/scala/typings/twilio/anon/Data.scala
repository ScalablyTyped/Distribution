package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var accountSid: String
  
  var createdBy: String
  
  var data: Any
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var index: Double
  
  var listSid: String
  
  var revision: String
  
  var serviceSid: String
  
  var url: String
}
object Data {
  
  inline def apply(
    accountSid: String,
    createdBy: String,
    data: Any,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    index: Double,
    listSid: String,
    revision: String,
    serviceSid: String,
    url: String
  ): Data = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listSid = listSid.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setListSid(value: String): Self = StObject.set(x, "listSid", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setServiceSid(value: String): Self = StObject.set(x, "serviceSid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
