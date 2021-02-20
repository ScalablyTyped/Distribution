package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildRequestValidationResult extends StObject {
  
  /**
    * The message associated with the result.
    */
  var message: String = js.native
  
  /**
    * The result.
    */
  var result: ValidationResult = js.native
}
object BuildRequestValidationResult {
  
  @scala.inline
  def apply(message: String, result: ValidationResult): BuildRequestValidationResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRequestValidationResult]
  }
  
  @scala.inline
  implicit class BuildRequestValidationResultMutableBuilder[Self <: BuildRequestValidationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: ValidationResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
