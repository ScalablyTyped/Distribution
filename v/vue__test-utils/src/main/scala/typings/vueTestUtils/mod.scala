package typings.vueTestUtils

import typings.std.InstanceType
import typings.std.Node
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import typings.vueRuntimeCore.mod.AllowedComponentProps
import typings.vueRuntimeCore.mod.App
import typings.vueRuntimeCore.mod.ComponentCustomProperties
import typings.vueRuntimeCore.mod.ComponentCustomProps
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComponentOptionsWithArrayProps
import typings.vueRuntimeCore.mod.ComponentOptionsWithObjectProps
import typings.vueRuntimeCore.mod.ComponentOptionsWithoutProps
import typings.vueRuntimeCore.mod.ComponentPropsOptions
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.Data
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.EmitsOptions
import typings.vueRuntimeCore.mod.EmitsToProps
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.ExtractPropTypes
import typings.vueRuntimeCore.mod.FunctionalComponent
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.PublicProps
import typings.vueRuntimeCore.mod.ResolveProps
import typings.vueRuntimeCore.mod.VNodeProps
import typings.vueShared.mod.Prettify
import typings.vueTestUtils.anon.Custom
import typings.vueTestUtils.anon.CustomBoolean
import typings.vueTestUtils.anon.DefaultProps
import typings.vueTestUtils.anon.Emit
import typings.vueTestUtils.anon.Instantiable
import typings.vueTestUtils.anon.RegisterHooks
import typings.vueTestUtils.anon.VccOpts
import typings.vueTestUtils.distBaseWrapperMod.default
import typings.vueTestUtils.distConfigMod.GlobalConfigOptions
import typings.vueTestUtils.distMountMod.ComponentMountingOptions
import typings.vueTestUtils.distTypesMod.MountingOptions
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.$emit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@vue/test-utils", "BaseWrapper")
  @js.native
  open class BaseWrapper[ElementType /* <: Node */] protected () extends default[ElementType] {
    /* protected */ def this(element: ElementType) = this()
  }
  
  @JSImport("@vue/test-utils", "DOMWrapper")
  @js.native
  open class DOMWrapper[NodeType /* <: Node */] ()
    extends typings.vueTestUtils.distDomWrapperMod.DOMWrapper[NodeType] {
    def this(element: NodeType) = this()
  }
  
  @JSImport("@vue/test-utils", "RouterLinkStub")
  @js.native
  val RouterLinkStub: DefineComponent_[
    Custom, 
    Any, 
    Any, 
    js.Object, 
    js.Object, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    VNodeProps & AllowedComponentProps & ComponentCustomProps, 
    js.Object, 
    CustomBoolean, 
    js.Object
  ] = js.native
  
  @JSImport("@vue/test-utils", "VueWrapper")
  @js.native
  open class VueWrapper[T /* <: (Omit[
    ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ], 
    $emit | (/* keyof @vue/runtime-core.@vue/runtime-core.ComponentCustomProperties */ String)
  ]) & Emit & ComponentCustomProperties */] protected ()
    extends typings.vueTestUtils.distVueWrapperMod.VueWrapper[T] {
    def this(app: Null, vm: T) = this()
    def this(app: App[Any], vm: T) = this()
    def this(app: Null, vm: T, setProps: js.Function1[/* props */ Record[String, Any], Unit]) = this()
    def this(app: App[Any], vm: T, setProps: js.Function1[/* props */ Record[String, Any], Unit]) = this()
  }
  
  @JSImport("@vue/test-utils", "config")
  @js.native
  val config: GlobalConfigOptions = js.native
  
  inline def createWrapperError[T /* <: js.Object */](
    wrapperType: typings.vueTestUtils.vueTestUtilsStrings.DOMWrapper | typings.vueTestUtils.vueTestUtilsStrings.VueWrapper
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrapperError")(wrapperType.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def disableAutoUnmount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoUnmount")().asInstanceOf[Unit]
  
  inline def enableAutoUnmount(hook: js.Function1[/* callback */ js.Function0[Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAutoUnmount")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def flushPromises(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flushPromises")().asInstanceOf[js.Promise[Any]]
  
  inline def mount[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    Any, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    ResolveProps[Any, js.Object], 
    ExtractDefaultPropTypes[Any], 
    js.Object
  ] */](component: T): typings.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]]]
  inline def mount[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    Any, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    ResolveProps[Any, js.Object], 
    ExtractDefaultPropTypes[Any], 
    js.Object
  ] */](component: T, options: ComponentMountingOptions[T]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]]]
  inline def mount[V /* <: js.Object */](originalComponent: RegisterHooks[V]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[V /* <: js.Object */](
    originalComponent: RegisterHooks[V],
    options: (MountingOptions[Any, js.Object]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[V /* <: js.Object */](originalComponent: VccOpts[V]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[V /* <: js.Object */](originalComponent: VccOpts[V], options: (MountingOptions[Any, js.Object]) & (Record[String, Any])): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[Props /* <: js.Object */, E /* <: EmitsOptions */](originalComponent: FunctionalComponent[Props, E, Any]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[Props /* <: js.Object */, E /* <: EmitsOptions */](
    originalComponent: FunctionalComponent[Props, E, Any],
    options: (MountingOptions[Props & typings.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[V /* <: js.Object */, P](originalComponent: DefaultProps[V]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[V /* <: js.Object */, P](
    originalComponent: DefaultProps[V],
    options: (MountingOptions[P & typings.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[V /* <: js.Object */, P](originalComponent: Instantiable[V, P]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[V /* <: js.Object */, P](
    originalComponent: Instantiable[V, P],
    options: (MountingOptions[P & typings.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Prettify[ExtractPropTypes[PropsOptions] & EmitsToProps[Extends]], 
      ExtractDefaultPropTypes[PropsOptions]
    ]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Prettify[ExtractPropTypes[PropsOptions] & EmitsToProps[Extends]], 
      ExtractDefaultPropTypes[PropsOptions]
    ],
    options: MountingOptions[ExtractPropTypes[PropsOptions] & typings.vueTestUtils.distMountMod.PublicProps, D]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Props & EmitsToProps[Extends]
    ]
  ): (typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]) & (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[(typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]) & (Record[String, Any])]
  inline def mount[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Props & EmitsToProps[Extends]
    ],
    options: MountingOptions[Props & typings.vueTestUtils.distMountMod.PublicProps, D]
  ): (typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]) & (Record[String, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]) & (Record[String, Any])]
  inline def mount[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[
      PropNames, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      Props, 
      String, 
      js.Object, 
      Prettify[
        (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[Extends]
      ]
    ]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[
      PropNames, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      Props, 
      String, 
      js.Object, 
      Prettify[
        (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[Extends]
      ]
    ],
    options: MountingOptions[Props & typings.vueTestUtils.distMountMod.PublicProps, D]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def mount[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults, js.Object],
    options: (MountingOptions[
      Partial[Defaults] & (Omit[Props & typings.vueTestUtils.distMountMod.PublicProps, /* keyof Defaults */ String]), 
      D
    ]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[
        PropsOrPropOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        EmitsOptions, 
        EE, 
        PP, 
        Props, 
        Defaults, 
        js.Object
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[
        PropsOrPropOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        EmitsOptions, 
        EE, 
        PP, 
        Props, 
        Defaults, 
        js.Object
      ]
    ]
  ]]
  
  inline def mount_PropsOrPropOptionsRawBindingsDCMMixinExtendsEEEPPPropsDefaults[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults, js.Object]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[
        PropsOrPropOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        EmitsOptions, 
        EE, 
        PP, 
        Props, 
        Defaults, 
        js.Object
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[
        PropsOrPropOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        EmitsOptions, 
        EE, 
        PP, 
        Props, 
        Defaults, 
        js.Object
      ]
    ]
  ]]
  
  inline def renderToString[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    Any, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    ResolveProps[Any, js.Object], 
    ExtractDefaultPropTypes[Any], 
    js.Object
  ] */](component: T): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(component.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    Any, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    ResolveProps[Any, js.Object], 
    ExtractDefaultPropTypes[Any], 
    js.Object
  ] */](component: T, options: typings.vueTestUtils.distRenderToStringMod.ComponentMountingOptions[T]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */](originalComponent: RegisterHooks[V]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */](
    originalComponent: RegisterHooks[V],
    options: (MountingOptions[Any, js.Object]) & (Record[String, Any])
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */](originalComponent: VccOpts[V]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */](originalComponent: VccOpts[V], options: (MountingOptions[Any, js.Object]) & (Record[String, Any])): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[Props /* <: js.Object */, E /* <: EmitsOptions */](originalComponent: FunctionalComponent[Props, E, Any]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[Props /* <: js.Object */, E /* <: EmitsOptions */](
    originalComponent: FunctionalComponent[Props, E, Any],
    options: (MountingOptions[Props & typings.vueTestUtils.distRenderToStringMod.PublicProps, js.Object]) & (Record[String, Any])
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */, P](originalComponent: DefaultProps[V]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */, P](
    originalComponent: DefaultProps[V],
    options: (MountingOptions[P & typings.vueTestUtils.distRenderToStringMod.PublicProps, js.Object]) & (Record[String, Any])
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */, P](originalComponent: Instantiable[V, P]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */, P](
    originalComponent: Instantiable[V, P],
    options: (MountingOptions[P & typings.vueTestUtils.distRenderToStringMod.PublicProps, js.Object]) & (Record[String, Any])
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Prettify[ExtractPropTypes[PropsOptions] & EmitsToProps[Extends]], 
      ExtractDefaultPropTypes[PropsOptions]
    ]
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Prettify[ExtractPropTypes[PropsOptions] & EmitsToProps[Extends]], 
      ExtractDefaultPropTypes[PropsOptions]
    ],
    options: MountingOptions[
      ExtractPropTypes[PropsOptions] & typings.vueTestUtils.distRenderToStringMod.PublicProps, 
      D
    ]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Props & EmitsToProps[Extends]
    ]
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Props & EmitsToProps[Extends]
    ],
    options: MountingOptions[Props & typings.vueTestUtils.distRenderToStringMod.PublicProps, D]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[
      PropNames, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      Props, 
      String, 
      js.Object, 
      Prettify[
        (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[Extends]
      ]
    ]
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[
      PropNames, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      Props, 
      String, 
      js.Object, 
      Prettify[
        (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[Extends]
      ]
    ],
    options: MountingOptions[Props & typings.vueTestUtils.distRenderToStringMod.PublicProps, D]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults, js.Object],
    options: (MountingOptions[
      Partial[Defaults] & (Omit[
        Props & typings.vueTestUtils.distRenderToStringMod.PublicProps, 
        /* keyof Defaults */ String
      ]), 
      D
    ]) & (Record[String, Any])
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def renderToString_PropsOrPropOptionsRawBindingsDCMMixinExtendsEEEPPPropsDefaults[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults, js.Object]
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(component.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def shallowMount[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    Any, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    ResolveProps[Any, js.Object], 
    ExtractDefaultPropTypes[Any], 
    js.Object
  ] */](component: T): typings.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]]]
  inline def shallowMount[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    Any, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    ResolveProps[Any, js.Object], 
    ExtractDefaultPropTypes[Any], 
    js.Object
  ] */](component: T, options: ComponentMountingOptions[T]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]]]
  inline def shallowMount[V /* <: js.Object */](originalComponent: RegisterHooks[V]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */](
    originalComponent: RegisterHooks[V],
    options: (MountingOptions[Any, js.Object]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */](originalComponent: VccOpts[V]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */](originalComponent: VccOpts[V], options: (MountingOptions[Any, js.Object]) & (Record[String, Any])): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[Props /* <: js.Object */, E /* <: EmitsOptions */](originalComponent: FunctionalComponent[Props, E, Any]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[Props /* <: js.Object */, E /* <: EmitsOptions */](
    originalComponent: FunctionalComponent[Props, E, Any],
    options: (MountingOptions[Props & typings.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */, P](originalComponent: DefaultProps[V]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */, P](
    originalComponent: DefaultProps[V],
    options: (MountingOptions[P & typings.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */, P](originalComponent: Instantiable[V, P]): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */, P](
    originalComponent: Instantiable[V, P],
    options: (MountingOptions[P & typings.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Prettify[ExtractPropTypes[PropsOptions] & EmitsToProps[Extends]], 
      ExtractDefaultPropTypes[PropsOptions]
    ]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Prettify[ExtractPropTypes[PropsOptions] & EmitsToProps[Extends]], 
      ExtractDefaultPropTypes[PropsOptions]
    ],
    options: MountingOptions[ExtractPropTypes[PropsOptions] & typings.vueTestUtils.distMountMod.PublicProps, D]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Props & EmitsToProps[Extends]
    ]
  ): (typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]) & (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[(typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]) & (Record[String, Any])]
  inline def shallowMount[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      js.Object, 
      String, 
      js.Object, 
      Props & EmitsToProps[Extends]
    ],
    options: MountingOptions[Props & typings.vueTestUtils.distMountMod.PublicProps, D]
  ): (typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]) & (Record[String, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]) & (Record[String, Any])]
  inline def shallowMount[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[
      PropNames, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      Props, 
      String, 
      js.Object, 
      Prettify[
        (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[Extends]
      ]
    ]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[
      PropNames, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      Props, 
      String, 
      js.Object, 
      Prettify[
        (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[Extends]
      ]
    ],
    options: MountingOptions[Props & typings.vueTestUtils.distMountMod.PublicProps, D]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ]]
  inline def shallowMount[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults, js.Object],
    options: (MountingOptions[
      Partial[Defaults] & (Omit[Props & typings.vueTestUtils.distMountMod.PublicProps, /* keyof Defaults */ String]), 
      D
    ]) & (Record[String, Any])
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[
        PropsOrPropOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        EmitsOptions, 
        EE, 
        PP, 
        Props, 
        Defaults, 
        js.Object
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[
        PropsOrPropOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        EmitsOptions, 
        EE, 
        PP, 
        Props, 
        Defaults, 
        js.Object
      ]
    ]
  ]]
  
  inline def shallowMount_PropsOrPropOptionsRawBindingsDCMMixinExtendsEEEPPPropsDefaults[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults, js.Object]
  ): typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[
        PropsOrPropOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        EmitsOptions, 
        EE, 
        PP, 
        Props, 
        Defaults, 
        js.Object
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[typings.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[
        PropsOrPropOptions, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        EmitsOptions, 
        EE, 
        PP, 
        Props, 
        Defaults, 
        js.Object
      ]
    ]
  ]]
}
