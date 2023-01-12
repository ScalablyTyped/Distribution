package typings.svelte

import org.scalablytyped.runtime.Instantiable1
import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Extract
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Node
import typings.std.Record
import typings.std.ShadowRoot
import typings.svelte.typesRuntimeInternalComponentMod.SvelteComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalDevMod {
  
  @JSImport("svelte/types/runtime/internal/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("svelte/types/runtime/internal/dev", "SvelteComponentDev")
  @js.native
  open class SvelteComponentDev protected () extends SvelteComponent {
    def this(options: ComponentConstructorOptions[Record[String, Any]]) = this()
    
    @JSName("$capture_state")
    def $capture_state(): Unit = js.native
    
    @JSName("$inject_state")
    def $inject_state(): Unit = js.native
    
    @JSName("$on")
    def $on(event: String): js.Function0[Unit] = js.native
    @JSName("$on")
    def $on(event: String, callback: js.Function1[/* event */ Any, Unit]): js.Function0[Unit] = js.native
    
    @JSName("$set")
    def $set(): Unit = js.native
    @JSName("$set")
    def $set(props: Props): Unit = js.native
    
    /**
      * @private
      * For type checking capabilities only.
      * Does not exist at runtime.
      * ### DO NOT USE!
      */
    @JSName("$$events_def")
    var DollarDollarevents_def: Any = js.native
    
    /**
      * @private
      * For type checking capabilities only.
      * Does not exist at runtime.
      * ### DO NOT USE!
      */
    @JSName("$$prop_def")
    var DollarDollarprop_def: Props = js.native
    
    /**
      * @private
      * For type checking capabilities only.
      * Does not exist at runtime.
      * ### DO NOT USE!
      */
    @JSName("$$slot_def")
    var DollarDollarslot_def: Any = js.native
  }
  
  @JSImport("svelte/types/runtime/internal/dev", "SvelteComponentTyped")
  @js.native
  open class SvelteComponentTyped[Props /* <: Record[String, Any] */, Events /* <: Record[String, Any] */, Slots /* <: Record[String, Any] */] protected () extends SvelteComponentDev {
    def this(options: ComponentConstructorOptions[Props]) = this()
    
    @JSName("$on")
    def $on[K /* <: Extract[/* keyof Events */ String, String] */](`type`: K): js.Function0[Unit] = js.native
    @JSName("$on")
    def $on[K /* <: Extract[/* keyof Events */ String, String] */](
      `type`: K,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[K] */ /* e */ js.Any, 
          Unit
        ]
    ): js.Function0[Unit] = js.native
    
    /**
      * @private
      * For type checking capabilities only.
      * Does not exist at runtime.
      * ### DO NOT USE!
      */
    @JSName("$$events_def")
    var DollarDollarevents_def_SvelteComponentTyped: Events = js.native
    
    /**
      * @private
      * For type checking capabilities only.
      * Does not exist at runtime.
      * ### DO NOT USE!
      */
    @JSName("$$prop_def")
    var DollarDollarprop_def_SvelteComponentTyped: Props = js.native
    
    /**
      * @private
      * For type checking capabilities only.
      * Does not exist at runtime.
      * ### DO NOT USE!
      */
    @JSName("$$slot_def")
    var DollarDollarslot_def_SvelteComponentTyped: Slots = js.native
  }
  
  inline def appendDev(target: Node, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("append_dev")(target.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendHydrationDev(target: Node, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("append_hydration_dev")(target.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def attrDev(node: Element, attribute: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attr_dev")(node.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def attrDev(node: Element, attribute: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attr_dev")(node.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def constructSvelteComponentDev(component: Any, props: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct_svelte_component_dev")(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def datasetDev(node: HTMLElement, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset_dev")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def datasetDev(node: HTMLElement, property: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset_dev")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def detachAfterDev(before: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach_after_dev")(before.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachBeforeDev(after: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach_before_dev")(after.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachBetweenDev(before: Node, after: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach_between_dev")(before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def detachDev(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach_dev")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def dispatchDev[T](`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch_dev")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dispatchDev[T](`type`: String, detail: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch_dev")(`type`.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertDev(target: Node, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert_dev")(target.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertDev(target: Node, node: Node, anchor: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert_dev")(target.asInstanceOf[js.Any], node.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertHydrationDev(target: Node, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert_hydration_dev")(target.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertHydrationDev(target: Node, node: Node, anchor: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert_hydration_dev")(target.asInstanceOf[js.Any], node.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def listenDev(node: Node, event: String, handler: EventListenerOrEventListenerObject): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(node: Node, event: String, handler: EventListenerOrEventListenerObject, options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: Boolean,
    has_prevent_default: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: Boolean,
    has_prevent_default: Boolean,
    has_stop_propagation: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any], has_stop_propagation.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: Boolean,
    has_prevent_default: Unit,
    has_stop_propagation: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any], has_stop_propagation.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: Unit,
    has_prevent_default: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: Unit,
    has_prevent_default: Boolean,
    has_stop_propagation: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any], has_stop_propagation.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: Unit,
    has_prevent_default: Unit,
    has_stop_propagation: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any], has_stop_propagation.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions,
    has_prevent_default: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions,
    has_prevent_default: Boolean,
    has_stop_propagation: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any], has_stop_propagation.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions,
    has_prevent_default: Unit,
    has_stop_propagation: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any], has_stop_propagation.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: EventListenerOptions,
    has_prevent_default: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: EventListenerOptions,
    has_prevent_default: Boolean,
    has_stop_propagation: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any], has_stop_propagation.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def listenDev(
    node: Node,
    event: String,
    handler: EventListenerOrEventListenerObject,
    options: EventListenerOptions,
    has_prevent_default: Unit,
    has_stop_propagation: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listen_dev")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any], has_prevent_default.asInstanceOf[js.Any], has_stop_propagation.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def loopGuard(timeout: Any): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loop_guard")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def propDev(node: Element, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prop_dev")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def propDev(node: Element, property: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prop_dev")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDataDev(text: Any, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set_data_dev")(text.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateDynamicElement(tag: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate_dynamic_element")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateEachArgument(arg: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate_each_argument")(arg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateSlots(name: Any, slot: Any, keys: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate_slots")(name.asInstanceOf[js.Any], slot.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateVoidDynamicElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate_void_dynamic_element")().asInstanceOf[Unit]
  inline def validateVoidDynamicElement(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate_void_dynamic_element")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ComponentConstructorOptions[Props /* <: Record[String, Any] */] extends StObject {
    
    @JSName("$$inline")
    var DollarDollarinline: js.UndefOr[Boolean] = js.undefined
    
    var anchor: js.UndefOr[Element] = js.undefined
    
    var context: js.UndefOr[Map[Any, Any]] = js.undefined
    
    var hydrate: js.UndefOr[Boolean] = js.undefined
    
    var intro: js.UndefOr[Boolean] = js.undefined
    
    var props: js.UndefOr[Props] = js.undefined
    
    var target: Element | ShadowRoot
  }
  object ComponentConstructorOptions {
    
    inline def apply[Props /* <: Record[String, Any] */](target: Element | ShadowRoot): ComponentConstructorOptions[Props] = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentConstructorOptions[Props]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentConstructorOptions[?], Props /* <: Record[String, Any] */] (val x: Self & ComponentConstructorOptions[Props]) extends AnyVal {
      
      inline def setAnchor(value: Element): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setContext(value: Map[Any, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDollarDollarinline(value: Boolean): Self = StObject.set(x, "$$inline", value.asInstanceOf[js.Any])
      
      inline def setDollarDollarinlineUndefined: Self = StObject.set(x, "$$inline", js.undefined)
      
      inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setIntro(value: Boolean): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setTarget(value: Element | ShadowRoot): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Component extends svelte.svelte/types/runtime/internal/dev.SvelteComponentTyped<any, infer Events, any> ? Events : never
    }}}
    */
  @js.native
  trait ComponentEvents[Component /* <: SvelteComponent */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Component extends svelte.svelte/types/runtime/internal/dev.SvelteComponentTyped<infer Props, any, any> ? Props : never
    }}}
    */
  @js.native
  trait ComponentProps[Component /* <: SvelteComponent */] extends StObject
  
  type ComponentType[Component /* <: SvelteComponentTyped[Any, Any, Any] */] = Instantiable1[
    /* options */ ComponentConstructorOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: Component extends svelte.svelte/types/runtime/internal/dev.SvelteComponentTyped<infer Props, any, any> ? Props : std.Record<string, any> */ js.Any
    ], 
    Component
  ]
  
  type Props = Record[String, Any]
}
