package typings.vueClassComponent

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/declarations", JSImport.Namespace)
@js.native
object declarationsMod extends js.Object {
  type DecoratedClass = VueClass[Vue] with AnonDecorators
  type VueClass[V] = AnonArgs[V] with VueConstructor[Vue]
}

