package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import typings.std.Record
import typings.vueDashTemplateDashCompiler.Anon_Callback
import typings.vueDashTemplateDashCompiler.Anon_Name
import typings.vueDashTemplateDashCompiler.Anon_NameValue
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerNumbers.`1`
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTElement extends ASTNode {
  var alias: js.UndefOr[String] = js.undefined
  // weex specific
  var appendAsTree: js.UndefOr[Boolean] = js.undefined
  var attrs: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var attrsList: js.Array[Anon_Name]
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
  var model: js.UndefOr[Anon_Callback] = js.undefined
  var nativeEvents: js.UndefOr[ASTElementHandlers] = js.undefined
  var ns: js.UndefOr[String] = js.undefined
  var once: js.UndefOr[`true`] = js.undefined
  var onceProcessed: js.UndefOr[Boolean] = js.undefined
  var parent: js.UndefOr[ASTElement] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var pre: js.UndefOr[`true`] = js.undefined
  var processed: js.UndefOr[`true`] = js.undefined
  var props: js.UndefOr[js.Array[Anon_NameValue]] = js.undefined
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
    attrsList: js.Array[Anon_Name],
    attrsMap: Record[String, _],
    children: js.Array[ASTNode],
    tag: String,
    `type`: `1`,
    alias: String = null,
    appendAsTree: js.UndefOr[Boolean] = js.undefined,
    attrs: js.Array[Anon_Name] = null,
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
    model: Anon_Callback = null,
    nativeEvents: ASTElementHandlers = null,
    ns: String = null,
    once: `true` = null,
    onceProcessed: js.UndefOr[Boolean] = js.undefined,
    parent: ASTElement = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    pre: `true` = null,
    processed: `true` = null,
    props: js.Array[Anon_NameValue] = null,
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
    transitionMode: String = null,
    transitionOnAppear: js.UndefOr[Boolean] = js.undefined,
    wrapData: /* code */ String => String = null,
    wrapListeners: /* code */ String => String = null
  ): ASTElement = {
    val __obj = js.Dynamic.literal(attrsList = attrsList, attrsMap = attrsMap, children = children, tag = tag)
    __obj.updateDynamic("type")(`type`)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(appendAsTree)) __obj.updateDynamic("appendAsTree")(appendAsTree)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (classBinding != null) __obj.updateDynamic("classBinding")(classBinding)
    if (component != null) __obj.updateDynamic("component")(component)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (`else` != null) __obj.updateDynamic("else")(`else`)
    if (elseif != null) __obj.updateDynamic("elseif")(elseif)
    if (events != null) __obj.updateDynamic("events")(events)
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    if (!js.isUndefined(forProcessed)) __obj.updateDynamic("forProcessed")(forProcessed)
    if (forbidden != null) __obj.updateDynamic("forbidden")(forbidden)
    if (!js.isUndefined(hasBindings)) __obj.updateDynamic("hasBindings")(hasBindings)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    if (ifConditions != null) __obj.updateDynamic("ifConditions")(ifConditions)
    if (!js.isUndefined(ifProcessed)) __obj.updateDynamic("ifProcessed")(ifProcessed)
    if (inlineTemplate != null) __obj.updateDynamic("inlineTemplate")(inlineTemplate)
    if (iterator1 != null) __obj.updateDynamic("iterator1")(iterator1)
    if (iterator2 != null) __obj.updateDynamic("iterator2")(iterator2)
    if (key != null) __obj.updateDynamic("key")(key)
    if (model != null) __obj.updateDynamic("model")(model)
    if (nativeEvents != null) __obj.updateDynamic("nativeEvents")(nativeEvents)
    if (ns != null) __obj.updateDynamic("ns")(ns)
    if (once != null) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(onceProcessed)) __obj.updateDynamic("onceProcessed")(onceProcessed)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (pre != null) __obj.updateDynamic("pre")(pre)
    if (processed != null) __obj.updateDynamic("processed")(processed)
    if (props != null) __obj.updateDynamic("props")(props)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (!js.isUndefined(refInFor)) __obj.updateDynamic("refInFor")(refInFor)
    if (scopedSlots != null) __obj.updateDynamic("scopedSlots")(scopedSlots)
    if (slotName != null) __obj.updateDynamic("slotName")(slotName)
    if (slotScope != null) __obj.updateDynamic("slotScope")(slotScope)
    if (slotTarget != null) __obj.updateDynamic("slotTarget")(slotTarget)
    if (ssrOptimizability != null) __obj.updateDynamic("ssrOptimizability")(ssrOptimizability)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (staticClass != null) __obj.updateDynamic("staticClass")(staticClass)
    if (!js.isUndefined(staticInFor)) __obj.updateDynamic("staticInFor")(staticInFor)
    if (!js.isUndefined(staticProcessed)) __obj.updateDynamic("staticProcessed")(staticProcessed)
    if (!js.isUndefined(staticRoot)) __obj.updateDynamic("staticRoot")(staticRoot)
    if (staticStyle != null) __obj.updateDynamic("staticStyle")(staticStyle)
    if (styleBinding != null) __obj.updateDynamic("styleBinding")(styleBinding)
    if (text != null) __obj.updateDynamic("text")(text)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (transitionMode != null) __obj.updateDynamic("transitionMode")(transitionMode)
    if (!js.isUndefined(transitionOnAppear)) __obj.updateDynamic("transitionOnAppear")(transitionOnAppear)
    if (wrapData != null) __obj.updateDynamic("wrapData")(js.Any.fromFunction1(wrapData))
    if (wrapListeners != null) __obj.updateDynamic("wrapListeners")(js.Any.fromFunction1(wrapListeners))
    __obj.asInstanceOf[ASTElement]
  }
}

