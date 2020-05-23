package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.anon.Callback
import typings.vueTemplateCompiler.anon.Name
import typings.vueTemplateCompiler.anon.Value
import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typings.vueTemplateCompiler.vueTemplateCompilerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTElement extends ASTNode {
  var alias: js.UndefOr[String] = js.undefined
  // weex specific
  var appendAsTree: js.UndefOr[Boolean] = js.undefined
  var attrs: js.UndefOr[js.Array[Name]] = js.undefined
  var attrsList: js.Array[Name]
  var attrsMap: Record[String, _]
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
  @scala.inline
  def apply(
    attrsList: js.Array[Name],
    attrsMap: Record[String, _],
    children: js.Array[ASTNode],
    tag: String,
    `type`: `1`,
    alias: String = null,
    appendAsTree: js.UndefOr[Boolean] = js.undefined,
    attrs: js.Array[Name] = null,
    classBinding: String = null,
    component: String = null,
    directives: js.Array[ASTDirective] = null,
    `else`: `true` = null,
    elseif: String = null,
    events: ASTElementHandlers = null,
    `for`: String = null,
    forProcessed: js.UndefOr[Boolean] = js.undefined,
    forbidden: `true` = null,
    hasBindings: js.UndefOr[Boolean] = js.undefined,
    `if`: String = null,
    ifConditions: js.Array[ASTIfCondition] = null,
    ifProcessed: js.UndefOr[Boolean] = js.undefined,
    inlineTemplate: `true` = null,
    iterator1: String = null,
    iterator2: String = null,
    key: String = null,
    model: Callback = null,
    nativeEvents: ASTElementHandlers = null,
    ns: String = null,
    once: `true` = null,
    onceProcessed: js.UndefOr[Boolean] = js.undefined,
    parent: ASTElement = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    pre: `true` = null,
    processed: `true` = null,
    props: js.Array[Value] = null,
    ref: String = null,
    refInFor: js.UndefOr[Boolean] = js.undefined,
    scopedSlots: Record[String, ASTElement] = null,
    slotName: String = null,
    slotScope: String = null,
    slotTarget: String = null,
    ssrOptimizability: SSROptimizability = null,
    static: js.UndefOr[Boolean] = js.undefined,
    staticClass: String = null,
    staticInFor: js.UndefOr[Boolean] = js.undefined,
    staticProcessed: js.UndefOr[Boolean] = js.undefined,
    staticRoot: js.UndefOr[Boolean] = js.undefined,
    staticStyle: String = null,
    styleBinding: String = null,
    text: String = null,
    transition: String | `true` = null,
    transitionMode: js.UndefOr[Null | String] = js.undefined,
    transitionOnAppear: js.UndefOr[Boolean] = js.undefined,
    wrapData: /* code */ String => String = null,
    wrapListeners: /* code */ String => String = null
  ): ASTElement = {
    val __obj = js.Dynamic.literal(attrsList = attrsList.asInstanceOf[js.Any], attrsMap = attrsMap.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(appendAsTree)) __obj.updateDynamic("appendAsTree")(appendAsTree.get.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (classBinding != null) __obj.updateDynamic("classBinding")(classBinding.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (`else` != null) __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    if (elseif != null) __obj.updateDynamic("elseif")(elseif.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (!js.isUndefined(forProcessed)) __obj.updateDynamic("forProcessed")(forProcessed.get.asInstanceOf[js.Any])
    if (forbidden != null) __obj.updateDynamic("forbidden")(forbidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBindings)) __obj.updateDynamic("hasBindings")(hasBindings.get.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (ifConditions != null) __obj.updateDynamic("ifConditions")(ifConditions.asInstanceOf[js.Any])
    if (!js.isUndefined(ifProcessed)) __obj.updateDynamic("ifProcessed")(ifProcessed.get.asInstanceOf[js.Any])
    if (inlineTemplate != null) __obj.updateDynamic("inlineTemplate")(inlineTemplate.asInstanceOf[js.Any])
    if (iterator1 != null) __obj.updateDynamic("iterator1")(iterator1.asInstanceOf[js.Any])
    if (iterator2 != null) __obj.updateDynamic("iterator2")(iterator2.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (nativeEvents != null) __obj.updateDynamic("nativeEvents")(nativeEvents.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (once != null) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(onceProcessed)) __obj.updateDynamic("onceProcessed")(onceProcessed.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.get.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (processed != null) __obj.updateDynamic("processed")(processed.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(refInFor)) __obj.updateDynamic("refInFor")(refInFor.get.asInstanceOf[js.Any])
    if (scopedSlots != null) __obj.updateDynamic("scopedSlots")(scopedSlots.asInstanceOf[js.Any])
    if (slotName != null) __obj.updateDynamic("slotName")(slotName.asInstanceOf[js.Any])
    if (slotScope != null) __obj.updateDynamic("slotScope")(slotScope.asInstanceOf[js.Any])
    if (slotTarget != null) __obj.updateDynamic("slotTarget")(slotTarget.asInstanceOf[js.Any])
    if (ssrOptimizability != null) __obj.updateDynamic("ssrOptimizability")(ssrOptimizability.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.get.asInstanceOf[js.Any])
    if (staticClass != null) __obj.updateDynamic("staticClass")(staticClass.asInstanceOf[js.Any])
    if (!js.isUndefined(staticInFor)) __obj.updateDynamic("staticInFor")(staticInFor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staticProcessed)) __obj.updateDynamic("staticProcessed")(staticProcessed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staticRoot)) __obj.updateDynamic("staticRoot")(staticRoot.get.asInstanceOf[js.Any])
    if (staticStyle != null) __obj.updateDynamic("staticStyle")(staticStyle.asInstanceOf[js.Any])
    if (styleBinding != null) __obj.updateDynamic("styleBinding")(styleBinding.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionMode)) __obj.updateDynamic("transitionMode")(transitionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionOnAppear)) __obj.updateDynamic("transitionOnAppear")(transitionOnAppear.get.asInstanceOf[js.Any])
    if (wrapData != null) __obj.updateDynamic("wrapData")(js.Any.fromFunction1(wrapData))
    if (wrapListeners != null) __obj.updateDynamic("wrapListeners")(js.Any.fromFunction1(wrapListeners))
    __obj.asInstanceOf[ASTElement]
  }
}

