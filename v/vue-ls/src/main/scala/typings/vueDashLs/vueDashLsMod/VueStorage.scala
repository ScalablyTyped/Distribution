package typings.vueDashLs.vueDashLsMod

import typings.vue.typesPluginMod.PluginFunction
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-ls", "VueStorage")
@js.native
object VueStorage extends js.Object {
  @JSName("install")
  var install_Original: PluginFunction[Options] = js.native
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  def install(Vue: VueConstructor[Vue], options: Options): Unit = js.native
}

