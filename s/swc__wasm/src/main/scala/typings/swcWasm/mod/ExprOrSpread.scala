package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExprOrSpread extends StObject {
  
  var expression: Expression
  
  var spread: js.UndefOr[Span] = js.undefined
}
object ExprOrSpread {
  
  inline def apply(expression: Expression): ExprOrSpread = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExprOrSpread]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExprOrSpread] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setSpread(value: Span): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
  }
}
