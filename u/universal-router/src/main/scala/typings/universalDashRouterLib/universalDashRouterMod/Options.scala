package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[C /* <: Context */, R] extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[C] = js.undefined
  var errorHandler: js.UndefOr[
    js.Function2[
      /* error */ stdLib.Error with universalDashRouterLib.Anon_Status, 
      /* context */ C with (RouteContext[C, R]), 
      _
    ]
  ] = js.undefined
  var resolveRoute: js.UndefOr[js.Function2[/* context */ C with (RouteContext[C, R]), /* params */ Params, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply[C /* <: Context */, R](
    baseUrl: java.lang.String = null,
    context: C = null,
    errorHandler: (/* error */ stdLib.Error with universalDashRouterLib.Anon_Status, /* context */ C with (RouteContext[C, R])) => _ = null,
    resolveRoute: (/* context */ C with (RouteContext[C, R]), /* params */ Params) => _ = null
  ): Options[C, R] = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction2(errorHandler))
    if (resolveRoute != null) __obj.updateDynamic("resolveRoute")(js.Any.fromFunction2(resolveRoute))
    __obj.asInstanceOf[Options[C, R]]
  }
}

