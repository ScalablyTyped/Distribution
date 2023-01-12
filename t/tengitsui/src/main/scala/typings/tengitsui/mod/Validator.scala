package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator
  extends StObject
     with ValidatorRule {
  
  def validator(value: Any): Boolean | String
}
object Validator {
  
  inline def apply(validator: Any => Boolean | String): Validator = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction1(validator))
    __obj.asInstanceOf[Validator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validator] (val x: Self) extends AnyVal {
    
    inline def setValidator(value: Any => Boolean | String): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
  }
}
