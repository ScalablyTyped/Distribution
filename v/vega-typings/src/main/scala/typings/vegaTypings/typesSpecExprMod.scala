package typings.vegaTypings

import typings.vegaTypings.typesSpecOnEventsMod._Update
import typings.vegaTypings.typesSpecTransformMod.TransformField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecExprMod {
  
  type Expr = String
  
  trait ExprRef
    extends StObject
       with TransformField
       with _Update {
    
    var expr: Expr
  }
  object ExprRef {
    
    inline def apply(expr: Expr): ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExprRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExprRef] (val x: Self) extends AnyVal {
      
      inline def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    }
  }
}
