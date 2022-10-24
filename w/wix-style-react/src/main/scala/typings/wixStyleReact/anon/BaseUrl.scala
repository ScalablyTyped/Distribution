package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUrl extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var token: Any
}
object BaseUrl {
  
  inline def apply(token: Any): BaseUrl = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
  
  extension [Self <: BaseUrl](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
