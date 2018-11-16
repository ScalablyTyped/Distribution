package typings
package vueLib.typesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginObject[T]
  extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  @JSName("install")
  var install_Original: PluginFunction[T] = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue]): scala.Unit = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue], options: T): scala.Unit = js.native
}

