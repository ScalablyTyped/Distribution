package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `setExpression` request. */
trait SetExpressionArguments extends StObject {
  
  /** The l-value expression to assign to. */
  var expression: String
  
  /** Specifies how the resulting value should be formatted. */
  var format: js.UndefOr[ValueFormat] = js.undefined
  
  /** Evaluate the expressions in the scope of this stack frame. If not specified, the expressions are evaluated in the global scope. */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /** The value expression to assign to the l-value expression. */
  var value: String
}
object SetExpressionArguments {
  
  inline def apply(expression: String, value: String): SetExpressionArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetExpressionArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetExpressionArguments] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ValueFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
