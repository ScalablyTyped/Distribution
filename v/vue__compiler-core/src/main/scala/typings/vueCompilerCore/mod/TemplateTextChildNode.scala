package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`2`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`5`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.TextNode
  - typings.vueCompilerCore.mod.InterpolationNode
  - typings.vueCompilerCore.mod.CompoundExpressionNode
*/
trait TemplateTextChildNode extends js.Object
object TemplateTextChildNode {
  
  @scala.inline
  def TextNode(content: String, loc: SourceLocation, `type`: `2`): TemplateTextChildNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateTextChildNode]
  }
  
  @scala.inline
  def InterpolationNode(content: ExpressionNode, loc: SourceLocation, `type`: `5`): TemplateTextChildNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateTextChildNode]
  }
  
  @scala.inline
  def CompoundExpressionNode(
    children: js.Array[
      SimpleExpressionNode | typings.vueCompilerCore.mod.CompoundExpressionNode | InterpolationNode | TextNode | String | js.Symbol
    ],
    loc: SourceLocation,
    `type`: `8`
  ): TemplateTextChildNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateTextChildNode]
  }
}
