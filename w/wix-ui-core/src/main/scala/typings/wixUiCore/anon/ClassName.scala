package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  def className(): js.Any
  
  def click(): js.Any
  
  def exists(): Boolean
  
  def getElement(): js.Any
  
  def getHighlightedStrings(): js.Array[String]
  
  def getText(): js.Any
  
  def isDisabled(): Boolean
  
  def isHovered(): Boolean
  
  def isSelectable(): Boolean
  
  def isSelected(): Boolean
  
  def mouseEnter(): js.Any
}
object ClassName {
  
  inline def apply(
    className: () => js.Any,
    click: () => js.Any,
    exists: () => Boolean,
    getElement: () => js.Any,
    getHighlightedStrings: () => js.Array[String],
    getText: () => js.Any,
    isDisabled: () => Boolean,
    isHovered: () => Boolean,
    isSelectable: () => Boolean,
    isSelected: () => Boolean,
    mouseEnter: () => js.Any
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = js.Any.fromFunction0(className), click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getElement = js.Any.fromFunction0(getElement), getHighlightedStrings = js.Any.fromFunction0(getHighlightedStrings), getText = js.Any.fromFunction0(getText), isDisabled = js.Any.fromFunction0(isDisabled), isHovered = js.Any.fromFunction0(isHovered), isSelectable = js.Any.fromFunction0(isSelectable), isSelected = js.Any.fromFunction0(isSelected), mouseEnter = js.Any.fromFunction0(mouseEnter))
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: () => js.Any): Self = StObject.set(x, "className", js.Any.fromFunction0(value))
    
    inline def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetElement(value: () => js.Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    inline def setGetHighlightedStrings(value: () => js.Array[String]): Self = StObject.set(x, "getHighlightedStrings", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => js.Any): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    inline def setIsHovered(value: () => Boolean): Self = StObject.set(x, "isHovered", js.Any.fromFunction0(value))
    
    inline def setIsSelectable(value: () => Boolean): Self = StObject.set(x, "isSelectable", js.Any.fromFunction0(value))
    
    inline def setIsSelected(value: () => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    
    inline def setMouseEnter(value: () => js.Any): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
  }
}
