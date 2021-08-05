package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOutside extends StObject {
  
  def click(): js.Any
  
  def clickOutside(): Unit
  
  def dropdownContentDisplayed(): Boolean
  
  def exists(): Boolean
  
  def getArrowElement(): typings.std.Element
  
  def getArrowOffset(): Bottom
  
  def getContentElement(): js.Any
  
  def getElementId(): js.Any
  
  def getOptionsCount(): js.Any
  
  def getSelectedOptionsCount(): Double
  
  def getTargetElement(): typings.std.Element
  
  def hasStyleState(state: js.Any): Boolean
  
  def inlineStyles(): js.Any
  
  def isContentElementExists(): Boolean
  
  def isTargetElementExists(): Boolean
  
  def mouseEnter(): js.Any
  
  def mouseLeave(): js.Any
  
  def optionAt(index: Double): ClassName
  
  def triggerMouseDownOnDropdownContent(): js.Any
}
object ClickOutside {
  
  inline def apply(
    click: () => js.Any,
    clickOutside: () => Unit,
    dropdownContentDisplayed: () => Boolean,
    exists: () => Boolean,
    getArrowElement: () => typings.std.Element,
    getArrowOffset: () => Bottom,
    getContentElement: () => js.Any,
    getElementId: () => js.Any,
    getOptionsCount: () => js.Any,
    getSelectedOptionsCount: () => Double,
    getTargetElement: () => typings.std.Element,
    hasStyleState: js.Any => Boolean,
    inlineStyles: () => js.Any,
    isContentElementExists: () => Boolean,
    isTargetElementExists: () => Boolean,
    mouseEnter: () => js.Any,
    mouseLeave: () => js.Any,
    optionAt: Double => ClassName,
    triggerMouseDownOnDropdownContent: () => js.Any
  ): ClickOutside = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOutside = js.Any.fromFunction0(clickOutside), dropdownContentDisplayed = js.Any.fromFunction0(dropdownContentDisplayed), exists = js.Any.fromFunction0(exists), getArrowElement = js.Any.fromFunction0(getArrowElement), getArrowOffset = js.Any.fromFunction0(getArrowOffset), getContentElement = js.Any.fromFunction0(getContentElement), getElementId = js.Any.fromFunction0(getElementId), getOptionsCount = js.Any.fromFunction0(getOptionsCount), getSelectedOptionsCount = js.Any.fromFunction0(getSelectedOptionsCount), getTargetElement = js.Any.fromFunction0(getTargetElement), hasStyleState = js.Any.fromFunction1(hasStyleState), inlineStyles = js.Any.fromFunction0(inlineStyles), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave), optionAt = js.Any.fromFunction1(optionAt), triggerMouseDownOnDropdownContent = js.Any.fromFunction0(triggerMouseDownOnDropdownContent))
    __obj.asInstanceOf[ClickOutside]
  }
  
  extension [Self <: ClickOutside](x: Self) {
    
    inline def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setClickOutside(value: () => Unit): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    inline def setDropdownContentDisplayed(value: () => Boolean): Self = StObject.set(x, "dropdownContentDisplayed", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetArrowElement(value: () => typings.std.Element): Self = StObject.set(x, "getArrowElement", js.Any.fromFunction0(value))
    
    inline def setGetArrowOffset(value: () => Bottom): Self = StObject.set(x, "getArrowOffset", js.Any.fromFunction0(value))
    
    inline def setGetContentElement(value: () => js.Any): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
    
    inline def setGetElementId(value: () => js.Any): Self = StObject.set(x, "getElementId", js.Any.fromFunction0(value))
    
    inline def setGetOptionsCount(value: () => js.Any): Self = StObject.set(x, "getOptionsCount", js.Any.fromFunction0(value))
    
    inline def setGetSelectedOptionsCount(value: () => Double): Self = StObject.set(x, "getSelectedOptionsCount", js.Any.fromFunction0(value))
    
    inline def setGetTargetElement(value: () => typings.std.Element): Self = StObject.set(x, "getTargetElement", js.Any.fromFunction0(value))
    
    inline def setHasStyleState(value: js.Any => Boolean): Self = StObject.set(x, "hasStyleState", js.Any.fromFunction1(value))
    
    inline def setInlineStyles(value: () => js.Any): Self = StObject.set(x, "inlineStyles", js.Any.fromFunction0(value))
    
    inline def setIsContentElementExists(value: () => Boolean): Self = StObject.set(x, "isContentElementExists", js.Any.fromFunction0(value))
    
    inline def setIsTargetElementExists(value: () => Boolean): Self = StObject.set(x, "isTargetElementExists", js.Any.fromFunction0(value))
    
    inline def setMouseEnter(value: () => js.Any): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    inline def setMouseLeave(value: () => js.Any): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
    
    inline def setOptionAt(value: Double => ClassName): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    
    inline def setTriggerMouseDownOnDropdownContent(value: () => js.Any): Self = StObject.set(x, "triggerMouseDownOnDropdownContent", js.Any.fromFunction0(value))
  }
}
