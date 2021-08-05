package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueCompilerCore.mod.BlockStatement
  - typings.vueCompilerCore.mod.TemplateLiteral
  - typings.vueCompilerCore.mod.IfStatement
  - typings.vueCompilerCore.mod.AssignmentExpression
  - typings.vueCompilerCore.mod.ReturnStatement
  - typings.vueCompilerCore.mod.SequenceExpression
*/
trait SSRCodegenNode
  extends StObject
     with CodegenNode
object SSRCodegenNode {
  
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
  
  inline def IfStatement(consequent: BlockStatement, loc: SourceLocation, test: ExpressionNode): typings.vueCompilerCore.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(23)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.IfStatement]
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
  
  inline def TemplateLiteral(elements: js.Array[String | JSChildNode], loc: SourceLocation): typings.vueCompilerCore.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(22)
    __obj.asInstanceOf[typings.vueCompilerCore.mod.TemplateLiteral]
  }
}
