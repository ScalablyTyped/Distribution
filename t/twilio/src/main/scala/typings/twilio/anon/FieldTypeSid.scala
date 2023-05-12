package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTypeSid extends StObject {
  
  var accountSid: String
  
  var assistantSid: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var fieldTypeSid: String
  
  var language: String
  
  var sid: String
  
  var synonymOf: String
  
  var url: String
  
  var value: String
}
object FieldTypeSid {
  
  inline def apply(
    accountSid: String,
    assistantSid: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    fieldTypeSid: String,
    language: String,
    sid: String,
    synonymOf: String,
    url: String,
    value: String
  ): FieldTypeSid = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], assistantSid = assistantSid.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], fieldTypeSid = fieldTypeSid.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], synonymOf = synonymOf.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTypeSid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldTypeSid] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setFieldTypeSid(value: String): Self = StObject.set(x, "fieldTypeSid", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSynonymOf(value: String): Self = StObject.set(x, "synonymOf", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
