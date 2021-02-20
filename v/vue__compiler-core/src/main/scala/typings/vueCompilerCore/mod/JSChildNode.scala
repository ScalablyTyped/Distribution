package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`13`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`14`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`15`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`17`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`18`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`19`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`20`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`24`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`25`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`4`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait JSChildNode extends CodegenNode
object JSChildNode {
  
  @scala.inline
  def ArrayExpression(elements: js.Array[String | JSChildNode], loc: SourceLocation, `type`: `17`): typings.vueCompilerCore.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ArrayExpression]
  }
  
  @scala.inline
  def AssignmentExpression(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode, `type`: `24`): typings.vueCompilerCore.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.AssignmentExpression]
  }
  
  @scala.inline
  def CacheExpression(index: Double, isVNode: Boolean, loc: SourceLocation, `type`: `20`, value: JSChildNode): typings.vueCompilerCore.mod.CacheExpression = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isVNode = isVNode.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CacheExpression]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    callee: String | js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): typings.vueCompilerCore.mod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CallExpression]
  }
  
  @scala.inline
  def CompoundExpressionNode(
    children: js.Array[
      SimpleExpressionNode | typings.vueCompilerCore.mod.CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation,
    `type`: `8`
  ): typings.vueCompilerCore.mod.CompoundExpressionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CompoundExpressionNode]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: JSChildNode,
    consequent: JSChildNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode,
    `type`: `19`
  ): typings.vueCompilerCore.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ConditionalExpression]
  }
  
  @scala.inline
  def FunctionExpression(isSlot: Boolean, loc: SourceLocation, newline: Boolean, `type`: `18`): typings.vueCompilerCore.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.FunctionExpression]
  }
  
  @scala.inline
  def ObjectExpression(loc: SourceLocation, properties: js.Array[Property], `type`: `15`): typings.vueCompilerCore.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ObjectExpression]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[JSChildNode], loc: SourceLocation, `type`: `25`): typings.vueCompilerCore.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SequenceExpression]
  }
  
  @scala.inline
  def SimpleExpressionNode(content: String, isConstant: Boolean, isStatic: Boolean, loc: SourceLocation, `type`: `4`): typings.vueCompilerCore.mod.SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isConstant = isConstant.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SimpleExpressionNode]
  }
  
  @scala.inline
  def VNodeCall(
    disableTracking: Boolean,
    isBlock: Boolean,
    loc: SourceLocation,
    tag: String | js.Symbol | CallExpression,
    `type`: `13`
  ): typings.vueCompilerCore.mod.VNodeCall = {
    val __obj = js.Dynamic.literal(disableTracking = disableTracking.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueCompilerCore.mod.VNodeCall]
  }
}
