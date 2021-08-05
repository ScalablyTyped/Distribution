package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOnContent extends StObject {
  
  def click(): js.Any
  
  /** Perform a click outside on the content element */
  def clickOnContent(): Unit
  
  def clickOutside(): Unit
  
  def exists(): Boolean
  
  def getArrowElement(): typings.std.Element
  
  def getArrowOffset(): Bottom
  
  def getContentElement(): js.Any
  
  def getElementId(): js.Any
  
  /** Return the <Popover/>'s portal element */
  def getPortalElement(): js.Any
  
  def getTargetElement(): typings.std.Element
  
  def inlineStyles(): js.Any
  
  def isContentElementExists(): Boolean
  
  def isTargetElementExists(): Boolean
  
  def mouseEnter(): js.Any
  
  def mouseLeave(): js.Any
}
object ClickOnContent {
  
  inline def apply(
    click: () => js.Any,
    clickOnContent: () => Unit,
    clickOutside: () => Unit,
    exists: () => Boolean,
    getArrowElement: () => typings.std.Element,
    getArrowOffset: () => Bottom,
    getContentElement: () => js.Any,
    getElementId: () => js.Any,
    getPortalElement: () => js.Any,
    getTargetElement: () => typings.std.Element,
    inlineStyles: () => js.Any,
    isContentElementExists: () => Boolean,
    isTargetElementExists: () => Boolean,
    mouseEnter: () => js.Any,
    mouseLeave: () => js.Any
  ): ClickOnContent = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnContent = js.Any.fromFunction0(clickOnContent), clickOutside = js.Any.fromFunction0(clickOutside), exists = js.Any.fromFunction0(exists), getArrowElement = js.Any.fromFunction0(getArrowElement), getArrowOffset = js.Any.fromFunction0(getArrowOffset), getContentElement = js.Any.fromFunction0(getContentElement), getElementId = js.Any.fromFunction0(getElementId), getPortalElement = js.Any.fromFunction0(getPortalElement), getTargetElement = js.Any.fromFunction0(getTargetElement), inlineStyles = js.Any.fromFunction0(inlineStyles), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
    __obj.asInstanceOf[ClickOnContent]
  }
  
  extension [Self <: ClickOnContent](x: Self) {
    
    inline def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setClickOnContent(value: () => Unit): Self = StObject.set(x, "clickOnContent", js.Any.fromFunction0(value))
    
    inline def setClickOutside(value: () => Unit): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetArrowElement(value: () => typings.std.Element): Self = StObject.set(x, "getArrowElement", js.Any.fromFunction0(value))
    
    inline def setGetArrowOffset(value: () => Bottom): Self = StObject.set(x, "getArrowOffset", js.Any.fromFunction0(value))
    
    inline def setGetContentElement(value: () => js.Any): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
    
    inline def setGetElementId(value: () => js.Any): Self = StObject.set(x, "getElementId", js.Any.fromFunction0(value))
    
    inline def setGetPortalElement(value: () => js.Any): Self = StObject.set(x, "getPortalElement", js.Any.fromFunction0(value))
    
    inline def setGetTargetElement(value: () => typings.std.Element): Self = StObject.set(x, "getTargetElement", js.Any.fromFunction0(value))
    
    inline def setInlineStyles(value: () => js.Any): Self = StObject.set(x, "inlineStyles", js.Any.fromFunction0(value))
    
    inline def setIsContentElementExists(value: () => Boolean): Self = StObject.set(x, "isContentElementExists", js.Any.fromFunction0(value))
    
    inline def setIsTargetElementExists(value: () => Boolean): Self = StObject.set(x, "isTargetElementExists", js.Any.fromFunction0(value))
    
    inline def setMouseEnter(value: () => js.Any): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    inline def setMouseLeave(value: () => js.Any): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
  }
}
