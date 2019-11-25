package typings.universalDashRouter.universalDashRouterMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[C /* <: Context */, R] extends js.Object {
  var action: js.UndefOr[
    js.Function2[/* context */ (RouteContext[C, R]) with C, /* params */ QueryParams, Result[R]]
  ] = js.undefined
  var children: js.UndefOr[(Routes[C, R]) | Null] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[(Route[C, R]) | Null] = js.undefined
  var path: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
}

object Route {
  @scala.inline
  def apply[C /* <: Context */, R](
    action: (/* context */ (RouteContext[C, R]) with C, /* params */ QueryParams) => Result[R] = null,
    children: Routes[C, R] = null,
    name: String = null,
    parent: Route[C, R] = null,
    path: String | RegExp | (js.Array[String | RegExp]) = null
  ): Route[C, R] = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction2(action))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[C, R]]
  }
}

