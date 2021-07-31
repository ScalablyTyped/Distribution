package typings.stylus.anon

import typings.stylus.mod.Stylus.Nodes.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var __type: String
  
  var block: typings.stylus.mod.Stylus.Nodes.Block
  
  var column: Double
  
  var expr: Expression
  
  var filename: String
  
  var key: String
  
  var lineno: Double
  
  var `val`: String
}
object Key {
  
  @scala.inline
  def apply(
    __type: String,
    block: typings.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    expr: Expression,
    filename: String,
    key: String,
    lineno: Double,
    `val`: String
  ): Key = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: typings.stylus.mod.Stylus.Nodes.Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpr(value: Expression): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
