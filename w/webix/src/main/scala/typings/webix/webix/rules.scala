package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rules extends StObject {
  
  def isChecked(value: Any): Boolean
  
  def isEmail(value: Any): Boolean
  
  def isNotEmpty(value: Any): Boolean
  
  def isNumber(value: Any): Boolean
}
object rules {
  
  inline def apply(
    isChecked: Any => Boolean,
    isEmail: Any => Boolean,
    isNotEmpty: Any => Boolean,
    isNumber: Any => Boolean
  ): rules = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction1(isChecked), isEmail = js.Any.fromFunction1(isEmail), isNotEmpty = js.Any.fromFunction1(isNotEmpty), isNumber = js.Any.fromFunction1(isNumber))
    __obj.asInstanceOf[rules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rules] (val x: Self) extends AnyVal {
    
    inline def setIsChecked(value: Any => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction1(value))
    
    inline def setIsEmail(value: Any => Boolean): Self = StObject.set(x, "isEmail", js.Any.fromFunction1(value))
    
    inline def setIsNotEmpty(value: Any => Boolean): Self = StObject.set(x, "isNotEmpty", js.Any.fromFunction1(value))
    
    inline def setIsNumber(value: Any => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
  }
}
