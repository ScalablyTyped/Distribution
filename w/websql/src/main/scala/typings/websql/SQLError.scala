package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.6 Errors and exceptions - asynchronous database API error
  */
trait SQLError extends StObject {
  
  // = 7;
  var code: Double
  
  var message: DOMString
}
object SQLError {
  
  @scala.inline
  def apply(code: Double, message: DOMString): SQLError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLError]
  }
  
  @scala.inline
  implicit class SQLErrorMutableBuilder[Self <: SQLError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: DOMString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
