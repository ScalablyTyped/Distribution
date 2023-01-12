package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Route Record that defines a redirect. Cannot have `component` or `components`
  * as it is never rendered.
  */
trait RouteRecordRedirect
  extends StObject
     with RouteRecordBase
     with RouteRecordRaw {
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  var components: js.UndefOr[scala.Nothing] = js.undefined
  
  @JSName("props")
  var props_RouteRecordRedirect: js.UndefOr[scala.Nothing] = js.undefined
  
  @JSName("redirect")
  var redirect_RouteRecordRedirect: RouteRecordRedirectOption
}
object RouteRecordRedirect {
  
  inline def apply(path: String, redirect: RouteRecordRedirectOption): RouteRecordRedirect = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecordRedirect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteRecordRedirect] (val x: Self) extends AnyVal {
    
    inline def setRedirect(value: RouteRecordRedirectOption): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectFunction1(value: /* to */ RouteLocation => RouteLocationRaw): Self = StObject.set(x, "redirect", js.Any.fromFunction1(value))
  }
}
