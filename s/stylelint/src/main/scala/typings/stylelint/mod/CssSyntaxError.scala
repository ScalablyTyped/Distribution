package typings.stylelint.mod

import typings.stylelint.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssSyntaxError extends StObject {
  
  /**
  			 * The column of the inclusive start position of the error.
  			 */
  var column: Double
  
  /**
  			 * The column of the exclusive end position of the error.
  			 */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The line of the exclusive end position of the error.
  			 */
  var endLine: js.UndefOr[Double] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var input: Column
  
  /**
  			 * The line of the inclusive start position of the error.
  			 */
  var line: Double
  
  var message: String
  
  var name: String
  
  var reason: String
  
  var source: String
}
object CssSyntaxError {
  
  inline def apply(
    column: Double,
    input: Column,
    line: Double,
    message: String,
    name: String,
    reason: String,
    source: String
  ): CssSyntaxError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssSyntaxError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CssSyntaxError] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setInput(value: Column): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
