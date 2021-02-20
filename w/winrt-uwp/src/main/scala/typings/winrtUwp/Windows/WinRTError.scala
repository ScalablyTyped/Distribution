package typings.winrtUwp.Windows

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WinRTError extends Error {
  
  var description: String = js.native
  
  var number: Double = js.native
}
object WinRTError {
  
  @scala.inline
  def apply(description: String, message: String, name: String, number: Double): WinRTError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinRTError]
  }
  
  @scala.inline
  implicit class WinRTErrorMutableBuilder[Self <: WinRTError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
