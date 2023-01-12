package typings.winrtUwp.Windows

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WinRTError
  extends StObject
     with Error {
  
  var description: String
  
  var number: Double
}
object WinRTError {
  
  inline def apply(description: String, message: String, name: String, number: Double): WinRTError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinRTError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WinRTError] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
