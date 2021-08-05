package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForRenderListExpression
  extends StObject
     with CallExpression {
  
  @JSName("arguments")
  var arguments_ForRenderListExpression: js.Tuple2[ExpressionNode, ForIteratorExpression]
  
  @JSName("callee")
  var callee_ForRenderListExpression: js.Symbol
}
object ForRenderListExpression {
  
  inline def apply(
    arguments: js.Tuple2[ExpressionNode, ForIteratorExpression],
    callee: js.Symbol,
    loc: SourceLocation
  ): ForRenderListExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[ForRenderListExpression]
  }
  
  extension [Self <: ForRenderListExpression](x: Self) {
    
    inline def setArguments(value: js.Tuple2[ExpressionNode, ForIteratorExpression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCallee(value: js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
