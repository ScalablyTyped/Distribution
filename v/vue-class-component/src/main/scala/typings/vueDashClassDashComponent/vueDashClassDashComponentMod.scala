package typings.vueDashClassDashComponent

import typings.std.ThisType
import typings.vue.typesOptionsMod.ComponentOptions
import typings.vue.typesOptionsMod.DefaultComputed
import typings.vue.typesOptionsMod.DefaultData
import typings.vue.typesOptionsMod.DefaultMethods
import typings.vue.typesOptionsMod.DefaultProps
import typings.vue.typesOptionsMod.PropsDefinition
import typings.vue.typesVueMod.Vue
import typings.vueDashClassDashComponent.libDeclarationsMod.VueClass
import typings.vueDashClassDashComponent.libUtilMod.VueDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component", JSImport.Namespace)
@js.native
object vueDashClassDashComponentMod extends js.Object {
  def createDecorator(
    factory: js.Function3[
      /* options */ ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps], 
        DefaultProps
      ], 
      /* key */ String, 
      /* index */ Double, 
      Unit
    ]
  ): VueDecorator = js.native
  def default[V /* <: Vue */](
    options: (ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]) with ThisType[V]
  ): js.Function1[/* target */ VueClass[V], VueClass[V]] = js.native
  def default[VC /* <: VueClass[Vue] */](target: VC): VC = js.native
  def mixins[A](CtorA: VueClass[A]): VueClass[A] = js.native
  def mixins[T](Ctors: VueClass[Vue]*): VueClass[T] = js.native
  def mixins[A, B](CtorA: VueClass[A], CtorB: VueClass[B]): VueClass[A with B] = js.native
  def mixins[A, B, C](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C]): VueClass[A with B with C] = js.native
  def mixins[A, B, C, D](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D]): VueClass[A with B with C with D] = js.native
  def mixins[A, B, C, D, E](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D], CtorE: VueClass[E]): VueClass[A with B with C with D with E] = js.native
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    var registerHooks: js.Function1[/* keys */ js.Array[String], Unit] = js.native
  }
  
}

