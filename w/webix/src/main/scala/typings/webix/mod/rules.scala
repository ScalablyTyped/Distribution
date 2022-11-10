package typings.webix.mod

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
  
  @JSImport("webix", "rules")
  @js.native
  val ^ : typings.webix.webix.rules = js.native
  
  extension [Self <: rules](x: Self) {
    
    inline def setIsChecked(value: Any => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction1(value))
    
    inline def setIsEmail(value: Any => Boolean): Self = StObject.set(x, "isEmail", js.Any.fromFunction1(value))
    
    inline def setIsNotEmpty(value: Any => Boolean): Self = StObject.set(x, "isNotEmpty", js.Any.fromFunction1(value))
    
    inline def setIsNumber(value: Any => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
  }
}
