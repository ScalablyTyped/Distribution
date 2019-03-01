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

object RouteConfig {
  @scala.inline
  def apply(
    path: java.lang.String,
    alias: java.lang.String | js.Array[java.lang.String] = null,
    beforeEnter: NavigationGuard[vueLib.typesVueMod.Vue] = null,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    children: js.Array[RouteConfig] = null,
    component: Component = null,
    components: Dictionary[Component] = null,
    meta: js.Any = null,
    name: java.lang.String = null,
    pathToRegexpOptions: PathToRegexpOptions = null,
    props: scala.Boolean | js.Object | RoutePropsFunction = null,
    redirect: RedirectOption = null
  ): RouteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (beforeEnter != null) __obj.updateDynamic("beforeEnter")(beforeEnter)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (children != null) __obj.updateDynamic("children")(children)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pathToRegexpOptions != null) __obj.updateDynamic("pathToRegexpOptions")(pathToRegexpOptions)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
}

