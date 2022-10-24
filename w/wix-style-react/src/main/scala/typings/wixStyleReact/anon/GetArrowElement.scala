package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArrowElement extends StObject {
  
  /** Click on the element */
  def click(): Unit
  
  /** Click outside the element */
  def clickOutside(): Unit
  
  /** Whether the element exists or not */
  def exists(): Boolean
  
  /** Returns the arrow element */
  def getArrowElement(): js.UndefOr[typings.std.Element]
  
  /** Returns the arrow offset */
  def getArrowOffset(): Bottom
  
  /** Returns the content element (`<Popover.Content/>`) */
  def getContentElement(): typings.std.Element | Null
  
  /** Returns the element's id */
  def getElementId(): js.UndefOr[String]
  
  /** Returns the target element (`<Popover.Element/>`) */
  def getTargetElement(): js.UndefOr[typings.std.Element]
  
  /** Returns the element's inline styles */
  def inlineStyles(): Any
  
  /** Returns `true` whether the content element (`<Popover.Content/>`) exists */
  def isContentElementExists(): Boolean
  
  /** Returns `true` whether the target element (`<Popover.Element/>`) exists */
  def isTargetElementExists(): Boolean
  
  /** Trigger `mouseEnter` on the element */
  def mouseEnter(): js.UndefOr[Unit]
  
  /** Trigger `mouseLeave` on the element */
  def mouseLeave(): js.UndefOr[Unit]
}
object GetArrowElement {
  
  inline def apply(
    click: () => Unit,
    clickOutside: () => Unit,
    exists: () => Boolean,
    getArrowElement: () => js.UndefOr[typings.std.Element],
    getArrowOffset: () => Bottom,
    getContentElement: () => typings.std.Element | Null,
    getElementId: () => js.UndefOr[String],
    getTargetElement: () => js.UndefOr[typings.std.Element],
    inlineStyles: () => Any,
    isContentElementExists: () => Boolean,
    isTargetElementExists: () => Boolean,
    mouseEnter: () => js.UndefOr[Unit],
    mouseLeave: () => js.UndefOr[Unit]
  ): GetArrowElement = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOutside = js.Any.fromFunction0(clickOutside), exists = js.Any.fromFunction0(exists), getArrowElement = js.Any.fromFunction0(getArrowElement), getArrowOffset = js.Any.fromFunction0(getArrowOffset), getContentElement = js.Any.fromFunction0(getContentElement), getElementId = js.Any.fromFunction0(getElementId), getTargetElement = js.Any.fromFunction0(getTargetElement), inlineStyles = js.Any.fromFunction0(inlineStyles), isContentElementExists = js.Any.fromFunction0(isContentElementExists), isTargetElementExists = js.Any.fromFunction0(isTargetElementExists), mouseEnter = js.Any.fromFunction0(mouseEnter), mouseLeave = js.Any.fromFunction0(mouseLeave))
    __obj.asInstanceOf[GetArrowElement]
  }
  
  extension [Self <: GetArrowElement](x: Self) {
    
    inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setClickOutside(value: () => Unit): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetArrowElement(value: () => js.UndefOr[typings.std.Element]): Self = StObject.set(x, "getArrowElement", js.Any.fromFunction0(value))
    
    inline def setGetArrowOffset(value: () => Bottom): Self = StObject.set(x, "getArrowOffset", js.Any.fromFunction0(value))
    
    inline def setGetContentElement(value: () => typings.std.Element | Null): Self = StObject.set(x, "getContentElement", js.Any.fromFunction0(value))
    
    inline def setGetElementId(value: () => js.UndefOr[String]): Self = StObject.set(x, "getElementId", js.Any.fromFunction0(value))
    
    inline def setGetTargetElement(value: () => js.UndefOr[typings.std.Element]): Self = StObject.set(x, "getTargetElement", js.Any.fromFunction0(value))
    
    inline def setInlineStyles(value: () => Any): Self = StObject.set(x, "inlineStyles", js.Any.fromFunction0(value))
    
    inline def setIsContentElementExists(value: () => Boolean): Self = StObject.set(x, "isContentElementExists", js.Any.fromFunction0(value))
    
    inline def setIsTargetElementExists(value: () => Boolean): Self = StObject.set(x, "isTargetElementExists", js.Any.fromFunction0(value))
    
    inline def setMouseEnter(value: () => js.UndefOr[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction0(value))
    
    inline def setMouseLeave(value: () => js.UndefOr[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction0(value))
  }
}
