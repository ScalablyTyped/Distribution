package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKey extends StObject {
  
  var apiKey: js.UndefOr[String] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var lang: String
}
object ApiKey {
  
  @scala.inline
  def apply(lang: String): ApiKey = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
  
  @scala.inline
  implicit class ApiKeyMutableBuilder[Self <: ApiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
  }
}
