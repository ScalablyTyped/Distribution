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
  
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  @scala.inline
  implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthUrl(value: String): Self = StObject.set(x, "authUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUrlUndefined: Self = StObject.set(x, "authUrl", js.undefined)
    
    @scala.inline
    def setOnAuth(value: /* user */ AuthUserData => Unit): Self = StObject.set(x, "onAuth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAuthUndefined: Self = StObject.set(x, "onAuth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
