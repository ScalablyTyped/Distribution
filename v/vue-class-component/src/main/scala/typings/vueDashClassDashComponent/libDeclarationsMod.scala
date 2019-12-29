package typings.vueDashClassDashComponent

import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/declarations", JSImport.Namespace)
@js.native
object libDeclarationsMod extends js.Object {
  type DecoratedClass = VueClass[Vue] with Anon_Decorators
  type VueClass[V] = Anon_Args[V] with VueConstructor[Vue]
}

