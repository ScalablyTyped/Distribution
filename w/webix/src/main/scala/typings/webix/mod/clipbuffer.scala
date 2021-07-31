package typings.webix.mod

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
  
  @JSImport("webix", "clipbuffer")
  @js.native
  val ^ : typings.webix.webix.clipbuffer = js.native
  
  @scala.inline
  implicit class clipbufferMutableBuilder[Self <: clipbuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestructor(value: () => Unit): Self = StObject.set(x, "destructor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
