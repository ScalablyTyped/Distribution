package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveArgumentNode
  extends StObject
     with ArrayExpression {
  
  @JSName("elements")
  var elements_DirectiveArgumentNode: js.Array[String] | (js.Tuple2[String, ExpressionNode]) | (js.Tuple3[String, ExpressionNode, ExpressionNode]) | (js.Tuple4[String, ExpressionNode, ExpressionNode, ObjectExpression])
}
object DirectiveArgumentNode {
  
  @scala.inline
  def apply(
    elements: js.Array[String] | (js.Tuple2[String, ExpressionNode]) | (js.Tuple3[String, ExpressionNode, ExpressionNode]) | (js.Tuple4[String, ExpressionNode, ExpressionNode, ObjectExpression]),
    loc: SourceLocation
  ): DirectiveArgumentNode = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[DirectiveArgumentNode]
  }
  
  @scala.inline
  implicit class DirectiveArgumentNodeMutableBuilder[Self <: DirectiveArgumentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(
      value: js.Array[String] | (js.Tuple2[String, ExpressionNode]) | (js.Tuple3[String, ExpressionNode, ExpressionNode]) | (js.Tuple4[String, ExpressionNode, ExpressionNode, ObjectExpression])
    ): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
