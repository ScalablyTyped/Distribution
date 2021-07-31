package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValidationRequest extends StObject {
  
  var inputs: StringDictionary[InputValidationItem]
}
object InputValidationRequest {
  
  @scala.inline
  def apply(inputs: StringDictionary[InputValidationItem]): InputValidationRequest = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValidationRequest]
  }
  
  @scala.inline
  implicit class InputValidationRequestMutableBuilder[Self <: InputValidationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: StringDictionary[InputValidationItem]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
