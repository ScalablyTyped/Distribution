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
  
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  @scala.inline
  implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    @scala.inline
    def setLinkActiveClass(value: String): Self = StObject.set(x, "linkActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkActiveClassUndefined: Self = StObject.set(x, "linkActiveClass", js.undefined)
    
    @scala.inline
    def setLinkExactActiveClass(value: String): Self = StObject.set(x, "linkExactActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkExactActiveClassUndefined: Self = StObject.set(x, "linkExactActiveClass", js.undefined)
    
    @scala.inline
    def setMode(value: RouterMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setParseQuery(value: /* query */ String => js.Object): Self = StObject.set(x, "parseQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseQueryUndefined: Self = StObject.set(x, "parseQuery", js.undefined)
    
    @scala.inline
    def setRoutes(value: js.Array[RouteConfig]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setScrollBehavior(
      value: (/* to */ Route, /* from */ Route, /* savedPosition */ Position | Unit) => js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]
    ): Self = StObject.set(x, "scrollBehavior", js.Any.fromFunction3(value))
    
    @scala.inline
    def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    @scala.inline
    def setStringifyQuery(value: /* query */ js.Object => String): Self = StObject.set(x, "stringifyQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringifyQueryUndefined: Self = StObject.set(x, "stringifyQuery", js.undefined)
  }
}
