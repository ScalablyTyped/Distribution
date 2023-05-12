package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsCount extends StObject {
  
  var accountSid: String
  
  var assistantSid: String
  
  var fieldsCount: Double
  
  var samplesCount: Double
  
  var taskSid: String
  
  var url: String
}
object FieldsCount {
  
  inline def apply(
    accountSid: String,
    assistantSid: String,
    fieldsCount: Double,
    samplesCount: Double,
    taskSid: String,
    url: String
  ): FieldsCount = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], assistantSid = assistantSid.asInstanceOf[js.Any], fieldsCount = fieldsCount.asInstanceOf[js.Any], samplesCount = samplesCount.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldsCount] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    
    inline def setFieldsCount(value: Double): Self = StObject.set(x, "fieldsCount", value.asInstanceOf[js.Any])
    
    inline def setSamplesCount(value: Double): Self = StObject.set(x, "samplesCount", value.asInstanceOf[js.Any])
    
    inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
