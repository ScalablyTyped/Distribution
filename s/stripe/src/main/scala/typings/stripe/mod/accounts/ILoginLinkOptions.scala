package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoginLinkOptions extends StObject {
  
  /**
    * Where to redirect the user after they log out of their dashboard.
    */
  var redirect_url: String = js.native
}
object ILoginLinkOptions {
  
  @scala.inline
  def apply(redirect_url: String): ILoginLinkOptions = {
    val __obj = js.Dynamic.literal(redirect_url = redirect_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginLinkOptions]
  }
  
  @scala.inline
  implicit class ILoginLinkOptionsMutableBuilder[Self <: ILoginLinkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirect_url(value: String): Self = StObject.set(x, "redirect_url", value.asInstanceOf[js.Any])
  }
}
