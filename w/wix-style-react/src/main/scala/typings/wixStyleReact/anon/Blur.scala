package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blur extends StObject {
  
  /** removes focus on the element */
  def blur(): Unit
  
  /** clicks on element */
  def click(): js.UndefOr[Unit | Null]
  
  /** returns the driver element */
  def element(): js.UndefOr[typings.std.Element | Null]
  
  /** returns true if element in the DOM */
  def exists(): Boolean
  
  /** sets focus on the element */
  def focus(): Unit
  
  /** returns value of subtitle */
  def getSubtitle(): Any
  
  /** returns value of action text */
  def getText(): Any
  
  /** returns value of tooltip content */
  def getTooltipContent(): js.UndefOr[String | Null]
  
  /** returns true if element is focused */
  def isFocused(): Boolean
  
  /** true if passed children in string exists */
  def textExists(): Any
}
object Blur {
  
  inline def apply(
    blur: () => Unit,
    click: () => js.UndefOr[Unit | Null],
    element: () => js.UndefOr[typings.std.Element | Null],
    exists: () => Boolean,
    focus: () => Unit,
    getSubtitle: () => Any,
    getText: () => Any,
    getTooltipContent: () => js.UndefOr[String | Null],
    isFocused: () => Boolean,
    textExists: () => Any
  ): Blur = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), focus = js.Any.fromFunction0(focus), getSubtitle = js.Any.fromFunction0(getSubtitle), getText = js.Any.fromFunction0(getText), getTooltipContent = js.Any.fromFunction0(getTooltipContent), isFocused = js.Any.fromFunction0(isFocused), textExists = js.Any.fromFunction0(textExists))
    __obj.asInstanceOf[Blur]
  }
  
  extension [Self <: Blur](x: Self) {
    
    inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    inline def setClick(value: () => js.UndefOr[Unit | Null]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setElement(value: () => js.UndefOr[typings.std.Element | Null]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setGetSubtitle(value: () => Any): Self = StObject.set(x, "getSubtitle", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => Any): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetTooltipContent(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getTooltipContent", js.Any.fromFunction0(value))
    
    inline def setIsFocused(value: () => Boolean): Self = StObject.set(x, "isFocused", js.Any.fromFunction0(value))
    
    inline def setTextExists(value: () => Any): Self = StObject.set(x, "textExists", js.Any.fromFunction0(value))
  }
}
