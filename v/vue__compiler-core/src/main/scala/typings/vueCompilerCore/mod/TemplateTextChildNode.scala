package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.TextNode
  - typings.vueCompilerCore.mod.InterpolationNode
  - typings.vueCompilerCore.mod.CompoundExpressionNode
*/
trait TemplateTextChildNode extends StObject
object TemplateTextChildNode {
  
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
  def InterpolationNode(content: ExpressionNode, loc: SourceLocation): typings.vueCompilerCore.mod.InterpolationNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(5)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.InterpolationNode]
  }
  
  @scala.inline
  def TextNode(content: String, loc: SourceLocation): typings.vueCompilerCore.mod.TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.TextNode]
  }
}
