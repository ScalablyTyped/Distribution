package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rules extends StObject {
  
  def isChecked(): Boolean
  
  def isEmail(): Boolean
  
  def isNotEmpty(): Boolean
  
  def isNumber(): Boolean
}
object rules {
  
  inline def apply(
    isChecked: () => Boolean,
    isEmail: () => Boolean,
    isNotEmpty: () => Boolean,
    isNumber: () => Boolean
  ): rules = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), isEmail = js.Any.fromFunction0(isEmail), isNotEmpty = js.Any.fromFunction0(isNotEmpty), isNumber = js.Any.fromFunction0(isNumber))
    __obj.asInstanceOf[rules]
  }
  
  extension [Self <: rules](x: Self) {
    
    inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    inline def setIsEmail(value: () => Boolean): Self = StObject.set(x, "isEmail", js.Any.fromFunction0(value))
    
    inline def setIsNotEmpty(value: () => Boolean): Self = StObject.set(x, "isNotEmpty", js.Any.fromFunction0(value))
    
    inline def setIsNumber(value: () => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction0(value))
  }
}
