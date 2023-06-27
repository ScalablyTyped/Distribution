package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationForceNewSessionOptions extends StObject {
  
  /**
  		 * An optional message that will be displayed to the user when we ask to re-authenticate. Providing additional context
  		 * as to why you are asking a user to re-authenticate can help increase the odds that they will accept.
  		 */
  var detail: js.UndefOr[String] = js.undefined
}
object AuthenticationForceNewSessionOptions {
  
  inline def apply(): AuthenticationForceNewSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationForceNewSessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationForceNewSessionOptions] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
