package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  var accountSid: String
  
  var assistantSid: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var language: String
  
  var modelBuildSid: String
  
  var query: String
  
  var results: Any
  
  var sampleSid: String
  
  var sid: String
  
  var sourceChannel: String
  
  var status: String
  
  var url: String
}
object Language {
  
  inline def apply(
    accountSid: String,
    assistantSid: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    language: String,
    modelBuildSid: String,
    query: String,
    results: Any,
    sampleSid: String,
    sid: String,
    sourceChannel: String,
    status: String,
    url: String
  ): Language = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], assistantSid = assistantSid.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], modelBuildSid = modelBuildSid.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], sampleSid = sampleSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sourceChannel = sourceChannel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setModelBuildSid(value: String): Self = StObject.set(x, "modelBuildSid", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResults(value: Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setSampleSid(value: String): Self = StObject.set(x, "sampleSid", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSourceChannel(value: String): Self = StObject.set(x, "sourceChannel", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
