package typings.vueClassComponent

import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueClassComponent.declarationsMod.VueClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("vue-class-component/lib/util", "createDecorator")
  @js.native
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
  
  @JSImport("vue-class-component/lib/util", "hasProto")
  @js.native
  val hasProto: Boolean = js.native
  
  @JSImport("vue-class-component/lib/util", "isPrimitive")
  @js.native
  def isPrimitive(value: js.Any): Boolean = js.native
  
  @JSImport("vue-class-component/lib/util", "mixins")
  @js.native
  def mixins[A](CtorA: VueClass[A]): VueClass[A] = js.native
  @JSImport("vue-class-component/lib/util", "mixins")
  @js.native
  def mixins[T /* <: js.Array[VueClass[Vue]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param Ctors because its type T is not an array type */ Ctors: T
  ): MixedVueClass[T] = js.native
  @JSImport("vue-class-component/lib/util", "mixins")
  @js.native
  def mixins[T](Ctors: VueClass[Vue]*): VueClass[T] = js.native
  @JSImport("vue-class-component/lib/util", "mixins")
  @js.native
  def mixins[A, B](CtorA: VueClass[A], CtorB: VueClass[B]): VueClass[A with B] = js.native
  @JSImport("vue-class-component/lib/util", "mixins")
  @js.native
  def mixins[A, B, C](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C]): VueClass[A with B with C] = js.native
  @JSImport("vue-class-component/lib/util", "mixins")
  @js.native
  def mixins[A, B, C, D](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D]): VueClass[A with B with C with D] = js.native
  @JSImport("vue-class-component/lib/util", "mixins")
  @js.native
  def mixins[A, B, C, D, E](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D], CtorE: VueClass[E]): VueClass[A with B with C with D with E] = js.native
  
  @JSImport("vue-class-component/lib/util", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("vue-class-component/lib/util", "warn")
  @js.native
  def warn(message: String): Unit = js.native
  
  type ExtractInstance[T] = js.Any
  
  type MixedVueClass[Mixins /* <: js.Array[VueClass[Vue]] */] = VueClass[UnionToIntersection[ExtractInstance[js.Any]]]
  
  type UnionToIntersection[U] = js.Any
  
  @js.native
  trait VueDecorator extends StObject {
    
    def apply(Ctor: VueConstructor[Vue]): Unit = js.native
    def apply(target: Vue, key: String): Unit = js.native
    def apply(target: Vue, key: String, index: Double): Unit = js.native
  }
}
