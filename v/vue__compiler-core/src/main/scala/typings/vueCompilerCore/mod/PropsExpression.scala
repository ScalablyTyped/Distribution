package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.ObjectExpression
  - typings.vueCompilerCore.mod.CallExpression
  - typings.vueCompilerCore.mod.ExpressionNode
*/
trait PropsExpression extends StObject
object PropsExpression {
  
  @scala.inline
  def CallExpression(
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
  
  @scala.inline
  def CompoundExpressionNode(
    children: js.Array[
      SimpleExpressionNode | typings.vueCompilerCore.mod.CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation
  ): typings.vueCompilerCore.mod.CompoundExpressionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(8)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.CompoundExpressionNode]
  }
  
  @scala.inline
  def ObjectExpression(loc: SourceLocation, properties: js.Array[Property]): typings.vueCompilerCore.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.ObjectExpression]
  }
  
  @scala.inline
  def SimpleExpressionNode(content: String, isConstant: Boolean, isStatic: Boolean, loc: SourceLocation): typings.vueCompilerCore.mod.SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isConstant = isConstant.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SimpleExpressionNode]
  }
}
