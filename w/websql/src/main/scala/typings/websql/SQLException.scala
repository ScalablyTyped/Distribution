package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// synchronous database API error
trait SQLException extends StObject {
  
  // = 7;
  var code: Double
  
  var message: DOMString
}
object SQLException {
  
  inline def apply(code: Double, message: DOMString): SQLException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLException]
  }
  
  extension [Self <: SQLException](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: DOMString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
