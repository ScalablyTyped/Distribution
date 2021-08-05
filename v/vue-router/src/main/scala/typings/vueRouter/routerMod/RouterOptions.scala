package typings.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterOptions extends StObject {
  
  var base: js.UndefOr[String] = js.undefined
  
  var fallback: js.UndefOr[Boolean] = js.undefined
  
  var linkActiveClass: js.UndefOr[String] = js.undefined
  
  var linkExactActiveClass: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[RouterMode] = js.undefined
  
  var parseQuery: js.UndefOr[js.Function1[/* query */ String, js.Object]] = js.undefined
  
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  
  var scrollBehavior: js.UndefOr[
    js.Function3[
      /* to */ Route, 
      /* from */ Route, 
      /* savedPosition */ Position | Unit, 
      js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]
    ]
  ] = js.undefined
  
  var stringifyQuery: js.UndefOr[js.Function1[/* query */ js.Object, String]] = js.undefined
}
object RouterOptions {
  
  inline def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  extension [Self <: RouterOptions](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setLinkActiveClass(value: String): Self = StObject.set(x, "linkActiveClass", value.asInstanceOf[js.Any])
    
    inline def setLinkActiveClassUndefined: Self = StObject.set(x, "linkActiveClass", js.undefined)
    
    inline def setLinkExactActiveClass(value: String): Self = StObject.set(x, "linkExactActiveClass", value.asInstanceOf[js.Any])
    
    inline def setLinkExactActiveClassUndefined: Self = StObject.set(x, "linkExactActiveClass", js.undefined)
    
    inline def setMode(value: RouterMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setParseQuery(value: /* query */ String => js.Object): Self = StObject.set(x, "parseQuery", js.Any.fromFunction1(value))
    
    inline def setParseQueryUndefined: Self = StObject.set(x, "parseQuery", js.undefined)
    
    inline def setRoutes(value: js.Array[RouteConfig]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    inline def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    inline def setScrollBehavior(
      value: (/* to */ Route, /* from */ Route, /* savedPosition */ Position | Unit) => js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]
    ): Self = StObject.set(x, "scrollBehavior", js.Any.fromFunction3(value))
    
    inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    inline def setStringifyQuery(value: /* query */ js.Object => String): Self = StObject.set(x, "stringifyQuery", js.Any.fromFunction1(value))
    
    inline def setStringifyQueryUndefined: Self = StObject.set(x, "stringifyQuery", js.undefined)
  }
}
