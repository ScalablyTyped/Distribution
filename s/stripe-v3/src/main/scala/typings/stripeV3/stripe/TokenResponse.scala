package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenResponse extends StObject {
  
  var error: js.UndefOr[Error] = js.undefined
  
  var token: js.UndefOr[Token] = js.undefined
}
object TokenResponse {
  
  inline def apply(): TokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
