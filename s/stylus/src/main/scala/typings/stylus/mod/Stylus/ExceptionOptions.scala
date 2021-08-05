package typings.stylus.mod.Stylus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionOptions extends StObject {
  
  var column: Double
  
  var context: Double
  
  var filename: String
  
  var input: String
  
  var lineno: Double
}
object ExceptionOptions {
  
  inline def apply(column: Double, context: Double, filename: String, input: String, lineno: Double): ExceptionOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionOptions]
  }
  
  extension [Self <: ExceptionOptions](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setContext(value: Double): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
  }
}
