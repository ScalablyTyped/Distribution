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
    val __obj = js.Dynamic.literal(components = components, instances = instances, meta = meta, path = path, props = props.asInstanceOf[js.Any], regex = regex)
    if (beforeEnter != null) __obj.updateDynamic("beforeEnter")(js.Any.fromFunction3(beforeEnter))
    if (matchAs != null) __obj.updateDynamic("matchAs")(matchAs)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecord]
  }
}

