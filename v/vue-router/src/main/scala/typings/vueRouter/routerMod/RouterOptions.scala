package typings.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
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
  def apply(
    base: String = null,
    fallback: js.UndefOr[Boolean] = js.undefined,
    linkActiveClass: String = null,
    linkExactActiveClass: String = null,
    mode: RouterMode = null,
    parseQuery: /* query */ String => js.Object = null,
    routes: js.Array[RouteConfig] = null,
    scrollBehavior: (/* to */ Route, /* from */ Route, /* savedPosition */ Position | Unit) => js.UndefOr[PositionResult | js.Promise[PositionResult] | Null] = null,
    stringifyQuery: /* query */ js.Object => String = null
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.get.asInstanceOf[js.Any])
    if (linkActiveClass != null) __obj.updateDynamic("linkActiveClass")(linkActiveClass.asInstanceOf[js.Any])
    if (linkExactActiveClass != null) __obj.updateDynamic("linkExactActiveClass")(linkExactActiveClass.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (parseQuery != null) __obj.updateDynamic("parseQuery")(js.Any.fromFunction1(parseQuery))
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (scrollBehavior != null) __obj.updateDynamic("scrollBehavior")(js.Any.fromFunction3(scrollBehavior))
    if (stringifyQuery != null) __obj.updateDynamic("stringifyQuery")(js.Any.fromFunction1(stringifyQuery))
    __obj.asInstanceOf[RouterOptions]
  }
}

