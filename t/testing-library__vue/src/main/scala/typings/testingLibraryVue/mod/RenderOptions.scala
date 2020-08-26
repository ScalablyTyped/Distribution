package typings.testingLibraryVue.mod

import typings.std.HTMLElement
import typings.vue.vueMod.Vue
import typings.vueRouter.routerMod.RouteConfig
import typings.vuex.mod.StoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> * / any, 'store' | 'props'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> * / any[P]} */ @js.native
trait RenderOptions[V /* <: Vue */, S] extends js.Object {
  var baseElement: js.UndefOr[HTMLElement] = js.native
  var container: js.UndefOr[HTMLElement] = js.native
  var props: js.UndefOr[js.Object] = js.native
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.native
  var store: js.UndefOr[StoreOptions[S]] = js.native
}

object RenderOptions {
  @scala.inline
  def apply[/* <: typings.vue.vueMod.Vue */ V, S](): RenderOptions[V, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions[V, S]]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions[_, _], /* <: typings.vue.vueMod.Vue */ V, S] (val x: Self with (RenderOptions[V, S])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseElement(value: HTMLElement): Self = this.set("baseElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseElement: Self = this.set("baseElement", js.undefined)
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setProps(value: js.Object): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: RouteConfig*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[RouteConfig]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    @scala.inline
    def setStore(value: StoreOptions[S]): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
  
}

