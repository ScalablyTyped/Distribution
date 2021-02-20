package typings.stylus.mod.Stylus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExceptionOptions extends StObject {
  
  var column: Double = js.native
  
  var context: Double = js.native
  
  var filename: String = js.native
  
  var input: String = js.native
  
  var lineno: Double = js.native
}
object ExceptionOptions {
  
  @scala.inline
  def apply(column: Double, context: Double, filename: String, input: String, lineno: Double): ExceptionOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptions]
  }
  
  @scala.inline
  implicit class ExceptionOptionsMutableBuilder[Self <: ExceptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: Double): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
  }
}
