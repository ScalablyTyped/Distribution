package typings.vueClassComponent

import typings.vueClassComponent.anon.TypeofVue
import typings.vueClassComponent.declarationsMod.VueClass
import typings.vueRuntimeCore.mod.ComponentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("vue-class-component/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDecorator(
    factory: js.Function3[
      /* options */ ComponentOptions[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any, 
        Any
      ], 
      /* key */ String, 
      /* index */ Double, 
      Unit
    ]
  ): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecorator")(factory.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  
  @JSImport("vue-class-component/lib/util", "hasProto")
  @js.native
  val hasProto: Boolean = js.native
  
  inline def isPrimitive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mixins[A](CtorA: VueClass[A]): VueClass[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("mixins")(CtorA.asInstanceOf[js.Any]).asInstanceOf[VueClass[A]]
  inline def mixins[T /* <: js.Array[
    VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ]
  ] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param Ctors because its type T is not an array type */ Ctors: T
  ): MixedVueClass[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mixins")(Ctors.asInstanceOf[js.Any]).asInstanceOf[MixedVueClass[T]]
  inline def mixins[T](
    Ctors: (VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ])*
  ): VueClass[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mixins")(Ctors.asInstanceOf[Seq[js.Any]]*).asInstanceOf[VueClass[T]]
  inline def mixins[A, B](CtorA: VueClass[A], CtorB: VueClass[B]): VueClass[A & B] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixins")(CtorA.asInstanceOf[js.Any], CtorB.asInstanceOf[js.Any])).asInstanceOf[VueClass[A & B]]
  inline def mixins[A, B, C](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C]): VueClass[A & B & C] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixins")(CtorA.asInstanceOf[js.Any], CtorB.asInstanceOf[js.Any], CtorC.asInstanceOf[js.Any])).asInstanceOf[VueClass[A & B & C]]
  inline def mixins[A, B, C, D](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D]): VueClass[A & B & C & D] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixins")(CtorA.asInstanceOf[js.Any], CtorB.asInstanceOf[js.Any], CtorC.asInstanceOf[js.Any], CtorD.asInstanceOf[js.Any])).asInstanceOf[VueClass[A & B & C & D]]
  inline def mixins[A, B, C, D, E](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D], CtorE: VueClass[E]): VueClass[A & B & C & D & E] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixins")(CtorA.asInstanceOf[js.Any], CtorB.asInstanceOf[js.Any], CtorC.asInstanceOf[js.Any], CtorD.asInstanceOf[js.Any], CtorE.asInstanceOf[js.Any])).asInstanceOf[VueClass[A & B & C & D & E]]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ExtractInstance[T] = Any
  
  type MixedVueClass[Mixins /* <: js.Array[
    VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ]
  ] */] = VueClass[UnionToIntersection[ExtractInstance[Any]]]
  
  type UnionToIntersection[U] = Any
  
  @js.native
  trait VueDecorator extends StObject {
    
    def apply(Ctor: TypeofVue): Unit = js.native
    def apply(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
      key: String
    ): Unit = js.native
    def apply(
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
      key: String,
      index: Double
    ): Unit = js.native
  }
}
