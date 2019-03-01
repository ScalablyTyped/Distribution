package typings
package vueDashRouterLib.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRecord extends js.Object {
  var beforeEnter: js.UndefOr[
    js.Function3[
      /* route */ Route, 
      /* redirect */ js.Function1[/* location */ RawLocation, scala.Unit], 
      /* next */ js.Function0[scala.Unit], 
      _
    ]
  ] = js.undefined
  var components: Dictionary[Component]
  var instances: Dictionary[vueLib.typesVueMod.Vue]
  var matchAs: js.UndefOr[java.lang.String] = js.undefined
  var meta: js.Any
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[RouteRecord] = js.undefined
  var path: java.lang.String
  var props: scala.Boolean | js.Object | RoutePropsFunction | (Dictionary[scala.Boolean | js.Object | RoutePropsFunction])
  var redirect: js.UndefOr[RedirectOption] = js.undefined
  var regex: stdLib.RegExp
}

object RouteRecord {
  @scala.inline
  def apply(
    components: Dictionary[Component],
    instances: Dictionary[vueLib.typesVueMod.Vue],
    meta: js.Any,
    path: java.lang.String,
    props: scala.Boolean | js.Object | RoutePropsFunction | (Dictionary[scala.Boolean | js.Object | RoutePropsFunction]),
    regex: stdLib.RegExp,
    beforeEnter: js.Function3[
      /* route */ Route, 
      /* redirect */ js.Function1[/* location */ RawLocation, scala.Unit], 
      /* next */ js.Function0[scala.Unit], 
      _
    ] = null,
    matchAs: java.lang.String = null,
    name: java.lang.String = null,
    parent: RouteRecord = null,
    redirect: RedirectOption = null
  ): RouteRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("components")(components)
    __obj.updateDynamic("instances")(instances)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.updateDynamic("regex")(regex)
    if (beforeEnter != null) __obj.updateDynamic("beforeEnter")(beforeEnter)
    if (matchAs != null) __obj.updateDynamic("matchAs")(matchAs)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecord]
  }
}

