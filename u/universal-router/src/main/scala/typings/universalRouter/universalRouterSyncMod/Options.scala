package typings.universalRouter.universalRouterSyncMod

import typings.std.Error
import typings.universalRouter.AnonStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[C /* <: Context */, R] extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[C] = js.undefined
  var errorHandler: js.UndefOr[ErrorHandler[C, R]] = js.undefined
  var resolveRoute: js.UndefOr[ResolveRoute[C, R]] = js.undefined
}

object Options {
  @scala.inline
  def apply[C /* <: Context */, R](
    baseUrl: String = null,
    context: C = null,
    errorHandler: (/* error */ Error with AnonStatus, /* context */ C with (RouteContext[C, R])) => Result[R] = null,
    resolveRoute: (/* context */ C with (RouteContext[C, R]), /* params */ QueryParams) => Result[R] = null
  ): Options[C, R] = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction2(errorHandler))
    if (resolveRoute != null) __obj.updateDynamic("resolveRoute")(js.Any.fromFunction2(resolveRoute))
    __obj.asInstanceOf[Options[C, R]]
  }
}

