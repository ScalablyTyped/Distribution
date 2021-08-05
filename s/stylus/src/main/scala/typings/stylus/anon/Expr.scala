package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Expression
import typings.stylus.mod.Stylus.Nodes.Literal
import typings.stylus.mod.Stylus.Nodes.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expr extends StObject {
  
  var __type: String
  
  var column: Double
  
  var expr: js.UndefOr[Expression] = js.undefined
  
  var filename: String
  
  var lineno: Double
  
  var literal: js.UndefOr[Literal] = js.undefined
  
  var name: String
  
  var segments: js.Array[Node]
}
object Expr {
  
  inline def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    name: String,
    segments: js.Array[Node]
  ): Expr = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expr]
  }
  
  extension [Self <: Expr](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: Expression): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setLiteral(value: Literal): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: js.Array[Node]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: Node*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
