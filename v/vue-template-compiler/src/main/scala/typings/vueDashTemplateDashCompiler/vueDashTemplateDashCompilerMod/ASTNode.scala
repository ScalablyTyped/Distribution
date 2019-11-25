package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import typings.std.Record
import typings.vueDashTemplateDashCompiler.Anon_Callback
import typings.vueDashTemplateDashCompiler.Anon_Name
import typings.vueDashTemplateDashCompiler.Anon_NameValue
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerNumbers.`1`
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerNumbers.`2`
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerNumbers.`3`
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod.ASTElement
  - typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod.ASTText
  - typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod.ASTExpression
*/
trait ASTNode extends js.Object

object ASTNode {
  @scala.inline
  def ASTElement(
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
    parent: typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod.ASTElement = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    pre: `true` = null,
    processed: `true` = null,
    props: js.Array[Anon_NameValue] = null,
    ref: String = null,
    refInFor: js.UndefOr[Boolean] = js.undefined,
    scopedSlots: Record[
      String, 
      typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod.ASTElement
    ] = null,
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
  ): ASTNode = {
    val __obj = js.Dynamic.literal(attrsList = attrsList.asInstanceOf[js.Any], attrsMap = attrsMap.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(appendAsTree)) __obj.updateDynamic("appendAsTree")(appendAsTree.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (classBinding != null) __obj.updateDynamic("classBinding")(classBinding.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (`else` != null) __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    if (elseif != null) __obj.updateDynamic("elseif")(elseif.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (!js.isUndefined(forProcessed)) __obj.updateDynamic("forProcessed")(forProcessed.asInstanceOf[js.Any])
    if (forbidden != null) __obj.updateDynamic("forbidden")(forbidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBindings)) __obj.updateDynamic("hasBindings")(hasBindings.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (ifConditions != null) __obj.updateDynamic("ifConditions")(ifConditions.asInstanceOf[js.Any])
    if (!js.isUndefined(ifProcessed)) __obj.updateDynamic("ifProcessed")(ifProcessed.asInstanceOf[js.Any])
    if (inlineTemplate != null) __obj.updateDynamic("inlineTemplate")(inlineTemplate.asInstanceOf[js.Any])
    if (iterator1 != null) __obj.updateDynamic("iterator1")(iterator1.asInstanceOf[js.Any])
    if (iterator2 != null) __obj.updateDynamic("iterator2")(iterator2.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (nativeEvents != null) __obj.updateDynamic("nativeEvents")(nativeEvents.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (once != null) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(onceProcessed)) __obj.updateDynamic("onceProcessed")(onceProcessed.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (processed != null) __obj.updateDynamic("processed")(processed.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(refInFor)) __obj.updateDynamic("refInFor")(refInFor.asInstanceOf[js.Any])
    if (scopedSlots != null) __obj.updateDynamic("scopedSlots")(scopedSlots.asInstanceOf[js.Any])
    if (slotName != null) __obj.updateDynamic("slotName")(slotName.asInstanceOf[js.Any])
    if (slotScope != null) __obj.updateDynamic("slotScope")(slotScope.asInstanceOf[js.Any])
    if (slotTarget != null) __obj.updateDynamic("slotTarget")(slotTarget.asInstanceOf[js.Any])
    if (ssrOptimizability != null) __obj.updateDynamic("ssrOptimizability")(ssrOptimizability.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (staticClass != null) __obj.updateDynamic("staticClass")(staticClass.asInstanceOf[js.Any])
    if (!js.isUndefined(staticInFor)) __obj.updateDynamic("staticInFor")(staticInFor.asInstanceOf[js.Any])
    if (!js.isUndefined(staticProcessed)) __obj.updateDynamic("staticProcessed")(staticProcessed.asInstanceOf[js.Any])
    if (!js.isUndefined(staticRoot)) __obj.updateDynamic("staticRoot")(staticRoot.asInstanceOf[js.Any])
    if (staticStyle != null) __obj.updateDynamic("staticStyle")(staticStyle.asInstanceOf[js.Any])
    if (styleBinding != null) __obj.updateDynamic("styleBinding")(styleBinding.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (transitionMode != null) __obj.updateDynamic("transitionMode")(transitionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionOnAppear)) __obj.updateDynamic("transitionOnAppear")(transitionOnAppear.asInstanceOf[js.Any])
    if (wrapData != null) __obj.updateDynamic("wrapData")(js.Any.fromFunction1(wrapData))
    if (wrapListeners != null) __obj.updateDynamic("wrapListeners")(js.Any.fromFunction1(wrapListeners))
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ASTText(
    text: String,
    `type`: `3`,
    isComment: js.UndefOr[Boolean] = js.undefined,
    ssrOptimizability: SSROptimizability = null,
    static: js.UndefOr[Boolean] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(isComment)) __obj.updateDynamic("isComment")(isComment.asInstanceOf[js.Any])
    if (ssrOptimizability != null) __obj.updateDynamic("ssrOptimizability")(ssrOptimizability.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ASTExpression(
    expression: String,
    text: String,
    tokens: js.Array[String | (Record[String, _])],
    `type`: `2`,
    ssrOptimizability: SSROptimizability = null,
    static: js.UndefOr[Boolean] = js.undefined
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ssrOptimizability != null) __obj.updateDynamic("ssrOptimizability")(ssrOptimizability.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}

