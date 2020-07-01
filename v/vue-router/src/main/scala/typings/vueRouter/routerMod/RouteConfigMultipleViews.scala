package typings.vueRouter.routerMod

import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfigMultipleViews
  extends RouteConfigBase
     with RouteConfig {
  var components: js.UndefOr[Dictionary[Component]] = js.undefined
  var props: js.UndefOr[Dictionary[Boolean | js.Object | RoutePropsFunction]] = js.undefined
}

object RouteConfigMultipleViews {
  @scala.inline
  def apply(
    path: String,
    alias: String | js.Array[String] = null,
    beforeEnter: (/* to */ Route, /* from */ Route, /* next */ NavigationGuardNext[Vue]) => js.Any = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[RouteConfig] = null,
    components: Dictionary[Component] = null,
    meta: js.Any = null,
    name: String = null,
    pathToRegexpOptions: PathToRegexpOptions = null,
    props: Dictionary[Boolean | js.Object | RoutePropsFunction] = null,
    redirect: RedirectOption = null
  ): RouteConfigMultipleViews = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (beforeEnter != null) __obj.updateDynamic("beforeEnter")(js.Any.fromFunction3(beforeEnter))
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pathToRegexpOptions != null) __obj.updateDynamic("pathToRegexpOptions")(pathToRegexpOptions.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigMultipleViews]
  }
}

