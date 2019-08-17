package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesPluginMod {
  import typings.vue.typesVueMod.Vue
  import typings.vue.typesVueMod.VueConstructor

  type PluginFunction[T] = js.Function2[/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[T], Unit]
}
