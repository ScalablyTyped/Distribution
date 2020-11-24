package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`17`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveArgumentNode extends ArrayExpression {
  
  @JSName("elements")
  var elements_DirectiveArgumentNode: js.Array[String] | (js.Tuple2[String, ExpressionNode]) | (js.Tuple3[String, ExpressionNode, ExpressionNode]) | (js.Tuple4[String, ExpressionNode, ExpressionNode, ObjectExpression]) = js.native
}
object DirectiveArgumentNode {
  
  @scala.inline
  def apply(
    elements: js.Array[String] | (js.Tuple2[String, ExpressionNode]) | (js.Tuple3[String, ExpressionNode, ExpressionNode]) | (js.Tuple4[String, ExpressionNode, ExpressionNode, ObjectExpression]),
    loc: SourceLocation,
    `type`: `17`
  ): DirectiveArgumentNode = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveArgumentNode]
  }
  
  @scala.inline
  implicit class DirectiveArgumentNodeOps[Self <: DirectiveArgumentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElementsVarargs(value: String*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(
      value: js.Array[String] | (js.Tuple2[String, ExpressionNode]) | (js.Tuple3[String, ExpressionNode, ExpressionNode]) | (js.Tuple4[String, ExpressionNode, ExpressionNode, ObjectExpression])
    ): Self = this.set("elements", value.asInstanceOf[js.Any])
  }
}
