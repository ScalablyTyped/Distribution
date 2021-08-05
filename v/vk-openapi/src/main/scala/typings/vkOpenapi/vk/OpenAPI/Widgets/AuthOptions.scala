package typings.vkOpenapi.vk.OpenAPI.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthOptions extends StObject {
  
  var authUrl: js.UndefOr[String] = js.undefined
  
  var onAuth: js.UndefOr[js.Function1[/* user */ AuthUserData, Unit]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object AuthOptions {
  
  inline def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  extension [Self <: AuthOptions](x: Self) {
    
    inline def setAuthUrl(value: String): Self = StObject.set(x, "authUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthUrlUndefined: Self = StObject.set(x, "authUrl", js.undefined)
    
    inline def setOnAuth(value: /* user */ AuthUserData => Unit): Self = StObject.set(x, "onAuth", js.Any.fromFunction1(value))
    
    inline def setOnAuthUndefined: Self = StObject.set(x, "onAuth", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
