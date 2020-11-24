package typings.universalRouter.universalRouterSyncMod

import typings.pathToRegexp.mod.MatchFunction
import typings.pathToRegexp.mod.Match_
import typings.pathToRegexp.mod.Path
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route[R, C /* <: RouterContext */] extends js.Object {
  
  /**
    * Action method should return anything except `null` or `undefined` to be resolved by router
    * otherwise router will throw `Page not found` error if all matched routes returned nothing.
    */
  var action: js.UndefOr[
    js.Function2[/* context */ RouteContext[R, C], /* params */ RouteParams, RouteResultSync[R]]
  ] = js.native
  
  /**
    * An array of Route objects. Nested routes are perfect to be used in middleware routes.
    */
  var children: js.UndefOr[(Routes[R, C]) | Null] = js.native
  
  /**
    * The route path match function. Used for internal caching.
    */
  var `match`: js.UndefOr[MatchFunction[RouteParams]] = js.native
  
  /**
    * A unique string that can be used to generate the route URL.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The link to the parent route is automatically populated by the router. Useful for breadcrumbs.
    */
  var parent: js.UndefOr[(Route[R, C]) | Null] = js.native
  
  /**
    * A string, array of strings, or a regular expression. Defaults to an empty string.
    */
  var path: js.UndefOr[Path] = js.native
}
object Route {
  
  @scala.inline
  def apply[R, C /* <: RouterContext */](): Route[R, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route[R, C]]
  }
  
  @scala.inline
  implicit class RouteOps[Self <: Route[_, _], R, C /* <: RouterContext */] (val x: Self with (Route[R, C])) extends AnyVal {
    
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
    def setAction(value: (/* context */ RouteContext[R, C], /* params */ RouteParams) => RouteResultSync[R]): Self = this.set("action", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (Route[R, C])*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: Routes[R, C]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setMatch(value: /* path */ String => Match_[RouteParams]): Self = this.set("match", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: Route[R, C]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setPathVarargs(value: (String | RegExp)*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
