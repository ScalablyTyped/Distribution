package typings.vueClassComponent

import typings.std.ThisType
import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vueMod.Vue
import typings.vueClassComponent.declarationsMod.VueClass
import typings.vueClassComponent.utilMod.MixedVueClass
import typings.vueClassComponent.utilMod.VueDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-class-component", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  
  def mixins[A](CtorA: VueClass[A]): VueClass[A] = js.native
  def mixins[T /* <: js.Array[VueClass[Vue]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param Ctors because its type T is not an array type */ Ctors: T
  ): MixedVueClass[T] = js.native
  def mixins[T](Ctors: VueClass[Vue]*): VueClass[T] = js.native
  def mixins[A, B](CtorA: VueClass[A], CtorB: VueClass[B]): VueClass[A with B] = js.native
  def mixins[A, B, C](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C]): VueClass[A with B with C] = js.native
  def mixins[A, B, C, D](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D]): VueClass[A with B with C with D] = js.native
  def mixins[A, B, C, D, E](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D], CtorE: VueClass[E]): VueClass[A with B with C with D with E] = js.native
  
  @js.native
  object default extends js.Object {
    
    def apply[V /* <: Vue */](
      options: (ComponentOptions[
          V, 
          DefaultData[V], 
          DefaultMethods[V], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]) with ThisType[V]
    ): js.Function1[/* target */ VueClass[V], VueClass[V]] = js.native
    def apply[VC /* <: VueClass[Vue] */](target: VC): VC = js.native
    
    var registerHooks: js.Function1[/* keys */ js.Array[String], Unit] = js.native
  }
}
