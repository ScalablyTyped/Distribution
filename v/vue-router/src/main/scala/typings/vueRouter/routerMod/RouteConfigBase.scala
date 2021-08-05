package typings.vueRouter.routerMod

import typings.vue.vueMod.Vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteConfigBase extends StObject {
  
  var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var beforeEnter: js.UndefOr[NavigationGuard[Vue]] = js.undefined
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  
  var meta: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var path: String
  
  var pathToRegexpOptions: js.UndefOr[PathToRegexpOptions] = js.undefined
  
  var redirect: js.UndefOr[RedirectOption] = js.undefined
}
object RouteConfigBase {
  
  inline def apply(path: String): RouteConfigBase = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigBase]
  }
  
  extension [Self <: RouteConfigBase](x: Self) {
    
    inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
    
    inline def setBeforeEnter(value: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[Vue]) => js.Any): Self = StObject.set(x, "beforeEnter", js.Any.fromFunction3(value))
    
    inline def setBeforeEnterUndefined: Self = StObject.set(x, "beforeEnter", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setChildren(value: js.Array[RouteConfig]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: RouteConfig*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathToRegexpOptions(value: PathToRegexpOptions): Self = StObject.set(x, "pathToRegexpOptions", value.asInstanceOf[js.Any])
    
    inline def setPathToRegexpOptionsUndefined: Self = StObject.set(x, "pathToRegexpOptions", js.undefined)
    
    inline def setRedirect(value: RedirectOption): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectFunction1(value: /* to */ Route => RawLocation): Self = StObject.set(x, "redirect", js.Any.fromFunction1(value))
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
  }
}
