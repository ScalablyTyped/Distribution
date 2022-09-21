package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expr extends StObject {
  
  var expr: String
}
object Expr {
  
  inline def apply(expr: String): Expr = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expr]
  }
  
  extension [Self <: Expr](x: Self) {
    
    inline def setExpr(value: String): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
  }
}
