package typings.vueDashRouter

import typings.vue.typesPluginMod.PluginFunction
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import typings.vueDashRouter.typesRouterMod.RouterOptions
import typings.vueDashRouter.typesRouterMod.VueRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-router", JSImport.Namespace)
@js.native
object vueDashRouterMod extends js.Object {
  @js.native
  class default () extends VueRouter {
    def this(options: RouterOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    @JSName("install")
    var install_Original: PluginFunction[scala.Nothing] = js.native
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
  }
  
}

