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

