package typings.vueDashClassDashComponent.libUtilMod

import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueDecorator extends js.Object {
  def apply(Ctor: VueConstructor[Vue]): Unit = js.native
  def apply(target: Vue, key: String): Unit = js.native
  def apply(target: Vue, key: String, index: Double): Unit = js.native
}

