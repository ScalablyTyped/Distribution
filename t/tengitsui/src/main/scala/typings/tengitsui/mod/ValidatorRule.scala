package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tengitsui.mod.Required
  - typings.tengitsui.mod.Validator
*/
trait ValidatorRule extends StObject
object ValidatorRule {
  
  inline def Required(required: Boolean): typings.tengitsui.mod.Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tengitsui.mod.Required]
  }
  
  inline def Validator(validator: Any => Boolean | String): typings.tengitsui.mod.Validator = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction1(validator))
    __obj.asInstanceOf[typings.tengitsui.mod.Validator]
  }
}
