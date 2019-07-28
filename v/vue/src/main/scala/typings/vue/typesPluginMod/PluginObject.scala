package typings.vue.typesPluginMod

import org.scalablytyped.runtime.StringDictionary
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginObject[T]
  extends /* key */ StringDictionary[js.Any] {
  @JSName("install")
  var install_Original: PluginFunction[T] = js.native
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  def install(Vue: VueConstructor[Vue], options: T): Unit = js.native
}

