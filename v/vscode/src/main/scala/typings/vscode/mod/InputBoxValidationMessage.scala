package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputBoxValidationMessage extends StObject {
  
  /**
  		 * The validation message to display.
  		 */
  val message: String
  
  /**
  		 * The severity of the validation message.
  		 * NOTE: When using `InputBoxValidationSeverity.Error`, the user will not be allowed to accept (hit ENTER) the input.
  		 * `Info` and `Warning` will still allow the InputBox to accept the input.
  		 */
  val severity: InputBoxValidationSeverity
}
object InputBoxValidationMessage {
  
  inline def apply(message: String, severity: InputBoxValidationSeverity): InputBoxValidationMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputBoxValidationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputBoxValidationMessage] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: InputBoxValidationSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
