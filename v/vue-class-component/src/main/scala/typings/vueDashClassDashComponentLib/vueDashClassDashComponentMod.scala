package typings
package vueDashClassDashComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component", JSImport.Namespace)
@js.native
object vueDashClassDashComponentMod extends js.Object {
  def createDecorator(
    factory: js.Function3[
      /* options */ vueLib.typesOptionsMod.ComponentOptions[
        vueLib.typesVueMod.Vue, 
        vueLib.typesOptionsMod.DefaultData[vueLib.typesVueMod.Vue], 
        vueLib.typesOptionsMod.DefaultMethods[vueLib.typesVueMod.Vue], 
        vueLib.typesOptionsMod.DefaultComputed, 
        vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
        vueLib.typesOptionsMod.DefaultProps
      ], 
      /* key */ java.lang.String, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): vueDashClassDashComponentLib.libUtilMod.VueDecorator = js.native
  def default[V /* <: vueLib.typesVueMod.Vue */](
    options: (vueLib.typesOptionsMod.ComponentOptions[
      V, 
      vueLib.typesOptionsMod.DefaultData[V], 
      vueLib.typesOptionsMod.DefaultMethods[V], 
      vueLib.typesOptionsMod.DefaultComputed, 
      vueLib.typesOptionsMod.PropsDefinition[vueLib.typesOptionsMod.DefaultProps], 
      vueLib.typesOptionsMod.DefaultProps
    ]) with stdLib.ThisType[V]
  ): js.Function1[
    /* target */ vueDashClassDashComponentLib.libDeclarationsMod.VueClass[V], 
    vueDashClassDashComponentLib.libDeclarationsMod.VueClass[V]
  ] = js.native
  def default[VC /* <: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[vueLib.typesVueMod.Vue] */](target: VC): VC = js.native
  def mixins[A](CtorA: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A]): vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A] = js.native
  def mixins[T](Ctors: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[vueLib.typesVueMod.Vue]*): vueDashClassDashComponentLib.libDeclarationsMod.VueClass[T] = js.native
  def mixins[A, B](
    CtorA: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A],
    CtorB: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[B]
  ): vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A with B] = js.native
  def mixins[A, B, C](
    CtorA: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A],
    CtorB: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[B],
    CtorC: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[C]
  ): vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A with B with C] = js.native
  def mixins[A, B, C, D](
    CtorA: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A],
    CtorB: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[B],
    CtorC: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[C],
    CtorD: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[D]
  ): vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A with B with C with D] = js.native
  def mixins[A, B, C, D, E](
    CtorA: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A],
    CtorB: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[B],
    CtorC: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[C],
    CtorD: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[D],
    CtorE: vueDashClassDashComponentLib.libDeclarationsMod.VueClass[E]
  ): vueDashClassDashComponentLib.libDeclarationsMod.VueClass[A with B with C with D with E] = js.native
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    var registerHooks: js.Function1[/* keys */ js.Array[java.lang.String], scala.Unit] = js.native
  }
  
}

