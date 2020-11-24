package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.anon.Callback
import typings.vueTemplateCompiler.anon.Name
import typings.vueTemplateCompiler.anon.Value
import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`1`
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
  implicit class ASTElementOps[Self <: ASTElement] (val x: Self) extends AnyVal {
    
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
    def setAttrsListVarargs(value: Name*): Self = this.set("attrsList", js.Array(value :_*))
    
    @scala.inline
    def setAttrsList(value: js.Array[Name]): Self = this.set("attrsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsMap(value: Record[String, _]): Self = this.set("attrsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ASTNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ASTNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `1`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAppendAsTree(value: Boolean): Self = this.set("appendAsTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendAsTree: Self = this.set("appendAsTree", js.undefined)
    
    @scala.inline
    def setAttrsVarargs(value: Name*): Self = this.set("attrs", js.Array(value :_*))
    
    @scala.inline
    def setAttrs(value: js.Array[Name]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setClassBinding(value: String): Self = this.set("classBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassBinding: Self = this.set("classBinding", js.undefined)
    
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: ASTDirective*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[ASTDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setElse(value: `true`): Self = this.set("else", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElse: Self = this.set("else", js.undefined)
    
    @scala.inline
    def setElseif(value: String): Self = this.set("elseif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElseif: Self = this.set("elseif", js.undefined)
    
    @scala.inline
    def setEvents(value: ASTElementHandlers): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    
    @scala.inline
    def setForProcessed(value: Boolean): Self = this.set("forProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForProcessed: Self = this.set("forProcessed", js.undefined)
    
    @scala.inline
    def setForbidden(value: `true`): Self = this.set("forbidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForbidden: Self = this.set("forbidden", js.undefined)
    
    @scala.inline
    def setHasBindings(value: Boolean): Self = this.set("hasBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasBindings: Self = this.set("hasBindings", js.undefined)
    
    @scala.inline
    def setIf(value: String): Self = this.set("if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIf: Self = this.set("if", js.undefined)
    
    @scala.inline
    def setIfConditionsVarargs(value: ASTIfCondition*): Self = this.set("ifConditions", js.Array(value :_*))
    
    @scala.inline
    def setIfConditions(value: js.Array[ASTIfCondition]): Self = this.set("ifConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfConditions: Self = this.set("ifConditions", js.undefined)
    
    @scala.inline
    def setIfProcessed(value: Boolean): Self = this.set("ifProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfProcessed: Self = this.set("ifProcessed", js.undefined)
    
    @scala.inline
    def setInlineTemplate(value: `true`): Self = this.set("inlineTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineTemplate: Self = this.set("inlineTemplate", js.undefined)
    
    @scala.inline
    def setIterator1(value: String): Self = this.set("iterator1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterator1: Self = this.set("iterator1", js.undefined)
    
    @scala.inline
    def setIterator2(value: String): Self = this.set("iterator2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterator2: Self = this.set("iterator2", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setModel(value: Callback): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNativeEvents(value: ASTElementHandlers): Self = this.set("nativeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeEvents: Self = this.set("nativeEvents", js.undefined)
    
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
    
    @scala.inline
    def setOnce(value: `true`): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setOnceProcessed(value: Boolean): Self = this.set("onceProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnceProcessed: Self = this.set("onceProcessed", js.undefined)
    
    @scala.inline
    def setParent(value: ASTElement): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setPre(value: `true`): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    
    @scala.inline
    def setProcessed(value: `true`): Self = this.set("processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessed: Self = this.set("processed", js.undefined)
    
    @scala.inline
    def setPropsVarargs(value: Value*): Self = this.set("props", js.Array(value :_*))
    
    @scala.inline
    def setProps(value: js.Array[Value]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefInFor(value: Boolean): Self = this.set("refInFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefInFor: Self = this.set("refInFor", js.undefined)
    
    @scala.inline
    def setScopedSlots(value: Record[String, ASTElement]): Self = this.set("scopedSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopedSlots: Self = this.set("scopedSlots", js.undefined)
    
    @scala.inline
    def setSlotName(value: String): Self = this.set("slotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotName: Self = this.set("slotName", js.undefined)
    
    @scala.inline
    def setSlotScope(value: String): Self = this.set("slotScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotScope: Self = this.set("slotScope", js.undefined)
    
    @scala.inline
    def setSlotTarget(value: String): Self = this.set("slotTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotTarget: Self = this.set("slotTarget", js.undefined)
    
    @scala.inline
    def setSsrOptimizability(value: SSROptimizability): Self = this.set("ssrOptimizability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrOptimizability: Self = this.set("ssrOptimizability", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    
    @scala.inline
    def setStaticClass(value: String): Self = this.set("staticClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticClass: Self = this.set("staticClass", js.undefined)
    
    @scala.inline
    def setStaticInFor(value: Boolean): Self = this.set("staticInFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticInFor: Self = this.set("staticInFor", js.undefined)
    
    @scala.inline
    def setStaticProcessed(value: Boolean): Self = this.set("staticProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticProcessed: Self = this.set("staticProcessed", js.undefined)
    
    @scala.inline
    def setStaticRoot(value: Boolean): Self = this.set("staticRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticRoot: Self = this.set("staticRoot", js.undefined)
    
    @scala.inline
    def setStaticStyle(value: String): Self = this.set("staticStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticStyle: Self = this.set("staticStyle", js.undefined)
    
    @scala.inline
    def setStyleBinding(value: String): Self = this.set("styleBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleBinding: Self = this.set("styleBinding", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTransition(value: String | `true`): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setTransitionMode(value: String): Self = this.set("transitionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionMode: Self = this.set("transitionMode", js.undefined)
    
    @scala.inline
    def setTransitionModeNull: Self = this.set("transitionMode", null)
    
    @scala.inline
    def setTransitionOnAppear(value: Boolean): Self = this.set("transitionOnAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionOnAppear: Self = this.set("transitionOnAppear", js.undefined)
    
    @scala.inline
    def setWrapData(value: /* code */ String => String): Self = this.set("wrapData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWrapData: Self = this.set("wrapData", js.undefined)
    
    @scala.inline
    def setWrapListeners(value: /* code */ String => String): Self = this.set("wrapListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWrapListeners: Self = this.set("wrapListeners", js.undefined)
  }
}
