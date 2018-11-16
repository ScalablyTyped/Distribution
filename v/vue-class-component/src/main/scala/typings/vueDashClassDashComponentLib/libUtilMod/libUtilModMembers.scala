package typings
package vueDashClassDashComponentLib.libUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/util", JSImport.Namespace)
@js.native
object libUtilModMembers extends js.Object {
  val hasProto: scala.Boolean = js.native
  val noop: js.Function0[scala.Unit] = js.native
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
  ): VueDecorator = js.native
  def isPrimitive(value: js.Any): scala.Boolean = js.native
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
  def warn(message: java.lang.String): scala.Unit = js.native
}

