package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.VNodeCall
  - typings.vueCompilerCore.mod.CallExpression
  - typings.vueCompilerCore.mod.ObjectExpression
  - typings.vueCompilerCore.mod.ArrayExpression
  - typings.vueCompilerCore.mod.ExpressionNode
  - typings.vueCompilerCore.mod.FunctionExpression
  - typings.vueCompilerCore.mod.ConditionalExpression
  - typings.vueCompilerCore.mod.CacheExpression
  - typings.vueCompilerCore.mod.AssignmentExpression
  - typings.vueCompilerCore.mod.SequenceExpression
*/
trait JSChildNode
  extends StObject
     with CodegenNode
object JSChildNode {
  
  inline def ArrayExpression(elements: js.Array[String | JSChildNode], loc: SourceLocation): typings.vueCompilerCore.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ArrayExpression]
  }
  
  inline def AssignmentExpression(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode): typings.vueCompilerCore.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(24)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.AssignmentExpression]
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
  
  inline def FunctionExpression(isSlot: Boolean, loc: SourceLocation, newline: Boolean): typings.vueCompilerCore.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(18)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.FunctionExpression]
  }
  
  inline def ObjectExpression(loc: SourceLocation, properties: js.Array[Property]): typings.vueCompilerCore.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ObjectExpression]
  }
  
  inline def SequenceExpression(expressions: js.Array[JSChildNode], loc: SourceLocation): typings.vueCompilerCore.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(25)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SequenceExpression]
  }
  
  inline def SimpleExpressionNode(content: String, isConstant: Boolean, isStatic: Boolean, loc: SourceLocation): typings.vueCompilerCore.mod.SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isConstant = isConstant.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SimpleExpressionNode]
  }
  
  inline def VNodeCall(
    disableTracking: Boolean,
    isBlock: Boolean,
    loc: SourceLocation,
    tag: String | js.Symbol | CallExpression
  ): typings.vueCompilerCore.mod.VNodeCall = {
    val __obj = js.Dynamic.literal(disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(13)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.VNodeCall]
  }
}
