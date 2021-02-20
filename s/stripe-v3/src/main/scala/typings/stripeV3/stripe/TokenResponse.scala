package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenResponse extends StObject {
  
  var error: js.UndefOr[Error] = js.native
  
  var token: js.UndefOr[Token] = js.native
}
object TokenResponse {
  
  @scala.inline
  def apply(): TokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenResponse]
  }
  
  @scala.inline
  implicit class TokenResponseMutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
