package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FalseExpr extends StObject {
  
  var __type: String
  
  var column: Double
  
  var falseExpr: Expression
  
  var filename: String
  
  var lineno: Double
  
  var op: String
  
  var trueExpr: Expression
}
object FalseExpr {
  
  inline def apply(
    __type: String,
    column: Double,
    falseExpr: Expression,
    filename: String,
    lineno: Double,
    op: String,
    trueExpr: Expression
  ): FalseExpr = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], falseExpr = falseExpr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], trueExpr = trueExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[FalseExpr]
  }
  
  extension [Self <: FalseExpr](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFalseExpr(value: Expression): Self = StObject.set(x, "falseExpr", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setTrueExpr(value: Expression): Self = StObject.set(x, "trueExpr", value.asInstanceOf[js.Any])
    
    inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
