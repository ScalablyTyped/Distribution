package typings.vue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Error
import typings.std.Record
import typings.vue.anon.Event
import typings.vue.vnodeMod.VNode
import typings.vue.vueMod.CreateElement
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentOptions[V /* <: Vue */, Data, Methods, Computed, PropsDef, Props] extends js.Object {
  
  var activated: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeCreate: js.UndefOr[js.ThisFunction0[/* this */ V, Unit]] = js.native
  
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
  var comments: js.UndefOr[Boolean] = js.native
  
  var components: js.UndefOr[StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])]] = js.native
  
  var computed: js.UndefOr[Accessors[Computed]] = js.native
  
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  
  var data: js.UndefOr[Data] = js.native
  
  var deactivated: js.UndefOr[js.Function0[Unit]] = js.native
  
  var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var directives: js.UndefOr[StringDictionary[DirectiveFunction | DirectiveOptions]] = js.native
  
  var el: js.UndefOr[Element | String] = js.native
  
  var errorCaptured: js.UndefOr[js.Function3[/* err */ Error, /* vm */ Vue, /* info */ String, Boolean | Unit]] = js.native
  
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
  ] = js.native
  
  var filters: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var inheritAttrs: js.UndefOr[Boolean] = js.native
  
  var inject: js.UndefOr[InjectOptions] = js.native
  
  var methods: js.UndefOr[Methods] = js.native
  
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
  ] = js.native
  
  var model: js.UndefOr[Event] = js.native
  
  var mounted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[Vue] = js.native
  
  var props: js.UndefOr[PropsDef] = js.native
  
  var propsData: js.UndefOr[js.Object] = js.native
  
  var provide: js.UndefOr[js.Object | js.Function0[js.Object]] = js.native
  
  // hack is for functional component type inference, should not be used in user code
  var render: js.UndefOr[
    js.Function2[/* createElement */ CreateElement, /* hack */ RenderContext[Props], VNode]
  ] = js.native
  
  var renderError: js.UndefOr[js.Function2[/* createElement */ CreateElement, /* err */ Error, VNode]] = js.native
  
  var serverPrefetch: js.UndefOr[js.ThisFunction0[/* this */ V, js.Promise[Unit]]] = js.native
  
  var staticRenderFns: js.UndefOr[js.Array[js.Function1[/* createElement */ CreateElement, VNode]]] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var transitions: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  var updated: js.UndefOr[js.Function0[Unit]] = js.native
  
  var watch: js.UndefOr[Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String]] = js.native
}
object ComponentOptions {
  
  @scala.inline
  def apply[V /* <: Vue */, Data, Methods, Computed, PropsDef, Props](): ComponentOptions[V, Data, Methods, Computed, PropsDef, Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[V, Data, Methods, Computed, PropsDef, Props]]
  }
  
  @scala.inline
  implicit class ComponentOptionsOps[Self <: ComponentOptions[_, _, _, _, _, _], V /* <: Vue */, Data, Methods, Computed, PropsDef, Props] (val x: Self with (ComponentOptions[V, Data, Methods, Computed, PropsDef, Props])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivated(value: () => Unit): Self = this.set("activated", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteActivated: Self = this.set("activated", js.undefined)
    
    @scala.inline
    def setBeforeCreate(value: js.ThisFunction0[/* this */ V, Unit]): Self = this.set("beforeCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeCreate: Self = this.set("beforeCreate", js.undefined)
    
    @scala.inline
    def setBeforeDestroy(value: () => Unit): Self = this.set("beforeDestroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeDestroy: Self = this.set("beforeDestroy", js.undefined)
    
    @scala.inline
    def setBeforeMount(value: () => Unit): Self = this.set("beforeMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeMount: Self = this.set("beforeMount", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: () => Unit): Self = this.set("beforeUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeUpdate: Self = this.set("beforeUpdate", js.undefined)
    
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setComponents(value: StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setComputed(value: Accessors[Computed]): Self = this.set("computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputed: Self = this.set("computed", js.undefined)
    
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDeactivated(value: () => Unit): Self = this.set("deactivated", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDeactivated: Self = this.set("deactivated", js.undefined)
    
    @scala.inline
    def setDelimiters(value: js.Tuple2[String, String]): Self = this.set("delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiters: Self = this.set("delimiters", js.undefined)
    
    @scala.inline
    def setDestroyed(value: () => Unit): Self = this.set("destroyed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroyed: Self = this.set("destroyed", js.undefined)
    
    @scala.inline
    def setDirectives(value: StringDictionary[DirectiveFunction | DirectiveOptions]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setEl(value: Element | String): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setErrorCaptured(value: (/* err */ Error, /* vm */ Vue, /* info */ String) => Boolean | Unit): Self = this.set("errorCaptured", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteErrorCaptured: Self = this.set("errorCaptured", js.undefined)
    
    @scala.inline
    def setExtends(
      value: (ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]) | VueConstructor[Vue]
    ): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    
    @scala.inline
    def setFilters(value: StringDictionary[js.Function]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setInheritAttrs(value: Boolean): Self = this.set("inheritAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritAttrs: Self = this.set("inheritAttrs", js.undefined)
    
    @scala.inline
    def setInjectVarargs(value: String*): Self = this.set("inject", js.Array(value :_*))
    
    @scala.inline
    def setInject(value: InjectOptions): Self = this.set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    
    @scala.inline
    def setMethods(value: Methods): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setMixinsVarargs(
      value: ((ComponentOptions[
          Vue, 
          DefaultData[Vue], 
          DefaultMethods[Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]) | VueConstructor[Vue])*
    ): Self = this.set("mixins", js.Array(value :_*))
    
    @scala.inline
    def setMixins(
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
    ): Self = this.set("mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    
    @scala.inline
    def setModel(value: Event): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setMounted(value: () => Unit): Self = this.set("mounted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMounted: Self = this.set("mounted", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: Vue): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProps(value: PropsDef): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setPropsData(value: js.Object): Self = this.set("propsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropsData: Self = this.set("propsData", js.undefined)
    
    @scala.inline
    def setProvideFunction0(value: () => js.Object): Self = this.set("provide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProvide(value: js.Object | js.Function0[js.Object]): Self = this.set("provide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvide: Self = this.set("provide", js.undefined)
    
    @scala.inline
    def setRender(value: (/* createElement */ CreateElement, /* hack */ RenderContext[Props]) => VNode): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRenderError(value: (/* createElement */ CreateElement, /* err */ Error) => VNode): Self = this.set("renderError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderError: Self = this.set("renderError", js.undefined)
    
    @scala.inline
    def setServerPrefetch(value: js.ThisFunction0[/* this */ V, js.Promise[Unit]]): Self = this.set("serverPrefetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerPrefetch: Self = this.set("serverPrefetch", js.undefined)
    
    @scala.inline
    def setStaticRenderFnsVarargs(value: (js.Function1[/* createElement */ CreateElement, VNode])*): Self = this.set("staticRenderFns", js.Array(value :_*))
    
    @scala.inline
    def setStaticRenderFns(value: js.Array[js.Function1[/* createElement */ CreateElement, VNode]]): Self = this.set("staticRenderFns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticRenderFns: Self = this.set("staticRenderFns", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTransitions(value: StringDictionary[js.Object]): Self = this.set("transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
    
    @scala.inline
    def setUpdated(value: () => Unit): Self = this.set("updated", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setWatch(value: Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String]): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
