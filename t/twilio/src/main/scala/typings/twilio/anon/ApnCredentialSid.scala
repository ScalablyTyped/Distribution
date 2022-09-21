package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApnCredentialSid extends StObject {
  
  var apnCredentialSid: js.UndefOr[String] = js.undefined
  
  var fcmCredentialSid: js.UndefOr[String] = js.undefined
  
  var includeDate: js.UndefOr[Boolean] = js.undefined
}
object ApnCredentialSid {
  
  inline def apply(): ApnCredentialSid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnCredentialSid]
  }
  
  extension [Self <: ApnCredentialSid](x: Self) {
    
    inline def setApnCredentialSid(value: String): Self = StObject.set(x, "apnCredentialSid", value.asInstanceOf[js.Any])
    
    inline def setApnCredentialSidUndefined: Self = StObject.set(x, "apnCredentialSid", js.undefined)
    
    inline def setFcmCredentialSid(value: String): Self = StObject.set(x, "fcmCredentialSid", value.asInstanceOf[js.Any])
    
    inline def setFcmCredentialSidUndefined: Self = StObject.set(x, "fcmCredentialSid", js.undefined)
    
    inline def setIncludeDate(value: Boolean): Self = StObject.set(x, "includeDate", value.asInstanceOf[js.Any])
    
    inline def setIncludeDateUndefined: Self = StObject.set(x, "includeDate", js.undefined)
  }
}
