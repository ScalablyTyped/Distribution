package typings.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterOptions extends js.Object {
  
  var base: js.UndefOr[String] = js.native
  
  var fallback: js.UndefOr[Boolean] = js.native
  
  var linkActiveClass: js.UndefOr[String] = js.native
  
  var linkExactActiveClass: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[RouterMode] = js.native
  
  var parseQuery: js.UndefOr[js.Function1[/* query */ String, js.Object]] = js.native
  
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.native
  
  var scrollBehavior: js.UndefOr[
    js.Function3[
      /* to */ Route, 
      /* from */ Route, 
      /* savedPosition */ Position | Unit, 
      js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]
    ]
  ] = js.native
  
  var stringifyQuery: js.UndefOr[js.Function1[/* query */ js.Object, String]] = js.native
}
object RouterOptions {
  
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setFallback(value: Boolean): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setLinkActiveClass(value: String): Self = this.set("linkActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkActiveClass: Self = this.set("linkActiveClass", js.undefined)
    
    @scala.inline
    def setLinkExactActiveClass(value: String): Self = this.set("linkExactActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkExactActiveClass: Self = this.set("linkExactActiveClass", js.undefined)
    
    @scala.inline
    def setMode(value: RouterMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setParseQuery(value: /* query */ String => js.Object): Self = this.set("parseQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseQuery: Self = this.set("parseQuery", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: RouteConfig*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[RouteConfig]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    
    @scala.inline
    def setScrollBehavior(
      value: (/* to */ Route, /* from */ Route, /* savedPosition */ Position | Unit) => js.UndefOr[PositionResult | js.Promise[PositionResult] | Null]
    ): Self = this.set("scrollBehavior", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteScrollBehavior: Self = this.set("scrollBehavior", js.undefined)
    
    @scala.inline
    def setStringifyQuery(value: /* query */ js.Object => String): Self = this.set("stringifyQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStringifyQuery: Self = this.set("stringifyQuery", js.undefined)
  }
}
