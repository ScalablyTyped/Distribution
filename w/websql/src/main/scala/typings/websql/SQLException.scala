package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// synchronous database API error
@js.native
trait SQLException extends StObject {
  
  // = 7;
  var code: Double = js.native
  
  var message: DOMString = js.native
}
object SQLException {
  
  @scala.inline
  def apply(code: Double, message: DOMString): SQLException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLException]
  }
  
  @scala.inline
  implicit class SQLExceptionMutableBuilder[Self <: SQLException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: DOMString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
