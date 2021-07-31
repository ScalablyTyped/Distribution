package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the `NaturalLanguageUnderstandingV1` constructor. */
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
  
  @scala.inline
  def apply(version: String): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIam_access_token(value: String): Self = StObject.set(x, "iam_access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIam_access_tokenUndefined: Self = StObject.set(x, "iam_access_token", js.undefined)
    
    @scala.inline
    def setIam_apikey(value: String): Self = StObject.set(x, "iam_apikey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIam_apikeyUndefined: Self = StObject.set(x, "iam_apikey", js.undefined)
    
    @scala.inline
    def setIam_url(value: String): Self = StObject.set(x, "iam_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIam_urlUndefined: Self = StObject.set(x, "iam_url", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUse_unauthenticated(value: Boolean): Self = StObject.set(x, "use_unauthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_unauthenticatedUndefined: Self = StObject.set(x, "use_unauthenticated", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
