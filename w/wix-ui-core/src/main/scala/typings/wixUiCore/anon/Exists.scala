package typings.wixUiCore.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exists extends StObject {
  
  def children(): typings.std.Element
  
  def click(): Unit
  
  def element(): js.Any
  
  def exists(): Boolean
  
  def focus(): js.Any
  
  def hasErrorState(): Boolean
  
  def hasFocusState(): Boolean
  
  def hasReadOnlyState(): Boolean
  
  def input(): HTMLInputElement
  
  def isChecked(): Boolean
  
  def isDisabled(): Boolean
  
  def isIndeterminate(): Boolean
  
  def keyDown(key: String): js.Any
  
  def mouseDown(): js.Any
  
  def mouseEnter(): js.Any
  
  def mouseLeave(): js.Any
  
  def tickmark(): typings.std.Element
}
object Exists {
  
  inline def apply(
    children: () => typings.std.Element,
    click: () => Unit,
    element: () => js.Any,
    exists: () => Boolean,
    focus: () => js.Any,
    hasErrorState: () => Boolean,
    hasFocusState: () => Boolean,
    hasReadOnlyState: () => Boolean,
    input: () => HTMLInputElement,
    isChecked: () => Boolean,
    isDisabled: () => Boolean,
    isIndeterminate: () => Boolean,
    keyDown: String => js.Any,
    mouseDown: () => js.Any,
    mouseEnter: () => js.Any,
    mouseLeave: () => js.Any,
    tickmark: () => typings.std.Element
  ): Exists = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction0(children), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), hasErrorState = js.Any.fromFunction0(hasErrorState), hasFocusState = js.Any.fromFunction0(hasFocusState), hasReadOnlyState = js.Any.fromFunction0(hasReadOnlyState), input = js.Any.fromFunction0(input), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled), isIndeterminate = js.Any.fromFunction0(isIndeterminate), keyDown = js.Any.fromFunction1(keyDown), mouseDown = js.Any.fromFunction0(mouseDown), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave), tickmark = js.Any.fromFunction0(tickmark))
    __obj.asInstanceOf[Exists]
  }
  
  extension [Self <: Exists](x: Self) {
    
    inline def setChildren(value: () => typings.std.Element): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
    
    inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.Any): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => js.Any): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setHasErrorState(value: () => Boolean): Self = StObject.set(x, "hasErrorState", js.Any.fromFunction0(value))
    
    inline def setHasFocusState(value: () => Boolean): Self = StObject.set(x, "hasFocusState", js.Any.fromFunction0(value))
    
    inline def setHasReadOnlyState(value: () => Boolean): Self = StObject.set(x, "hasReadOnlyState", js.Any.fromFunction0(value))
    
    inline def setInput(value: () => HTMLInputElement): Self = StObject.set(x, "input", js.Any.fromFunction0(value))
    
    inline def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    inline def setIsIndeterminate(value: () => Boolean): Self = StObject.set(x, "isIndeterminate", js.Any.fromFunction0(value))
    
    inline def setKeyDown(value: String => js.Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setMouseDown(value: () => js.Any): Self = StObject.set(x, "mouseDown", js.Any.fromFunction0(value))
    
    inline def setMouseEnter(value: () => js.Any): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    inline def setMouseLeave(value: () => js.Any): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    
    inline def setTickmark(value: () => typings.std.Element): Self = StObject.set(x, "tickmark", js.Any.fromFunction0(value))
  }
}
