package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`21`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`22`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`23`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`24`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`25`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`26`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.BlockStatement
  - typings.vueCompilerCore.mod.TemplateLiteral
  - typings.vueCompilerCore.mod.IfStatement
  - typings.vueCompilerCore.mod.AssignmentExpression
  - typings.vueCompilerCore.mod.ReturnStatement
  - typings.vueCompilerCore.mod.SequenceExpression
*/
trait SSRCodegenNode extends CodegenNode
object SSRCodegenNode {
  
  @scala.inline
  def ReturnStatement(
    loc: SourceLocation,
    returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode,
    `type`: `26`
  ): SSRCodegenNode = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSRCodegenNode]
  }
  
  @scala.inline
  def BlockStatement(body: js.Array[JSChildNode | IfStatement], loc: SourceLocation, `type`: `21`): SSRCodegenNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSRCodegenNode]
  }
  
  @scala.inline
  def AssignmentExpression(left: SimpleExpressionNode, loc: SourceLocation, right: JSChildNode, `type`: `24`): SSRCodegenNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSRCodegenNode]
  }
  
  @scala.inline
  def IfStatement(consequent: BlockStatement, loc: SourceLocation, test: ExpressionNode, `type`: `23`): SSRCodegenNode = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSRCodegenNode]
  }
  
  @scala.inline
  def TemplateLiteral(elements: js.Array[String | JSChildNode], loc: SourceLocation, `type`: `22`): SSRCodegenNode = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSRCodegenNode]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[JSChildNode], loc: SourceLocation, `type`: `25`): SSRCodegenNode = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSRCodegenNode]
  }
}
