package typings.vue

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.std.Node
import typings.vue.anon.Render
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeMod {
  
  type NormalizedScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotChildren]
  
  type ScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotReturnValue]
  
  type ScopedSlotChildren = js.UndefOr[js.Array[VNode]]
  
  @js.native
  trait ScopedSlotReturnArray
    extends StObject
       with Array[ScopedSlotReturnValue]
       with _ScopedSlotReturnValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.vue.vnodeMod.VNode
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - scala.Unit
    - typings.vue.vnodeMod.ScopedSlotReturnArray
  */
  type ScopedSlotReturnValue = js.UndefOr[_ScopedSlotReturnValue | String | Boolean | Null]
  
  trait VNode
    extends StObject
       with _ScopedSlotReturnValue {
    
    var children: js.UndefOr[js.Array[VNode]] = js.undefined
    
    var componentInstance: js.UndefOr[Vue] = js.undefined
    
    var componentOptions: js.UndefOr[VNodeComponentOptions] = js.undefined
    
    var context: js.UndefOr[Vue] = js.undefined
    
    var data: js.UndefOr[VNodeData] = js.undefined
    
    var elm: js.UndefOr[Node] = js.undefined
    
    var isComment: Boolean
    
    var isRootInsert: Boolean
    
    var isStatic: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var ns: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[VNode] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object VNode {
    
    inline def apply(isComment: Boolean, isRootInsert: Boolean): VNode = {
      val __obj = js.Dynamic.literal(isComment = isComment.asInstanceOf[js.Any], isRootInsert = isRootInsert.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode]
    }
    
    extension [Self <: VNode](x: Self) {
      
      inline def setChildren(value: js.Array[VNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: VNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setComponentInstance(value: Vue): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
      
      inline def setComponentInstanceUndefined: Self = StObject.set(x, "componentInstance", js.undefined)
      
      inline def setComponentOptions(value: VNodeComponentOptions): Self = StObject.set(x, "componentOptions", value.asInstanceOf[js.Any])
      
      inline def setComponentOptionsUndefined: Self = StObject.set(x, "componentOptions", js.undefined)
      
      inline def setContext(value: Vue): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setData(value: VNodeData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setElm(value: Node): Self = StObject.set(x, "elm", value.asInstanceOf[js.Any])
      
      inline def setElmUndefined: Self = StObject.set(x, "elm", js.undefined)
      
      inline def setIsComment(value: Boolean): Self = StObject.set(x, "isComment", value.asInstanceOf[js.Any])
      
      inline def setIsRootInsert(value: Boolean): Self = StObject.set(x, "isRootInsert", value.asInstanceOf[js.Any])
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setParent(value: VNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type VNodeChildren = js.UndefOr[VNodeChildrenArrayContents | js.Array[ScopedSlot] | String | Boolean | Null]
  
  @js.native
  trait VNodeChildrenArrayContents
    extends StObject
       with Array[VNodeChildren | VNode]
  
  trait VNodeComponentOptions extends StObject {
    
    var Ctor: VueConstructor[Vue]
    
    var children: js.UndefOr[js.Array[VNode]] = js.undefined
    
    var listeners: js.UndefOr[js.Object] = js.undefined
    
    var propsData: js.UndefOr[js.Object] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object VNodeComponentOptions {
    
    inline def apply(Ctor: VueConstructor[Vue]): VNodeComponentOptions = {
      val __obj = js.Dynamic.literal(Ctor = Ctor.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNodeComponentOptions]
    }
    
    extension [Self <: VNodeComponentOptions](x: Self) {
      
      inline def setChildren(value: js.Array[VNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: VNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setCtor(value: VueConstructor[Vue]): Self = StObject.set(x, "Ctor", value.asInstanceOf[js.Any])
      
      inline def setListeners(value: js.Object): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setPropsData(value: js.Object): Self = StObject.set(x, "propsData", value.asInstanceOf[js.Any])
      
      inline def setPropsDataUndefined: Self = StObject.set(x, "propsData", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait VNodeData extends StObject {
    
    var attrs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var `class`: js.UndefOr[js.Any] = js.undefined
    
    var directives: js.UndefOr[js.Array[VNodeDirective]] = js.undefined
    
    var domProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var hook: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    var inlineTemplate: js.UndefOr[Render] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var nativeOn: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.undefined
    
    var on: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.undefined
    
    var props: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var ref: js.UndefOr[String] = js.undefined
    
    var refInFor: js.UndefOr[Boolean] = js.undefined
    
    var scopedSlots: js.UndefOr[StringDictionary[js.UndefOr[ScopedSlot]]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var staticClass: js.UndefOr[String] = js.undefined
    
    var staticStyle: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var style: js.UndefOr[String | js.Array[js.Object] | js.Object] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var transition: js.UndefOr[js.Object] = js.undefined
  }
  object VNodeData {
    
    inline def apply(): VNodeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNodeData]
    }
    
    extension [Self <: VNodeData](x: Self) {
      
      inline def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setClass(value: js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setDirectives(value: js.Array[VNodeDirective]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setDirectivesVarargs(value: VNodeDirective*): Self = StObject.set(x, "directives", js.Array(value :_*))
      
      inline def setDomProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "domProps", value.asInstanceOf[js.Any])
      
      inline def setDomPropsUndefined: Self = StObject.set(x, "domProps", js.undefined)
      
      inline def setHook(value: StringDictionary[js.Function]): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
      
      inline def setInlineTemplate(value: Render): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
      
      inline def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNativeOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = StObject.set(x, "nativeOn", value.asInstanceOf[js.Any])
      
      inline def setNativeOnUndefined: Self = StObject.set(x, "nativeOn", js.undefined)
      
      inline def setOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefInFor(value: Boolean): Self = StObject.set(x, "refInFor", value.asInstanceOf[js.Any])
      
      inline def setRefInForUndefined: Self = StObject.set(x, "refInFor", js.undefined)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setScopedSlots(value: StringDictionary[js.UndefOr[ScopedSlot]]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
      
      inline def setScopedSlotsUndefined: Self = StObject.set(x, "scopedSlots", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setStaticClass(value: String): Self = StObject.set(x, "staticClass", value.asInstanceOf[js.Any])
      
      inline def setStaticClassUndefined: Self = StObject.set(x, "staticClass", js.undefined)
      
      inline def setStaticStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "staticStyle", value.asInstanceOf[js.Any])
      
      inline def setStaticStyleUndefined: Self = StObject.set(x, "staticStyle", js.undefined)
      
      inline def setStyle(value: String | js.Array[js.Object] | js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: js.Object*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTransition(value: js.Object): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait VNodeDirective extends StObject {
    
    var arg: js.UndefOr[String] = js.undefined
    
    var expression: js.UndefOr[js.Any] = js.undefined
    
    var modifiers: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var name: String
    
    var oldArg: js.UndefOr[String] = js.undefined
    
    var oldValue: js.UndefOr[js.Any] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object VNodeDirective {
    
    inline def apply(name: String): VNodeDirective = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNodeDirective]
    }
    
    extension [Self <: VNodeDirective](x: Self) {
      
      inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      inline def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setModifiers(value: StringDictionary[Boolean]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOldArg(value: String): Self = StObject.set(x, "oldArg", value.asInstanceOf[js.Any])
      
      inline def setOldArgUndefined: Self = StObject.set(x, "oldArg", js.undefined)
      
      inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait _ScopedSlotReturnValue extends StObject
}
