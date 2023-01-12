package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwaitExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var argument: Expression
  
  @JSName("type")
  var type_AwaitExpression: typings.swcWasm.swcWasmStrings.AwaitExpression
}
object AwaitExpression {
  
  inline def apply(argument: Expression, span: Span): AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[AwaitExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwaitExpression] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
