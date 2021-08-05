package typings.vueTestUtils

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import typings.std.ThisType
import typings.vue.optionsMod.Component
import typings.vue.optionsMod.ComponentOptions
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.optionsMod.FunctionalComponentOptions
import typings.vue.optionsMod.PropsDefinition
import typings.vue.vnodeMod.VNodeData
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vueTestUtils.anon.Args
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@vue/test-utils", "RouterLinkStub")
  @js.native
  class RouterLinkStub protected ()
    extends StObject
       with Vue {
    def this(args: js.Any*) = this()
  }
  @JSImport("@vue/test-utils", "RouterLinkStub")
  @js.native
  def RouterLinkStub: VueClass[Vue] = js.native
  inline def RouterLinkStub_=(x: VueClass[Vue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RouterLinkStub")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/test-utils", "config")
  @js.native
  def config: VueTestUtilsConfigOptions = js.native
  inline def config_=(x: VueTestUtilsConfigOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
  
  inline def createLocalVue(): VueConstructor[Vue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVue")().asInstanceOf[VueConstructor[Vue]]
  
  inline def createWrapper(node: HTMLElement): Wrapper[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrapper")(node.asInstanceOf[js.Any]).asInstanceOf[Wrapper[Null]]
  inline def createWrapper(node: HTMLElement, options: WrapperOptions): Wrapper[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrapper")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapper[Null]]
  inline def createWrapper(node: Vue): Wrapper[Vue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrapper")(node.asInstanceOf[js.Any]).asInstanceOf[Wrapper[Vue]]
  inline def createWrapper(node: Vue, options: WrapperOptions): Wrapper[Vue] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWrapper")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapper[Vue]]
  
  inline def enableAutoDestroy(hook: js.Function1[/* repeated */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAutoDestroy")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mount[V /* <: Vue */](
    component: ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): Wrapper[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[Wrapper[V]]
  inline def mount[V /* <: Vue */](
    component: ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ],
    options: ThisTypedMountOptions[V]
  ): Wrapper[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapper[V]]
  inline def mount[V /* <: Vue */](component: VueClass[V]): Wrapper[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[Wrapper[V]]
  inline def mount[V /* <: Vue */](component: VueClass[V], options: ThisTypedMountOptions[V]): Wrapper[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapper[V]]
  inline def mount[Props, PropDefs](component: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[Wrapper[Vue]]
  inline def mount[Props, PropDefs](component: FunctionalComponentOptions[Props, PropDefs], options: MountOptions[Vue]): Wrapper[Vue] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapper[Vue]]
  
  inline def resetAutoDestroyState(hook: js.Function1[/* repeated */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetAutoDestroyState")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shallowMount[V /* <: Vue */](
    component: ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]
  ): Wrapper[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[Wrapper[V]]
  inline def shallowMount[V /* <: Vue */](
    component: ComponentOptions[
      V, 
      DefaultData[V], 
      DefaultMethods[V], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ],
    options: ThisTypedShallowMountOptions[V]
  ): Wrapper[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapper[V]]
  inline def shallowMount[V /* <: Vue */](component: VueClass[V]): Wrapper[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[Wrapper[V]]
  inline def shallowMount[V /* <: Vue */](component: VueClass[V], options: ThisTypedShallowMountOptions[V]): Wrapper[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapper[V]]
  inline def shallowMount[Props, PropDefs](component: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[Wrapper[Vue]]
  inline def shallowMount[Props, PropDefs](component: FunctionalComponentOptions[Props, PropDefs], options: ShallowMountOptions[Vue]): Wrapper[Vue] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Wrapper[Vue]]
  
  /**
    * Base class of Wrapper and WrapperArray
    * It has common methods on both Wrapper and WrapperArray
    */
  @js.native
  trait BaseWrapper extends StObject {
    
    def attributes(): StringDictionary[String] = js.native
    def attributes(key: String): String | Unit = js.native
    
    def classes(): js.Array[String] = js.native
    def classes(className: String): Boolean = js.native
    
    def contains(selector: Selector): Boolean = js.native
    
    def destroy(): Unit = js.native
    
    def exists(): Boolean = js.native
    
    def is(selector: Selector): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isVisible(): Boolean = js.native
    
    def isVueInstance(): Boolean = js.native
    
    def overview(): Unit = js.native
    
    def props(): StringDictionary[js.Any] = js.native
    def props(key: String): js.Any | Unit = js.native
    
    var selector: Selector | Unit = js.native
    
    def setChecked(): js.Promise[Unit] | Unit = js.native
    def setChecked(checked: Boolean): js.Promise[Unit] | Unit = js.native
    
    def setData(data: js.Object): js.Promise[Unit] | Unit = js.native
    
    def setMethods(data: js.Object): Unit = js.native
    
    def setProps(props: js.Object): js.Promise[Unit] | Unit = js.native
    
    def setSelected(): js.Promise[Unit] | Unit = js.native
    
    def setValue(value: js.Any): js.Promise[Unit] | Unit = js.native
    
    def trigger(eventName: String): js.Promise[Unit] | Unit = js.native
    def trigger(eventName: String, options: js.Object): js.Promise[Unit] | Unit = js.native
  }
  
  trait MountOptions[V /* <: Vue */]
    extends StObject
       with ComponentOptions[
          V, 
          DefaultData[V], 
          DefaultMethods[V], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ] {
    
    var attachTo: js.UndefOr[Element | String] = js.undefined
    
    var attachToDocument: js.UndefOr[Boolean] = js.undefined
    
    var attrs: js.UndefOr[Record[String, String]] = js.undefined
    
    var context: js.UndefOr[VNodeData] = js.undefined
    
    var listeners: js.UndefOr[Record[String, js.Function | js.Array[js.Function]]] = js.undefined
    
    var localVue: js.UndefOr[VueConstructor[Vue]] = js.undefined
    
    var mocks: js.UndefOr[js.Object | `false`] = js.undefined
    
    var parentComponent: js.UndefOr[
        Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
      ] = js.undefined
    
    var scopedSlots: js.UndefOr[Record[String, String | js.Function]] = js.undefined
    
    var slots: js.UndefOr[Slots] = js.undefined
    
    var stubs: js.UndefOr[Stubs | `false`] = js.undefined
  }
  object MountOptions {
    
    inline def apply[V /* <: Vue */](): MountOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MountOptions[V]]
    }
    
    extension [Self <: MountOptions[?], V /* <: Vue */](x: Self & MountOptions[V]) {
      
      inline def setAttachTo(value: Element | String): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToDocument(value: Boolean): Self = StObject.set(x, "attachToDocument", value.asInstanceOf[js.Any])
      
      inline def setAttachToDocumentUndefined: Self = StObject.set(x, "attachToDocument", js.undefined)
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setContext(value: VNodeData): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setListeners(value: Record[String, js.Function | js.Array[js.Function]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setLocalVue(value: VueConstructor[Vue]): Self = StObject.set(x, "localVue", value.asInstanceOf[js.Any])
      
      inline def setLocalVueUndefined: Self = StObject.set(x, "localVue", js.undefined)
      
      inline def setMocks(value: js.Object | `false`): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      inline def setMocksUndefined: Self = StObject.set(x, "mocks", js.undefined)
      
      inline def setParentComponent(
        value: Component[
              DefaultData[scala.Nothing], 
              DefaultMethods[scala.Nothing], 
              DefaultComputed, 
              DefaultProps
            ]
      ): Self = StObject.set(x, "parentComponent", value.asInstanceOf[js.Any])
      
      inline def setParentComponentUndefined: Self = StObject.set(x, "parentComponent", js.undefined)
      
      inline def setScopedSlots(value: Record[String, String | js.Function]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
      
      inline def setScopedSlotsUndefined: Self = StObject.set(x, "scopedSlots", js.undefined)
      
      inline def setSlots(value: Slots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setStubs(value: Stubs | `false`): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
      
      inline def setStubsUndefined: Self = StObject.set(x, "stubs", js.undefined)
      
      inline def setStubsVarargs(value: String*): Self = StObject.set(x, "stubs", js.Array(value :_*))
    }
  }
  
  /**
    * Utility type for name options object that can be used as a Selector
    */
  trait NameSelector extends StObject {
    
    var name: String
  }
  object NameSelector {
    
    inline def apply(name: String): NameSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameSelector]
    }
    
    extension [Self <: NameSelector](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Utility type for ref options object that can be used as a Selector
    */
  trait RefSelector extends StObject {
    
    var ref: String
  }
  object RefSelector {
    
    inline def apply(ref: String): RefSelector = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefSelector]
    }
    
    extension [Self <: RefSelector](x: Self) {
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Utility type for a selector
    */
  type Selector = String | (Component[
    DefaultData[scala.Nothing], 
    DefaultMethods[scala.Nothing], 
    DefaultComputed, 
    DefaultProps
  ])
  
  type ShallowMountOptions[V /* <: Vue */] = MountOptions[V]
  
  /**
    * Utility type for slots
    */
  type Slots = StringDictionary[
    (js.Array[
      (Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]) | String
    ]) | (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | String
  ]
  
  /**
    * Utility type for stubs which can be a string of template as a shorthand
    * If it is an array of string, the specified children are replaced by blank components
    */
  type Stubs = (StringDictionary[
    (Component[
      DefaultData[scala.Nothing], 
      DefaultMethods[scala.Nothing], 
      DefaultComputed, 
      DefaultProps
    ]) | String | Boolean
  ]) | js.Array[String]
  
  trait ThisTypedMountOptions[V /* <: Vue */]
    extends StObject
       with MountOptions[V]
       with ThisType[V]
  object ThisTypedMountOptions {
    
    inline def apply[V /* <: Vue */](): ThisTypedMountOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThisTypedMountOptions[V]]
    }
  }
  
  trait ThisTypedShallowMountOptions[V /* <: Vue */]
    extends StObject
       with MountOptions[V]
       with ThisType[V]
  object ThisTypedShallowMountOptions {
    
    inline def apply[V /* <: Vue */](): ThisTypedShallowMountOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThisTypedShallowMountOptions[V]]
    }
  }
  
  /**
    * Utility type to declare an extended Vue constructor
    */
  type VueClass[V /* <: Vue */] = (Instantiable1[/* args (repeated) */ js.Any, V]) & VueConstructor[Vue]
  
  trait VueTestUtilsConfigOptions extends StObject {
    
    var deprecationWarningHandler: js.UndefOr[js.Function] = js.undefined
    
    var methods: Record[String, js.Function]
    
    var mocks: Record[String, js.Any]
    
    var provide: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var showDeprecationWarnings: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var stubs: Record[
        String, 
        (Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]) | Boolean | String
      ]
  }
  object VueTestUtilsConfigOptions {
    
    inline def apply(
      methods: Record[String, js.Function],
      mocks: Record[String, js.Any],
      stubs: Record[
          String, 
          (Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]) | Boolean | String
        ]
    ): VueTestUtilsConfigOptions = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], stubs = stubs.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTestUtilsConfigOptions]
    }
    
    extension [Self <: VueTestUtilsConfigOptions](x: Self) {
      
      inline def setDeprecationWarningHandler(value: js.Function): Self = StObject.set(x, "deprecationWarningHandler", value.asInstanceOf[js.Any])
      
      inline def setDeprecationWarningHandlerUndefined: Self = StObject.set(x, "deprecationWarningHandler", js.undefined)
      
      inline def setMethods(value: Record[String, js.Function]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMocks(value: Record[String, js.Any]): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      inline def setProvide(value: Record[String, js.Any]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setProvideUndefined: Self = StObject.set(x, "provide", js.undefined)
      
      inline def setShowDeprecationWarnings(value: Boolean): Self = StObject.set(x, "showDeprecationWarnings", value.asInstanceOf[js.Any])
      
      inline def setShowDeprecationWarningsUndefined: Self = StObject.set(x, "showDeprecationWarnings", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setStubs(
        value: Record[
              String, 
              (Component[
                DefaultData[scala.Nothing], 
                DefaultMethods[scala.Nothing], 
                DefaultComputed, 
                DefaultProps
              ]) | Boolean | String
            ]
      ): Self = StObject.set(x, "stubs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Wrapper[V /* <: Vue | Null */]
    extends StObject
       with BaseWrapper {
    
    val element: HTMLElement = js.native
    
    def emitted(): StringDictionary[js.UndefOr[js.Array[js.Array[js.Any]]]] = js.native
    def emitted(event: String): js.UndefOr[js.Array[js.Any]] = js.native
    
    def emittedByOrder(): js.Array[Args] = js.native
    
    def find(selector: String): Wrapper[Vue] = js.native
    def find(selector: NameSelector): Wrapper[Vue] = js.native
    def find(selector: RefSelector): Wrapper[Vue] = js.native
    def find[R /* <: Vue */](
      selector: ComponentOptions[
          R, 
          DefaultData[R], 
          DefaultMethods[R], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): Wrapper[R] = js.native
    def find[R /* <: Vue */](selector: VueClass[R]): Wrapper[R] = js.native
    def find[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = js.native
    
    def findAll(selector: String): WrapperArray[Vue] = js.native
    def findAll(selector: NameSelector): WrapperArray[Vue] = js.native
    def findAll(selector: RefSelector): WrapperArray[Vue] = js.native
    def findAll[R /* <: Vue */](
      selector: ComponentOptions[
          R, 
          DefaultData[R], 
          DefaultMethods[R], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): WrapperArray[R] = js.native
    def findAll[R /* <: Vue */](selector: VueClass[R]): WrapperArray[R] = js.native
    def findAll[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): WrapperArray[Vue] = js.native
    
    def findAllComponents(selector: NameSelector): WrapperArray[Vue] = js.native
    def findAllComponents(selector: RefSelector): WrapperArray[Vue] = js.native
    def findAllComponents[R /* <: Vue */](
      selector: ComponentOptions[
          R, 
          DefaultData[R], 
          DefaultMethods[R], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): WrapperArray[R] = js.native
    def findAllComponents[R /* <: Vue */](selector: VueClass[R]): WrapperArray[R] = js.native
    def findAllComponents[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): WrapperArray[Vue] = js.native
    
    def findComponent(selector: NameSelector): Wrapper[Vue] = js.native
    def findComponent(selector: RefSelector): Wrapper[Vue] = js.native
    def findComponent[R /* <: Vue */](
      selector: ComponentOptions[
          R, 
          DefaultData[R], 
          DefaultMethods[R], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): Wrapper[R] = js.native
    def findComponent[R /* <: Vue */](selector: VueClass[R]): Wrapper[R] = js.native
    def findComponent[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = js.native
    
    def get(selector: String): Wrapper[Vue] = js.native
    def get(selector: NameSelector): Wrapper[Vue] = js.native
    def get(selector: RefSelector): Wrapper[Vue] = js.native
    def get[R /* <: Vue */](
      selector: ComponentOptions[
          R, 
          DefaultData[R], 
          DefaultMethods[R], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): Wrapper[R] = js.native
    def get[R /* <: Vue */](selector: VueClass[R]): Wrapper[R] = js.native
    def get[Props, PropDefs](selector: FunctionalComponentOptions[Props, PropDefs]): Wrapper[Vue] = js.native
    
    def html(): String = js.native
    
    def name(): String = js.native
    
    val options: WrapperOptions = js.native
    
    def text(): String = js.native
    
    val vm: V = js.native
  }
  
  @js.native
  trait WrapperArray[V /* <: Vue */]
    extends StObject
       with BaseWrapper {
    
    def at(index: Double): Wrapper[V] = js.native
    
    def filter(
      predicate: js.Function3[/* value */ Wrapper[V], /* index */ Double, /* array */ js.Array[Wrapper[V]], js.Any]
    ): WrapperArray[Vue] = js.native
    
    val length: Double = js.native
    
    val wrappers: js.Array[Wrapper[V]] = js.native
  }
  
  trait WrapperOptions extends StObject {
    
    var attachedToDocument: js.UndefOr[Boolean] = js.undefined
  }
  object WrapperOptions {
    
    inline def apply(): WrapperOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperOptions]
    }
    
    extension [Self <: WrapperOptions](x: Self) {
      
      inline def setAttachedToDocument(value: Boolean): Self = StObject.set(x, "attachedToDocument", value.asInstanceOf[js.Any])
      
      inline def setAttachedToDocumentUndefined: Self = StObject.set(x, "attachedToDocument", js.undefined)
    }
  }
}
