package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the `AssistantV2` constructor. */
trait Options extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var iam_access_token: js.UndefOr[String] = js.undefined
  
  var iam_apikey: js.UndefOr[String] = js.undefined
  
  var iam_url: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var use_unauthenticated: js.UndefOr[Boolean] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var version: String
}
object Options {
  
  inline def apply(version: String): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIam_access_token(value: String): Self = StObject.set(x, "iam_access_token", value.asInstanceOf[js.Any])
    
    inline def setIam_access_tokenUndefined: Self = StObject.set(x, "iam_access_token", js.undefined)
    
    inline def setIam_apikey(value: String): Self = StObject.set(x, "iam_apikey", value.asInstanceOf[js.Any])
    
    inline def setIam_apikeyUndefined: Self = StObject.set(x, "iam_apikey", js.undefined)
    
    inline def setIam_url(value: String): Self = StObject.set(x, "iam_url", value.asInstanceOf[js.Any])
    
    inline def setIam_urlUndefined: Self = StObject.set(x, "iam_url", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUse_unauthenticated(value: Boolean): Self = StObject.set(x, "use_unauthenticated", value.asInstanceOf[js.Any])
    
    inline def setUse_unauthenticatedUndefined: Self = StObject.set(x, "use_unauthenticated", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
