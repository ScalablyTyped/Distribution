package typings.webix.mod

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
  
  @JSImport("webix", "rules")
  @js.native
  val ^ : typings.webix.webix.rules = js.native
  
  extension [Self <: rules](x: Self) {
    
    inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    inline def setIsEmail(value: () => Boolean): Self = StObject.set(x, "isEmail", js.Any.fromFunction0(value))
    
    inline def setIsNotEmpty(value: () => Boolean): Self = StObject.set(x, "isNotEmpty", js.Any.fromFunction0(value))
    
    inline def setIsNumber(value: () => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction0(value))
  }
}
