package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FireKeyDown extends StObject {
  
  def blur(): js.Any
  
  def click(): Unit
  
  def exists(): Boolean
  
  def fireKeyDown(): Boolean
  
  def fireKeyUp(): Boolean
  
  def fireMouseDown(): Boolean
  
  def focus(): js.Any
  
  def hasFocusState(): Boolean
  
  def hasFocusVisibleState(): Boolean
  
  def tabIn(): Unit
  
  def tabOut(): Unit
}
object FireKeyDown {
  
  inline def apply(
    blur: () => js.Any,
    click: () => Unit,
    exists: () => Boolean,
    fireKeyDown: () => Boolean,
    fireKeyUp: () => Boolean,
    fireMouseDown: () => Boolean,
    focus: () => js.Any,
    hasFocusState: () => Boolean,
    hasFocusVisibleState: () => Boolean,
    tabIn: () => Unit,
    tabOut: () => Unit
  ): FireKeyDown = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), fireKeyDown = js.Any.fromFunction0(fireKeyDown), fireKeyUp = js.Any.fromFunction0(fireKeyUp), fireMouseDown = js.Any.fromFunction0(fireMouseDown), focus = js.Any.fromFunction0(focus), hasFocusState = js.Any.fromFunction0(hasFocusState), hasFocusVisibleState = js.Any.fromFunction0(hasFocusVisibleState), tabIn = js.Any.fromFunction0(tabIn), tabOut = js.Any.fromFunction0(tabOut))
    __obj.asInstanceOf[FireKeyDown]
  }
  
  extension [Self <: FireKeyDown](x: Self) {
    
    inline def setBlur(value: () => js.Any): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setFireKeyDown(value: () => Boolean): Self = StObject.set(x, "fireKeyDown", js.Any.fromFunction0(value))
    
    inline def setFireKeyUp(value: () => Boolean): Self = StObject.set(x, "fireKeyUp", js.Any.fromFunction0(value))
    
    inline def setFireMouseDown(value: () => Boolean): Self = StObject.set(x, "fireMouseDown", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => js.Any): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setHasFocusState(value: () => Boolean): Self = StObject.set(x, "hasFocusState", js.Any.fromFunction0(value))
    
    inline def setHasFocusVisibleState(value: () => Boolean): Self = StObject.set(x, "hasFocusVisibleState", js.Any.fromFunction0(value))
    
    inline def setTabIn(value: () => Unit): Self = StObject.set(x, "tabIn", js.Any.fromFunction0(value))
    
    inline def setTabOut(value: () => Unit): Self = StObject.set(x, "tabOut", js.Any.fromFunction0(value))
  }
}
