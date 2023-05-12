package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceChannel extends StObject {
  
  var accountSid: String
  
  var assistantSid: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var language: String
  
  var sid: String
  
  var sourceChannel: String
  
  var taggedText: String
  
  var taskSid: String
  
  var url: String
}
object SourceChannel {
  
  inline def apply(
    accountSid: String,
    assistantSid: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    language: String,
    sid: String,
    sourceChannel: String,
    taggedText: String,
    taskSid: String,
    url: String
  ): SourceChannel = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], assistantSid = assistantSid.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sourceChannel = sourceChannel.asInstanceOf[js.Any], taggedText = taggedText.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceChannel] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSourceChannel(value: String): Self = StObject.set(x, "sourceChannel", value.asInstanceOf[js.Any])
    
    inline def setTaggedText(value: String): Self = StObject.set(x, "taggedText", value.asInstanceOf[js.Any])
    
    inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
