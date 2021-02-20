package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.anon.Callback
import typings.vueTemplateCompiler.anon.Name
import typings.vueTemplateCompiler.anon.Value
import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASTElement extends ASTNode {
  
  var alias: js.UndefOr[String] = js.native
  
  // weex specific
  var appendAsTree: js.UndefOr[Boolean] = js.native
  
  var attrs: js.UndefOr[js.Array[Name]] = js.native
  
  var attrsList: js.Array[Name] = js.native
  
  var attrsMap: Record[String, _] = js.native
  
  var children: js.Array[ASTNode] = js.native
  
  var classBinding: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[String] = js.native
  
  var directives: js.UndefOr[js.Array[ASTDirective]] = js.native
  
  var `else`: js.UndefOr[`true`] = js.native
  
  var elseif: js.UndefOr[String] = js.native
  
  var events: js.UndefOr[ASTElementHandlers] = js.native
  
  var `for`: js.UndefOr[String] = js.native
  
  var forProcessed: js.UndefOr[Boolean] = js.native
  
  var forbidden: js.UndefOr[`true`] = js.native
  
  var hasBindings: js.UndefOr[Boolean] = js.native
  
  var `if`: js.UndefOr[String] = js.native
  
  var ifConditions: js.UndefOr[js.Array[ASTIfCondition]] = js.native
  
  var ifProcessed: js.UndefOr[Boolean] = js.native
  
  var inlineTemplate: js.UndefOr[`true`] = js.native
  
  var iterator1: js.UndefOr[String] = js.native
  
  var iterator2: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var model: js.UndefOr[Callback] = js.native
  
  var nativeEvents: js.UndefOr[ASTElementHandlers] = js.native
  
  var ns: js.UndefOr[String] = js.native
  
  var once: js.UndefOr[`true`] = js.native
  
  var onceProcessed: js.UndefOr[Boolean] = js.native
  
  var parent: js.UndefOr[ASTElement] = js.native
  
  var plain: js.UndefOr[Boolean] = js.native
  
  var pre: js.UndefOr[`true`] = js.native
  
  var processed: js.UndefOr[`true`] = js.native
  
  var props: js.UndefOr[js.Array[Value]] = js.native
  
  var ref: js.UndefOr[String] = js.native
  
  var refInFor: js.UndefOr[Boolean] = js.native
  
  var scopedSlots: js.UndefOr[Record[String, ASTElement]] = js.native
  
  var slotName: js.UndefOr[String] = js.native
  
  var slotScope: js.UndefOr[String] = js.native
  
  var slotTarget: js.UndefOr[String] = js.native
  
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.native
  
  var static: js.UndefOr[Boolean] = js.native
  
  var staticClass: js.UndefOr[String] = js.native
  
  var staticInFor: js.UndefOr[Boolean] = js.native
  
  var staticProcessed: js.UndefOr[Boolean] = js.native
  
  var staticRoot: js.UndefOr[Boolean] = js.native
  
  var staticStyle: js.UndefOr[String] = js.native
  
  var styleBinding: js.UndefOr[String] = js.native
  
  var tag: String = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[String | `true`] = js.native
  
  var transitionMode: js.UndefOr[String | Null] = js.native
  
  var transitionOnAppear: js.UndefOr[Boolean] = js.native
  
  var `type`: `1` = js.native
  
  var wrapData: js.UndefOr[js.Function1[/* code */ String, String]] = js.native
  
  var wrapListeners: js.UndefOr[js.Function1[/* code */ String, String]] = js.native
}
object ASTElement {
  
  @scala.inline
  def apply(
    attrsList: js.Array[Name],
    attrsMap: Record[String, _],
    children: js.Array[ASTNode],
    tag: String,
    `type`: `1`
  ): ASTElement = {
    val __obj = js.Dynamic.literal(attrsList = attrsList.asInstanceOf[js.Any], attrsMap = attrsMap.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTElement]
  }
  
  @scala.inline
  implicit class ASTElementMutableBuilder[Self <: ASTElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setAppendAsTree(value: Boolean): Self = StObject.set(x, "appendAsTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendAsTreeUndefined: Self = StObject.set(x, "appendAsTree", js.undefined)
    
    @scala.inline
    def setAttrs(value: js.Array[Name]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsList(value: js.Array[Name]): Self = StObject.set(x, "attrsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsListVarargs(value: Name*): Self = StObject.set(x, "attrsList", js.Array(value :_*))
    
    @scala.inline
    def setAttrsMap(value: Record[String, _]): Self = StObject.set(x, "attrsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    @scala.inline
    def setAttrsVarargs(value: Name*): Self = StObject.set(x, "attrs", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ASTNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ASTNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClassBinding(value: String): Self = StObject.set(x, "classBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBindingUndefined: Self = StObject.set(x, "classBinding", js.undefined)
    
    @scala.inline
    def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDirectives(value: js.Array[ASTDirective]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: ASTDirective*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setElse(value: `true`): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
    
    @scala.inline
    def setElseif(value: String): Self = StObject.set(x, "elseif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElseifUndefined: Self = StObject.set(x, "elseif", js.undefined)
    
    @scala.inline
    def setEvents(value: ASTElementHandlers): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForProcessed(value: Boolean): Self = StObject.set(x, "forProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForProcessedUndefined: Self = StObject.set(x, "forProcessed", js.undefined)
    
    @scala.inline
    def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    @scala.inline
    def setForbidden(value: `true`): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenUndefined: Self = StObject.set(x, "forbidden", js.undefined)
    
    @scala.inline
    def setHasBindings(value: Boolean): Self = StObject.set(x, "hasBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBindingsUndefined: Self = StObject.set(x, "hasBindings", js.undefined)
    
    @scala.inline
    def setIf(value: String): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfConditions(value: js.Array[ASTIfCondition]): Self = StObject.set(x, "ifConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfConditionsUndefined: Self = StObject.set(x, "ifConditions", js.undefined)
    
    @scala.inline
    def setIfConditionsVarargs(value: ASTIfCondition*): Self = StObject.set(x, "ifConditions", js.Array(value :_*))
    
    @scala.inline
    def setIfProcessed(value: Boolean): Self = StObject.set(x, "ifProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfProcessedUndefined: Self = StObject.set(x, "ifProcessed", js.undefined)
    
    @scala.inline
    def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    @scala.inline
    def setInlineTemplate(value: `true`): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
    
    @scala.inline
    def setIterator1(value: String): Self = StObject.set(x, "iterator1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterator1Undefined: Self = StObject.set(x, "iterator1", js.undefined)
    
    @scala.inline
    def setIterator2(value: String): Self = StObject.set(x, "iterator2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterator2Undefined: Self = StObject.set(x, "iterator2", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setModel(value: Callback): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNativeEvents(value: ASTElementHandlers): Self = StObject.set(x, "nativeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeEventsUndefined: Self = StObject.set(x, "nativeEvents", js.undefined)
    
    @scala.inline
    def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    @scala.inline
    def setOnce(value: `true`): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceProcessed(value: Boolean): Self = StObject.set(x, "onceProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceProcessedUndefined: Self = StObject.set(x, "onceProcessed", js.undefined)
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setParent(value: ASTElement): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    @scala.inline
    def setPre(value: `true`): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    @scala.inline
    def setProcessed(value: `true`): Self = StObject.set(x, "processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedUndefined: Self = StObject.set(x, "processed", js.undefined)
    
    @scala.inline
    def setProps(value: js.Array[Value]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    @scala.inline
    def setPropsVarargs(value: Value*): Self = StObject.set(x, "props", js.Array(value :_*))
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefInFor(value: Boolean): Self = StObject.set(x, "refInFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefInForUndefined: Self = StObject.set(x, "refInFor", js.undefined)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setScopedSlots(value: Record[String, ASTElement]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedSlotsUndefined: Self = StObject.set(x, "scopedSlots", js.undefined)
    
    @scala.inline
    def setSlotName(value: String): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotNameUndefined: Self = StObject.set(x, "slotName", js.undefined)
    
    @scala.inline
    def setSlotScope(value: String): Self = StObject.set(x, "slotScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotScopeUndefined: Self = StObject.set(x, "slotScope", js.undefined)
    
    @scala.inline
    def setSlotTarget(value: String): Self = StObject.set(x, "slotTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTargetUndefined: Self = StObject.set(x, "slotTarget", js.undefined)
    
    @scala.inline
    def setSsrOptimizability(value: SSROptimizability): Self = StObject.set(x, "ssrOptimizability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrOptimizabilityUndefined: Self = StObject.set(x, "ssrOptimizability", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticClass(value: String): Self = StObject.set(x, "staticClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticClassUndefined: Self = StObject.set(x, "staticClass", js.undefined)
    
    @scala.inline
    def setStaticInFor(value: Boolean): Self = StObject.set(x, "staticInFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticInForUndefined: Self = StObject.set(x, "staticInFor", js.undefined)
    
    @scala.inline
    def setStaticProcessed(value: Boolean): Self = StObject.set(x, "staticProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticProcessedUndefined: Self = StObject.set(x, "staticProcessed", js.undefined)
    
    @scala.inline
    def setStaticRoot(value: Boolean): Self = StObject.set(x, "staticRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticRootUndefined: Self = StObject.set(x, "staticRoot", js.undefined)
    
    @scala.inline
    def setStaticStyle(value: String): Self = StObject.set(x, "staticStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticStyleUndefined: Self = StObject.set(x, "staticStyle", js.undefined)
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    @scala.inline
    def setStyleBinding(value: String): Self = StObject.set(x, "styleBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBindingUndefined: Self = StObject.set(x, "styleBinding", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTransition(value: String | `true`): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionMode(value: String): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionModeNull: Self = StObject.set(x, "transitionMode", null)
    
    @scala.inline
    def setTransitionModeUndefined: Self = StObject.set(x, "transitionMode", js.undefined)
    
    @scala.inline
    def setTransitionOnAppear(value: Boolean): Self = StObject.set(x, "transitionOnAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionOnAppearUndefined: Self = StObject.set(x, "transitionOnAppear", js.undefined)
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapData(value: /* code */ String => String): Self = StObject.set(x, "wrapData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrapDataUndefined: Self = StObject.set(x, "wrapData", js.undefined)
    
    @scala.inline
    def setWrapListeners(value: /* code */ String => String): Self = StObject.set(x, "wrapListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrapListenersUndefined: Self = StObject.set(x, "wrapListeners", js.undefined)
  }
}
