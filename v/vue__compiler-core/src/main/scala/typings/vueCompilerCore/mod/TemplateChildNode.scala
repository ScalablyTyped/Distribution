package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`0`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`10`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`11`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`12`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`2`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`3`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`5`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`8`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.ElementNode
  - typings.vueCompilerCore.mod.InterpolationNode
  - typings.vueCompilerCore.mod.CompoundExpressionNode
  - typings.vueCompilerCore.mod.TextNode
  - typings.vueCompilerCore.mod.CommentNode
  - typings.vueCompilerCore.mod.IfNode
  - typings.vueCompilerCore.mod.IfBranchNode
  - typings.vueCompilerCore.mod.ForNode
  - typings.vueCompilerCore.mod.TextCallNode
*/
trait TemplateChildNode extends CodegenNode
object TemplateChildNode {
  
  @scala.inline
  def InterpolationNode(content: ExpressionNode, loc: SourceLocation, `type`: `5`): TemplateChildNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def ComponentNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `1`,
    `type`: `1`
  ): TemplateChildNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def PlainElementNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `0`,
    `type`: `1`
  ): TemplateChildNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def ForNode(
    children: js.Array[TemplateChildNode],
    loc: SourceLocation,
    parseResult: ForParseResult,
    source: ExpressionNode,
    `type`: `11`
  ): TemplateChildNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parseResult = parseResult.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def IfNode(branches: js.Array[IfBranchNode], loc: SourceLocation, `type`: `9`): TemplateChildNode = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def SlotOutletNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `2`,
    `type`: `1`
  ): TemplateChildNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def TemplateNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `3`,
    `type`: `1`
  ): TemplateChildNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def IfBranchNode(children: js.Array[TemplateChildNode], loc: SourceLocation, `type`: `10`): TemplateChildNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def TextNode(content: String, loc: SourceLocation, `type`: `2`): TemplateChildNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def CompoundExpressionNode(
    children: js.Array[
      SimpleExpressionNode | typings.vueCompilerCore.mod.CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation,
    `type`: `8`
  ): TemplateChildNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def TextCallNode(
    codegenNode: CallExpression | SimpleExpressionNode,
    content: TextNode | InterpolationNode | CompoundExpressionNode,
    loc: SourceLocation,
    `type`: `12`
  ): TemplateChildNode = {
    val __obj = js.Dynamic.literal(codegenNode = codegenNode.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
  
  @scala.inline
  def CommentNode(content: String, loc: SourceLocation, `type`: `3`): TemplateChildNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChildNode]
  }
}
