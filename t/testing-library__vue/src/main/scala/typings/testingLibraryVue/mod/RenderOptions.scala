package typings.testingLibraryVue.mod

import typings.vue.vueMod.Vue
import typings.vueRouter.routerMod.RouteConfig
import typings.vuex.mod.StoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> * / any, 'store' | 'props'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> * / any[P]} */ trait RenderOptions[V /* <: Vue */, S] extends js.Object {
  var props: js.UndefOr[js.Object] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var store: js.UndefOr[StoreOptions[S]] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply[/* <: typings.vue.vueMod.Vue */ V, S](props: js.Object = null, routes: js.Array[RouteConfig] = null, store: StoreOptions[S] = null): RenderOptions[V, S] = {
    val __obj = js.Dynamic.literal()
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions[V, S]]
  }
}

