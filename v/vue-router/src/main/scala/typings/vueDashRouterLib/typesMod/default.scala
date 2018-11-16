package typings
package vueDashRouterLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-router/types", JSImport.Default)
@js.native
class default ()
  extends vueDashRouterLib.typesRouterMod.VueRouter {
  def this(options: vueDashRouterLib.typesRouterMod.RouterOptions) = this()
}

@JSImport("vue-router/types", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("install")
  var install_Original: vueLib.typesPluginMod.PluginFunction[scala.Nothing] = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue]): scala.Unit = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue], options: scala.Nothing): scala.Unit = js.native
}

