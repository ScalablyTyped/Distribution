package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoExpression
  extends StObject
     with CallExpression {
  
  @JSName("arguments")
  var arguments_MemoExpression: js.Tuple4[ExpressionNode, MemoFactory, String, String]
  
  @JSName("callee")
  var callee_MemoExpression: js.Symbol
}
object MemoExpression {
  
  inline def apply(
    arguments: js.Tuple4[ExpressionNode, MemoFactory, String, String],
    callee: js.Symbol,
    loc: SourceLocation
  ): MemoExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[MemoExpression]
  }
  
  extension [Self <: MemoExpression](x: Self) {
    
    inline def setArguments(value: js.Tuple4[ExpressionNode, MemoFactory, String, String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCallee(value: js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
