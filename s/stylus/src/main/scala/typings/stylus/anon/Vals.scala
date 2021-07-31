package typings.stylus.anon

import typings.stylus.mod.Stylus.Dictionary
import typings.stylus.mod.Stylus.Nodes.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vals extends StObject {
  
  var __type: String
  
  var column: Double
  
  var filename: String
  
  var lineno: Double
  
  var vals: Dictionary[Node]
}
object Vals {
  
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, vals: Dictionary[Node]): Vals = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vals]
  }
  
  @scala.inline
  implicit class ValsMutableBuilder[Self <: Vals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVals(value: Dictionary[Node]): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
