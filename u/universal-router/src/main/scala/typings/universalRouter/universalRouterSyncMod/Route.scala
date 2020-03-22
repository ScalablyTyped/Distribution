package typings.universalRouter.universalRouterSyncMod

import typings.pathToRegexp.mod.MatchFunction
import typings.pathToRegexp.mod.Match_
import typings.pathToRegexp.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[R, C /* <: RouterContext */] extends js.Object {
  /**
    * Action method should return anything except `null` or `undefined` to be resolved by router
    * otherwise router will throw `Page not found` error if all matched routes returned nothing.
    */
  var action: js.UndefOr[
    js.Function2[/* context */ RouteContext[R, C], /* params */ RouteParams, RouteResultSync[R]]
  ] = js.undefined
  /**
    * An array of Route objects. Nested routes are perfect to be used in middleware routes.
    */
  var children: js.UndefOr[(Routes[R, C]) | Null] = js.undefined
  /**
    * The route path match function. Used for internal caching.
    */
  var `match`: js.UndefOr[MatchFunction[RouteParams]] = js.undefined
  /**
    * A unique string that can be used to generate the route URL.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The link to the parent route is automatically populated by the router. Useful for breadcrumbs.
    */
  var parent: js.UndefOr[(Route[R, C]) | Null] = js.undefined
  /**
    * A string, array of strings, or a regular expression. Defaults to an empty string.
    */
  var path: js.UndefOr[Path] = js.undefined
}

object Route {
  @scala.inline
  def apply[R, C /* <: RouterContext */](
    action: (/* context */ RouteContext[R, C], /* params */ RouteParams) => RouteResultSync[R] = null,
    children: Routes[R, C] = null,
    `match`: /* path */ String => Match_[RouteParams] = null,
    name: String = null,
    parent: Route[R, C] = null,
    path: Path = null
  ): Route[R, C] = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction2(action))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[R, C]]
  }
}

