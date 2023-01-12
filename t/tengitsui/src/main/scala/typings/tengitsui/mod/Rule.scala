package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  def validator(value: Any, fields: Fields): Any
}
object Rule {
  
  inline def apply(validator: (Any, Fields) => Any): Rule = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction2(validator))
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValidator(value: (Any, Fields) => Any): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
  }
}
