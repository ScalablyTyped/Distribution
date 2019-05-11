package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[C /* <: Context */, R] extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[C] = js.undefined
  var errorHandler: js.UndefOr[ErrorHandler[C, R]] = js.undefined
  var resolveRoute: js.UndefOr[ResolveRoute[C, R]] = js.undefined
}

object Options {
  @scala.inline
  def apply[C /* <: Context */, R](
    baseUrl: java.lang.String = null,
    context: C = null,
    errorHandler: ErrorHandler[C, R] = null,
    resolveRoute: ResolveRoute[C, R] = null
  ): Options[C, R] = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(errorHandler)
    if (resolveRoute != null) __obj.updateDynamic("resolveRoute")(resolveRoute)
    __obj.asInstanceOf[Options[C, R]]
  }
}

