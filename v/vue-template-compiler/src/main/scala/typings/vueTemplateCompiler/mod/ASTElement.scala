package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.anon.Callback
import typings.vueTemplateCompiler.anon.Name
import typings.vueTemplateCompiler.anon.Value
import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASTElement
  extends StObject
     with ASTNode {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var attrs: js.UndefOr[js.Array[Name]] = js.undefined
  
  var attrsList: js.Array[Name]
  
  var attrsMap: Record[String, Any]
  
  var children: js.Array[ASTNode]
  
  var classBinding: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[String] = js.undefined
  
  var directives: js.UndefOr[js.Array[ASTDirective]] = js.undefined
  
  var `else`: js.UndefOr[`true`] = js.undefined
  
  var elseif: js.UndefOr[String] = js.undefined
  
  var events: js.UndefOr[ASTElementHandlers] = js.undefined
  
  var `for`: js.UndefOr[String] = js.undefined
  
  var forProcessed: js.UndefOr[Boolean] = js.undefined
  
  var forbidden: js.UndefOr[`true`] = js.undefined
  
  var hasBindings: js.UndefOr[Boolean] = js.undefined
  
  var `if`: js.UndefOr[String] = js.undefined
  
  var ifConditions: js.UndefOr[js.Array[ASTIfCondition]] = js.undefined
  
  var ifProcessed: js.UndefOr[Boolean] = js.undefined
  
  var inlineTemplate: js.UndefOr[`true`] = js.undefined
  
  var iterator1: js.UndefOr[String] = js.undefined
  
  var iterator2: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var model: js.UndefOr[Callback] = js.undefined
  
  var nativeEvents: js.UndefOr[ASTElementHandlers] = js.undefined
  
  var ns: js.UndefOr[String] = js.undefined
  
  var once: js.UndefOr[`true`] = js.undefined
  
  var onceProcessed: js.UndefOr[Boolean] = js.undefined
  
  var parent: js.UndefOr[ASTElement] = js.undefined
  
  var plain: js.UndefOr[Boolean] = js.undefined
  
  var pre: js.UndefOr[`true`] = js.undefined
  
  var processed: js.UndefOr[`true`] = js.undefined
  
  var props: js.UndefOr[js.Array[Value]] = js.undefined
  
  var ref: js.UndefOr[String] = js.undefined
  
  var refInFor: js.UndefOr[Boolean] = js.undefined
  
  var scopedSlots: js.UndefOr[Record[String, ASTElement]] = js.undefined
  
  var slotName: js.UndefOr[String] = js.undefined
  
  var slotScope: js.UndefOr[String] = js.undefined
  
  var slotTarget: js.UndefOr[String] = js.undefined
  
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
  
  var staticClass: js.UndefOr[String] = js.undefined
  
  var staticInFor: js.UndefOr[Boolean] = js.undefined
  
  var staticProcessed: js.UndefOr[Boolean] = js.undefined
  
  var staticRoot: js.UndefOr[Boolean] = js.undefined
  
  var staticStyle: js.UndefOr[String] = js.undefined
  
  var styleBinding: js.UndefOr[String] = js.undefined
  
  var tag: String
  
  var text: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String | `true`] = js.undefined
  
  var transitionMode: js.UndefOr[String | Null] = js.undefined
  
  var transitionOnAppear: js.UndefOr[Boolean] = js.undefined
  
  var `type`: `1`
  
  var wrapData: js.UndefOr[js.Function1[/* code */ String, String]] = js.undefined
  
  var wrapListeners: js.UndefOr[js.Function1[/* code */ String, String]] = js.undefined
}
object ASTElement {
  
  inline def apply(attrsList: js.Array[Name], attrsMap: Record[String, Any], children: js.Array[ASTNode], tag: String): ASTElement = {
    val __obj = js.Dynamic.literal(attrsList = attrsList.asInstanceOf[js.Any], attrsMap = attrsMap.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[ASTElement]
  }
  
  extension [Self <: ASTElement](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAttrs(value: js.Array[Name]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsList(value: js.Array[Name]): Self = StObject.set(x, "attrsList", value.asInstanceOf[js.Any])
    
    inline def setAttrsListVarargs(value: Name*): Self = StObject.set(x, "attrsList", js.Array(value*))
    
    inline def setAttrsMap(value: Record[String, Any]): Self = StObject.set(x, "attrsMap", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setAttrsVarargs(value: Name*): Self = StObject.set(x, "attrs", js.Array(value*))
    
    inline def setChildren(value: js.Array[ASTNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ASTNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClassBinding(value: String): Self = StObject.set(x, "classBinding", value.asInstanceOf[js.Any])
    
    inline def setClassBindingUndefined: Self = StObject.set(x, "classBinding", js.undefined)
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDirectives(value: js.Array[ASTDirective]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: ASTDirective*): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setElse(value: `true`): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
    
    inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
    
    inline def setElseif(value: String): Self = StObject.set(x, "elseif", value.asInstanceOf[js.Any])
    
    inline def setElseifUndefined: Self = StObject.set(x, "elseif", js.undefined)
    
    inline def setEvents(value: ASTElementHandlers): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForProcessed(value: Boolean): Self = StObject.set(x, "forProcessed", value.asInstanceOf[js.Any])
    
    inline def setForProcessedUndefined: Self = StObject.set(x, "forProcessed", js.undefined)
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setForbidden(value: `true`): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
    
    inline def setForbiddenUndefined: Self = StObject.set(x, "forbidden", js.undefined)
    
    inline def setHasBindings(value: Boolean): Self = StObject.set(x, "hasBindings", value.asInstanceOf[js.Any])
    
    inline def setHasBindingsUndefined: Self = StObject.set(x, "hasBindings", js.undefined)
    
    inline def setIf(value: String): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfConditions(value: js.Array[ASTIfCondition]): Self = StObject.set(x, "ifConditions", value.asInstanceOf[js.Any])
    
    inline def setIfConditionsUndefined: Self = StObject.set(x, "ifConditions", js.undefined)
    
    inline def setIfConditionsVarargs(value: ASTIfCondition*): Self = StObject.set(x, "ifConditions", js.Array(value*))
    
    inline def setIfProcessed(value: Boolean): Self = StObject.set(x, "ifProcessed", value.asInstanceOf[js.Any])
    
    inline def setIfProcessedUndefined: Self = StObject.set(x, "ifProcessed", js.undefined)
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    inline def setInlineTemplate(value: `true`): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
    
    inline def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
    
    inline def setIterator1(value: String): Self = StObject.set(x, "iterator1", value.asInstanceOf[js.Any])
    
    inline def setIterator1Undefined: Self = StObject.set(x, "iterator1", js.undefined)
    
    inline def setIterator2(value: String): Self = StObject.set(x, "iterator2", value.asInstanceOf[js.Any])
    
    inline def setIterator2Undefined: Self = StObject.set(x, "iterator2", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setModel(value: Callback): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNativeEvents(value: ASTElementHandlers): Self = StObject.set(x, "nativeEvents", value.asInstanceOf[js.Any])
    
    inline def setNativeEventsUndefined: Self = StObject.set(x, "nativeEvents", js.undefined)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    inline def setOnce(value: `true`): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceProcessed(value: Boolean): Self = StObject.set(x, "onceProcessed", value.asInstanceOf[js.Any])
    
    inline def setOnceProcessedUndefined: Self = StObject.set(x, "onceProcessed", js.undefined)
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setParent(value: ASTElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    inline def setPre(value: `true`): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    inline def setProcessed(value: `true`): Self = StObject.set(x, "processed", value.asInstanceOf[js.Any])
    
    inline def setProcessedUndefined: Self = StObject.set(x, "processed", js.undefined)
    
    inline def setProps(value: js.Array[Value]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setPropsVarargs(value: Value*): Self = StObject.set(x, "props", js.Array(value*))
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefInFor(value: Boolean): Self = StObject.set(x, "refInFor", value.asInstanceOf[js.Any])
    
    inline def setRefInForUndefined: Self = StObject.set(x, "refInFor", js.undefined)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setScopedSlots(value: Record[String, ASTElement]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
    
    inline def setScopedSlotsUndefined: Self = StObject.set(x, "scopedSlots", js.undefined)
    
    inline def setSlotName(value: String): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    inline def setSlotNameUndefined: Self = StObject.set(x, "slotName", js.undefined)
    
    inline def setSlotScope(value: String): Self = StObject.set(x, "slotScope", value.asInstanceOf[js.Any])
    
    inline def setSlotScopeUndefined: Self = StObject.set(x, "slotScope", js.undefined)
    
    inline def setSlotTarget(value: String): Self = StObject.set(x, "slotTarget", value.asInstanceOf[js.Any])
    
    inline def setSlotTargetUndefined: Self = StObject.set(x, "slotTarget", js.undefined)
    
    inline def setSsrOptimizability(value: SSROptimizability): Self = StObject.set(x, "ssrOptimizability", value.asInstanceOf[js.Any])
    
    inline def setSsrOptimizabilityUndefined: Self = StObject.set(x, "ssrOptimizability", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticClass(value: String): Self = StObject.set(x, "staticClass", value.asInstanceOf[js.Any])
    
    inline def setStaticClassUndefined: Self = StObject.set(x, "staticClass", js.undefined)
    
    inline def setStaticInFor(value: Boolean): Self = StObject.set(x, "staticInFor", value.asInstanceOf[js.Any])
    
    inline def setStaticInForUndefined: Self = StObject.set(x, "staticInFor", js.undefined)
    
    inline def setStaticProcessed(value: Boolean): Self = StObject.set(x, "staticProcessed", value.asInstanceOf[js.Any])
    
    inline def setStaticProcessedUndefined: Self = StObject.set(x, "staticProcessed", js.undefined)
    
    inline def setStaticRoot(value: Boolean): Self = StObject.set(x, "staticRoot", value.asInstanceOf[js.Any])
    
    inline def setStaticRootUndefined: Self = StObject.set(x, "staticRoot", js.undefined)
    
    inline def setStaticStyle(value: String): Self = StObject.set(x, "staticStyle", value.asInstanceOf[js.Any])
    
    inline def setStaticStyleUndefined: Self = StObject.set(x, "staticStyle", js.undefined)
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setStyleBinding(value: String): Self = StObject.set(x, "styleBinding", value.asInstanceOf[js.Any])
    
    inline def setStyleBindingUndefined: Self = StObject.set(x, "styleBinding", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTransition(value: String | `true`): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionMode(value: String): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
    
    inline def setTransitionModeNull: Self = StObject.set(x, "transitionMode", null)
    
    inline def setTransitionModeUndefined: Self = StObject.set(x, "transitionMode", js.undefined)
    
    inline def setTransitionOnAppear(value: Boolean): Self = StObject.set(x, "transitionOnAppear", value.asInstanceOf[js.Any])
    
    inline def setTransitionOnAppearUndefined: Self = StObject.set(x, "transitionOnAppear", js.undefined)
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWrapData(value: /* code */ String => String): Self = StObject.set(x, "wrapData", js.Any.fromFunction1(value))
    
    inline def setWrapDataUndefined: Self = StObject.set(x, "wrapData", js.undefined)
    
    inline def setWrapListeners(value: /* code */ String => String): Self = StObject.set(x, "wrapListeners", js.Any.fromFunction1(value))
    
    inline def setWrapListenersUndefined: Self = StObject.set(x, "wrapListeners", js.undefined)
  }
}
