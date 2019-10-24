package typings.atTestingDashLibraryVue.atTestingDashLibraryVueMod

import typings.vue.typesVueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> * / any, 'store' | 'props'> ]: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> * / any[P]} */ trait RenderOptions[V /* <: Vue */, S] extends js.Object {
  var props: js.UndefOr[js.Object] = js.undefined
  var routes: js.UndefOr[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteConfig */ _
    ]
  ] = js.undefined
  var store: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoreOptions<S> */ js.Any
  ] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply[V /* <: Vue */, S](
    props: js.Object = null,
    routes: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteConfig */ _
    ] = null,
    store: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoreOptions<S> */ js.Any = null
  ): RenderOptions[V, S] = {
    val __obj = js.Dynamic.literal()
    if (props != null) __obj.updateDynamic("props")(props)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[RenderOptions[V, S]]
  }
}

