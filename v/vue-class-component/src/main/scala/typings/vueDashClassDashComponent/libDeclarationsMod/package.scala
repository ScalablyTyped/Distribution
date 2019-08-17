package typings.vueDashClassDashComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDeclarationsMod {
  import typings.vue.typesVueMod.Vue
  import typings.vue.typesVueMod.VueConstructor
  import typings.vueDashClassDashComponent.Anon_Args
  import typings.vueDashClassDashComponent.Anon_Decorators

  type DecoratedClass = VueClass[Vue] with Anon_Decorators
  type VueClass[V] = Anon_Args[V] with VueConstructor[Vue]
}
