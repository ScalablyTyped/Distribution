package typings.uiRouterExtras

import typings.uiRouterExtras.angularMod.ui.IRedirectParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Redirect extends StObject {
    
    var redirect: IRedirectParams
    
    var to: IRedirectParams
  }
  object Redirect {
    
    inline def apply(redirect: IRedirectParams, to: IRedirectParams): Redirect = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redirect]
    }
    
    extension [Self <: Redirect](x: Self) {
      
      inline def setRedirect(value: IRedirectParams): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setTo(value: IRedirectParams): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
