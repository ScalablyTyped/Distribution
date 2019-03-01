package typings
package vueDashRouterLib.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var fallback: js.UndefOr[scala.Boolean] = js.undefined
  var linkActiveClass: js.UndefOr[java.lang.String] = js.undefined
  var linkExactActiveClass: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[RouterMode] = js.undefined
  var parseQuery: js.UndefOr[js.Function1[/* query */ java.lang.String, js.Object]] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var scrollBehavior: js.UndefOr[
    js.Function3[
      /* to */ Route, 
      /* from */ Route, 
      /* savedPosition */ Position | scala.Unit, 
      PositionResult | js.Promise[PositionResult]
    ]
  ] = js.undefined
  var stringifyQuery: js.UndefOr[js.Function1[/* query */ js.Object, java.lang.String]] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    fallback: js.UndefOr[scala.Boolean] = js.undefined,
    linkActiveClass: java.lang.String = null,
    linkExactActiveClass: java.lang.String = null,
    mode: RouterMode = null,
    parseQuery: js.Function1[/* query */ java.lang.String, js.Object] = null,
    routes: js.Array[RouteConfig] = null,
    scrollBehavior: js.Function3[
      /* to */ Route, 
      /* from */ Route, 
      /* savedPosition */ Position | scala.Unit, 
      PositionResult | js.Promise[PositionResult]
    ] = null,
    stringifyQuery: js.Function1[/* query */ js.Object, java.lang.String] = null
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback)
    if (linkActiveClass != null) __obj.updateDynamic("linkActiveClass")(linkActiveClass)
    if (linkExactActiveClass != null) __obj.updateDynamic("linkExactActiveClass")(linkExactActiveClass)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (parseQuery != null) __obj.updateDynamic("parseQuery")(parseQuery)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (scrollBehavior != null) __obj.updateDynamic("scrollBehavior")(scrollBehavior)
    if (stringifyQuery != null) __obj.updateDynamic("stringifyQuery")(stringifyQuery)
    __obj.asInstanceOf[RouterOptions]
  }
}

