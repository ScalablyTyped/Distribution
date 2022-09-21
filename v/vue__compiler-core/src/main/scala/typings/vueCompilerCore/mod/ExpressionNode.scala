package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.SimpleExpressionNode
  - typings.vueCompilerCore.mod.CompoundExpressionNode
*/
trait ExpressionNode
  extends StObject
     with JSChildNode
     with PropsExpression
object ExpressionNode {
  
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
  
  inline def SimpleExpressionNode(constType: ConstantTypes, content: String, isStatic: Boolean, loc: SourceLocation): typings.vueCompilerCore.mod.SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(constType = constType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.SimpleExpressionNode]
  }
}
