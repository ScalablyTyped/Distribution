package typings.vuePropertyDecorator

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.Event
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import typings.std.KeyboardEvent
import typings.std.Node
import typings.std.Parameters
import typings.std.Record
import typings.std.ShadowRoot
import typings.std.ThisType
import typings.std.Window
import typings.vueClassComponent.declarationsMod.VueClass
import typings.vueClassComponent.utilMod.MixedVueClass
import typings.vueClassComponent.utilMod.VueDecorator
import typings.vueCompilerCore.mod.CompilerOptions
import typings.vuePropertyDecorator.injectMod.InjectOptions
import typings.vuePropertyDecorator.vuePropertyDecoratorBooleans.`false`
import typings.vuePropertyDecorator.vuePropertyDecoratorBooleans.`true`
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.at
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.concat
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.copyWithin
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.entries
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.every
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.fill
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.filter
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.find
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.findIndex
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.flat
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.flatMap
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.forEach
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.includes
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.indexOf
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.join
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.keys
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.lastIndexOf
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.length
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.map
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.pop
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.push
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.reduce
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.reduceRight
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.reverse
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.shift
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.slice
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.some
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.sort
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.splice
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.toLocaleString
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.toString
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.unshift
import typings.vuePropertyDecorator.vuePropertyDecoratorStrings.values
import typings.vueReactivity.anon.RawSymbol
import typings.vueReactivity.mod.ComputedGetter
import typings.vueReactivity.mod.ComputedRef
import typings.vueReactivity.mod.CustomRefFactory
import typings.vueReactivity.mod.DebuggerOptions
import typings.vueReactivity.mod.DeepReadonly
import typings.vueReactivity.mod.EffectScheduler
import typings.vueReactivity.mod.ReactiveEffectOptions
import typings.vueReactivity.mod.ReactiveEffectRunner
import typings.vueReactivity.mod.Ref_
import typings.vueReactivity.mod.ShallowReactive_
import typings.vueReactivity.mod.ShallowRef_
import typings.vueReactivity.mod.ShallowUnwrapRef
import typings.vueReactivity.mod.ToRef_
import typings.vueReactivity.mod.ToRefs_
import typings.vueReactivity.mod.UnwrapNestedRefs
import typings.vueReactivity.mod.UnwrapRef
import typings.vueReactivity.mod.WritableComputedOptions
import typings.vueReactivity.mod.WritableComputedRef
import typings.vueRuntimeCore.anon.IsFragment
import typings.vueRuntimeCore.anon.IsSuspense
import typings.vueRuntimeCore.anon.IsTeleport
import typings.vueRuntimeCore.anon.Props
import typings.vueRuntimeCore.anon.ReadonlyMultiWatchSources
import typings.vueRuntimeCore.mod.AsyncComponentLoader
import typings.vueRuntimeCore.mod.AsyncComponentOptions
import typings.vueRuntimeCore.mod.BaseTransitionProps
import typings.vueRuntimeCore.mod.ClassComponent
import typings.vueRuntimeCore.mod.CompiledSlotDescriptor
import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueRuntimeCore.mod.ComponentObjectPropsOptions
import typings.vueRuntimeCore.mod.ComponentOptions
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComponentOptionsWithArrayProps
import typings.vueRuntimeCore.mod.ComponentOptionsWithObjectProps
import typings.vueRuntimeCore.mod.ComponentOptionsWithoutProps
import typings.vueRuntimeCore.mod.ComponentPropsOptions
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.ConcreteComponent
import typings.vueRuntimeCore.mod.Constructor
import typings.vueRuntimeCore.mod.CreateAppFunction
import typings.vueRuntimeCore.mod.Data
import typings.vueRuntimeCore.mod.DebuggerHook
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.DevtoolsHook
import typings.vueRuntimeCore.mod.Directive
import typings.vueRuntimeCore.mod.DirectiveArguments
import typings.vueRuntimeCore.mod.EmitFn
import typings.vueRuntimeCore.mod.EmitsOptions
import typings.vueRuntimeCore.mod.EmitsToProps
import typings.vueRuntimeCore.mod.ErrorCapturedHook
import typings.vueRuntimeCore.mod.ErrorTypes
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.ExtractPropTypes
import typings.vueRuntimeCore.mod.FunctionalComponent
import typings.vueRuntimeCore.mod.HydrationRenderer
import typings.vueRuntimeCore.mod.InferDefaults
import typings.vueRuntimeCore.mod.InjectionKey
import typings.vueRuntimeCore.mod.MapSources
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.MultiWatchSources
import typings.vueRuntimeCore.mod.ObjectDirective
import typings.vueRuntimeCore.mod.PropOptions
import typings.vueRuntimeCore.mod.PropsWithDefaults
import typings.vueRuntimeCore.mod.PublicProps
import typings.vueRuntimeCore.mod.RawChildren
import typings.vueRuntimeCore.mod.RawProps
import typings.vueRuntimeCore.mod.RawSlots
import typings.vueRuntimeCore.mod.RenderFunction
import typings.vueRuntimeCore.mod.Renderer
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.RendererOptions
import typings.vueRuntimeCore.mod.RootHydrateFunction
import typings.vueRuntimeCore.mod.RootRenderFunction
import typings.vueRuntimeCore.mod.SSRSlot
import typings.vueRuntimeCore.mod.SchedulerJobs
import typings.vueRuntimeCore.mod.SetupContext
import typings.vueRuntimeCore.mod.Slots
import typings.vueRuntimeCore.mod.SuspenseProps
import typings.vueRuntimeCore.mod.TeleportProps
import typings.vueRuntimeCore.mod.TransitionHooks
import typings.vueRuntimeCore.mod.TransitionState
import typings.vueRuntimeCore.mod.VNode
import typings.vueRuntimeCore.mod.VNodeArrayChildren
import typings.vueRuntimeCore.mod.VNodeChild
import typings.vueRuntimeCore.mod.VNodeProps
import typings.vueRuntimeCore.mod.VNodeTypes
import typings.vueRuntimeCore.mod.WatchCallback
import typings.vueRuntimeCore.mod.WatchEffect_
import typings.vueRuntimeCore.mod.WatchOptions
import typings.vueRuntimeCore.mod.WatchOptionsBase
import typings.vueRuntimeCore.mod.WatchSource
import typings.vueRuntimeCore.mod.WatchStopHandle
import typings.vueRuntimeDom.anon.Instantiable
import typings.vueRuntimeDom.anon.Styles
import typings.vueRuntimeDom.mod.InnerComponentDef
import typings.vueRuntimeDom.mod.ModelDirective
import typings.vueRuntimeDom.mod.TransitionGroupProps
import typings.vueRuntimeDom.mod.TransitionProps
import typings.vueRuntimeDom.mod.VShowElement
import typings.vueRuntimeDom.mod.VueElementConstructor
import typings.vueShared.mod.NormalizedStyle
import typings.vueShared.mod.ShapeFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-property-decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Component {
    
    inline def apply[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](options: (ComponentOptions[V, Any, Any, Any, Any, Any, Any, Any]) & ThisType[V]): js.Function1[/* target */ VueClass[V], VueClass[V]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ VueClass[V], VueClass[V]]]
    inline def apply[VC /* <: VueClass[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
      ] */](target: VC): VC = ^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any]).asInstanceOf[VC]
    
    @JSImport("vue-property-decorator", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vue-property-decorator", "Component.registerHooks")
    @js.native
    def registerHooks: js.Function1[/* keys */ js.Array[String], Unit] = js.native
    inline def registerHooks_=(x: js.Function1[/* keys */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerHooks")(x.asInstanceOf[js.Any])
  }
  
  inline def Emit(): js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* _target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ Any, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Emit")().asInstanceOf[js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* _target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ Any, 
    Unit
  ]]
  inline def Emit(event: String): js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* _target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ Any, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Emit")(event.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* _target */ Any, 
    /* propertyKey */ String, 
    /* descriptor */ Any, 
    Unit
  ]]
  
  inline def Inject(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Inject")().asInstanceOf[VueDecorator]
  inline def Inject(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InjectKey */ Any
  ): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Inject")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def Inject(options: InjectOptions): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Inject")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  
  inline def InjectReactive(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("InjectReactive")().asInstanceOf[VueDecorator]
  inline def InjectReactive(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InjectKey */ Any
  ): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("InjectReactive")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def InjectReactive(options: InjectOptions): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("InjectReactive")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  
  inline def Mixins[A](CtorA: VueClass[A]): VueClass[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("Mixins")(CtorA.asInstanceOf[js.Any]).asInstanceOf[VueClass[A]]
  inline def Mixins[T /* <: js.Array[
    VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ]
  ] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param Ctors because its type T is not an array type */ Ctors: T
  ): MixedVueClass[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Mixins")(Ctors.asInstanceOf[js.Any]).asInstanceOf[MixedVueClass[T]]
  inline def Mixins[T](
    Ctors: (VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ])*
  ): VueClass[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Mixins")(Ctors.asInstanceOf[Seq[js.Any]]*).asInstanceOf[VueClass[T]]
  inline def Mixins[A, B](CtorA: VueClass[A], CtorB: VueClass[B]): VueClass[A & B] = (^.asInstanceOf[js.Dynamic].applyDynamic("Mixins")(CtorA.asInstanceOf[js.Any], CtorB.asInstanceOf[js.Any])).asInstanceOf[VueClass[A & B]]
  inline def Mixins[A, B, C](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C]): VueClass[A & B & C] = (^.asInstanceOf[js.Dynamic].applyDynamic("Mixins")(CtorA.asInstanceOf[js.Any], CtorB.asInstanceOf[js.Any], CtorC.asInstanceOf[js.Any])).asInstanceOf[VueClass[A & B & C]]
  inline def Mixins[A, B, C, D](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D]): VueClass[A & B & C & D] = (^.asInstanceOf[js.Dynamic].applyDynamic("Mixins")(CtorA.asInstanceOf[js.Any], CtorB.asInstanceOf[js.Any], CtorC.asInstanceOf[js.Any], CtorD.asInstanceOf[js.Any])).asInstanceOf[VueClass[A & B & C & D]]
  inline def Mixins[A, B, C, D, E](CtorA: VueClass[A], CtorB: VueClass[B], CtorC: VueClass[C], CtorD: VueClass[D], CtorE: VueClass[E]): VueClass[A & B & C & D & E] = (^.asInstanceOf[js.Dynamic].applyDynamic("Mixins")(CtorA.asInstanceOf[js.Any], CtorB.asInstanceOf[js.Any], CtorC.asInstanceOf[js.Any], CtorD.asInstanceOf[js.Any], CtorE.asInstanceOf[js.Any])).asInstanceOf[VueClass[A & B & C & D & E]]
  
  inline def Model(): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Model")().asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Model(event: String): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Model")(event.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Model(
    event: String,
    options: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
    ]
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Model")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Model(
    event: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Model")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Model(event: String, options: PropOptions[Any, Any]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Model")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Model(
    event: Unit,
    options: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
    ]
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Model")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Model(
    event: Unit,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Model")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Model(event: Unit, options: PropOptions[Any, Any]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Model")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  
  inline def ModelSync(propName: String): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ModelSync")(propName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def ModelSync(propName: String, event: String): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ModelSync")(propName.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def ModelSync(
    propName: String,
    event: String,
    options: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
    ]
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ModelSync")(propName.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def ModelSync(
    propName: String,
    event: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ModelSync")(propName.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def ModelSync(propName: String, event: String, options: PropOptions[Any, Any]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ModelSync")(propName.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def ModelSync(
    propName: String,
    event: Unit,
    options: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
    ]
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ModelSync")(propName.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def ModelSync(
    propName: String,
    event: Unit,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ModelSync")(propName.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def ModelSync(propName: String, event: Unit, options: PropOptions[Any, Any]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ModelSync")(propName.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  
  inline def Prop(): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Prop")().asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Prop(
    options: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
    ]
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Prop")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Prop(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Prop")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def Prop(options: PropOptions[Any, Any]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Prop")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  
  inline def PropSync(propName: String): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("PropSync")(propName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def PropSync(
    propName: String,
    options: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
    ]
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("PropSync")(propName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def PropSync(
    propName: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
  ): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("PropSync")(propName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  inline def PropSync(propName: String, options: PropOptions[Any, Any]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("PropSync")(propName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ /* target */ Any, 
    /* key */ String, 
    Unit
  ]]
  
  inline def Provide(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Provide")().asInstanceOf[VueDecorator]
  inline def Provide(key: String): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Provide")(key.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def Provide(key: js.Symbol): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Provide")(key.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  
  inline def ProvideReactive(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ProvideReactive")().asInstanceOf[VueDecorator]
  inline def ProvideReactive(key: String): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ProvideReactive")(key.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def ProvideReactive(key: js.Symbol): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ProvideReactive")(key.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  
  inline def Ref(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Ref")().asInstanceOf[VueDecorator]
  inline def Ref(refKey: String): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Ref")(refKey.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  
  inline def VModel(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("VModel")().asInstanceOf[VueDecorator]
  inline def VModel(options: PropOptions[Any, Any]): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("VModel")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  
  object Vue {
    
    @JSImport("vue-property-decorator", "Vue")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("vue-property-decorator", "Vue.BaseTransition")
    @js.native
    open class BaseTransition ()
      extends StObject
         with Props {
      
      /* CompleteClass */
      @JSName("$props")
      var $props: BaseTransitionProps[Any] = js.native
    }
    @JSImport("vue-property-decorator", "Vue.BaseTransition")
    @js.native
    val BaseTransition: Instantiable0[Props] = js.native
    
    @JSImport("vue-property-decorator", "Vue.Comment")
    @js.native
    val Comment: js.Symbol = js.native
    
    @JSImport("vue-property-decorator", "Vue.EffectScope")
    @js.native
    /* Excluded from this release type: active */
    /* Excluded from this release type: effects */
    /* Excluded from this release type: cleanups */
    /* Excluded from this release type: parent */
    /* Excluded from this release type: scopes */
    /* Excluded from this release type: index */
    open class EffectScope_ ()
      extends typings.vue.mod.EffectScope_ {
      def this(detached: Boolean) = this()
    }
    
    object Fragment {
      
      @JSImport("vue-property-decorator", "Vue.Fragment")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("vue-property-decorator", "Vue.Fragment.__isFragment")
      @js.native
      def isFragment: `true` = js.native
      
      inline def isFragment_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isFragment")(x.asInstanceOf[js.Any])
    }
    
    object KeepAlive {
      
      @JSImport("vue-property-decorator", "Vue.KeepAlive")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("vue-property-decorator", "Vue.KeepAlive.__isKeepAlive")
      @js.native
      def isKeepAlive: `true` = js.native
      
      inline def isKeepAlive_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isKeepAlive")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("vue-property-decorator", "Vue.ReactiveEffect")
    @js.native
    open class ReactiveEffect[T] protected ()
      extends typings.vue.mod.ReactiveEffect[T] {
      def this(fn: js.Function0[T]) = this()
      def this(fn: js.Function0[T], scheduler: EffectScheduler) = this()
      def this(fn: js.Function0[T], scheduler: Null, scope: typings.vueReactivity.mod.EffectScope_) = this()
      def this(fn: js.Function0[T], scheduler: Unit, scope: typings.vueReactivity.mod.EffectScope_) = this()
      def this(fn: js.Function0[T], scheduler: EffectScheduler, scope: typings.vueReactivity.mod.EffectScope_) = this()
    }
    
    @JSImport("vue-property-decorator", "Vue.Static")
    @js.native
    val Static: js.Symbol = js.native
    
    object Suspense {
      
      @JSImport("vue-property-decorator", "Vue.Suspense")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("vue-property-decorator", "Vue.Suspense.__isSuspense")
      @js.native
      def isSuspense: `true` = js.native
      
      inline def isSuspense_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isSuspense")(x.asInstanceOf[js.Any])
    }
    
    object Teleport {
      
      @JSImport("vue-property-decorator", "Vue.Teleport")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("vue-property-decorator", "Vue.Teleport.__isTeleport")
      @js.native
      def isTeleport: `true` = js.native
      
      inline def isTeleport_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isTeleport")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("vue-property-decorator", "Vue.Text")
    @js.native
    val Text: js.Symbol = js.native
    
    @JSImport("vue-property-decorator", "Vue.Transition")
    @js.native
    val Transition: FunctionalComponent[TransitionProps, js.Object] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("vue-property-decorator", "Vue.TransitionGroup")
    @js.native
    open class TransitionGroup ()
      extends StObject
         with typings.vueRuntimeDom.anon.Props {
      
      /* CompleteClass */
      @JSName("$props")
      var $props: TransitionGroupProps = js.native
    }
    @JSImport("vue-property-decorator", "Vue.TransitionGroup")
    @js.native
    val TransitionGroup: Instantiable0[typings.vueRuntimeDom.anon.Props] = js.native
    
    @JSImport("vue-property-decorator", "Vue.VueElement")
    @js.native
    open class VueElement protected ()
      extends typings.vue.mod.VueElement {
      def this(_def: InnerComponentDef) = this()
      def this(_def: InnerComponentDef, _props: Record[String, Any]) = this()
      def this(_def: InnerComponentDef, _props: Unit, hydrate: RootHydrateFunction) = this()
      def this(_def: InnerComponentDef, _props: Record[String, Any], hydrate: RootHydrateFunction) = this()
    }
    
    inline def callWithAsyncErrorHandling(fn: js.Array[js.Function], instance: Null, `type`: ErrorTypes): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithAsyncErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def callWithAsyncErrorHandling(fn: js.Array[js.Function], instance: Null, `type`: ErrorTypes, args: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithAsyncErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def callWithAsyncErrorHandling(fn: js.Array[js.Function], instance: ComponentInternalInstance, `type`: ErrorTypes): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithAsyncErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def callWithAsyncErrorHandling(
      fn: js.Array[js.Function],
      instance: ComponentInternalInstance,
      `type`: ErrorTypes,
      args: js.Array[Any]
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithAsyncErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def callWithAsyncErrorHandling(fn: js.Function, instance: Null, `type`: ErrorTypes): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithAsyncErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def callWithAsyncErrorHandling(fn: js.Function, instance: Null, `type`: ErrorTypes, args: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithAsyncErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def callWithAsyncErrorHandling(fn: js.Function, instance: ComponentInternalInstance, `type`: ErrorTypes): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithAsyncErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def callWithAsyncErrorHandling(fn: js.Function, instance: ComponentInternalInstance, `type`: ErrorTypes, args: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithAsyncErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def callWithErrorHandling(fn: js.Function, instance: Null, `type`: ErrorTypes): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def callWithErrorHandling(fn: js.Function, instance: Null, `type`: ErrorTypes, args: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def callWithErrorHandling(fn: js.Function, instance: ComponentInternalInstance, `type`: ErrorTypes): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def callWithErrorHandling(fn: js.Function, instance: ComponentInternalInstance, `type`: ErrorTypes, args: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("callWithErrorHandling")(fn.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cloneVNode[T, U](vnode: VNode[T, U, StringDictionary[Any]]): VNode[T, U, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vnode.asInstanceOf[js.Any]).asInstanceOf[VNode[T, U, StringDictionary[Any]]]
    inline def cloneVNode[T, U](vnode: VNode[T, U, StringDictionary[Any]], extraProps: Data & VNodeProps): VNode[T, U, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vnode.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[VNode[T, U, StringDictionary[Any]]]
    inline def cloneVNode[T, U](vnode: VNode[T, U, StringDictionary[Any]], extraProps: Data & VNodeProps, mergeRef: Boolean): VNode[T, U, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vnode.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], mergeRef.asInstanceOf[js.Any])).asInstanceOf[VNode[T, U, StringDictionary[Any]]]
    inline def cloneVNode[T, U](vnode: VNode[T, U, StringDictionary[Any]], extraProps: Null, mergeRef: Boolean): VNode[T, U, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vnode.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], mergeRef.asInstanceOf[js.Any])).asInstanceOf[VNode[T, U, StringDictionary[Any]]]
    inline def cloneVNode[T, U](vnode: VNode[T, U, StringDictionary[Any]], extraProps: Unit, mergeRef: Boolean): VNode[T, U, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneVNode")(vnode.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], mergeRef.asInstanceOf[js.Any])).asInstanceOf[VNode[T, U, StringDictionary[Any]]]
    
    inline def compile(template: String): RenderFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[RenderFunction]
    inline def compile(template: String, options: CompilerOptions): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
    inline def compile(template: HTMLElement): RenderFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[RenderFunction]
    inline def compile(template: HTMLElement, options: CompilerOptions): RenderFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RenderFunction]
    
    inline def computed[T](getter: ComputedGetter[T]): ComputedRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("computed")(getter.asInstanceOf[js.Any]).asInstanceOf[ComputedRef[T]]
    inline def computed[T](getter: ComputedGetter[T], debugOptions: DebuggerOptions): ComputedRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("computed")(getter.asInstanceOf[js.Any], debugOptions.asInstanceOf[js.Any])).asInstanceOf[ComputedRef[T]]
    inline def computed[T](options: WritableComputedOptions[T]): WritableComputedRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("computed")(options.asInstanceOf[js.Any]).asInstanceOf[WritableComputedRef[T]]
    inline def computed[T](options: WritableComputedOptions[T], debugOptions: DebuggerOptions): WritableComputedRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("computed")(options.asInstanceOf[js.Any], debugOptions.asInstanceOf[js.Any])).asInstanceOf[WritableComputedRef[T]]
    
    @JSImport("vue-property-decorator", "Vue.createApp")
    @js.native
    val createApp: CreateAppFunction[Element] = js.native
    
    inline def createBlock(`type`: ClassComponent): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Null, children: Any): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Null, children: Any, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Null,
      children: Any,
      patchFlag: Double,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Null,
      children: Any,
      patchFlag: Unit,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Null, children: Unit, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Null,
      children: Unit,
      patchFlag: Double,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Null,
      children: Unit,
      patchFlag: Unit,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Unit, children: Any): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Unit, children: Any, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Unit,
      children: Any,
      patchFlag: Double,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Unit,
      children: Any,
      patchFlag: Unit,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Unit, children: Unit, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Unit,
      children: Unit,
      patchFlag: Double,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Unit,
      children: Unit,
      patchFlag: Unit,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Record[String, Any]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Record[String, Any], children: Any): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Record[String, Any], children: Any, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Record[String, Any],
      children: Any,
      patchFlag: Double,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Record[String, Any],
      children: Any,
      patchFlag: Unit,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: ClassComponent, props: Record[String, Any], children: Unit, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Record[String, Any],
      children: Unit,
      patchFlag: Double,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: ClassComponent,
      props: Record[String, Any],
      children: Unit,
      patchFlag: Unit,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Null, children: Any): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Null, children: Any, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Null, children: Any, patchFlag: Double, dynamicProps: js.Array[String]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Null, children: Any, patchFlag: Unit, dynamicProps: js.Array[String]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Null, children: Unit, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Null, children: Unit, patchFlag: Double, dynamicProps: js.Array[String]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Null, children: Unit, patchFlag: Unit, dynamicProps: js.Array[String]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Unit, children: Any): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Unit, children: Any, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Unit, children: Any, patchFlag: Double, dynamicProps: js.Array[String]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Unit, children: Any, patchFlag: Unit, dynamicProps: js.Array[String]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Unit, children: Unit, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Unit, children: Unit, patchFlag: Double, dynamicProps: js.Array[String]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Unit, children: Unit, patchFlag: Unit, dynamicProps: js.Array[String]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Record[String, Any]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Record[String, Any], children: Any): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Record[String, Any], children: Any, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: VNodeTypes,
      props: Record[String, Any],
      children: Any,
      patchFlag: Double,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: VNodeTypes,
      props: Record[String, Any],
      children: Any,
      patchFlag: Unit,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(`type`: VNodeTypes, props: Record[String, Any], children: Unit, patchFlag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: VNodeTypes,
      props: Record[String, Any],
      children: Unit,
      patchFlag: Double,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createBlock(
      `type`: VNodeTypes,
      props: Record[String, Any],
      children: Unit,
      patchFlag: Unit,
      dynamicProps: js.Array[String]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    inline def createCommentVNode(): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommentVNode")().asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createCommentVNode(text: String): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommentVNode")(text.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createCommentVNode(text: String, asBlock: Boolean): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCommentVNode")(text.asInstanceOf[js.Any], asBlock.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createCommentVNode(text: Unit, asBlock: Boolean): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCommentVNode")(text.asInstanceOf[js.Any], asBlock.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    inline def createElementBlock(
      `type`: String | IsFragment,
      props: js.UndefOr[(Record[String, Any]) | Null],
      children: js.UndefOr[Any],
      patchFlag: js.UndefOr[Double],
      dynamicProps: js.UndefOr[js.Array[String]],
      shapeFlag: js.UndefOr[Double]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementBlock")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any], shapeFlag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    inline def createElementVNode(
      `type`: VNodeTypes | ClassComponent | js.Symbol,
      props: js.UndefOr[(Data & VNodeProps) | Null],
      children: js.UndefOr[Any],
      patchFlag: js.UndefOr[Double],
      dynamicProps: js.UndefOr[js.Array[String] | Null],
      shapeFlag: js.UndefOr[Double | ShapeFlags],
      isBlockNode: js.UndefOr[Boolean],
      needFullChildrenNormalization: js.UndefOr[Boolean]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementVNode")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any], patchFlag.asInstanceOf[js.Any], dynamicProps.asInstanceOf[js.Any], shapeFlag.asInstanceOf[js.Any], isBlockNode.asInstanceOf[js.Any], needFullChildrenNormalization.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    inline def createHydrationRenderer(options: RendererOptions[Node, Element]): HydrationRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createHydrationRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[HydrationRenderer]
    
    inline def createRenderer[HostNode, HostElement](options: RendererOptions[HostNode, HostElement]): Renderer[HostElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[Renderer[HostElement]]
    
    @JSImport("vue-property-decorator", "Vue.createSSRApp")
    @js.native
    val createSSRApp: CreateAppFunction[Element] = js.native
    
    inline def createSlots(
      slots: Record[String, SSRSlot],
      dynamicSlots: js.Array[js.UndefOr[CompiledSlotDescriptor | js.Array[CompiledSlotDescriptor]]]
    ): Record[String, SSRSlot] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSlots")(slots.asInstanceOf[js.Any], dynamicSlots.asInstanceOf[js.Any])).asInstanceOf[Record[String, SSRSlot]]
    
    inline def createStaticVNode(content: String, numberOfNodes: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStaticVNode")(content.asInstanceOf[js.Any], numberOfNodes.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    inline def createTextVNode(): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")().asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createTextVNode(text: String): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createTextVNode(text: String, flag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def createTextVNode(text: Unit, flag: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextVNode")(text.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    @JSImport("vue-property-decorator", "Vue.createVNode")
    @js.native
    val createVNode: js.Function6[
        /* type */ VNodeTypes | ClassComponent | (/* import warning: importer.ImportType#apply Failed type conversion: typeof NULL_DYNAMIC_COMPONENT */ js.Any), 
        /* props */ js.UndefOr[(Data & VNodeProps) | Null], 
        /* children */ js.UndefOr[Any], 
        /* patchFlag */ js.UndefOr[Double], 
        /* dynamicProps */ js.UndefOr[js.Array[String] | Null], 
        /* isBlockNode */ js.UndefOr[Boolean], 
        VNode[RendererNode, RendererElement, StringDictionary[Any]]
      ] = js.native
    
    inline def customRef[T](factory: CustomRefFactory[T]): Ref_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("customRef")(factory.asInstanceOf[js.Any]).asInstanceOf[Ref_[T]]
    
    inline def defineAsyncComponent[T /* <: Component[Any, Any, Any, ComputedOptions, MethodOptions] */](source: AsyncComponentLoader[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defineAsyncComponent")(source.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def defineAsyncComponent[T /* <: Component[Any, Any, Any, ComputedOptions, MethodOptions] */](source: AsyncComponentOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defineAsyncComponent")(source.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def defineComponent[Props, RawBindings](
      setup: js.Function2[
          /* props */ Props, 
          /* ctx */ SetupContext[EmitsOptions], 
          RawBindings | RenderFunction
        ]
    ): DefineComponent_[
        Props, 
        RawBindings, 
        js.Object, 
        ComputedOptions, 
        MethodOptions, 
        ComponentOptionsMixin, 
        ComponentOptionsMixin, 
        js.Object, 
        String, 
        PublicProps, 
        (Props | ExtractPropTypes[Props]) & (EmitsToProps[js.Object] | js.Object), 
        ExtractDefaultPropTypes[Props]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineComponent")(setup.asInstanceOf[js.Any]).asInstanceOf[DefineComponent_[
        Props, 
        RawBindings, 
        js.Object, 
        ComputedOptions, 
        MethodOptions, 
        ComponentOptionsMixin, 
        ComponentOptionsMixin, 
        js.Object, 
        String, 
        PublicProps, 
        (Props | ExtractPropTypes[Props]) & (EmitsToProps[js.Object] | js.Object), 
        ExtractDefaultPropTypes[Props]
      ]]
    inline def defineComponent[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: ComponentOptionsWithArrayProps[
          PropNames, 
          RawBindings, 
          D, 
          C, 
          M, 
          Mixin, 
          Extends, 
          E, 
          EE, 
          typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any] & EmitsToProps[E]
        ]
    ): DefineComponent_[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any], 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        EE, 
        PublicProps, 
        ((/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any]) | (ExtractPropTypes[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any]
        ])) & (EmitsToProps[E] | js.Object), 
        ExtractDefaultPropTypes[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineComponent")(options.asInstanceOf[js.Any]).asInstanceOf[DefineComponent_[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any], 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        EE, 
        PublicProps, 
        ((/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any]) | (ExtractPropTypes[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any]
        ])) & (EmitsToProps[E] | js.Object), 
        ExtractDefaultPropTypes[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineComponent & TopLevel[Any]
        ]
      ]]
    inline def defineComponent[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: ComponentOptionsWithObjectProps[
          PropsOptions, 
          RawBindings, 
          D, 
          C, 
          M, 
          Mixin, 
          Extends, 
          E, 
          EE, 
          ExtractPropTypes[PropsOptions] & EmitsToProps[E], 
          ExtractDefaultPropTypes[PropsOptions]
        ]
    ): DefineComponent_[
        PropsOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        EE, 
        PublicProps, 
        (PropsOptions | ExtractPropTypes[PropsOptions]) & (EmitsToProps[E] | js.Object), 
        ExtractDefaultPropTypes[PropsOptions]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineComponent")(options.asInstanceOf[js.Any]).asInstanceOf[DefineComponent_[
        PropsOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        EE, 
        PublicProps, 
        (PropsOptions | ExtractPropTypes[PropsOptions]) & (EmitsToProps[E] | js.Object), 
        ExtractDefaultPropTypes[PropsOptions]
      ]]
    inline def defineComponent[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Props & EmitsToProps[E]]
    ): DefineComponent_[
        Props, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        EE, 
        PublicProps, 
        (Props | ExtractPropTypes[Props]) & (EmitsToProps[E] | js.Object), 
        ExtractDefaultPropTypes[Props]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineComponent")(options.asInstanceOf[js.Any]).asInstanceOf[DefineComponent_[
        Props, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        EE, 
        PublicProps, 
        (Props | ExtractPropTypes[Props]) & (EmitsToProps[E] | js.Object), 
        ExtractDefaultPropTypes[Props]
      ]]
    
    inline def defineCustomElement(options: Instantiable): VueElementConstructor[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineCustomElement")(options.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[js.Object]]
    inline def defineCustomElement[Props, RawBindings](
      setup: js.Function2[
          /* props */ Props, 
          /* ctx */ SetupContext[EmitsOptions], 
          RawBindings | RenderFunction
        ]
    ): VueElementConstructor[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineCustomElement")(setup.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[Props]]
    inline def defineCustomElement[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: (ComponentOptionsWithObjectProps[
          PropsOptions, 
          RawBindings, 
          D, 
          C, 
          M, 
          Mixin, 
          Extends, 
          E, 
          EE, 
          ExtractPropTypes[PropsOptions] & EmitsToProps[E], 
          ExtractDefaultPropTypes[PropsOptions]
        ]) & Styles
    ): VueElementConstructor[ExtractPropTypes[PropsOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineCustomElement")(options.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[ExtractPropTypes[PropsOptions]]]
    inline def defineCustomElement[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: (ComponentOptionsWithArrayProps[
          PropNames, 
          RawBindings, 
          D, 
          C, 
          M, 
          Mixin, 
          Extends, 
          E, 
          EE, 
          typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineCustomElement & TopLevel[Any] & EmitsToProps[E]
        ]) & Styles
    ): VueElementConstructor[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in PropNames ]: any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineCustomElement & TopLevel[Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineCustomElement")(options.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in PropNames ]: any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineCustomElement & TopLevel[Any]
      ]]
    inline def defineCustomElement[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: (ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Props & EmitsToProps[E]]) & Styles
    ): VueElementConstructor[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineCustomElement")(options.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[Props]]
    
    inline def defineEmits[TypeEmit](): TypeEmit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineEmits")().asInstanceOf[TypeEmit]
    inline def defineEmits[E /* <: EmitsOptions */](emitOptions: E): EmitFn[E, /* keyof E */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineEmits")(emitOptions.asInstanceOf[js.Any]).asInstanceOf[EmitFn[E, /* keyof E */ String]]
    inline def defineEmits[EE /* <: String */](emitOptions: js.Array[EE]): EmitFn[
        js.Array[EE], 
        /* keyof std.Array<EE> */ find | findIndex | fill | copyWithin | entries | keys | values | includes | flatMap | flat | at | length | toString | toLocaleString | pop | push | concat | join | reverse | shift | slice | sort | splice | unshift | indexOf | lastIndexOf | every | some | forEach | map | filter | reduce | reduceRight
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineEmits")(emitOptions.asInstanceOf[js.Any]).asInstanceOf[EmitFn[
        js.Array[EE], 
        /* keyof std.Array<EE> */ find | findIndex | fill | copyWithin | entries | keys | values | includes | flatMap | flat | at | length | toString | toLocaleString | pop | push | concat | join | reverse | shift | slice | sort | splice | unshift | indexOf | lastIndexOf | every | some | forEach | map | filter | reduce | reduceRight
      ]]
    
    inline def defineExpose[Exposed /* <: Record[String, Any] */](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineExpose")().asInstanceOf[Unit]
    inline def defineExpose[Exposed /* <: Record[String, Any] */](exposed: Exposed): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineExpose")(exposed.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def defineProps[TypeProps](): TypeProps = ^.asInstanceOf[js.Dynamic].applyDynamic("defineProps")().asInstanceOf[TypeProps]
    inline def defineProps[PP /* <: ComponentObjectPropsOptions[Data] */](props: PP): ExtractPropTypes[PP] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineProps")(props.asInstanceOf[js.Any]).asInstanceOf[ExtractPropTypes[PP]]
    inline def defineProps[PropNames /* <: String */](props: js.Array[PropNames]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineProps & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineProps")(props.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in PropNames ]:? any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.defineProps & TopLevel[Any]]
    
    inline def defineSSRCustomElement(options: Instantiable): VueElementConstructor[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineSSRCustomElement")(options.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[js.Object]]
    inline def defineSSRCustomElement[Props, RawBindings](
      setup: js.Function2[
          /* props */ Props, 
          /* ctx */ SetupContext[EmitsOptions], 
          RawBindings | RenderFunction
        ]
    ): VueElementConstructor[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineSSRCustomElement")(setup.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[Props]]
    inline def defineSSRCustomElement[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: (ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Props & EmitsToProps[E]]) & Styles
    ): VueElementConstructor[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineSSRCustomElement")(options.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[Props]]
    inline def defineSSRCustomElement[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: (ComponentOptionsWithArrayProps[
          PropNames, 
          RawBindings, 
          D, 
          C, 
          M, 
          Mixin, 
          Extends, 
          E, 
          EE, 
          typings.vuePropertyDecorator.vuePropertyDecoratorStrings.apply & TopLevel[Any] & EmitsToProps[E]
        ]) & Styles
    ): VueElementConstructor[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in PropNames ]: any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.apply & TopLevel[Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineSSRCustomElement")(options.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in PropNames ]: any}
      */ typings.vuePropertyDecorator.vuePropertyDecoratorStrings.apply & TopLevel[Any]
      ]]
    inline def defineSSRCustomElement[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
      options: (ComponentOptionsWithObjectProps[
          PropsOptions, 
          RawBindings, 
          D, 
          C, 
          M, 
          Mixin, 
          Extends, 
          E, 
          EE, 
          ExtractPropTypes[PropsOptions] & EmitsToProps[E], 
          ExtractDefaultPropTypes[PropsOptions]
        ]) & Styles
    ): VueElementConstructor[ExtractPropTypes[PropsOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineSSRCustomElement")(options.asInstanceOf[js.Any]).asInstanceOf[VueElementConstructor[ExtractPropTypes[PropsOptions]]]
    
    @JSImport("vue-property-decorator", "Vue.devtools")
    @js.native
    def devtools: DevtoolsHook = js.native
    inline def devtools_=(x: DevtoolsHook): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devtools")(x.asInstanceOf[js.Any])
    
    inline def effect[T](fn: js.Function0[T]): ReactiveEffectRunner[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("effect")(fn.asInstanceOf[js.Any]).asInstanceOf[ReactiveEffectRunner[Any]]
    inline def effect[T](fn: js.Function0[T], options: ReactiveEffectOptions): ReactiveEffectRunner[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("effect")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactiveEffectRunner[Any]]
    
    inline def effectScope(): typings.vueReactivity.mod.EffectScope_ = ^.asInstanceOf[js.Dynamic].applyDynamic("effectScope")().asInstanceOf[typings.vueReactivity.mod.EffectScope_]
    inline def effectScope(detached: Boolean): typings.vueReactivity.mod.EffectScope_ = ^.asInstanceOf[js.Dynamic].applyDynamic("effectScope")(detached.asInstanceOf[js.Any]).asInstanceOf[typings.vueReactivity.mod.EffectScope_]
    
    inline def getCurrentInstance(): ComponentInternalInstance | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentInstance")().asInstanceOf[ComponentInternalInstance | Null]
    
    inline def getCurrentScope(): js.UndefOr[typings.vueReactivity.mod.EffectScope_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentScope")().asInstanceOf[js.UndefOr[typings.vueReactivity.mod.EffectScope_]]
    
    inline def getTransitionRawChildren(children: js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionRawChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
    inline def getTransitionRawChildren(
      children: js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
      keepComment: Boolean
    ): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionRawChildren")(children.asInstanceOf[js.Any], keepComment.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
    inline def getTransitionRawChildren(
      children: js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
      keepComment: Boolean,
      parentKey: String
    ): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionRawChildren")(children.asInstanceOf[js.Any], keepComment.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
    inline def getTransitionRawChildren(
      children: js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
      keepComment: Boolean,
      parentKey: js.Symbol
    ): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionRawChildren")(children.asInstanceOf[js.Any], keepComment.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
    inline def getTransitionRawChildren(
      children: js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
      keepComment: Boolean,
      parentKey: Double
    ): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionRawChildren")(children.asInstanceOf[js.Any], keepComment.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
    inline def getTransitionRawChildren(
      children: js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
      keepComment: Unit,
      parentKey: String
    ): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionRawChildren")(children.asInstanceOf[js.Any], keepComment.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
    inline def getTransitionRawChildren(
      children: js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
      keepComment: Unit,
      parentKey: js.Symbol
    ): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionRawChildren")(children.asInstanceOf[js.Any], keepComment.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
    inline def getTransitionRawChildren(
      children: js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
      keepComment: Unit,
      parentKey: Double
    ): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionRawChildren")(children.asInstanceOf[js.Any], keepComment.asInstanceOf[js.Any], parentKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
    
    inline def guardReactiveProps(): (Data & VNodeProps) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("guardReactiveProps")().asInstanceOf[(Data & VNodeProps) | Null]
    inline def guardReactiveProps(props: Data & VNodeProps): (Data & VNodeProps) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("guardReactiveProps")(props.asInstanceOf[js.Any]).asInstanceOf[(Data & VNodeProps) | Null]
    
    inline def h(`type`: String): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: String, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: String, props: Null, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: String, props: Null, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: String, props: Unit, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: String, props: Unit, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: String, props: RawProps): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: String, props: RawProps, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: String, props: RawProps, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, children: String): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, children: Boolean): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, children: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, props: Null, children: String): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, props: Null, children: Boolean): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, props: Null, children: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, props: Unit, children: String): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, props: Unit, children: Boolean): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: js.Symbol, props: Unit, children: Double): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsFragment): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsFragment, children: VNodeArrayChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsFragment, props: Null, children: VNodeArrayChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsFragment, props: Unit, children: VNodeArrayChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsFragment, props: RawProps): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsFragment, props: RawProps, children: VNodeArrayChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense, props: RawProps & SuspenseProps): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense, props: RawProps & SuspenseProps, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense, props: RawProps & SuspenseProps, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense, props: Null, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense, props: Null, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense, props: Unit, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsSuspense, props: Unit, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: IsTeleport, props: RawProps & TeleportProps, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: Component[Any, Any, Any, ComputedOptions, MethodOptions]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: Component[Any, Any, Any, ComputedOptions, MethodOptions], children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(
      `type`: Component[Any, Any, Any, ComputedOptions, MethodOptions],
      props: Null,
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: Component[Any, Any, Any, ComputedOptions, MethodOptions], props: Null, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: Constructor[Any]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(`type`: Constructor[Any], children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(
      `type`: DefineComponent_[
          js.Object, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (js.Object | ExtractPropTypes[js.Object]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[js.Object]
        ]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h(
      `type`: DefineComponent_[
          js.Object, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (js.Object | ExtractPropTypes[js.Object]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[js.Object]
        ],
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: String, props: RawProps & P, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: String, props: Null): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any], props: RawProps & P): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any],
      props: RawProps & P,
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any],
      props: RawProps & P,
      children: RawSlots
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any], props: Null): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any], props: Null, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any], props: Null, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any], props: Unit, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ComponentOptions[P, Any, Any, Any, Any, Any, Any, Any], props: Unit, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ConcreteComponent[js.Object | P, Any, Any, ComputedOptions, MethodOptions]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: ConcreteComponent[js.Object | P, Any, Any, ComputedOptions, MethodOptions],
      children: (RawProps & P) | RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: ConcreteComponent[P, Any, Any, ComputedOptions, MethodOptions],
      props: RawProps & P,
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: ConcreteComponent[P, Any, Any, ComputedOptions, MethodOptions], props: Null): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: ConcreteComponent[P, Any, Any, ComputedOptions, MethodOptions],
      props: Null,
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: ConcreteComponent[P, Any, Any, ComputedOptions, MethodOptions],
      props: Unit,
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: Constructor[P], props: RawProps & P, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: Constructor[P], props: RawProps & P, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: Constructor[P], props: Null): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: Constructor[P], props: Null, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: Constructor[P], props: Null, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: Constructor[P], props: Unit, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](`type`: Constructor[P], props: Unit, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ],
      props: RawProps & P,
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ],
      props: RawProps & P,
      children: RawSlots
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ],
      props: Null
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ],
      props: Null,
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ],
      props: Null,
      children: RawSlots
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ],
      props: Unit,
      children: RawChildren
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ],
      props: Unit,
      children: RawSlots
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E], props: RawProps & P): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E], props: RawProps & P, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E], props: RawProps & P, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E], props: Null): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E], props: Null, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E], props: Null, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E], props: Unit, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h[P, E /* <: EmitsOptions */](`type`: FunctionalComponent[P, E], props: Unit, children: RawSlots): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    inline def h_P[P](`type`: String): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h_P[P](`type`: String, children: (RawProps & P) | RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h_P[P](`type`: String, props: Null, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h_P[P](`type`: String, props: Unit, children: RawChildren): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h_P[P](`type`: Constructor[P]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h_P[P](`type`: Constructor[P], props: RawProps & P): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h_P[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ]
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any]).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def h_P[P](
      `type`: DefineComponent_[
          P, 
          js.Object, 
          js.Object, 
          ComputedOptions, 
          MethodOptions, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          String, 
          PublicProps, 
          (P | ExtractPropTypes[P]) & (EmitsToProps[js.Object] | js.Object), 
          ExtractDefaultPropTypes[P]
        ],
      props: RawProps & P
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    inline def handleError(err: Any, instance: Null, `type`: ErrorTypes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(err.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def handleError(err: Any, instance: Null, `type`: ErrorTypes, throwInDev: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(err.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], throwInDev.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def handleError(err: Any, instance: ComponentInternalInstance, `type`: ErrorTypes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(err.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def handleError(err: Any, instance: ComponentInternalInstance, `type`: ErrorTypes, throwInDev: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(err.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], throwInDev.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("vue-property-decorator", "Vue.hydrate")
    @js.native
    val hydrate: RootHydrateFunction = js.native
    
    inline def initCustomFormatter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initCustomFormatter")().asInstanceOf[Unit]
    
    inline def inject[T](key: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
    inline def inject[T](key: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def inject[T](key: InjectionKey[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
    inline def inject[T](key: InjectionKey[T], defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def inject_false[T](key: String, defaultValue: T, treatDefaultAsFactory: `false`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], treatDefaultAsFactory.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def inject_false[T](key: InjectionKey[T], defaultValue: T, treatDefaultAsFactory: `false`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], treatDefaultAsFactory.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def inject_true[T](key: String, defaultValue: T, treatDefaultAsFactory: `true`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], treatDefaultAsFactory.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def inject_true[T](key: String, defaultValue: js.Function0[T], treatDefaultAsFactory: `true`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], treatDefaultAsFactory.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def inject_true[T](key: InjectionKey[T], defaultValue: T, treatDefaultAsFactory: `true`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], treatDefaultAsFactory.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def inject_true[T](key: InjectionKey[T], defaultValue: js.Function0[T], treatDefaultAsFactory: `true`): T = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], treatDefaultAsFactory.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def isMemoSame(cached: VNode[RendererNode, RendererElement, StringDictionary[Any]], memo: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMemoSame")(cached.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isProxy(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProxy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isReactive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isReadonly(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonly")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRef[T](r: Any): /* is @vue/reactivity.@vue/reactivity.Ref<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(r.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/reactivity.@vue/reactivity.Ref<T> */ Boolean]
    inline def isRef[T](r: Ref_[T]): /* is @vue/reactivity.@vue/reactivity.Ref<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(r.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/reactivity.@vue/reactivity.Ref<T> */ Boolean]
    
    inline def isRuntimeOnly(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRuntimeOnly")().asInstanceOf[Boolean]
    
    inline def isShallow(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShallow")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isVNode(value: Any): /* is @vue/runtime-core.@vue/runtime-core.VNode<@vue/runtime-core.@vue/runtime-core.RendererNode, @vue/runtime-core.@vue/runtime-core.RendererElement, {[key: string] : any}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVNode")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/runtime-core.@vue/runtime-core.VNode<@vue/runtime-core.@vue/runtime-core.RendererNode, @vue/runtime-core.@vue/runtime-core.RendererElement, {[key: string] : any}> */ Boolean]
    
    inline def markRaw[T /* <: js.Object */](value: T): T & RawSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("markRaw")(value.asInstanceOf[js.Any]).asInstanceOf[T & RawSymbol]
    
    inline def mergeProps(args: (Data & VNodeProps)*): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeProps")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Data]
    
    inline def nextTick[T](): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")().asInstanceOf[js.Promise[Unit]]
    inline def nextTick[T](fn: js.ThisFunction0[/* this */ T, Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def normalizeClass(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeClass")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def normalizeProps(): (Record[String, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProps")().asInstanceOf[(Record[String, Any]) | Null]
    inline def normalizeProps(props: Record[String, Any]): (Record[String, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProps")(props.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | Null]
    
    inline def normalizeStyle(value: Any): js.UndefOr[NormalizedStyle | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStyle")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NormalizedStyle | String]]
    
    inline def onActivated(hook: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onActivated")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onActivated(hook: js.Function, target: ComponentInternalInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onActivated")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def onBeforeMount(hook: js.Function0[Any]): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeMount")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onBeforeMount(hook: js.Function0[Any], target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeMount")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def onBeforeUnmount(hook: js.Function0[Any]): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeUnmount")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onBeforeUnmount(hook: js.Function0[Any], target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeUnmount")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def onBeforeUpdate(hook: js.Function0[Any]): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeUpdate")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onBeforeUpdate(hook: js.Function0[Any], target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeUpdate")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def onDeactivated(hook: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDeactivated")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onDeactivated(hook: js.Function, target: ComponentInternalInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onDeactivated")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def onErrorCaptured[TError](hook: ErrorCapturedHook[TError]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorCaptured")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onErrorCaptured[TError](hook: ErrorCapturedHook[TError], target: ComponentInternalInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorCaptured")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def onMounted(hook: js.Function0[Any]): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onMounted")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onMounted(hook: js.Function0[Any], target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onMounted")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def onRenderTracked(hook: DebuggerHook): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onRenderTracked")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onRenderTracked(hook: DebuggerHook, target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onRenderTracked")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def onRenderTriggered(hook: DebuggerHook): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onRenderTriggered")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onRenderTriggered(hook: DebuggerHook, target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onRenderTriggered")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def onScopeDispose(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onScopeDispose")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onServerPrefetch(hook: js.Function0[Any]): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onServerPrefetch")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onServerPrefetch(hook: js.Function0[Any], target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onServerPrefetch")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def onUnmounted(hook: js.Function0[Any]): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onUnmounted")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onUnmounted(hook: js.Function0[Any], target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onUnmounted")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def onUpdated(hook: js.Function0[Any]): js.UndefOr[`false` | js.Function] = ^.asInstanceOf[js.Dynamic].applyDynamic("onUpdated")(hook.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`false` | js.Function]]
    inline def onUpdated(hook: js.Function0[Any], target: ComponentInternalInstance): js.UndefOr[`false` | js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("onUpdated")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false` | js.Function]]
    
    inline def openBlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openBlock")().asInstanceOf[Unit]
    inline def openBlock(disableTracking: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openBlock")(disableTracking.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def popScopeId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popScopeId")().asInstanceOf[Unit]
    
    inline def provide[T](key: String, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def provide[T](key: Double, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def provide[T](key: InjectionKey[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def proxyRefs[T /* <: js.Object */](objectWithRefs: T): ShallowUnwrapRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyRefs")(objectWithRefs.asInstanceOf[js.Any]).asInstanceOf[ShallowUnwrapRef[T]]
    
    inline def pushScopeId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pushScopeId")().asInstanceOf[Unit]
    inline def pushScopeId(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pushScopeId")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def queuePostFlushCb(cb: SchedulerJobs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queuePostFlushCb")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def reactive[T /* <: js.Object */](target: T): UnwrapNestedRefs[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(target.asInstanceOf[js.Any]).asInstanceOf[UnwrapNestedRefs[T]]
    
    inline def readonly[T /* <: js.Object */](target: T): DeepReadonly[UnwrapNestedRefs[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(target.asInstanceOf[js.Any]).asInstanceOf[DeepReadonly[UnwrapNestedRefs[T]]]
    
    inline def ref[T](): Ref_[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")().asInstanceOf[Ref_[js.UndefOr[T]]]
    inline def ref[T /* <: js.Object */](value: T): Ref_[UnwrapRef[T]] | T = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(value.asInstanceOf[js.Any]).asInstanceOf[Ref_[UnwrapRef[T]] | T]
    
    inline def ref_T_Ref_[T](value: T): Ref_[UnwrapRef[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(value.asInstanceOf[js.Any]).asInstanceOf[Ref_[UnwrapRef[T]]]
    
    inline def registerRuntimeCompiler(_compile: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRuntimeCompiler")(_compile.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("vue-property-decorator", "Vue.render")
    @js.native
    val render: RootRenderFunction[Element | ShadowRoot] = js.native
    
    inline def renderList(source: String, renderItem: js.Function2[/* value */ String, /* index */ Double, VNodeChild]): js.Array[VNodeChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderList")(source.asInstanceOf[js.Any], renderItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNodeChild]]
    inline def renderList(source: Double, renderItem: js.Function2[/* value */ Double, /* index */ Double, VNodeChild]): js.Array[VNodeChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderList")(source.asInstanceOf[js.Any], renderItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNodeChild]]
    inline def renderList[T](
      source: T,
      renderItem: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
          /* keyof T */ /* key */ String, 
          /* index */ Double, 
          VNodeChild
        ]
    ): js.Array[VNodeChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderList")(source.asInstanceOf[js.Any], renderItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNodeChild]]
    inline def renderList[T](source: js.Array[T], renderItem: js.Function2[/* value */ T, /* index */ Double, VNodeChild]): js.Array[VNodeChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderList")(source.asInstanceOf[js.Any], renderItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNodeChild]]
    inline def renderList[T](source: js.Iterable[T], renderItem: js.Function2[/* value */ T, /* index */ Double, VNodeChild]): js.Array[VNodeChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderList")(source.asInstanceOf[js.Any], renderItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[VNodeChild]]
    
    inline def renderSlot(slots: Slots, name: String): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSlot")(slots.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def renderSlot(slots: Slots, name: String, props: Unit, fallback: js.Function0[VNodeArrayChildren]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSlot")(slots.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def renderSlot(
      slots: Slots,
      name: String,
      props: Unit,
      fallback: js.Function0[VNodeArrayChildren],
      noSlotted: Boolean
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSlot")(slots.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], noSlotted.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def renderSlot(slots: Slots, name: String, props: Unit, fallback: Unit, noSlotted: Boolean): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSlot")(slots.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], noSlotted.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def renderSlot(slots: Slots, name: String, props: Data): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSlot")(slots.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def renderSlot(slots: Slots, name: String, props: Data, fallback: js.Function0[VNodeArrayChildren]): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSlot")(slots.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def renderSlot(
      slots: Slots,
      name: String,
      props: Data,
      fallback: js.Function0[VNodeArrayChildren],
      noSlotted: Boolean
    ): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSlot")(slots.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], noSlotted.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    inline def renderSlot(slots: Slots, name: String, props: Data, fallback: Unit, noSlotted: Boolean): VNode[RendererNode, RendererElement, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSlot")(slots.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], noSlotted.asInstanceOf[js.Any])).asInstanceOf[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    
    inline def resolveComponent(name: String): (ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]) | String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponent")(name.asInstanceOf[js.Any]).asInstanceOf[(ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]) | String]
    inline def resolveComponent(name: String, maybeSelfReference: Boolean): (ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]) | String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponent")(name.asInstanceOf[js.Any], maybeSelfReference.asInstanceOf[js.Any])).asInstanceOf[(ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]) | String]
    
    inline def resolveDirective(name: String): js.UndefOr[Directive[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirective")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Directive[Any, Any]]]
    
    inline def resolveDynamicComponent(component: Any): VNodeTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDynamicComponent")(component.asInstanceOf[js.Any]).asInstanceOf[VNodeTypes]
    
    inline def resolveTransitionHooks(
      vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]],
      props: BaseTransitionProps[Any],
      state: TransitionState,
      instance: ComponentInternalInstance
    ): TransitionHooks[RendererElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTransitionHooks")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[TransitionHooks[RendererElement]]
    
    inline def setBlockTracking(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBlockTracking")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setDevtoolsHook(hook: DevtoolsHook, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDevtoolsHook")(hook.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setTransitionHooks(
      vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]],
      hooks: TransitionHooks[RendererElement]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTransitionHooks")(vnode.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def shallowReactive[T /* <: js.Object */](target: T): ShallowReactive_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowReactive")(target.asInstanceOf[js.Any]).asInstanceOf[ShallowReactive_[T]]
    
    inline def shallowReadonly[T /* <: js.Object */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowReadonly")(target.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def shallowRef[T](): ShallowRef_[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowRef")().asInstanceOf[ShallowRef_[js.UndefOr[T]]]
    inline def shallowRef[T](value: T): ShallowRef_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowRef")(value.asInstanceOf[js.Any]).asInstanceOf[ShallowRef_[T]]
    
    inline def shallowRef_T_Union[T /* <: js.Object */](value: T): ShallowRef_[T] | T = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowRef")(value.asInstanceOf[js.Any]).asInstanceOf[ShallowRef_[T] | T]
    
    @JSImport("vue-property-decorator", "Vue.ssrContextKey")
    @js.native
    val ssrContextKey: js.Symbol = js.native
    
    inline def stop(runner: ReactiveEffectRunner[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(runner.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def toDisplayString(`val`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDisplayString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toHandlerKey(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHandlerKey")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toHandlers(obj: Record[String, Any]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHandlers")(obj.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
    inline def toHandlers(obj: Record[String, Any], preserveCaseIfNecessary: Boolean): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toHandlers")(obj.asInstanceOf[js.Any], preserveCaseIfNecessary.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
    
    inline def toRaw[T](observed: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toRaw")(observed.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def toRef[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, key: K): ToRef_[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toRef")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ToRef_[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]]
    inline def toRef[T /* <: js.Object */, K /* <: /* keyof T */ String */](
      `object`: T,
      key: K,
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): ToRef_[
        Exclude[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
          Unit
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toRef")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ToRef_[
        Exclude[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
          Unit
        ]
      ]]
    
    inline def toRefs[T /* <: js.Object */](`object`: T): ToRefs_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toRefs")(`object`.asInstanceOf[js.Any]).asInstanceOf[ToRefs_[T]]
    
    inline def transformVNodeArgs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transformVNodeArgs")().asInstanceOf[Unit]
    inline def transformVNodeArgs(
      transformer: js.Function2[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof _createVNode */ js.Any
          ], 
          /* instance */ ComponentInternalInstance | Null, 
          Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof _createVNode */ js.Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transformVNodeArgs")(transformer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def triggerRef(ref: Ref_[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unref[T](ref: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unref")(ref.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def unref[T](ref: Ref_[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unref")(ref.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def useAttrs(): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("useAttrs")().asInstanceOf[Data]
    
    inline def useCssModule(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCssModule")().asInstanceOf[Record[String, String]]
    inline def useCssModule(name: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCssModule")(name.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
    
    inline def useCssVars(getter: js.Function1[/* ctx */ Any, Record[String, String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useCssVars")(getter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def useSSRContext[T](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSSRContext")().asInstanceOf[js.UndefOr[T]]
    
    inline def useSlots(): Slots = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlots")().asInstanceOf[Slots]
    
    inline def useTransitionState(): TransitionState = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransitionState")().asInstanceOf[TransitionState]
    
    @JSImport("vue-property-decorator", "Vue.vModelCheckbox")
    @js.native
    val vModelCheckbox: ModelDirective[HTMLInputElement] = js.native
    
    @JSImport("vue-property-decorator", "Vue.vModelDynamic")
    @js.native
    val vModelDynamic: ObjectDirective[HTMLInputElement | HTMLSelectElement | HTMLTextAreaElement, Any] = js.native
    
    @JSImport("vue-property-decorator", "Vue.vModelRadio")
    @js.native
    val vModelRadio: ModelDirective[HTMLInputElement] = js.native
    
    @JSImport("vue-property-decorator", "Vue.vModelSelect")
    @js.native
    val vModelSelect: ModelDirective[HTMLSelectElement] = js.native
    
    @JSImport("vue-property-decorator", "Vue.vModelText")
    @js.native
    val vModelText: ModelDirective[HTMLInputElement | HTMLTextAreaElement] = js.native
    
    @JSImport("vue-property-decorator", "Vue.vShow")
    @js.native
    val vShow: ObjectDirective[VShowElement, Any] = js.native
    
    @JSImport("vue-property-decorator", "Vue.version")
    @js.native
    val version: String = js.native
    
    inline def warn(msg: String, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(msg.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def watchEffect(effect: WatchEffect_): WatchStopHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("watchEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[WatchStopHandle]
    inline def watchEffect(effect: WatchEffect_, options: WatchOptionsBase): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watchEffect")(effect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    
    inline def watchPostEffect(effect: WatchEffect_): WatchStopHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPostEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[WatchStopHandle]
    inline def watchPostEffect(effect: WatchEffect_, options: DebuggerOptions): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watchPostEffect")(effect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    
    inline def watchSyncEffect(effect: WatchEffect_): WatchStopHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("watchSyncEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[WatchStopHandle]
    inline def watchSyncEffect(effect: WatchEffect_, options: DebuggerOptions): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watchSyncEffect")(effect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    
    inline def watch_false[T /* <: ReadonlyMultiWatchSources */, Immediate /* <: Boolean */](source: T, cb: WatchCallback[MapSources[T, `false`], MapSources[T, Immediate]]): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    inline def watch_false[T /* <: ReadonlyMultiWatchSources */, Immediate /* <: Boolean */](
      source: T,
      cb: WatchCallback[MapSources[T, `false`], MapSources[T, Immediate]],
      options: WatchOptions[Immediate]
    ): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    inline def watch_false[T /* <: MultiWatchSources */, Immediate /* <: Boolean */](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
      cb: WatchCallback[MapSources[T, `false`], MapSources[T, Immediate]]
    ): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(sources.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    inline def watch_false[T /* <: MultiWatchSources */, Immediate /* <: Boolean */](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
      cb: WatchCallback[MapSources[T, `false`], MapSources[T, Immediate]],
      options: WatchOptions[Immediate]
    ): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(sources.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    
    inline def watch_true[T /* <: js.Object */, Immediate /* <: Boolean */](source: T, cb: WatchCallback[T, js.UndefOr[T]]): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    inline def watch_true[T /* <: js.Object */, Immediate /* <: Boolean */](source: T, cb: WatchCallback[T, js.UndefOr[T]], options: WatchOptions[Immediate]): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    inline def watch_true[T, Immediate /* <: Boolean */](source: WatchSource[T], cb: WatchCallback[T, js.UndefOr[T]]): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    inline def watch_true[T, Immediate /* <: Boolean */](source: WatchSource[T], cb: WatchCallback[T, js.UndefOr[T]], options: WatchOptions[Immediate]): WatchStopHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(source.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WatchStopHandle]
    
    inline def withCtx(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("withCtx")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def withCtx(fn: js.Function, ctx: Null, isNonScopedSlot: Boolean): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("withCtx")(fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], isNonScopedSlot.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def withCtx(fn: js.Function, ctx: Unit, isNonScopedSlot: Boolean): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("withCtx")(fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], isNonScopedSlot.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def withCtx(fn: js.Function, ctx: ComponentInternalInstance): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("withCtx")(fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def withCtx(fn: js.Function, ctx: ComponentInternalInstance, isNonScopedSlot: Boolean): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("withCtx")(fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], isNonScopedSlot.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    inline def withDefaults[Props, Defaults /* <: InferDefaults[Props] */](props: Props, defaults: Defaults): PropsWithDefaults[Props, Defaults] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDefaults")(props.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[PropsWithDefaults[Props, Defaults]]
    
    inline def withDirectives[T /* <: VNode[RendererNode, RendererElement, StringDictionary[Any]] */](vnode: T, directives: DirectiveArguments): T = (^.asInstanceOf[js.Dynamic].applyDynamic("withDirectives")(vnode.asInstanceOf[js.Any], directives.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def withKeys(fn: js.Function, modifiers: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("withKeys")(fn.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ KeyboardEvent, Any]]
    
    inline def withMemo(
      memo: js.Array[Any],
      render: js.Function0[VNode[Any, Any, StringDictionary[Any]]],
      cache: js.Array[Any],
      index: Double
    ): VNode[Any, Any, StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withMemo")(memo.asInstanceOf[js.Any], render.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[VNode[Any, Any, StringDictionary[Any]]]
    
    inline def withModifiers(fn: js.Function, modifiers: js.Array[String]): js.Function2[/* event */ Event, /* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("withModifiers")(fn.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* event */ Event, /* repeated */ Any, Any]]
    
    inline def withScopeId(_id: String): js.Function3[
        /* fn */ js.Function, 
        /* ctx */ js.UndefOr[ComponentInternalInstance | Null], 
        /* isNonScopedSlot */ js.UndefOr[Boolean], 
        js.Function
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScopeId")(_id.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
        /* fn */ js.Function, 
        /* ctx */ js.UndefOr[ComponentInternalInstance | Null], 
        /* isNonScopedSlot */ js.UndefOr[Boolean], 
        js.Function
      ]]
    
    // Note: this file is auto concatenated to the end of the bundled d.ts during
    // build.
    object vueReactivityAugmentingMod {
      
      trait RefUnwrapBailTypes extends StObject {
        
        var runtimeDOMBailTypes: Node | Window
      }
      object RefUnwrapBailTypes {
        
        inline def apply(runtimeDOMBailTypes: Node | Window): RefUnwrapBailTypes = {
          val __obj = js.Dynamic.literal(runtimeDOMBailTypes = runtimeDOMBailTypes.asInstanceOf[js.Any])
          __obj.asInstanceOf[RefUnwrapBailTypes]
        }
        
        extension [Self <: RefUnwrapBailTypes](x: Self) {
          
          inline def setRuntimeDOMBailTypes(value: Node | Window): Self = StObject.set(x, "runtimeDOMBailTypes", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  inline def Watch(path: String): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(path.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def Watch(path: String, options: WatchOptions[Boolean]): VueDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueDecorator]
}
