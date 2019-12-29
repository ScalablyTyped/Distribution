package typings.vueDashClassDashComponent

import typings.vue.typesOptionsMod.ComponentOptions
import typings.vue.typesOptionsMod.DefaultComputed
import typings.vue.typesOptionsMod.DefaultData
import typings.vue.typesOptionsMod.DefaultMethods
import typings.vue.typesOptionsMod.DefaultProps
import typings.vue.typesOptionsMod.PropsDefinition
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import typings.vueDashClassDashComponent.libDeclarationsMod.VueClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/util", JSImport.Namespace)
@js.native
object libUtilMod extends js.Object {
  @js.native
  trait VueDecorator extends js.Object {
    def apply(Ctor: VueConstructor[Vue]): Unit = js.native
    def apply(target: Vue, key: String): Unit = js.native
    def apply(target: Vue, key: String, index: Double): Unit = js.native
  }
  
  val hasProto: Boolean = js.native
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
  def isPrimitive(value: js.Any): Boolean = js.native
  def mixins[A](CtorA: VueClass[A]): VueClass[A] = js.native
  def mixins[T](Ctors: VueClass[Vue]*): VueClass[T] = js.native
  def mixins[A, B](CtorA: VueClass[A], CtorB: VueClass[B]): VueClass[A with B] = js.native
  def mixins[A, B, C](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C]): VueClass[A with B with C] = js.native
  def mixins[A, B, C, D](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D]): VueClass[A with B with C with D] = js.native
  def mixins[A, B, C, D, E](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D], CtorE: VueClass[E]): VueClass[A with B with C with D with E] = js.native
  def noop(): Unit = js.native
  def warn(message: String): Unit = js.native
}

