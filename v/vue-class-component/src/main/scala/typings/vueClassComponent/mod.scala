package typings.vueClassComponent

import typings.std.ThisType
import typings.vueClassComponent.declarationsMod.VueClass
import typings.vueClassComponent.utilMod.MixedVueClass
import typings.vueClassComponent.utilMod.VueDecorator
import typings.vueRuntimeCore.mod.ComponentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-class-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](options: (ComponentOptions[V, Any, Any, Any, Any, Any, Any, Any]) & ThisType[V]): js.Function1[/* target */ VueClass[V], VueClass[V]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ VueClass[V], VueClass[V]]]
    inline def apply[VC /* <: VueClass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
      ] */](target: VC): VC = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[VC]
    
    @JSImport("vue-class-component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vue-class-component", "default.registerHooks")
    @js.native
    def registerHooks: js.Function1[/* keys */ js.Array[String], Unit] = js.native
    inline def registerHooks_=(x: js.Function1[/* keys */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerHooks")(x.asInstanceOf[js.Any])
  }
  
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
}
