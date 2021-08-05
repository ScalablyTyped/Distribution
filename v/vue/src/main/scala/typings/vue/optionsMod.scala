package typings.vue

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.Error
import typings.std.HTMLElement
import typings.std.Record
import typings.std.ThisType
import typings.vue.anon.Default
import typings.vue.anon.Event
import typings.vue.vnodeMod.NormalizedScopedSlot
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeData
import typings.vue.vueMod.CombinedVueInstance
import typings.vue.vueMod.CreateElement
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  type Accessors[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typings.vue.vueStrings.Accessors & TopLevel[js.Any]
  
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ String]
  
  type AsyncComponent[Data, Methods, Computed, Props] = (AsyncComponentPromise[Data, Methods, Computed, Props]) | (AsyncComponentFactory[Data, Methods, Computed, Props])
  
  type AsyncComponentFactory[Data, Methods, Computed, Props] = js.Function0[typings.vue.anon.Component[Data, Methods, Computed, Props]]
  
  type AsyncComponentPromise[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[/* component */ Component[Data, Methods, Computed, Props], Unit], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
    (js.Promise[
      (Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]) | EsModuleComponent
    ]) | Unit
  ]
  
  type Component[Data, Methods, Computed, Props] = VueConstructor[Vue] | (FunctionalComponentOptions[Props, PropsDefinition[Props]]) | (ComponentOptions[scala.Nothing, Data, Methods, Computed, Props, DefaultProps])
  
  trait ComponentOptions[V /* <: Vue */, Data, Methods, Computed, PropsDef, Props] extends StObject {
    
    var activated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeCreate: js.UndefOr[js.ThisFunction0[/* this */ V, Unit]] = js.undefined
    
    var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeMount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var comments: js.UndefOr[Boolean] = js.undefined
    
    var components: js.UndefOr[
        StringDictionary[
          (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
        ]
      ] = js.undefined
    
    var computed: js.UndefOr[Accessors[Computed]] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var data: js.UndefOr[Data] = js.undefined
    
    var deactivated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var destroyed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var directives: js.UndefOr[StringDictionary[DirectiveFunction | DirectiveOptions]] = js.undefined
    
    var el: js.UndefOr[Element | String] = js.undefined
    
    var errorCaptured: js.UndefOr[js.Function3[/* err */ Error, /* vm */ Vue, /* info */ String, Boolean | Unit]] = js.undefined
    
    // TODO: support properly inferred 'extends'
    var `extends`: js.UndefOr[
        (ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]) | VueConstructor[Vue]
      ] = js.undefined
    
    var filters: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    var inheritAttrs: js.UndefOr[Boolean] = js.undefined
    
    var inject: js.UndefOr[InjectOptions] = js.undefined
    
    var methods: js.UndefOr[Methods] = js.undefined
    
    var mixins: js.UndefOr[
        js.Array[
          (ComponentOptions[
            Vue, 
            DefaultData[Vue], 
            DefaultMethods[Vue], 
            DefaultComputed, 
            PropsDefinition[DefaultProps], 
            DefaultProps
          ]) | VueConstructor[Vue]
        ]
      ] = js.undefined
    
    var model: js.UndefOr[Event] = js.undefined
    
    var mounted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[Vue] = js.undefined
    
    var props: js.UndefOr[PropsDef] = js.undefined
    
    var propsData: js.UndefOr[js.Object] = js.undefined
    
    var provide: js.UndefOr[js.Object | js.Function0[js.Object]] = js.undefined
    
    // hack is for functional component type inference, should not be used in user code
    var render: js.UndefOr[
        js.Function2[/* createElement */ CreateElement, /* hack */ RenderContext[Props], VNode]
      ] = js.undefined
    
    var renderError: js.UndefOr[js.Function2[/* createElement */ CreateElement, /* err */ Error, VNode]] = js.undefined
    
    var serverPrefetch: js.UndefOr[js.ThisFunction0[/* this */ V, js.Promise[Unit]]] = js.undefined
    
    var staticRenderFns: js.UndefOr[js.Array[js.Function1[/* createElement */ CreateElement, VNode]]] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var transitions: js.UndefOr[StringDictionary[js.Object]] = js.undefined
    
    var updated: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var watch: js.UndefOr[Record[String, WatchOptionsWithHandler[js.Any] | WatchHandler[js.Any] | String]] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply[V /* <: Vue */, Data, Methods, Computed, PropsDef, Props](): ComponentOptions[V, Data, Methods, Computed, PropsDef, Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V, Data, Methods, Computed, PropsDef, Props]]
    }
    
    extension [Self <: ComponentOptions[?, ?, ?, ?, ?, ?], V /* <: Vue */, Data, Methods, Computed, PropsDef, Props](x: Self & (ComponentOptions[V, Data, Methods, Computed, PropsDef, Props])) {
      
      inline def setActivated(value: () => Unit): Self = StObject.set(x, "activated", js.Any.fromFunction0(value))
      
      inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
      
      inline def setBeforeCreate(value: js.ThisFunction0[/* this */ V, Unit]): Self = StObject.set(x, "beforeCreate", value.asInstanceOf[js.Any])
      
      inline def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
      
      inline def setBeforeDestroy(value: () => Unit): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
      
      inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
      
      inline def setBeforeMount(value: () => Unit): Self = StObject.set(x, "beforeMount", js.Any.fromFunction0(value))
      
      inline def setBeforeMountUndefined: Self = StObject.set(x, "beforeMount", js.undefined)
      
      inline def setBeforeUpdate(value: () => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction0(value))
      
      inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setComponents(
        value: StringDictionary[
              (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
            ]
      ): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComputed(value: Accessors[Computed]): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
      
      inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDeactivated(value: () => Unit): Self = StObject.set(x, "deactivated", js.Any.fromFunction0(value))
      
      inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
      
      inline def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setDestroyed(value: () => Unit): Self = StObject.set(x, "destroyed", js.Any.fromFunction0(value))
      
      inline def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
      
      inline def setDirectives(value: StringDictionary[DirectiveFunction | DirectiveOptions]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setEl(value: Element | String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setErrorCaptured(value: (/* err */ Error, /* vm */ Vue, /* info */ String) => Boolean | Unit): Self = StObject.set(x, "errorCaptured", js.Any.fromFunction3(value))
      
      inline def setErrorCapturedUndefined: Self = StObject.set(x, "errorCaptured", js.undefined)
      
      inline def setExtends(
        value: (ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps], 
              DefaultProps
            ]) | VueConstructor[Vue]
      ): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setFilters(value: StringDictionary[js.Function]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setInheritAttrs(value: Boolean): Self = StObject.set(x, "inheritAttrs", value.asInstanceOf[js.Any])
      
      inline def setInheritAttrsUndefined: Self = StObject.set(x, "inheritAttrs", js.undefined)
      
      inline def setInject(value: InjectOptions): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value :_*))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMixins(
        value: js.Array[
              (ComponentOptions[
                Vue, 
                DefaultData[Vue], 
                DefaultMethods[Vue], 
                DefaultComputed, 
                PropsDefinition[DefaultProps], 
                DefaultProps
              ]) | VueConstructor[Vue]
            ]
      ): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(
        value: ((ComponentOptions[
              Vue, 
              DefaultData[Vue], 
              DefaultMethods[Vue], 
              DefaultComputed, 
              PropsDefinition[DefaultProps], 
              DefaultProps
            ]) | VueConstructor[Vue])*
      ): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      inline def setModel(value: Event): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setMounted(value: () => Unit): Self = StObject.set(x, "mounted", js.Any.fromFunction0(value))
      
      inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent(value: Vue): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setProps(value: PropsDef): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsData(value: js.Object): Self = StObject.set(x, "propsData", value.asInstanceOf[js.Any])
      
      inline def setPropsDataUndefined: Self = StObject.set(x, "propsData", js.undefined)
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setProvide(value: js.Object | js.Function0[js.Object]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setProvideFunction0(value: () => js.Object): Self = StObject.set(x, "provide", js.Any.fromFunction0(value))
      
      inline def setProvideUndefined: Self = StObject.set(x, "provide", js.undefined)
      
      inline def setRender(value: (/* createElement */ CreateElement, /* hack */ RenderContext[Props]) => VNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderError(value: (/* createElement */ CreateElement, /* err */ Error) => VNode): Self = StObject.set(x, "renderError", js.Any.fromFunction2(value))
      
      inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setServerPrefetch(value: js.ThisFunction0[/* this */ V, js.Promise[Unit]]): Self = StObject.set(x, "serverPrefetch", value.asInstanceOf[js.Any])
      
      inline def setServerPrefetchUndefined: Self = StObject.set(x, "serverPrefetch", js.undefined)
      
      inline def setStaticRenderFns(value: js.Array[js.Function1[/* createElement */ CreateElement, VNode]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      inline def setStaticRenderFnsUndefined: Self = StObject.set(x, "staticRenderFns", js.undefined)
      
      inline def setStaticRenderFnsVarargs(value: (js.Function1[/* createElement */ CreateElement, VNode])*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTransitions(value: StringDictionary[js.Object]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setUpdated(value: () => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction0(value))
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      
      inline def setWatch(value: Record[String, WatchOptionsWithHandler[js.Any] | WatchHandler[js.Any] | String]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait ComputedOptions[T] extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var get: js.UndefOr[js.Function0[T]] = js.undefined
    
    var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  }
  object ComputedOptions {
    
    inline def apply[T](): ComputedOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputedOptions[T]]
    }
    
    extension [Self <: ComputedOptions[?], T](x: Self & ComputedOptions[T]) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setSet(value: /* value */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  type DataDef[Data, Props, V] = Data | (js.ThisFunction0[/* this */ Props & V, Data])
  
  type DefaultComputed = StringDictionary[js.Any]
  
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  
  type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  
  type DefaultProps = Record[String, js.Any]
  
  /* Inlined parent std.Readonly<vue.vue/types/vnode.VNodeDirective> */
  trait DirectiveBinding extends StObject {
    
    val arg: js.UndefOr[String] = js.undefined
    
    val expression: js.UndefOr[js.Any] = js.undefined
    
    val modifiers: StringDictionary[Boolean]
    
    val name: String
    
    val oldArg: js.UndefOr[String] = js.undefined
    
    val oldValue: js.UndefOr[js.Any] = js.undefined
    
    val value: js.UndefOr[js.Any] = js.undefined
  }
  object DirectiveBinding {
    
    inline def apply(modifiers: StringDictionary[Boolean], name: String): DirectiveBinding = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectiveBinding]
    }
    
    extension [Self <: DirectiveBinding](x: Self) {
      
      inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      inline def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setModifiers(value: StringDictionary[Boolean]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOldArg(value: String): Self = StObject.set(x, "oldArg", value.asInstanceOf[js.Any])
      
      inline def setOldArgUndefined: Self = StObject.set(x, "oldArg", js.undefined)
      
      inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type DirectiveFunction = js.Function4[
    /* el */ HTMLElement, 
    /* binding */ DirectiveBinding, 
    /* vnode */ VNode, 
    /* oldVnode */ VNode, 
    Unit
  ]
  
  trait DirectiveOptions extends StObject {
    
    var bind: js.UndefOr[DirectiveFunction] = js.undefined
    
    var componentUpdated: js.UndefOr[DirectiveFunction] = js.undefined
    
    var inserted: js.UndefOr[DirectiveFunction] = js.undefined
    
    var unbind: js.UndefOr[DirectiveFunction] = js.undefined
    
    var update: js.UndefOr[DirectiveFunction] = js.undefined
  }
  object DirectiveOptions {
    
    inline def apply(): DirectiveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectiveOptions]
    }
    
    extension [Self <: DirectiveOptions](x: Self) {
      
      inline def setBind(
        value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "bind", js.Any.fromFunction4(value))
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setComponentUpdated(
        value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "componentUpdated", js.Any.fromFunction4(value))
      
      inline def setComponentUpdatedUndefined: Self = StObject.set(x, "componentUpdated", js.undefined)
      
      inline def setInserted(
        value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "inserted", js.Any.fromFunction4(value))
      
      inline def setInsertedUndefined: Self = StObject.set(x, "inserted", js.undefined)
      
      inline def setUnbind(
        value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "unbind", js.Any.fromFunction4(value))
      
      inline def setUnbindUndefined: Self = StObject.set(x, "unbind", js.undefined)
      
      inline def setUpdate(
        value: (/* el */ HTMLElement, /* binding */ DirectiveBinding, /* vnode */ VNode, /* oldVnode */ VNode) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait EsModuleComponent extends StObject {
    
    var default: Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
  }
  object EsModuleComponent {
    
    inline def apply(
      default: Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
    ): EsModuleComponent = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsModuleComponent]
    }
    
    extension [Self <: EsModuleComponent](x: Self) {
      
      inline def setDefault(
        value: Component[
              DefaultData[scala.Nothing], 
              DefaultMethods[scala.Nothing], 
              DefaultComputed, 
              DefaultProps
            ]
      ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionalComponentOptions[Props, PropDefs] extends StObject {
    
    var functional: Boolean
    
    var inject: js.UndefOr[InjectOptions] = js.undefined
    
    var model: js.UndefOr[Event] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[PropDefs] = js.undefined
    
    var render: js.UndefOr[
        js.ThisFunction2[
          /* this */ Unit, 
          /* createElement */ CreateElement, 
          /* context */ RenderContext[Props], 
          VNode | js.Array[VNode]
        ]
      ] = js.undefined
  }
  object FunctionalComponentOptions {
    
    inline def apply[Props, PropDefs](functional: Boolean): FunctionalComponentOptions[Props, PropDefs] = {
      val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
    }
    
    extension [Self <: FunctionalComponentOptions[?, ?], Props, PropDefs](x: Self & (FunctionalComponentOptions[Props, PropDefs])) {
      
      inline def setFunctional(value: Boolean): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
      
      inline def setInject(value: InjectOptions): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setInjectVarargs(value: String*): Self = StObject.set(x, "inject", js.Array(value :_*))
      
      inline def setModel(value: Event): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProps(value: PropDefs): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRender(
        value: js.ThisFunction2[
              /* this */ Unit, 
              /* createElement */ CreateElement, 
              /* context */ RenderContext[Props], 
              VNode | js.Array[VNode]
            ]
      ): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  type InjectKey = String | js.Symbol
  
  type InjectOptions = (StringDictionary[InjectKey | Default]) | js.Array[String]
  
  /* Rewritten from type alias, can be one of: 
    - js.Function0[T]
    - typings.vue.anon.Instantiable[T]
    - typings.vue.anon.InstantiableFunction
  */
  type Prop[T] = _Prop[T] | js.Function0[T]
  
  trait PropOptions[T] extends StObject {
    
    var default: js.UndefOr[T | Null | (js.Function0[js.UndefOr[T | Null]])] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[PropType[T]] = js.undefined
    
    var validator: js.UndefOr[js.Function1[/* value */ T, Boolean]] = js.undefined
  }
  object PropOptions {
    
    inline def apply[T](): PropOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropOptions[T]]
    }
    
    extension [Self <: PropOptions[?], T](x: Self & PropOptions[T]) {
      
      inline def setDefault(value: T | (js.Function0[js.UndefOr[T | Null]])): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultFunction0(value: () => js.UndefOr[T | Null]): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: PropType[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction0(value: () => T): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: Prop[T]*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      inline def setValidator(value: /* value */ T => Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  type PropType[T] = Prop[T] | js.Array[Prop[T]]
  
  type PropValidator[T] = PropOptions[T] | PropType[T]
  
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: vue.vue/types/options.PropValidator<T[K]>}
    */ typings.vue.vueStrings.RecordPropsDefinition & TopLevel[T]
  
  trait RenderContext[Props] extends StObject {
    
    var children: js.Array[VNode]
    
    var data: VNodeData
    
    var injections: js.Any
    
    var listeners: StringDictionary[js.Function | js.Array[js.Function]]
    
    var parent: Vue
    
    var props: Props
    
    var scopedSlots: StringDictionary[NormalizedScopedSlot]
    
    def slots(): js.Any
  }
  object RenderContext {
    
    inline def apply[Props](
      children: js.Array[VNode],
      data: VNodeData,
      injections: js.Any,
      listeners: StringDictionary[js.Function | js.Array[js.Function]],
      parent: Vue,
      props: Props,
      scopedSlots: StringDictionary[NormalizedScopedSlot],
      slots: () => js.Any
    ): RenderContext[Props] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], injections = injections.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scopedSlots = scopedSlots.asInstanceOf[js.Any], slots = js.Any.fromFunction0(slots))
      __obj.asInstanceOf[RenderContext[Props]]
    }
    
    extension [Self <: RenderContext[?], Props](x: Self & RenderContext[Props]) {
      
      inline def setChildren(value: js.Array[VNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: VNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setData(value: VNodeData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInjections(value: js.Any): Self = StObject.set(x, "injections", value.asInstanceOf[js.Any])
      
      inline def setListeners(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Vue): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setScopedSlots(value: StringDictionary[NormalizedScopedSlot]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
      
      inline def setSlots(value: () => js.Any): Self = StObject.set(x, "slots", js.Any.fromFunction0(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait ThisTypedComponentOptionsWithArrayProps[V /* <: Vue */, Data, Methods, Computed, PropNames /* <: String */]
    extends StObject
       with ComponentOptions[
          V, 
          DataDef[Data, Record[PropNames, js.Any], V], 
          Methods, 
          Computed, 
          js.Array[PropNames], 
          Record[PropNames, js.Any]
        ]
       with ThisType[CombinedVueInstance[V, Data, Methods, Computed, Record[PropNames, js.Any]]]
  object ThisTypedComponentOptionsWithArrayProps {
    
    inline def apply[V /* <: Vue */, Data, Methods, Computed, PropNames /* <: String */](): ThisTypedComponentOptionsWithArrayProps[V, Data, Methods, Computed, PropNames] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThisTypedComponentOptionsWithArrayProps[V, Data, Methods, Computed, PropNames]]
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait ThisTypedComponentOptionsWithRecordProps[V /* <: Vue */, Data, Methods, Computed, Props]
    extends StObject
       with ComponentOptions[V, DataDef[Data, Props, V], Methods, Computed, RecordPropsDefinition[Props], Props]
       with ThisType[CombinedVueInstance[V, Data, Methods, Computed, Props]]
  object ThisTypedComponentOptionsWithRecordProps {
    
    inline def apply[V /* <: Vue */, Data, Methods, Computed, Props](): ThisTypedComponentOptionsWithRecordProps[V, Data, Methods, Computed, Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThisTypedComponentOptionsWithRecordProps[V, Data, Methods, Computed, Props]]
    }
  }
  
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, Unit]
  
  trait WatchOptions extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var immediate: js.UndefOr[Boolean] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    extension [Self <: WatchOptions](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    }
  }
  
  trait WatchOptionsWithHandler[T]
    extends StObject
       with WatchOptions {
    
    def handler(`val`: T, oldVal: T): Unit
    @JSName("handler")
    var handler_Original: WatchHandler[T]
  }
  object WatchOptionsWithHandler {
    
    inline def apply[T](handler: (T, T) => Unit): WatchOptionsWithHandler[T] = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler))
      __obj.asInstanceOf[WatchOptionsWithHandler[T]]
    }
    
    extension [Self <: WatchOptionsWithHandler[?], T](x: Self & WatchOptionsWithHandler[T]) {
      
      inline def setHandler(value: (T, T) => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    }
  }
  
  trait _Prop[T] extends StObject
}
