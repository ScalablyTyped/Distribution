package typings.twilio.anon

import typings.twilio.libRestPreviewUnderstandAssistantModelBuildMod.ModelBuildStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDuration extends StObject {
  
  var accountSid: String
  
  var assistantSid: String
  
  var buildDuration: Double
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var errorCode: Double
  
  var sid: String
  
  var status: ModelBuildStatus
  
  var uniqueName: String
  
  var url: String
}
object BuildDuration {
  
  inline def apply(
    accountSid: String,
    assistantSid: String,
    buildDuration: Double,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    errorCode: Double,
    sid: String,
    status: ModelBuildStatus,
    uniqueName: String,
    url: String
  ): BuildDuration = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], assistantSid = assistantSid.asInstanceOf[js.Any], buildDuration = buildDuration.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildDuration] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    
    inline def setBuildDuration(value: Double): Self = StObject.set(x, "buildDuration", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ModelBuildStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
