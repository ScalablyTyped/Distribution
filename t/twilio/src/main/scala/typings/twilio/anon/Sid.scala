package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sid extends StObject {
  
  var accountSid: String
  
  var assistantSid: String
  
  var data: Any
  
  var sid: String
  
  var url: String
}
object Sid {
  
  inline def apply(accountSid: String, assistantSid: String, data: Any, sid: String, url: String): Sid = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], assistantSid = assistantSid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sid] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
