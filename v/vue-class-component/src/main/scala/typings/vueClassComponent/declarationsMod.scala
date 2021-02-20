package typings.vueClassComponent

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import typings.vue.anon.StaticRenderFns
import typings.vue.optionsMod.AsyncComponent
import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.DirectiveFunction
import typings.vue.optionsMod.DirectiveOptions
import typings.vue.optionsMod.FunctionalComponentOptions
import typings.vue.optionsMod.PropsDefinition
import typings.vue.optionsMod.RecordPropsDefinition
import typings.vue.optionsMod.ThisTypedComponentOptionsWithArrayProps
import typings.vue.optionsMod.ThisTypedComponentOptionsWithRecordProps
import typings.vue.pluginMod.PluginFunction
import typings.vue.pluginMod.PluginObject
import typings.vue.vueMod.CombinedVueInstance
import typings.vue.vueMod.ExtendedVue
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConfiguration
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationsMod {
  
  /* Inlined vue-class-component.vue-class-component/lib/declarations.VueClass<vue.vue.default> & {  __decorators__ :std.Array<(options : vue.vue.ComponentOptions<vue.vue.default, vue.vue/types/options.DefaultData<vue.vue.default>, vue.vue/types/options.DefaultMethods<vue.vue.default>, vue.vue/types/options.DefaultComputed, vue.vue/types/options.PropsDefinition<vue.vue/types/options.DefaultProps>, vue.vue/types/options.DefaultProps>): void> | undefined} */
  @js.native
  trait DecoratedClass
    extends // ideally, the return type should just contain Props, not Record<keyof Props, any>. But TS requires to have Base constructors with the same return type.
  Instantiable0[
          CombinedVueInstance[Vue, js.Object, js.Object, js.Object, Record[/* keyof object */ String, js.Any]]
        ]
       with Instantiable1[
          (/* args (repeated) */ js.Any) | (/* options */ ComponentOptions[
            Vue, 
            DefaultData[Vue], 
            DefaultMethods[Vue], 
            DefaultComputed, 
            PropsDefinition[DefaultProps], 
            DefaultProps
          ]) | (/* options */ ThisTypedComponentOptionsWithArrayProps[Vue, js.Object, js.Object, js.Object, String]) | (/* options */ ThisTypedComponentOptionsWithRecordProps[Vue, js.Object, js.Object, js.Object, js.Object]), 
          (CombinedVueInstance[Vue, js.Object, js.Object, js.Object, Record[/* keyof object */ String, js.Any]]) | Vue
        ] {
    
    var __decorators__ : js.UndefOr[
        js.Array[
          js.Function1[
            /* options */ ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps], 
              DefaultProps
            ], 
            Unit
          ]
        ]
      ] = js.native
    
    def compile(template: String): StaticRenderFns = js.native
    
    def component(id: String): ExtendedVue[Vue, js.Object, js.Object, js.Object, js.Object] = js.native
    def component(
      id: String,
      definition: ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): ExtendedVue[Vue, js.Object, js.Object, js.Object, js.Object] = js.native
    def component[VC /* <: VueConstructor[Vue] */](id: String, constructor: VC): VC = js.native
    def component[Props](id: String, definition: FunctionalComponentOptions[Props, RecordPropsDefinition[Props]]): ExtendedVue[Vue, js.Object, js.Object, js.Object, Props] = js.native
    def component[Data, Methods, Computed, Props](id: String, definition: AsyncComponent[Data, Methods, Computed, Props]): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](id: String): ExtendedVue[Vue, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("component")
    def component_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](
      id: String,
      definition: ThisTypedComponentOptionsWithArrayProps[Vue, Data, Methods, Computed, PropNames]
    ): ExtendedVue[Vue, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("component")
    def component_DataMethodsComputedProps[Data, Methods, Computed, Props](id: String): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_DataMethodsComputedProps[Data, Methods, Computed, Props](
      id: String,
      definition: ThisTypedComponentOptionsWithRecordProps[Vue, Data, Methods, Computed, Props]
    ): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_PropNames_String[PropNames /* <: String */](id: String, definition: FunctionalComponentOptions[Record[PropNames, _], js.Array[PropNames]]): ExtendedVue[Vue, js.Object, js.Object, js.Object, Record[PropNames, _]] = js.native
    @JSName("component")
    def component_VueConstructor(id: String): VueConstructor[Vue] = js.native
    
    var config: VueConfiguration = js.native
    
    def delete(`object`: js.Object, key: String): Unit = js.native
    def delete(`object`: js.Object, key: Double): Unit = js.native
    def delete[T](array: js.Array[T], key: Double): Unit = js.native
    
    def directive(id: String): DirectiveOptions = js.native
    def directive(id: String, definition: DirectiveFunction): DirectiveOptions = js.native
    def directive(id: String, definition: DirectiveOptions): DirectiveOptions = js.native
    
    def extend(): ExtendedVue[Vue, js.Object, js.Object, js.Object, js.Object] = js.native
    def extend(
      options: ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): ExtendedVue[Vue, js.Object, js.Object, js.Object, js.Object] = js.native
    def extend[Props](definition: FunctionalComponentOptions[Props, RecordPropsDefinition[Props]]): ExtendedVue[Vue, js.Object, js.Object, js.Object, Props] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](): ExtendedVue[Vue, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](options: ThisTypedComponentOptionsWithArrayProps[Vue, Data, Methods, Computed, PropNames]): ExtendedVue[Vue, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](options: ThisTypedComponentOptionsWithRecordProps[Vue, Data, Methods, Computed, Props]): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("extend")
    def extend_PropNames_String[PropNames /* <: String */](definition: FunctionalComponentOptions[Record[PropNames, _], js.Array[PropNames]]): ExtendedVue[Vue, js.Object, js.Object, js.Object, Record[PropNames, _]] = js.native
    
    def filter(id: String): js.Function = js.native
    def filter(id: String, definition: js.Function): js.Function = js.native
    
    def mixin(
      mixin: ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): VueConstructor[Vue] = js.native
    def mixin(mixin: VueConstructor[Vue]): VueConstructor[Vue] = js.native
    
    def nextTick(): js.Promise[Unit] = js.native
    def nextTick[T](callback: js.ThisFunction0[/* this */ T, Unit]): Unit = js.native
    def nextTick[T](callback: js.ThisFunction0[/* this */ T, Unit], context: T): Unit = js.native
    
    def observable[T](obj: T): T = js.native
    
    def set[T](array: js.Array[T], key: Double, value: T): T = js.native
    def set[T](`object`: js.Object, key: String, value: T): T = js.native
    def set[T](`object`: js.Object, key: Double, value: T): T = js.native
    
    def use(plugin: PluginFunction[_], options: js.Any*): VueConstructor[Vue] = js.native
    def use(plugin: PluginObject[_], options: js.Any*): VueConstructor[Vue] = js.native
    def use[T](plugin: PluginFunction[T]): VueConstructor[Vue] = js.native
    def use[T](plugin: PluginFunction[T], options: T): VueConstructor[Vue] = js.native
    def use[T](plugin: PluginObject[T]): VueConstructor[Vue] = js.native
    def use[T](plugin: PluginObject[T], options: T): VueConstructor[Vue] = js.native
    
    var version: String = js.native
  }
  
  /* Inlined {new (args : ...any): V & vue.vue.default} & vue.vue/types/vue.VueConstructor<vue.vue/types/vue.Vue> */
  @js.native
  trait VueClass[V]
    extends // ideally, the return type should just contain Props, not Record<keyof Props, any>. But TS requires to have Base constructors with the same return type.
  Instantiable0[
          CombinedVueInstance[Vue, js.Object, js.Object, js.Object, Record[/* keyof object */ String, js.Any]]
        ]
       with Instantiable1[
          (/* args (repeated) */ js.Any) | (/* options */ ComponentOptions[
            Vue, 
            DefaultData[Vue], 
            DefaultMethods[Vue], 
            DefaultComputed, 
            PropsDefinition[DefaultProps], 
            DefaultProps
          ]) | (/* options */ ThisTypedComponentOptionsWithArrayProps[Vue, js.Object, js.Object, js.Object, String]) | (/* options */ ThisTypedComponentOptionsWithRecordProps[Vue, js.Object, js.Object, js.Object, js.Object]), 
          (V with Vue) | (CombinedVueInstance[Vue, js.Object, js.Object, js.Object, Record[/* keyof object */ String, js.Any]])
        ] {
    
    def compile(template: String): StaticRenderFns = js.native
    
    def component(id: String): ExtendedVue[Vue, js.Object, js.Object, js.Object, js.Object] = js.native
    def component(
      id: String,
      definition: ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): ExtendedVue[Vue, js.Object, js.Object, js.Object, js.Object] = js.native
    def component[VC /* <: VueConstructor[Vue] */](id: String, constructor: VC): VC = js.native
    def component[Props](id: String, definition: FunctionalComponentOptions[Props, RecordPropsDefinition[Props]]): ExtendedVue[Vue, js.Object, js.Object, js.Object, Props] = js.native
    def component[Data, Methods, Computed, Props](id: String, definition: AsyncComponent[Data, Methods, Computed, Props]): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](id: String): ExtendedVue[Vue, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("component")
    def component_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](
      id: String,
      definition: ThisTypedComponentOptionsWithArrayProps[Vue, Data, Methods, Computed, PropNames]
    ): ExtendedVue[Vue, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("component")
    def component_DataMethodsComputedProps[Data, Methods, Computed, Props](id: String): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_DataMethodsComputedProps[Data, Methods, Computed, Props](
      id: String,
      definition: ThisTypedComponentOptionsWithRecordProps[Vue, Data, Methods, Computed, Props]
    ): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_PropNames_String[PropNames /* <: String */](id: String, definition: FunctionalComponentOptions[Record[PropNames, _], js.Array[PropNames]]): ExtendedVue[Vue, js.Object, js.Object, js.Object, Record[PropNames, _]] = js.native
    @JSName("component")
    def component_VueConstructor(id: String): VueConstructor[Vue] = js.native
    
    var config: VueConfiguration = js.native
    
    def delete(`object`: js.Object, key: String): Unit = js.native
    def delete(`object`: js.Object, key: Double): Unit = js.native
    def delete[T](array: js.Array[T], key: Double): Unit = js.native
    
    def directive(id: String): DirectiveOptions = js.native
    def directive(id: String, definition: DirectiveFunction): DirectiveOptions = js.native
    def directive(id: String, definition: DirectiveOptions): DirectiveOptions = js.native
    
    def extend(): ExtendedVue[Vue, js.Object, js.Object, js.Object, js.Object] = js.native
    def extend(
      options: ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): ExtendedVue[Vue, js.Object, js.Object, js.Object, js.Object] = js.native
    def extend[Props](definition: FunctionalComponentOptions[Props, RecordPropsDefinition[Props]]): ExtendedVue[Vue, js.Object, js.Object, js.Object, Props] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](): ExtendedVue[Vue, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](options: ThisTypedComponentOptionsWithArrayProps[Vue, Data, Methods, Computed, PropNames]): ExtendedVue[Vue, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](options: ThisTypedComponentOptionsWithRecordProps[Vue, Data, Methods, Computed, Props]): ExtendedVue[Vue, Data, Methods, Computed, Props] = js.native
    @JSName("extend")
    def extend_PropNames_String[PropNames /* <: String */](definition: FunctionalComponentOptions[Record[PropNames, _], js.Array[PropNames]]): ExtendedVue[Vue, js.Object, js.Object, js.Object, Record[PropNames, _]] = js.native
    
    def filter(id: String): js.Function = js.native
    def filter(id: String, definition: js.Function): js.Function = js.native
    
    def mixin(
      mixin: ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): VueConstructor[Vue] = js.native
    def mixin(mixin: VueConstructor[Vue]): VueConstructor[Vue] = js.native
    
    def nextTick(): js.Promise[Unit] = js.native
    def nextTick[T](callback: js.ThisFunction0[/* this */ T, Unit]): Unit = js.native
    def nextTick[T](callback: js.ThisFunction0[/* this */ T, Unit], context: T): Unit = js.native
    
    def observable[T](obj: T): T = js.native
    
    def set[T](array: js.Array[T], key: Double, value: T): T = js.native
    def set[T](`object`: js.Object, key: String, value: T): T = js.native
    def set[T](`object`: js.Object, key: Double, value: T): T = js.native
    
    def use(plugin: PluginFunction[_], options: js.Any*): VueConstructor[Vue] = js.native
    def use(plugin: PluginObject[_], options: js.Any*): VueConstructor[Vue] = js.native
    def use[T](plugin: PluginFunction[T]): VueConstructor[Vue] = js.native
    def use[T](plugin: PluginFunction[T], options: T): VueConstructor[Vue] = js.native
    def use[T](plugin: PluginObject[T]): VueConstructor[Vue] = js.native
    def use[T](plugin: PluginObject[T], options: T): VueConstructor[Vue] = js.native
    
    var version: String = js.native
  }
}
