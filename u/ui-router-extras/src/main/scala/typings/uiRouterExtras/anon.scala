package typings.uiRouterExtras

import typings.uiRouterExtras.mod.ui.IRedirectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Redirect extends StObject {
    
    var redirect: IRedirectParams = js.native
    
    var to: IRedirectParams = js.native
  }
  object Redirect {
    
    @scala.inline
    def apply(redirect: IRedirectParams, to: IRedirectParams): Redirect = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirect(value: IRedirectParams): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: IRedirectParams): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
