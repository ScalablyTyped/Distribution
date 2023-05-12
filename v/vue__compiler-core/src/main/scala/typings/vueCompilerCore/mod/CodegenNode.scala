package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.TemplateChildNode
  - typings.vueCompilerCore.mod.JSChildNode
  - typings.vueCompilerCore.mod.SSRCodegenNode
*/
trait CodegenNode extends StObject
object CodegenNode {
  
  inline def ArrayExpression(elements: js.Array[String | Node], loc: SourceLocation): typings.vueCompilerCore.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ArrayExpression]
  }
  
  inline def AssignmentExpression(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode): typings.vueCompilerCore.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(24)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.AssignmentExpression]
  }
  
  inline def BlockStatement(body: js.Array[JSChildNode | IfStatement], loc: SourceLocation): typings.vueCompilerCore.mod.BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(21)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.BlockStatement]
  }
  
  inline def CacheExpression(index: Double, isVNode: Boolean, loc: SourceLocation, value: JSChildNode): typings.vueCompilerCore.mod.CacheExpression = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isVNode = isVNode.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(20)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CacheExpression]
  }
  
  inline def CallExpression(
    arguments: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    callee: String | js.Symbol,
    loc: SourceLocation
  ): typings.vueCompilerCore.mod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CallExpression]
  }
  
  inline def CommentNode(content: String, loc: SourceLocation): typings.vueCompilerCore.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(3)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CommentNode]
  }
  
  inline def ComponentNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typings.vueCompilerCore.mod.ComponentNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 1)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ComponentNode]
  }
  
  inline def CompoundExpressionNode(
    children: js.Array[
      SimpleExpressionNode | typings.vueCompilerCore.mod.CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation
  ): typings.vueCompilerCore.mod.CompoundExpressionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(8)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CompoundExpressionNode]
  }
  
  inline def ConditionalExpression(
    alternate: JSChildNode,
    consequent: JSChildNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode
  ): typings.vueCompilerCore.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(19)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ConditionalExpression]
  }
  
  inline def ForNode(
    children: js.Array[TemplateChildNode],
    loc: SourceLocation,
    parseResult: ForParseResult,
    source: ExpressionNode
  ): typings.vueCompilerCore.mod.ForNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parseResult = parseResult.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(11)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ForNode]
  }
  
  inline def FunctionExpression(isSlot: Boolean, loc: SourceLocation, newline: Boolean): typings.vueCompilerCore.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(18)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.FunctionExpression]
  }
  
  inline def IfBranchNode(children: js.Array[TemplateChildNode], loc: SourceLocation): typings.vueCompilerCore.mod.IfBranchNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(10)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.IfBranchNode]
  }
  
  inline def IfNode(branches: js.Array[IfBranchNode], loc: SourceLocation): typings.vueCompilerCore.mod.IfNode = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.IfNode]
  }
  
  inline def IfStatement(consequent: BlockStatement, loc: SourceLocation, test: ExpressionNode): typings.vueCompilerCore.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(23)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.IfStatement]
  }
  
  inline def InterpolationNode(content: ExpressionNode, loc: SourceLocation): typings.vueCompilerCore.mod.InterpolationNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(5)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.InterpolationNode]
  }
  
  inline def ObjectExpression(loc: SourceLocation, properties: js.Array[Property]): typings.vueCompilerCore.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ObjectExpression]
  }
  
  inline def PlainElementNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typings.vueCompilerCore.mod.PlainElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 0)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.PlainElementNode]
  }
  
  inline def ReturnStatement(loc: SourceLocation, returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode): typings.vueCompilerCore.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(26)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ReturnStatement]
  }
  
  inline def SequenceExpression(expressions: js.Array[JSChildNode], loc: SourceLocation): typings.vueCompilerCore.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(25)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SequenceExpression]
  }
  
  inline def SimpleExpressionNode(constType: ConstantTypes, content: String, isStatic: Boolean, loc: SourceLocation): typings.vueCompilerCore.mod.SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(constType = constType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SimpleExpressionNode]
  }
  
  inline def SlotOutletNode(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typings.vueCompilerCore.mod.SlotOutletNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 2)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SlotOutletNode]
  }
  
  inline def TemplateLiteral(elements: js.Array[String | JSChildNode], loc: SourceLocation): typings.vueCompilerCore.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(22)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.TemplateLiteral]
  }
  
  inline def TemplateNode(
    children: js.Array[TemplateChildNode],
    codegenNode: Unit,
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): typings.vueCompilerCore.mod.TemplateNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], codegenNode = codegenNode.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 3)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.TemplateNode]
  }
  
  inline def TextCallNode(
    codegenNode: CallExpression | SimpleExpressionNode,
    content: TextNode | InterpolationNode | CompoundExpressionNode,
    loc: SourceLocation
  ): typings.vueCompilerCore.mod.TextCallNode = {
    val __obj = js.Dynamic.literal(codegenNode = codegenNode.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(12)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.TextCallNode]
  }
  
  inline def TextNode(content: String, loc: SourceLocation): typings.vueCompilerCore.mod.TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.TextNode]
  }
  
  inline def VNodeCall(
    disableTracking: Boolean,
    isBlock: Boolean,
    isComponent: Boolean,
    loc: SourceLocation,
    tag: String | js.Symbol | CallExpression
  ): typings.vueCompilerCore.mod.VNodeCall = {
    val __obj = js.Dynamic.literal(disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(13)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.VNodeCall]
  }
}
