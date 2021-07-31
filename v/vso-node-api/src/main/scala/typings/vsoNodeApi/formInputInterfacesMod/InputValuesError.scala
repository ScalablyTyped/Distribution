package typings.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValuesError extends StObject {
  
  /**
    * The error message.
    */
  var message: String
}
object InputValuesError {
  
  @scala.inline
  def apply(message: String): InputValuesError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValuesError]
  }
  
  @scala.inline
  implicit class InputValuesErrorMutableBuilder[Self <: InputValuesError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
