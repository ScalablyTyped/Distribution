package typings.virtualDom

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VirtualDOM {
  
  type EventHandler = js.Function1[/* repeated */ js.Any, Unit]
  
  type PatchFn[T /* <: Element */] = js.Function3[
    /* rootNode */ T, 
    /* patches */ js.Array[VPatch], 
    /* renderOptions */ VPatchOptions[T], 
    T
  ]
  
  @js.native
  trait Thunk extends VTree {
    
    def render(previous: VTree): VTree = js.native
    
    var `type`: String = js.native
    
    // 'Thunk'
    var vnode: VTree = js.native
  }
  object Thunk {
    
    @scala.inline
    def apply(render: VTree => VTree, `type`: String, vnode: VTree): Thunk = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), vnode = vnode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Thunk]
    }
    
    @scala.inline
    implicit class ThunkMutableBuilder[Self <: Thunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: VTree => VTree): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVnode(value: VTree): Self = StObject.set(x, "vnode", value.asInstanceOf[js.Any])
    }
  }
  
  type VChild = (js.Array[String | VTree]) | VTree | String
  
  @js.native
  trait VHook extends StObject {
    
    def hook(node: Element, propertyName: String): Unit = js.native
    
    def unhook(node: Element, propertyName: String): Unit = js.native
  }
  object VHook {
    
    @scala.inline
    def apply(hook: (Element, String) => Unit, unhook: (Element, String) => Unit): VHook = {
      val __obj = js.Dynamic.literal(hook = js.Any.fromFunction2(hook), unhook = js.Any.fromFunction2(unhook))
      __obj.asInstanceOf[VHook]
    }
    
    @scala.inline
    implicit class VHookMutableBuilder[Self <: VHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHook(value: (Element, String) => Unit): Self = StObject.set(x, "hook", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnhook(value: (Element, String) => Unit): Self = StObject.set(x, "unhook", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait VNode extends VTree {
    
    var children: js.Array[VTree] = js.native
    
    var count: Double = js.native
    
    var descendantHooks: js.Array[_] = js.native
    
    var hasThunks: Boolean = js.native
    
    var hasWidgets: Boolean = js.native
    
    var hooks: js.Array[_] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var namespace: js.UndefOr[String] = js.native
    
    var properties: VProperties = js.native
    
    var tagName: String = js.native
    
    var `type`: String = js.native
    
    var version: String = js.native
  }
  object VNode {
    
    @scala.inline
    def apply(
      children: js.Array[VTree],
      count: Double,
      descendantHooks: js.Array[_],
      hasThunks: Boolean,
      hasWidgets: Boolean,
      hooks: js.Array[_],
      properties: VProperties,
      tagName: String,
      `type`: String,
      version: String
    ): VNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], descendantHooks = descendantHooks.asInstanceOf[js.Any], hasThunks = hasThunks.asInstanceOf[js.Any], hasWidgets = hasWidgets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode]
    }
    
    @scala.inline
    implicit class VNodeMutableBuilder[Self <: VNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[VTree]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: VTree*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescendantHooks(value: js.Array[_]): Self = StObject.set(x, "descendantHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescendantHooksVarargs(value: js.Any*): Self = StObject.set(x, "descendantHooks", js.Array(value :_*))
      
      @scala.inline
      def setHasThunks(value: Boolean): Self = StObject.set(x, "hasThunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasWidgets(value: Boolean): Self = StObject.set(x, "hasWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooks(value: js.Array[_]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksVarargs(value: js.Any*): Self = StObject.set(x, "hooks", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setProperties(value: VProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VNodeConstructor
    extends Instantiable3[
          /* tagName */ String, 
          /* properties */ VProperties, 
          /* children */ js.Array[VTree], 
          VNode
        ]
       with Instantiable4[
          /* tagName */ String, 
          /* properties */ VProperties, 
          /* children */ js.Array[VTree], 
          /* key */ String, 
          VNode
        ]
       with Instantiable5[
          /* tagName */ String, 
          /* properties */ VProperties, 
          /* children */ js.Array[VTree], 
          js.UndefOr[/* key */ String], 
          /* namespace */ String, 
          VNode
        ]
  
  // enum VPatch {
  //   NONE = 0,
  //   VTEXT = 1,
  //   VNODE = 2,
  //   WIDGET = 3,
  //   PROPS = 4,
  //   ORDER = 5,
  //   INSERT = 6,
  //   REMOVE = 7,
  //   THUNK = 8
  // }
  @js.native
  trait VPatch extends StObject {
    
    var patch: js.Any = js.native
    
    /**
      type is set to 'VirtualPatch' on the prototype, but overridden in the
      constructor with a number.
      */
    var `type`: Double = js.native
    
    var vNode: VNode = js.native
    
    var version: String = js.native
  }
  object VPatch {
    
    @scala.inline
    def apply(patch: js.Any, `type`: Double, vNode: VNode, version: String): VPatch = {
      val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any], vNode = vNode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VPatch]
    }
    
    @scala.inline
    implicit class VPatchMutableBuilder[Self <: VPatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPatch(value: js.Any): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVNode(value: VNode): Self = StObject.set(x, "vNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VPatchOptions[T /* <: Element */] extends StObject {
    
    var patch: js.UndefOr[PatchFn[T]] = js.native
  }
  object VPatchOptions {
    
    @scala.inline
    def apply[T /* <: Element */](): VPatchOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VPatchOptions[T]]
    }
    
    @scala.inline
    implicit class VPatchOptionsMutableBuilder[Self <: VPatchOptions[_], T /* <: Element */] (val x: Self with VPatchOptions[T]) extends AnyVal {
      
      @scala.inline
      def setPatch(value: (T, /* patches */ js.Array[VPatch], /* renderOptions */ VPatchOptions[T]) => T): Self = StObject.set(x, "patch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    }
  }
  
  @js.native
  trait VProperties
    extends /**
    The relaxation on `style` above is the reason why we need `any` as an option
    on the indexer type.
    */
  /* index */ StringDictionary[
          js.Any | String | Boolean | Double | VHook | EventHandler | (StringDictionary[String | Boolean | Double])
        ] {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      I would like to use {[index: string]: string}, but then we couldn't use an
      object literal when setting the styles, since TypeScript doesn't seem to
      infer that {'fontSize': string; 'fontWeight': string;} is actually quite
      assignable to the type { [index: string]: string; }
      */
    var style: js.UndefOr[js.Any] = js.native
  }
  object VProperties {
    
    @scala.inline
    def apply(): VProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VProperties]
    }
    
    @scala.inline
    implicit class VPropertiesMutableBuilder[Self <: VProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait VText extends VTree {
    
    var text: String = js.native
    
    var `type`: String = js.native
    
    var version: String = js.native
  }
  object VText {
    
    @scala.inline
    def apply(text: String, `type`: String, version: String): VText = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VText]
    }
    
    @scala.inline
    implicit class VTextMutableBuilder[Self <: VText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VTextConstructor extends Instantiable1[/* text */ String, VText]
  
  /* Rewritten from type alias, can be one of: 
    - typings.virtualDom.VirtualDOM.VText
    - typings.virtualDom.VirtualDOM.VNode
    - typings.virtualDom.VirtualDOM.Widget
    - typings.virtualDom.VirtualDOM.Thunk
  */
  trait VTree extends StObject
  object VTree {
    
    @scala.inline
    def Thunk(render: VTree => VTree, `type`: String, vnode: VTree): typings.virtualDom.VirtualDOM.Thunk = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), vnode = vnode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.virtualDom.VirtualDOM.Thunk]
    }
    
    @scala.inline
    def VNode(
      children: js.Array[VTree],
      count: Double,
      descendantHooks: js.Array[_],
      hasThunks: Boolean,
      hasWidgets: Boolean,
      hooks: js.Array[_],
      properties: VProperties,
      tagName: String,
      `type`: String,
      version: String
    ): typings.virtualDom.VirtualDOM.VNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], descendantHooks = descendantHooks.asInstanceOf[js.Any], hasThunks = hasThunks.asInstanceOf[js.Any], hasWidgets = hasWidgets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.virtualDom.VirtualDOM.VNode]
    }
    
    @scala.inline
    def VText(text: String, `type`: String, version: String): typings.virtualDom.VirtualDOM.VText = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.virtualDom.VirtualDOM.VText]
    }
    
    @scala.inline
    def Widget(
      destroy: Element => Unit,
      init: () => Element,
      `type`: String,
      update: (typings.virtualDom.VirtualDOM.Widget, Element) => Unit
    ): typings.virtualDom.VirtualDOM.Widget = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction0(init), update = js.Any.fromFunction2(update))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.virtualDom.VirtualDOM.Widget]
    }
  }
  
  @js.native
  trait Widget extends VTree {
    
    def destroy(node: Element): Unit = js.native
    
    // 'Widget'
    def init(): Element = js.native
    
    var `type`: String = js.native
    
    def update(previous: Widget, domNode: Element): Unit = js.native
  }
  object Widget {
    
    @scala.inline
    def apply(destroy: Element => Unit, init: () => Element, `type`: String, update: (Widget, Element) => Unit): Widget = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction0(init), update = js.Any.fromFunction2(update))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Widget]
    }
    
    @scala.inline
    implicit class WidgetMutableBuilder[Self <: Widget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: Element => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInit(value: () => Element): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: (Widget, Element) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait createProperties extends VProperties {
    
    var key: js.UndefOr[String] = js.native
    
    var namespace: js.UndefOr[String] = js.native
  }
  object createProperties {
    
    @scala.inline
    def apply(): createProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[createProperties]
    }
    
    @scala.inline
    implicit class createPropertiesMutableBuilder[Self <: createProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
}
