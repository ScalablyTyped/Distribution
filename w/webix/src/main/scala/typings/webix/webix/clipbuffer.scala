package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait clipbuffer extends StObject {
  
  def destructor(): Unit
  
  def focus(): Unit
  
  def init(): Unit
  
  def set(text: String): Unit
}
object clipbuffer {
  
  inline def apply(destructor: () => Unit, focus: () => Unit, init: () => Unit, set: String => Unit): clipbuffer = {
    val __obj = js.Dynamic.literal(destructor = js.Any.fromFunction0(destructor), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[clipbuffer]
  }
  
  extension [Self <: clipbuffer](x: Self) {
    
    inline def setDestructor(value: () => Unit): Self = StObject.set(x, "destructor", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
