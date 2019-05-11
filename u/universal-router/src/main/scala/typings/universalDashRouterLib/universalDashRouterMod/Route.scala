package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[C /* <: Context */, R] extends js.Object {
  var action: js.UndefOr[
    js.Function2[/* context */ (RouteContext[C, R]) with C, /* params */ QueryParams, Result[R]]
  ] = js.undefined
  var children: js.UndefOr[(Routes[C, R]) | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[(Route[C, R]) | scala.Null] = js.undefined
  var path: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
}

object Route {
  @scala.inline
  def apply[C /* <: Context */, R](
    action: (/* context */ (RouteContext[C, R]) with C, /* params */ QueryParams) => Result[R] = null,
    children: Routes[C, R] = null,
    name: java.lang.String = null,
    parent: Route[C, R] = null,
    path: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null
  ): Route[C, R] = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction2(action))
    if (children != null) __obj.updateDynamic("children")(children)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route[C, R]]
  }
}

