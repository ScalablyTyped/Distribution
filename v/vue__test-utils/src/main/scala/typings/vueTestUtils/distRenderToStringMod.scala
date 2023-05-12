package typings.vueTestUtils

import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import typings.vueRuntimeCore.mod.AllowedComponentProps
import typings.vueRuntimeCore.mod.ComponentCustomProps
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComponentOptionsWithArrayProps
import typings.vueRuntimeCore.mod.ComponentOptionsWithObjectProps
import typings.vueRuntimeCore.mod.ComponentOptionsWithoutProps
import typings.vueRuntimeCore.mod.ComponentPropsOptions
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.Data
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.EmitsOptions
import typings.vueRuntimeCore.mod.EmitsToProps
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.ExtractPropTypes
import typings.vueRuntimeCore.mod.FunctionalComponent
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.ResolveProps
import typings.vueRuntimeCore.mod.VNodeProps
import typings.vueShared.mod.Prettify
import typings.vueTestUtils.anon.DefaultProps
import typings.vueTestUtils.anon.Instantiable
import typings.vueTestUtils.anon.RegisterHooks
import typings.vueTestUtils.anon.VccOpts
import typings.vueTestUtils.distTypesMod.MountingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRenderToStringMod {
  
  @JSImport("@vue/test-utils/dist/renderToString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    typings.vueRuntimeCore.mod.PublicProps, 
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
    typings.vueRuntimeCore.mod.PublicProps, 
    ResolveProps[Any, js.Object], 
    ExtractDefaultPropTypes[Any], 
    js.Object
  ] */](component: T, options: ComponentMountingOptions[T]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
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
    options: (MountingOptions[Props & PublicProps, js.Object]) & (Record[String, Any])
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */, P](originalComponent: DefaultProps[V]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */, P](
    originalComponent: DefaultProps[V],
    options: (MountingOptions[P & PublicProps, js.Object]) & (Record[String, Any])
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */, P](originalComponent: Instantiable[V, P]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def renderToString[V /* <: js.Object */, P](
    originalComponent: Instantiable[V, P],
    options: (MountingOptions[P & PublicProps, js.Object]) & (Record[String, Any])
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
    options: MountingOptions[ExtractPropTypes[PropsOptions] & PublicProps, D]
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
    options: MountingOptions[Props & PublicProps, D]
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
    options: MountingOptions[Props & PublicProps, D]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def renderToString[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults, js.Object],
    options: (MountingOptions[Partial[Defaults] & (Omit[Props & PublicProps, /* keyof Defaults */ String]), D]) & (Record[String, Any])
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def renderToString_PropsOrPropOptionsRawBindingsDCMMixinExtendsEEEPPPropsDefaults[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults, js.Object]
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(component.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends @vue/runtime-core.@vue/runtime-core.DefineComponent<infer PropsOrPropOptions, any, infer D, any, any, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, {}, string, @vue/runtime-core.@vue/runtime-core.PublicProps, @vue/runtime-core.@vue/runtime-core.ResolveProps<infer PropsOrPropOptions, {}>, @vue/runtime-core.@vue/runtime-core.ExtractDefaultPropTypes<infer PropsOrPropOptions>, {}> ? @vue/test-utils.@vue/test-utils/dist/types.MountingOptions<std.Partial<@vue/runtime-core.@vue/runtime-core.ExtractDefaultPropTypes<PropsOrPropOptions>> & std.Omit<std.Readonly<@vue/runtime-core.@vue/runtime-core.ExtractPropTypes<PropsOrPropOptions>> & @vue/test-utils.@vue/test-utils/dist/renderToString.PublicProps, keyof @vue/runtime-core.@vue/runtime-core.ExtractDefaultPropTypes<PropsOrPropOptions>>, D> & std.Record<string, any> : @vue/test-utils.@vue/test-utils/dist/types.MountingOptions<any, {}>
    }}}
    */
  type ComponentMountingOptions[T] = MountingOptions[Any, js.Object]
  
  trait PublicProps
    extends StObject
       with VNodeProps
       with AllowedComponentProps
       with ComponentCustomProps
  object PublicProps {
    
    inline def apply(): PublicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicProps]
    }
  }
}
