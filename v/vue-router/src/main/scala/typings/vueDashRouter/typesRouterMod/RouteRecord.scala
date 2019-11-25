package typings.vueDashRouter.typesRouterMod

import typings.std.RegExp
import typings.vue.typesVueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRecord extends js.Object {
  var beforeEnter: js.UndefOr[
    js.Function3[
      /* route */ Route, 
      /* redirect */ js.Function1[/* location */ RawLocation, Unit], 
      /* next */ js.Function0[Unit], 
      _
    ]
  ] = js.undefined
  var components: Dictionary[Component]
  var instances: Dictionary[Vue]
  var matchAs: js.UndefOr[String] = js.undefined
  var meta: js.Any
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[RouteRecord] = js.undefined
  var path: String
  var props: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction])
  var redirect: js.UndefOr[RedirectOption] = js.undefined
  var regex: RegExp
}

object RouteRecord {
  @scala.inline
  def apply(
    components: Dictionary[Component],
    instances: Dictionary[Vue],
    meta: js.Any,
    path: String,
    props: Boolean | js.Object | RoutePropsFunction | (Dictionary[Boolean | js.Object | RoutePropsFunction]),
    regex: RegExp,
    beforeEnter: (/* route */ Route, /* redirect */ js.Function1[/* location */ RawLocation, Unit], /* next */ js.Function0[Unit]) => _ = null,
    matchAs: String = null,
    name: String = null,
    parent: RouteRecord = null,
    redirect: RedirectOption = null
  ): RouteRecord = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    if (beforeEnter != null) __obj.updateDynamic("beforeEnter")(js.Any.fromFunction3(beforeEnter))
    if (matchAs != null) __obj.updateDynamic("matchAs")(matchAs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecord]
  }
}

