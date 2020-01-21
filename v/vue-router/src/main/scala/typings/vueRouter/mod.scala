package typings.vueRouter

import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueRouter.routerMod.RouterOptions
import typings.vueRouter.routerMod.VueRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-router", JSImport.Namespace)
@js.native
object mod extends js.Object {
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

