package typings
package vueDashRouterLib.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RouteConfig extends js.Object {
  var alias: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var beforeEnter: js.UndefOr[NavigationGuard[vueLib.typesVueMod.Vue]] = js.undefined
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var component: js.UndefOr[Component] = js.undefined
  var components: js.UndefOr[Dictionary[Component]] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
  var pathToRegexpOptions: js.UndefOr[PathToRegexpOptions] = js.undefined
  var props: js.UndefOr[scala.Boolean | js.Object | RoutePropsFunction] = js.undefined
  var redirect: js.UndefOr[RedirectOption] = js.undefined
}

